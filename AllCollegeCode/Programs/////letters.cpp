/*
 * Name:Frankie Messina
 * Date: 10/6/19
 * Section: 4
 * Assignment: 3 (Program 2 - Printing Letters)
 * Due Date: 10/9/19
 * About this project: The purpose of this assignment is to:
 * Make sure you can use Unix commands to navigate through and use a Unix machine.
 * Make sure you are familiar with repetitive structures (loops) and selection statements (if/else or switch) in any combination.
 * Make sure you can recover from wrong user inputs.
 * Make sure you are comfortable with console input and output involving numeric types.
 * Make suer you can approach a complex problem, break it down into various parts, and put together a solution.
 * Assumptions: The user inputs an odd number greater than or equal to 5, and the user will always input 'Y' or 'N' to repeat.
 * All work below was performed by Frankie Messina.
 */

#include <iostream>
using namespace std;

int main()
{
//Instantiating Variables
int size;
char letter;
char repeat='Y';

cout<<"Welcome to the letter printer."<<endl;

while(repeat=='Y')
{
	//User Input
	cout<<"Enter the size : "<<endl;
	cin>>size;

	//Input Validation
	while(size%2==0||size<5)
	{
		cout<<"Invalid size. Enter the size again: "<<endl;
		cin>>size;
	}

	//User Input
	cout<<"Enter the Letter: "<<endl;
	cin>>letter;

	//Input Validation
	while(letter!='S'&&letter!='O'&&letter!='P')
	{
		cout<<"Invalid letter: Enter the letter again: "<<endl;
		cin>>letter;
	}

	//Printing Letters
	//S
	if(letter=='S')
	{
		for(int i = 0; i<size; i++)				//Height of Letter
		{	
			if(i==0)					//Top of Letter
			{	
				for(int j = 0; j<size; j++)
				{
					cout<<"*";
				}
				cout<<endl;
			}
			else if(i<((size-1)/2))				//First half of the body
			{
				cout<<"*"<<endl;
			}
			else if(i==((size-1)/2))			//Center line of Letter
			{
				for(int j = 0; j<size; j++)
                        	{
                                	cout<<"*";
                        	}
                        	cout<<endl;
			}
			else if(i==(size-1))				//Last line of Letter
			{
				for(int j = 0; j<size; j++)
                        	{
                                	cout<<"*";
                        	}
                        	cout<<endl;
			}
			else if(i>((size-1)/2))				//Last half of the body
			{
				for(int j = 0; j<size-1; j++)
                        	{
                               		cout<<" ";
                        	}
                        	cout<<"*"<<endl;
			}
		
		}	
	}

	//O
	if(letter=='O')
	{
        	for(int i = 0; i<size; i++)                             //Height of Letter
        	{
                	if(i==0)                                        //Top of Letter
                	{
                        	for(int j = 0; j<size; j++)
                        	{
                                	cout<<"*";
                        	}
                        	cout<<endl;
                	}
                	else if(i<(size-1))                         	//Body
                	{
				cout<<"*";
                        	for(int j = 0; j<(size-2); j++)
                        	{
                                	cout<<" ";
                        	}
				cout<<"*"<<endl;
                	}
                	else if(i==(size-1))                            //Last line of Letter
                	{
                        	for(int j = 0; j<size; j++)
                        	{
                                	cout<<"*";
                        	}
                        	cout<<endl;
                	}
        	}
	}

	//P
	if(letter=='P')
	{
        	for(int i = 0; i<size; i++)                             //Height of Letter
        	{
               		if(i==0)                                        //Top of Letter
                	{
                        	for(int j = 0; j<size; j++)
                        	{
                                	cout<<"*";
                        	}
                        	cout<<endl;
                	}
                	else if(i<((size-1)/2))                         //First half of the body
                	{
                        	cout<<"*";
                        	for(int j = 0; j<(size-2); j++)
                        	{
                                	cout<<" ";
                        	}
                        	cout<<"*"<<endl;
                	}
                	else if(i==((size-1)/2))                        //Center line of Letter
                	{
                        	for(int j = 0; j<size; j++)
                        	{
                                	cout<<"*";
                        	}
                        	cout<<endl;
                	}
                	else if(i>((size-1)/2))                         //Last half of the body
                	{
                        	cout<<"*"<<endl;
                	}
        	}
	}

	cout<<"Would you like to continue? (Y or N): "<<endl;
	cin>>repeat;

}

}
