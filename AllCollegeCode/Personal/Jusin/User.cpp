#include <iostream>
#include <utility>
#include <vector>
#include "User.h"



using namespace std;

void promptUserAction(User &user1, const Room rooms[], string &strCh)
{
    /* tell user where they are */
    cout << user1 << ", you are in the room " << rooms[user1.getIndexCurrentRoom()] <<  endl;
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

void User::changeNextTurn(vector<User> user)
{
    if (nextTurn + 1 == user.size())
    {
        nextTurn = 0;
    }
    else
    {
        nextTurn++;
    }
};

User::User(string userName, int indx)
{
    Name = userName;
    indexCurrentRoom = indx;
};

User::User()
{
    Name = "Justin";
    indexCurrentRoom = 2;
};


/* User Action */


/* implement Users Action */
void implementUserAction(User& user1, const Room rooms[], string strCh, vector<User> users)
{
    if ((strCh =="N") ||(strCh =="n"))
    {
        /* user has selected to move north

         is it possible to move north from the room the user
        is currently in */
        int indxRoomNorth = rooms[user1.getIndexCurrentRoom()].getIndexRoomToNorth();
        if (indxRoomNorth != -99 && indxRoomNorth != -89 && indxRoomNorth != -79 && indxRoomNorth != -69)
        {
            user1.setIndexCurrentRoom(indxRoomNorth);
            cout << user1.getName() <<", you are now in " << rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        /*user has selected to move east*/
        if (indxRoomNorth == -99)
        {
            cout<< user1.getName() <<", you can not move west from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomNorth == -89)
        {
            cout<<user1.getName()<<", you can not move east from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomNorth == -79)
        {
            cout<<user1.getName()<<", you can not move south from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomNorth == -69)
        {
            cout<<user1.getName()<<", you can not move north from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
    }
    else if ((strCh =="S") ||(strCh =="s"))
    {
        /*user has selected to move south

        is it possible to move south from the room the user
        is currently in*/
        int indxRoomSouth = rooms[user1.getIndexCurrentRoom()].getIndexRoomToSouth();
        if (indxRoomSouth != -99 && indxRoomSouth != -89 && indxRoomSouth != -79 && indxRoomSouth != -69)
        {
            user1.setIndexCurrentRoom(indxRoomSouth);
            cout<<user1.getName()<<", you are now in "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomSouth == -99)
        {
            cout<<user1.getName()<<", you can not move west from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomSouth == -89)
        {
            cout<<user1.getName()<<", you can not move east from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomSouth == -79)
        {
            cout<<user1.getName()<<", you can not move south from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomSouth == -69)
        {
            cout<<user1.getName()<<", you can not move north from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
    }
    else if ((strCh =="E") ||(strCh =="e"))
    {
        /*user has selected to move east

         is it possible to move south from the room the user
        is currently in*/
        int indxRoomEast = rooms[user1.getIndexCurrentRoom()].getIndexRoomToEast();
        if (indxRoomEast != -99 && indxRoomEast != -89 && indxRoomEast != -79 && indxRoomEast != -69)
        {
            user1.setIndexCurrentRoom(indxRoomEast);
            cout << user1.getName() << ", you are now in " << rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomEast == -99)
        {
            cout<<user1.getName()<<", you can not move west from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomEast == -89)
        {
            cout<<user1.getName()<<", you can not move east from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomEast == -79)
        {
            cout<<user1.getName()<<", you can not move south from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomEast == -69)
        {
            cout<<user1.getName()<<", you can not move north from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
    }
    else if ((strCh =="W") ||(strCh =="w"))
    {
        /*user has selected to move west

         is it possible to move south from the room the user
        is currently in*/
        int indxRoomWest = rooms[user1.getIndexCurrentRoom()].getIndexRoomToWest();
        if (indxRoomWest != -99 && indxRoomWest != -89 && indxRoomWest != -79 && indxRoomWest != -69)
        {
            user1.setIndexCurrentRoom(indxRoomWest);
            cout << user1.getName() << ", you are now in " << rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomWest == -99)
        {
            cout<<user1.getName()<<", you can not move west from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomWest == -89)
        {
            cout<<user1.getName()<<", you can not move east from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomWest == -79)
        {
            cout<<user1.getName()<<", you can not move south from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
        if (indxRoomWest == -69)
        {
            cout<<user1.getName()<<", you can not move north from "<<rooms[user1.getIndexCurrentRoom()].getName()<<endl;
        }
    }
    else if ((strCh =="Q") ||(strCh =="q"))
    {
        /*user has selected to quit*/
        cout<<"Thank you for playing..."<<endl;
    }

    else if ((strCh == "O") || (strCh == "o"))
    {
        cout << "\nThese users are in this room: \n";
        /* user has selected to see if any other users are in the same room */
        for (int i = 0; i < users.size(); i++)
        {
            if (users[i] == users[user1.nextTurn])
            {
                cout  << users[i].getName() << endl;
            }
        }
        cout << "\n";
    }



    else
    {
        /*user has selected an invalid option*/
        cout<<strCh<<" is not a valid option."<<endl;
    }
}


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
}

bool User::operator == (const User& otherUser) const
{
    if (getIndexCurrentRoom() == otherUser.getIndexCurrentRoom())
    {
        return true;
    }
}

