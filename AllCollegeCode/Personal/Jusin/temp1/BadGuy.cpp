#include <iostream>
#include <utility>
#include <vector>
#include "BadGuy.h"
#include <fstream>
#include <string>
#include <cstdlib>

using namespace std; 

BadGuy::BadGuy()
{
	Name = "";
	curRoom = 3;
	Health = 200;
}

BadGuy::BadGuy(string n, int r, int h)
{
	Name = n;
	curRoom = r;
	Health = h;
}

void BadGuy::move(const Room rooms[])
{
	if(Health > 0)
	{
		curRoom = rand() % 6;
	}
}

string BadGuy::getName()
{
	return Name;
}

int BadGuy::getIndexCurrentRoom() const
{
	return this-> curRoom;	
}

int BadGuy::getHealth() const
{
	return Health;
}

void BadGuy::damage()
{
	if(Health > 0)
	{
		Health = (Health - (rand() % 50 + 1));
		cout<<Name<<"'s health is now "<<Health<<endl;
	}
	else
	{
		cout<<Name<<" is dead. You can no longer attack them."<<endl;
	}
}

void BadGuy::superDamage()
{
	if(Health > 0)
	{
		Health = (Health - (rand() % 50 + 1));
		cout<<Name<<"'s health is now "<<Health<<endl;
	}
	else
	{
		cout<<Name<<" is dead. You can no longer attack them."<<endl;
	}
}



void BadGuy::setName(string badName)
{
	badName = Name;
}

void multipleBadGuys()
{
	string BadG = "";
	int numBad = 0;
	bool run = true;
	while(run)
	{
		cout << "How many BadGuys would you like to play against?" <<endl;
		cin >> numBad;
		if ((numBad > 10) || (numBad < 1))
		{
			cout << "There must be a minimum of 1 BadGuy and a maximum of 10 BadGuys. Please try again.\n" << endl;
		}
		else
		{
			run = false;
		}
	}

	cout << numBad << " Bad Guys have been added.\n" << endl;

	for (int i = 0; i < numBad; i++)
	{
		cout << "Enter name for villain " << i + 1 << ":" << endl;
		cin >> BadG;
		BadGuy* vivi = new BadGuy(BadG, 3, 200);
		bahd.push_back(vivi);
	}
}

int BadGuy::badTurn = 0;

void BadGuy::changeNextTurnBahd(vector<BadGuy*> bad)
{
	if(badTurn + 1 >= bad.size())	
	{
		badTurn = 0;
	}
	else
	{
		badTurn++;
	}
}
