 /*
 *Name: Frankie Messina
 *Date: 9/22/2019
 *Section: 4 
 *Assignment: 2 (Ordering 3 numbers) 
 *Due Date: 9/26/19 
 *About this project: The purpose of this assignment is to
 *Use basic unix commands to navigate through the file system.
 *Write, compile and run programs on the command line.
 *Use the iostream library to perform console input and output.
 *Use variables and arithmetic operators in C++ to do basic math.
 *Familiarize yourself with selection statements (if . . . else and switch).
 *Use fundamental algorithmic error checking (checking the validity of user input).
 *Assumptions: The user will only enter the proper type of data for the 3 numbers and the ordering (no type checking)
 *All work below was performed by Frankie Messina. 
 */
#include <iostream>
using namespace std;
int main()
{
//Initializing Variables
double x, y, z;
string order;

//User Input
cout<<"Please input 3 different numbers: "<<endl;
cin>>x>>y>>z;

//Error checking
if(x==y&&x==z)
{
	cout<<"Error, you entered the same number 3 times"<<endl;
}
else
{

//User Input
	cout<<"Please enter either (A) for Ascending or (D) for Descending: "<<endl;
	cin>>order;

//Error Checking
	if(order!="A"&&order!="D")
	{
		cout<<"You didn't enter a valid choice: Please try again!"<<endl;
	}
	else
	{

//Descending
		if(order=="D")
		{
			if(x>y&&x>z)
			{
				cout<<x<<", ";
				if(y>z)
				{
					cout<<y<<", "<<z<<endl;
				}
				else
				{
					cout<<z<<", "<<y<<endl;
				}
			}
	
			if(y>x&&y>z)
                        {
                                cout<<y<<", ";
                                if(x>z)
                                {
                                        cout<<x<<", "<<z<<endl;
                                }
                                else
                                {
                                        cout<<z<<", "<<x<<endl;
                                }
                    	}
			
			if(z>x&&z>y)
                        {
                                cout<<z<<", ";
                                if(y>x)
                                {
                                        cout<<y<<", "<<x<<endl;
                                }
                                else
                                {
                                        cout<<x<<", "<<y<<endl;
                                }
                        }
		}

//Ascending
		if(order=="A")
                {
                        if(x<y&&x<z)
                        {
                                cout<<x<<", ";
                                if(y<z)
                                {
                                        cout<<y<<", "<<z<<endl;
                                }
                                else
                                {
                                        cout<<z<<", "<<y<<endl;
                                }
                        }

                        if(y<x&&y<z)
                        {
                                cout<<y<<", ";
                                if(x<z)
                                {
                                        cout<<x<<", "<<z<<endl;
                                }
                                else
                                {
                                        cout<<z<<", "<<x<<endl;
                                }
                        }

                        if(z<x&&z<y)
                        {
                                cout<<z<<", ";
                                if(y<x)
                                {
                                        cout<<y<<", "<<x<<endl;
                                }
                                else
                                {
                                        cout<<x<<", "<<y<<endl;
                                }
                        }
                }

	}


	
}




}
