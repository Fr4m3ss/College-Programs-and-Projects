#include <iostream>
#include <utility>
#include <vector>

using namespace std;

#ifndef TEXTBASEDGAMEPART4_ROOM_H
#define TEXTBASEDGAMEPART4_ROOM_H
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
    string getName() const;
    void setName(string nm);
    void setDescriptionOfRoom(string);
    string getDescriptionOfRoom() const;
    friend ostream& operator << (ostream& outputStream, const Room& rooms);
    void setIndexRoomToNorth(int indx);
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
void initRooms(Room rooms[]);
#endif //TEXTBASEDGAMEPART4_ROOM_H
