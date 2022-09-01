#include <iostream>
#include <utility>
#include <vector>
#include "Room.h"

using namespace std;

#ifndef TEXTBASEDGAMEPART4_BADGUY_H
#define TEXTBASEDGAMEPART4_BADGUY_H
class BadGuy
{
private:
string Name;
int curRoom;
int Health;
public:
static int badTurn;
BadGuy();
BadGuy(string n, int r, int h);
void move(const Room rooms[]);
string getName();
int getHealth() const;
int getIndexCurrentRoom() const;
void damage();
void superDamage();
void setName(string);
void changeNextTurnBahd(vector<BadGuy*> bad);
};

vector <BadGuy*> bahd;

void multipleBadGuys();
#endif //TEXTBASEDGAMEPART4_BADGUY_H
