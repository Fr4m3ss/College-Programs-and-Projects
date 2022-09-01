/* Name: Justin Lin
Date: 09 - 18 - 21
Section: ???
Assignment: Module 4 Text-based game Program - Part 3
Due Date: 09 - 19 - 21
About this project: This is a text-based game program that allows the user to move North East South or West. Each "room"
is unique to itself, with vivid descriptions about the environment in each "room". With the new addition of code however
 we use 2 different classes for the User and the Rooms. With the new addition of code, we added another user and they
 take turns moving on the map. Code changes include vectors, multiple users, and also overload operators.
Assumptions: NA
All work below was performed by Justin Lin */

#include <iostream>
#include <utility>
#include <vector>

using namespace std;

/*number of rooms*/
const int NUM_ROOMS=6;

/* creates a class called User (for Mod3)*/
class User
{
private:
    string Name;
    int indexCurrentRoom;
    static int nextTurn;

public:
    /* set the name of the user */
    void setName(string userName)
    {
        Name = (userName);
    };

    /* get the name of the user */
    string getName()
    {
        return Name;
    };

    /* set the index of the current room */
    void setIndexCurrentRoom(int indx)
    {
        indexCurrentRoom = indx;
    };

    /* get the name of the current room */
    int getIndexCurrentRoom() const
    {
        return indexCurrentRoom;
    };

    static void changeNextTurn(vector<User> user) {
        if (nextTurn + 1 == user.size())
        {
            nextTurn = 0;
        }
        else
        {
            nextTurn++;
        }
    };

    User(string userName, int indx)
    {
        Name = userName;
        indexCurrentRoom = indx;
    };

    User()
    {
        Name = "Justin";
        indexCurrentRoom = 2;
    };
};

/*room class*/
class Room
{
private:
    string Name;
    int IndexOfRoomToNorth;
    int IndexOfRoomToSouth;
    int IndexOfRoomToEast;
    int IndexOfRoomToWest;
    string DescriptionOfRoom;
public:
    /* return the name of the room */
    string getName()
    {
        return Name;
    };

    /*set the name of the room*/
    void setName(string nm)
    {
        Name = nm;
    };

    /*set description of room*/
    void setDescriptionOfRoom(string dor)
    {
        DescriptionOfRoom = dor;
    };

    /*set description of room*/
    string getDescriptionOfRoom()
    {
        return DescriptionOfRoom;
    };

    /*set the index of the room to the north*/
    void setIndexRoomToNorth(int indx);
    /*get the index of the room to the north*/
    int getIndexRoomToNorth() const;

    /*set the index of the room to the south*/
    void setIndexRoomToSouth(int indx);
    /*get the index of the room to the south*/
    int getIndexRoomToSouth() const;

    /*set the index of the room to the east*/
    void setIndexRoomToEast(int indx);
    /*get the index of the room to the east*/
    int getIndexRoomToEast() const;

    /*set the index of the room to the west*/
    void setIndexRoomToWest(int indx);
    /*get the index of the room to the west*/
    int getIndexRoomToWest() const;
};

static int nextTurn = 0;

/* sets up rooms*/
void initRooms(Room rooms[]);
/* sets up user*/
void initUser(User&);
/* sets up description */

/*User selects an action*/
void promptUserAction(User&,Room rooms[], string &strCh);
/*implement Users Action*/
void implementUserAction(User&,Room rooms[],const string& strCh);

int main() {
    Room rooms[NUM_ROOMS];

    string userName;
    /*initialize rooms*/
    initRooms(rooms);
    User user1("",0);
    User user2 = User();
    initUser(user1);
    vector<User> users;
    users.push_back(user1);
    users.push_back(user2);
    /*welcome*/
    cout << "Welcome to my game!" << endl;

    string UserAction;
    do
    {
        promptUserAction(users[nextTurn], rooms, UserAction);
        implementUserAction(users[nextTurn],rooms,UserAction);
        users[nextTurn].changeNextTurn(users);
    }
    while (((UserAction != "Q")&&(UserAction != "q")));
    /*continue until user decides to quit*/
    return 0;
}

