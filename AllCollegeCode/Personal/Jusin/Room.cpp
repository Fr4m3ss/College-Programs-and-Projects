#include <iostream>
#include <utility>
#include "Room.h"

using namespace std;

/*number of rooms*/
const int NUM_ROOMS=6;

string Room::getName() const
{
    return this-> Name;
}

void Room::setName(string nm)
{
    Name = nm;
}

void Room::setDescriptionOfRoom(string dor)
{
    DescriptionOfRoom = dor;
}

string Room::getDescriptionOfRoom() const
{
    return this-> DescriptionOfRoom;
}

ostream& operator << (ostream& outputStream, const Room& rooms)
{
    outputStream << rooms.Name;
    outputStream << '\n';
    outputStream << rooms.DescriptionOfRoom;
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




