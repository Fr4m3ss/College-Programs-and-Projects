#include <iostream>
#include <utility>
#include <vector>
#include "User.h"
#include <fstream> 
#include <string>

using namespace std;

User::User()
{
    Name = "Justin";
    indexCurrentRoom = 2;
    UserType = 0;
};

User::User(string userName, int indx)
{
    Name = userName;
    indexCurrentRoom = indx;
    UserType = 0;
};

void promptUserAction(User &user1, const Room rooms[], string& strCh)
{
    if(user1.getUserType() == 1)
    {
    	cout<<"\n-----SUPER USER----";
    }
    /* tell user where they are */
    cout << "\n" << user1.getName() << ", you are in the room " << rooms[user1.getIndexCurrentRoom()] <<  endl;
    /* prompt user for choice */
    cout<<"What would you like to do?"<<endl;
    cin>>strCh;
}

void User::setName(string userName)
{
    Name = (userName);
}

string User::getName() const
{
    return this-> Name;
}

void User::setIndexCurrentRoom(int indx)
{
    indexCurrentRoom = indx;
};

int User::getIndexCurrentRoom() const
{
    return this-> indexCurrentRoom;
};

void User::setUserType(int ut)
{
    UserType = ut;	
};

int User::getUserType() const
{
    return this-> UserType;
};

void User::changeNextTurn(vector<User*> user)
{
    if((nextTurn + 1)>= user.size())
    {
        nextTurn = 0;
    }
    else
    {
        nextTurn++;
    }
};
/* User Action */

/* sets up user1 */
void initUser(User& user1)
{
    string userName;
    cout<<"What is your name?";
    cin>>userName;
    user1.setName(userName);
}


int User::nextTurn = 0;

ostream& operator << (ostream& outputStream, const User& u)
{
    outputStream << u.Name;
    return outputStream;
}

bool User::operator == (const User& otherUser) const
{
    if (getIndexCurrentRoom() == otherUser.getIndexCurrentRoom())
    {
        return true;
    }
    return false;
}

void createFile()
{
	ifstream in;
	remove("save.txt");
	in.open("save.txt");
	in.close();
}

void saveUser(User user)
{
	ofstream out;
        out.open("save.txt");                            
        if(!out)    
        {
                out.close();
        }
        else
	{
		out<<user.getName()<<"\n"<<user.getIndexCurrentRoom()<<"\n";
	}
}

void startSave(User& user)
{
	string str = "";
	ifstream in;
	ifstream file("save.txt");	
	in.open("save.txt");
	if(!in)
	{
		in.close();
	}
	else
	{
		getline(file,str);
		user.setName(str);
		getline(file,str);
		int x = stoi(str);
		user.setIndexCurrentRoom(x);
	}
}


