 /*
 * Name:Frankie Messina
 * Date: 10/22/19
 * Section: 4
 * Assignment: 4 (Program 2 - Mclaurin Series Expansion)
 * Due Date: 10/24/19
 * About this project: The purpose of this assignment is to make sure:
 * You are comfortable with C++ functions (pre-defined and user-defined).
 * You are familiar with C++ control structures (loops and branches) in any combination.
 * You can recover from wrong user inputs.
 * You are comfortable with console input and output involving numeric types.
 * You can approach a complex problem, break it down into various parts, and put together a solution.
 * Assumptions: The user will always input a positive value for n and always input a number in the range of -3.1, 3.14 for x.
 * All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <cmath>
#include <iomanip>
#include <cstdlib>
using namespace std;

//Instantiating Functions
double factorial(double a);
double sum(double x, int n);
`
int main()
{
//Instantiating Variables
double inputx;
int inputn;

//User input
cout<<"Enter the value of x: "<<endl;
cin>>inputx;
cout<<"Enter the number of terms: "<<endl;
cin>>inputn;

//Calling sum function and outputting answer
cout<<"sin("<<inputx<<") = "<<fixed<<setprecision(3)<<sum(inputx,inputn)<<endl;

return 0;
}

//Factorial Function
double factorial(double a)
{
//Instantiating Variables
double total = a;
double tempa = a;

	//Calculating the Factorial of inputted number
	while((a-1)!=0)
	{
	total*=(a-1);
	a--;
	}

a=tempa;

//Returning Factorial
return total;

}

//Sum Function
double sum(double x, int n)
{
//Instantiating Variable
double totalsum = 0;
	
	//Calculating the McLaurin Series Expansion to find sin(n)
	for(int k = 0; k<n; k++)
	{
	totalsum+=((pow((-1),k))/(factorial(((2*k)+1))))*(pow((x),((2*k)+1)));		
	}

//Returning value of sin(n) to the precision of n terms
return totalsum;
}
