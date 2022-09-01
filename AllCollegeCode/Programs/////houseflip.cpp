/*Name: Frankie Messina
 *Date: 11/20/2019
 *Section: 4
 *Assignment: 6 (Program 2 - House Flipping)
 *Due Date: 11/22/2019
 *About this project: The purpose of this assignment is to make sure:
 *You understand and can work with C++ arrays.You are familiar with certain basic unix commands and can use them effectively.
 *You understand and can work with strings in C++, both C-Strings and C++ string objects.
 *You are comfortable with writing functions in C++.
 *You are familiar with repetitive structures (loops) and selection statements (if/else or switch)
in any combination and can use them in functions and to manipulate array/string data.
 *You can approach a complex problem, break it down into various parts, and put together a
solution.
 *You are comfortable with writing functions in C++.
 *You are familiar with repetitive structures (loops) and selection statements (if/else or switch) in any combination and can use them in functions and to manipulate array data.
 *You can approach a complex problem, break it down into various parts, and put together a solution.
 *Assumptions: The text entered will be properly typed in with spaces.
 *All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <string>

using namespace std;

//Instantiating Functions
string flipHouse();

int main()
{
	//Instantiating Variables
	string print = flipHouse();
	
	//Print Statement
	cout<<"The mirrored house is: "<<endl<<print<<endl;
	
	//Return Statement
	return 0;
}

//House Flip Function
string flipHouse()
{
	
//Instantiating Variables
	int lines;
	
//User input
	cout<<"Enter the number of lines: "<<endl;
	cin>>lines;
	cout<<"Enter the house image: "<<endl;
	
//Instantiating Arrays
	string str[lines+1];
	string mir[lines+1];	

//Instantiating Variables
	string temp;
	string output;	

//User input of strings into the arrays
	for(int i = 0; i<=lines; i++)
	{
		getline(cin,temp);
		str[i]=temp;
		mir[i]=temp;	
	}	
	
//Mirroring the inputted strings and setting them to mir
	for(int i = 1; i<=lines; i++)
	{
		for(int j = 0; j<str[i].length(); j++)
		{
			mir[i][j]=str[i][str[i].length()-1-j];
		}
	}
	
//Flipping the charachters to match new mirrored image
	for(int i = 1; i<=lines; i++)
	{
		for(int j = 0; j<mir[i].length(); j++)
		{	
			if(mir[i][j]=='[')
			{
				mir[i][j]=']';
			}
			else if(mir[i][j]==']')
                        {
				mir[i][j]='[';
                        }  
			else if(mir[i][j]=='/')
                        {
				mir[i][j]='\\';
                        }  		
			else if(mir[i][j]=='\\')
                        {
				mir[i][j]='/';
                        }  	
		}
	}
	
//Setting the string to the array, and adding new lines in order to keep the proper format
	for(int i = 1; i<=lines; i++)
	{
		output+=mir[i];
		output+="\n";	
	}

//Returning the string
	return output;
}
