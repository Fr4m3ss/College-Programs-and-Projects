 /*
 * Name:Frankie Messina
 * Date: 10/22/19
 * Section: 4
 * Assignment: 4 (Program 1 - Special Values)
 * Due Date: 10/24/19
 * About this project: The purpose of this assignment is to make sure:
 * You are comfortable with C++ functions (pre-defined and user-defined).
 * You are familiar with C++ control structures (loops and branches) in any combination.
 * You can recover from wrong user inputs.
 * You are comfortable with console input and output involving numeric types.
 * You can approach a complex problem, break it down into various parts, and put together a solution.
 * Assumptions: The user inputs a 0 when they want to stop entering numbers.
 * All work below was performed by Frankie Messina.
 */



#include <iostream>
#include <cstdlib>
using namespace std;

//Instantiating Functions
int reverse(int a);
int value(int b);

//Main
int main()
{
//Instantiating Variables
int numberinput=1;
int sum=0;

//User input
cout<<"Enter the numbers: "<<endl;
	while(numberinput!=0)			//Checking for 0 or not
	{
	cin>>numberinput;
		if(numberinput!=0)		//Stops Floating Exception with n/0
		{
		sum+=value(numberinput);	//Calculates value and adds to sum
		}
	}
	
cout<<"The Sum is "<<sum<<endl;			//Prints Sum

return 0;
}

//Reverse Function
int reverse(int a)
{
	//Instantiating Variables
	int backwards=0;
	int before = a;
	int digits = 0;
	int tempa = a;
	
	//Counting how many Digits the number is	
	while(tempa!=0)
	{
	tempa=tempa/10;
	++digits;
	}	
	
	//Reversing the number
	for(int i = 0; i<digits; i++)
	{	
	backwards+=(a%10);
	a=a/10;
		if(a!=0)
		{
		backwards*=10;
		}	
	}
	a=before;
	
	//Returning the reversed number
	return backwards;
}

//Value Function
int value(int b)
{
	//Instantiating Variable
	int special = 0;
	
	//Calculating Special Value
	special=(reverse(b)-(rand()%b));
	
	//Returning Value
	return special;	
}






