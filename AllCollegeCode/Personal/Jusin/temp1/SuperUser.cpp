#include <iostream>
#include <utility>
#include <vector>
#include <cstdlib>
#include "SuperUser.h"

using namespace std;

SuperUser::SuperUser()
{
 	setName("Justin");
    	setIndexCurrentRoom(2);
    	setUserType(1);
};

SuperUser::SuperUser(string userName, int indx)
{
        setName(userName);
        setIndexCurrentRoom(indx);
	setUserType(1);
};

