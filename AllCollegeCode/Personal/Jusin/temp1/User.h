#include <iostream>
#include <utility>
#include <vector>
#include "Room.h"
#include "BadGuy.h"
using namespace std;

#ifndef TEXTBASEDGAMEPART4_USER_H
#define TEXTBASEDGAMEPART4_USER_H
class User
{
private:
    string Name;
    int indexCurrentRoom;
    int UserType;

public:
    /*User selects an action*/

    static int nextTurn;
    enum UserTypes{NORMAL, SUPERUSER, UNKNOWN};


    User();

    User(string, int indx);

    void setName(string);

    string getName() const;

    void setIndexCurrentRoom(int indx);

    int getIndexCurrentRoom() const;

    void setUserType(int ut);

    int getUserType() const;

    static void changeNextTurn(vector<User*> user);
    friend ostream& operator << (ostream& outputStream, const User& u);
    bool operator == (const User& otherUser) const;

    virtual void teleportRand(User& user) {};   	

};
#endif //TEXTBASEDGAMEPART4_USER_H

void promptUserAction(User&,const Room rooms[], string& strCh);

/* sets up user*/
void initUser(User&);
void startSave(User& user);
void createFile();
void saveUser(User user);
 