/*sets up rooms*/
void initRooms(Room rooms[])
{
    /*init Cave*/
    rooms[0].setName("Cave");
    rooms[0].setIndexRoomToNorth(-69);
    rooms[0].setIndexRoomToSouth(1);
    rooms[0].setIndexRoomToEast(-89);
    rooms[0].setIndexRoomToWest(-99);
    rooms[0].setDescriptionOfRoom("The cave is filled with rigid rocks and a general ominous vibe.\n");

    /*init Forest*/
    rooms[1].setName("Forest");
    rooms[1].setIndexRoomToNorth(0);
    rooms[1].setIndexRoomToSouth(2);
    rooms[1].setIndexRoomToEast(4);
    rooms[1].setIndexRoomToWest(3);
    rooms[1].setDescriptionOfRoom("In the forest, you find a diverse amount of living creatures with the "
                                  "overall environment being very lively.\n");
    /*init Lake*/
    rooms[2].setName("Lake");
    rooms[2].setIndexRoomToNorth(1);
    rooms[2].setIndexRoomToSouth(5);
    rooms[2].setIndexRoomToEast(-89);
    rooms[2].setIndexRoomToWest(-99);
    rooms[2].setDescriptionOfRoom("The lake is quite empty. theres not much to explore but you do see small "
                                  "tadpoles and hear the croaks of nearby frogs.\n");
    /*init Mountain*/
    rooms[3].setName("Mountain");
    rooms[3].setIndexRoomToNorth(-69);
    rooms[3].setIndexRoomToSouth(-79);
    rooms[3].setIndexRoomToEast(1);
    rooms[3].setIndexRoomToWest(-99);
    rooms[3].setDescriptionOfRoom("You explore up the mountain and find yourself at the top of the mountain "
                                  "with a huge picture-perfect scene.\n");
    /*init Treehouse*/
    rooms[4].setName("Treehouse");
    rooms[4].setIndexRoomToNorth(-69);
    rooms[4].setIndexRoomToSouth(-79);
    rooms[4].setIndexRoomToEast(-89);
    rooms[4].setIndexRoomToWest(1);
    rooms[4].setDescriptionOfRoom("You see a big treehouse that seems to be completely unoccupied. The wood "
                                  "planks seem to be falling off.\n");
    /*init Town*/
    rooms[5].setName("Town");
    rooms[5].setIndexRoomToNorth(2);
    rooms[5].setIndexRoomToSouth(-79);
    rooms[5].setIndexRoomToEast(-89);
    rooms[5].setIndexRoomToWest(-99);
    rooms[5].setDescriptionOfRoom("At the town, you feel a sense of safety. the streets seem to be clustered "
                                  "with convenience stores but since you're practically in the middle of nowhere, "
                                  "the environment seems quite Amish.\n");
}


/* sets up user1 */
void initUser(User& user1)
{
    string userName;
    cout<<"What is your name?";
    cin>>userName;
    user1.setName(userName);
}

/* User Action */
void promptUserAction(User& user1, Room rooms[], string &strCh)
{
    /* tell user where they are */
    cout << user1.getName() << ", you are currently in "<< rooms[user1.getIndexCurrentRoom()].getName() << "\n"
         << rooms[user1.getIndexCurrentRoom()].getDescriptionOfRoom() << endl;
    /* prompt user for choice */
    cout<<"What would you like to do?"<<endl;
    cin>>strCh;
}
/* implement Users Action */
void implementUserAction(User& user1, Room rooms[],const string& strCh)
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
    else
    {
        /*user has selected an invalid option*/
        cout<<strCh<<" is not a valid option."<<endl;
    }
}



/* Room class
set the index of the room to the north*/
void Room::setIndexRoomToNorth(int indx)
{
    IndexOfRoomToNorth=indx;
}

/*get the index of the room to the north*/
int Room::getIndexRoomToNorth() const
{
    return IndexOfRoomToNorth;
}

/*set the index of the room to the south*/
void Room::setIndexRoomToSouth(int indx)
{
    IndexOfRoomToSouth=indx;
}

/*get the index of the room to the south*/
int Room::getIndexRoomToSouth() const
{
    return IndexOfRoomToSouth;
}

/*set the index of the room to the east*/
void Room::setIndexRoomToEast(int indx)
{
    IndexOfRoomToEast=indx;
}

/*get the index of the room to the east*/
int Room::getIndexRoomToEast() const
{
    return IndexOfRoomToEast;
}

/*set the index of the room to the west*/
void Room::setIndexRoomToWest(int indx)
{
    IndexOfRoomToWest=indx;
}

/*get the index of the room to the west*/
int Room::getIndexRoomToWest() const
{
    return IndexOfRoomToWest;
}

