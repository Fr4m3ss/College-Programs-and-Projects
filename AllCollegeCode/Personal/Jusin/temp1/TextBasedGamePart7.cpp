/* Name: Justin Lin
Date: 10 - 01 - 21
Section: ???
Assignment: Module 6 Text-based game Program - Part 5
Due Date: 10 - 03 - 21
About this project: This is a text-based game program that allows the user to move North East South or West. Each "room"
is unique to itself, with vivid descriptions about the environment in each "room". With the new addition of code however
we use 2 different classes for the User and the Rooms. With the new addition of code, we added another user and they
take turns moving on the map. Code changes include vectors, multiple users, and also overload operators. we also use 
pointers and make many changes. As requested for Module 6,I added a badguy into the game. i also allowed users to save 
their progress. 
Assumptions: NA
All work below was performed by Justin Lin */


#include <vector>
#include <iostream>
#include <utility>
#include "User.cpp"
#include "Room.cpp"
#include "BadGuy.cpp"   
#include "SuperUser.cpp"
using namespace std;

/* implement Users Action */
void implementUserAction(User& user1, const Room rooms[], string strCh, vector<User*> users, BadGuy& badguy)
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
        bool run = true;
        while(run)
        {
            cout<<"Save data?: "<<endl;
            cin>>strCh;
            if(strCh == "Y" || strCh == "y")
            {
                saveUser(user1);
                run = false;
            }
            else if(strCh == "N" || strCh == "n")
            {
                run = false;
            }
            else
            {
                cout<<"Invalid input: please answer yes (Y) or no (N)"<<endl;
                run = true;
            }
        }
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
                cout  << users[i]->getName() << endl;
            }
        }
        cout << "\n";
    }
    else if((strCh == "A") || (strCh == "a"))
    {
	 if(user1.getIndexCurrentRoom() == badguy.getIndexCurrentRoom())
	 {
		badguy.damage();
	 }
	 else
	 {
		cout<<"There is no Bad Guy in the room for you to attack. You swing, and miss."<<endl;
	 }
    }
    else if ((strCh == "X") || (strCh == "x"))
    {
    	if(user1.getUserType() == 1)
	{
		badguy.superDamage();
	}
	else
	{
		 cout<<"You are not a super user, therefore you are unable to use this move. Please try again.";
	}
    }
    else if ((strCh == "T") || (strCh == "t"))
    {
    	if(user1.getUserType() == 1)
	{
		SuperUser temp = SuperUser();
		temp.teleportRand(user1);
	}
	else
	{
		 cout<<"You are not a super user, therefore you are unable to use this move. Please try again.";
	}

    }
    else
    {
        /*user has selected an invalid option*/
        cout<<strCh<<" is not a valid option."<<endl;
    }   
}



int main()
{
    Room rooms[NUM_ROOMS];
		
    string input1;
    bool runT = true;
    BadGuy badGuy;
    string userName;
    /*initialize rooms*/
    initRooms(rooms);
    User user1("",0);
    cout<<"Would you like to start from where you left off"<<endl;
    vector<User*> users;
    users.push_back(&user1);
    while(runT)
    {
    	    cin>>input1;
	    if(input1 == "Y" || input1 == "y")
	    {
		startSave(user1);
		User user2 = User();
		runT = false;
		users.push_back(&user2);
	    }
	    else if(input1 == "N" || input1 == "n")
	    {
	    	initUser(user1);
		runT = false;
		users.push_back(new SuperUser);
	    }
	    else
	    {
		cout<<"Invalid choice: try again"<<endl;
		runT = true;
	    }
    }
   createFile();
    /*welcome*/
    cout << "Welcome to my game!" << endl;
    multipleBadGuys();
    int temp = 0, temp2 = 0;

    string UserAction;

    do
    {
        if(temp2 == users.size())
        {
            temp = 0;
            temp2 = 0;
        }
        if(users[user1.nextTurn]->getIndexCurrentRoom() == bahd[badGuy.badTurn]->getIndexCurrentRoom() && bahd[badGuy.badTurn]->getHealth() > 0)
	{
		cout<<"\nBad Guy "<<bahd[badGuy.badTurn]->getName()<< " is in the room with you.";
	}
	promptUserAction(*users[user1.nextTurn], rooms, UserAction);
        implementUserAction(*users[user1.nextTurn], rooms, UserAction, users, *bahd[badGuy.badTurn]);
	users[user1.nextTurn]->changeNextTurn(users);
	bahd[badGuy.badTurn]->move(rooms);
	bahd[badGuy.badTurn]->changeNextTurnBahd(bahd);


        if((UserAction == "q") || (UserAction == "Q"))
        {
            temp++;
        }
	
        temp2++;
    }
    while (temp != users.size()) ;
    /*continue until user decides to quit*/
    return 0;
}


