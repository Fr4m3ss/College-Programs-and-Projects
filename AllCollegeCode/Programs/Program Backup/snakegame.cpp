/*Name: Frankie Messina
 *Date: 12/4/2019
 *Section: 4
 *Assignment: 7 (Program 1 - Snake Game)
 *Due Date: 12/6/2019
 *About this project: The purpose of this assignment is to make sure:
 *You are familiar with certain basic unix commands and can use them effectively.
 *You are familiar with the basics of shell scripting
 *You understand and can work with strings in C++, both C-Strings and C++ string objects.
 *You are familiar with dynamic memory allocation and two dimensional arrays.
 *You are familiar with the concepts of bounds checking and maintaining state.
 *You can work with pointers, structures, and files in C++.
 *You can approach a complex problem, break it down into various parts, and put together a solution.
 *Assumptions: The snake will never do a 180 degree turn. The first turn will work with the location of the gate. The gate will never be at the corner, and the obstacles will not block entry into the field. The snake will be able to move the given number of spots in the given direction without running into a wall.
 *All work below was performed by Frankie Messina.
 */

#include <iostream>

using namespace std;

//Instantiating the functions
char **createField(int width, int length);
void playGame(int rows, int cols, char** field);

//Instantiating Structures
struct Point
{
	int x, y;
};

struct Turn
{
	string dir;
	int n;
};

//Main Function
int main()
{
//Instantiating Variables
	int width;
	int length;
	
//User Input
	cout<<"Enter the number of rows: "<<endl;
	cin>>width;
	cout<<"Enter the number of columns: "<<endl;
	cin>>length;

//Making the field
	char** field = createField(width,length);

//Running the game
	playGame(width,length, field);
	
//Deleting the pointer/dynamic array
	delete field;
}

//Creating the field function
char **createField(int width, int length)
{
//Instantiating Variables
	int obstacles;
	Point point;
	char placeholder;
	
//Making the field itself
	char **field= new char*[width];
	for(int i = 0; i<width; i++)
        {	
		field[i] = new char[length];
                for(int j = 0; j<length; j++)
                {
                        if(i==0||i==(width-1))
			{
				field[i][j]='W';
			}
			else if(j==0||j==(length-1))
			{
				field[i][j]='W';
			}
			else
			{
				field[i][j]='.';
			}
		}
        }	

//User input
	cout<<"Enter the number of obstacles: "<<endl;
	cin>>obstacles;
	cout<<"Enter the locations of the obstacles: "<<endl;

//Adding in the Obstacles to the field	
	for(int i = 0; i < obstacles; i++)
	{
		cin>>point.x>>placeholder>>point.y;
		
		for(int i = 0; i<width; i++)
		{
                	for(int j = 0; j<length; j++)
                	{
                        	if(i==point.x&&j==point.y)
                        	{
                                	field[i][j]='O';
                        	}
                	}
        	}

	}

//Returning the field from the function	
	return field;
}

//Play Game Function
void playGame(int rows, int cols, char** field)
{
//Instantiating Variables
	Point point;
	Point lastSpot;
	Turn t;
        char placeholder;
	int T;	
	int runAgain=1;
	
//User Input
	cout<<"Enter the location of the gate: "<<endl;
	cin>>point.x>>placeholder>>point.y;
	
//Putting gate into the wall on the field
	for(int i = 0; i<rows; i++)
        {
                for(int j = 0; j<cols; j++)
                {
                        if(i==point.x&&j==point.y)
                        {
                                field[i][j]='G';
                        }
                }
        }
	
//Setting lastSpot point to be the gates position
	lastSpot.x=point.x;
	lastSpot.y=point.y;

//User input
	cout<<"Enter the number of turns: "<<endl;
	cin>>T;
	cout<<"Enter the turns: "<<endl;
	
//Inputting S's into the field depending on turns/spaces per turn
	for(int turns = 0; turns<T; turns++)
	{
		cin>>t.dir>>t.n;
		for(int spaces = 0; spaces<t.n; spaces++)
		{
//Checking for direction being Down
			if(t.dir=="D"&&runAgain==1)
			{
				if(field[lastSpot.x+1][lastSpot.y]!='O'&&field[lastSpot.x+1][lastSpot.y]!='S')
				{
					field[lastSpot.x+1][lastSpot.y]='S';
					lastSpot.x++;
				}
				if(field[lastSpot.x+1][lastSpot.y]=='S')
				{
					runAgain=0;
				}
			}

//Checking for direction being Up
			if(t.dir=="U"&&runAgain==1)
                        {
                                if(field[lastSpot.x-1][lastSpot.y]!='O'&&field[lastSpot.x-1][lastSpot.y]!='S')
                                {
                                        field[lastSpot.x-1][lastSpot.y]='S';
                                        lastSpot.x--;
                                }
				if(field[lastSpot.x-1][lastSpot.y]=='S')
                                {
                                        runAgain=0;
                                }
                        }
			
//Checking for direction being Right
			if(t.dir=="R"&&runAgain==1)
                        {
                                if(field[lastSpot.x][lastSpot.y+1]!='O'&&field[lastSpot.x][lastSpot.y+1]!='S')
                                {
                                        field[lastSpot.x][lastSpot.y+1]='S';
                                        lastSpot.y++;
                                }
                                if(field[lastSpot.x][lastSpot.y+1]=='S')
                                {
                                        runAgain=0;
                                }
                        }

//Checking for direction being Left
                        if(t.dir=="L"&&runAgain==1)
                        {
                                if(field[lastSpot.x][lastSpot.y-1]!='O'&&field[lastSpot.x][lastSpot.y-1]!='S')
                                {
                                        field[lastSpot.x][lastSpot.y-1]='S';
                                        lastSpot.y--;
                                }
                                if(field[lastSpot.x][lastSpot.y-1]=='S')
                                {
                                        runAgain=0;
                                }
                        }
		}
	}

//Printing the field
        for(int i = 0; i<rows; i++)
        {
                for(int j = 0; j<cols; j++)
                {
                        cout<<field[i][j];
                }
                cout<<endl;
        }
}
