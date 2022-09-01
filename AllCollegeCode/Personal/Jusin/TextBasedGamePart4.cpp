#include <vector>
#include <iostream>
#include <utility>
#include "User.cpp"
#include "Room.cpp"

using namespace std;

int main()
{
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
    int temp = 0, temp2 = 0;

    string UserAction = "";
    do
    {
        if(temp2 == users.size())
        {
            temp = 0;
            temp2 = 0;
        }


        promptUserAction(users[user1.nextTurn], rooms, UserAction);
        implementUserAction(users[user1.nextTurn], rooms, UserAction, users);
        users[user1.nextTurn].changeNextTurn(users);
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



