#include <iostream>
#include <utility>
#include <vector>
#include <cstdlib>
#include "User.h"

using namespace std;

class SuperUser : public User
{
private:

public:

//Default Constructor
SuperUser();

//Constructor
SuperUser(string userName, int indx);

void teleportRand(User& user)
{
        int x = rand() % 5;
	user.setIndexCurrentRoom(x); 
};


};

