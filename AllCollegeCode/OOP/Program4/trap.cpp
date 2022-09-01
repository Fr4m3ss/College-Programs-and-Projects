//Francseco Messina, Section 7, Program 4: "Grid"

#include <iostream>
using namespace std;
#include "grid.h"

int main()
{
	//Instantiating Variables
	int r;
	int c;

	//Taking user input
	cout<<"Enter the number of rows:"<<endl;
	cin>>r;
	cout<<"Enter the number of cols:"<<endl;
	cin>>c;

	//Setting up the initial grid
	Grid g(r,c);
	g.Display();
	
	int success = 0;
	int wall = 0;
	
	//Sends mover to wall directly in front of it
	while(wall == 0)
	{
		if(!g.FrontIsClear())
		{
			wall = 1;
			g.TurnLeft();
		}
		else
		{
			g.Move(1);
		}
		
		//Checks to make sure that it didnt walk directly into the exit
		if(g.GetRow() == 0 || g.GetCol() == 0 || g.GetRow() == g.GetNumRows()-1 || g.GetCol() == g.GetNumCols()-1)
		{
			wall = 1;
			success = 1;
		}
	}

	//Moves mover around perimeter of wall until it detects an exit
	while(success == 0)
	{
		if(g.FrontIsClear() && !g.RightIsClear())
		{
			g.Move(1);
		}
		else if(g.RightIsClear())
		{
			g.TurnLeft();
                        g.TurnLeft();
                        g.TurnLeft();
			g.Move(1);
			success = 1;	
		}
		else if(!g.FrontIsClear())
		{
			g.TurnLeft();
		}
	}

	//Prints success message and coordinates
	if(success == 1)
	{
		cout<<"We Escaped! The final position of the mover was: ("<<g.GetRow()<<", "<<g.GetCol()<<")"<<endl;
		g.Display();
	}
	

}

