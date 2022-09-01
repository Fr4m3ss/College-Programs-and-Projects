// Bob Myers
// Test program that was provided to the students

#include <iostream>
using namespace std;

#include "grid.h"


int main()
{
  // set up the initial grid

  Grid g(9,15,2,13,Grid::WEST);

  g.PutDown(2,1);

  for (int i = 0; i < 7; i++)
  {
     g.PlaceBlock(i,11);
     g.PlaceBlock(i,7);
     g.PlaceBlock(i,3);
     g.PlaceBlock(i+2,5);
     g.PlaceBlock(i+2,9);
  }

  g.Display();

  // now start moving

  g.TurnLeft();
  g.Move(5);
  g.Display();

  g.TurnLeft();
  g.TurnLeft();
  g.TurnLeft();
  g.Move(1);
  g.Display();  

  for (int i = 0; i < 2; i++)
  {
    g.Move(2);
    g.Display();

    g.TurnLeft();
    g.TurnLeft();
    g.TurnLeft();
    g.Move(6);
    g.Display();  

    g.PutDown();
    g.Display();  

    g.TurnLeft();
    g.Move(2);
    g.Display();

    g.TurnLeft();
    g.Move(6);
    g.Display();

    g.TurnLeft();
    g.TurnLeft();
    g.TurnLeft();
  }

  g.Move(3);
  g.Display();

  g.TurnLeft();
  g.TurnLeft();
  g.TurnLeft();
  g.Move(5);
  g.Display();

  g.PickUp();
  g.Display();

  g.TurnLeft();
  g.Move(1);
  g.Display();

  g.TogglePath();
  g.Display();
  g.TogglePath();
  g.Display();
  
  g.Grow(3,3);
  g.Display();
  g.Grow(10,10);
  g.Display();
  g.Grow(40,40);
  g.Display();
}

