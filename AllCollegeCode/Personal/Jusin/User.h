#include <iostream>
#include <utility>
#include <vector>
#include "Room.h"

using namespace std;

#ifndef TEXTBASEDGAMEPART4_USER_H
#define TEXTBASEDGAMEPART4_USER_H
class User
{
private:
    string Name;
    int indexCurrentRoom;

public:
    /*User selects an action*/

    static int nextTurn;


    void setName(string);

    string getName() const;

    void setIndexCurrentRoom(int indx);

    int getIndexCurrentRoom() const;

    static void changeNextTurn(vector<User> user);

    User(string, int indx);

    User();

    friend ostream& operator << (ostream& outputStream, const User& u);
    bool operator == (const User& otherUser) const;
};
#endif //TEXTBASEDGAMEPART4_USER_H

void promptUserAction(User&,const Room rooms[], string& strCh);

/*implement Users Action*/
void implementUserAction(User&,const Room rooms[], string strCh, vector<User> users);

/* sets up user*/
void initUser(User&);

