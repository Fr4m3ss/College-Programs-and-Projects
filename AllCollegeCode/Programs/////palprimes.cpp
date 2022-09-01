 /*
 * Name:Frankie Messina
 * Date: 10/22/19
 * Section: 4
 * Assignment: 4 (Program 3 (Extra Credit Program) - Palindromic Primes)
 * Due Date: 10/24/19
 * About this project: The purpose of this assignment is to make sure:
 * You are comfortable with C++ functions (pre-defined and user-defined).
 * You are familiar with C++ control structures (loops and branches) in any combination.
 * You can recover from wrong user inputs.
 * You are comfortable with console input and output involving numeric types.
 * You can approach a complex problem, break it down into various parts, and put together a solution.
 * Assumptions: The user will enter 0, 1, or a negative number to terminate the program.
 * All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstdlib>
using namespace std;

//Instantiating Functions
int reverse(int a);

int main()
{
//Instantiating Variables
int upperlimit;
int prime=0;

//User Input
cout<<"Please enter the upper limit: "<<endl;
cin>>upperlimit;

//Printing the output
cout<<"The palindrome primes are: "<<endl;
	
//Calculating Palindromic Primes
for(int i = 2; i<=upperlimit; i++)
{
	for(int j = 2; j<=i/2; j++)	
	{
		if(i%j==0)
		{
		prime = 1;
		}
	}
	if(prime==0)
	{
		if(i==(reverse(i)))
		{
		cout<<i<<endl;
		}
	}
	prime=0;
}



}

//Reverse Function
int reverse(int a)
{
	//Instantiating Variables
	int backwards = 0;
	int before = a;
	int digits = 0;
	int tempa = a;

	//Counting how many digits the number is
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






