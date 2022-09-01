 /*
 * Name:Frankie Messina
 * Date: 10/6/19
 * Section: 4
 * Assignment: 3 (Program 1 - Coprime Numbers)
 * Due Date: 10/9/19
 * About this project: The purpose of this assignment is to:
 * Make sure you can use Unix commands to navigate through and use a Unix machine.
 * Make sure you are familiar with repetitive structures (loops) and selection statements (if/else or switch) in any combination.
 * Make sure you can recover from wrong user inputs.
 * Make sure you are comfortable with console input and output involving numeric types.
 * Make suer you can approach a complex problem, break it down into various parts, and put together a solution.
 * Assumptions: The user inputs a number greater than 2.
 * All work below was performed by Frankie Messina.
 */

#include <iostream>
using namespace std;

int main()
{
								//Instantiating Variables
int num1;//Input Number
int ncp=0;//Not Co Prime

								//Taking user input
cout<<"Enter the number: "<<endl;
cin>>num1;

if(num1<2)
{
	cout<<"Number is too small. Goodbye."<<endl;
}
else
{	
								//Printing Coprime Numbers
	cout<<"The coprime numbers are:"<<endl;
	
								//Calculating Coprime Numbers
	for(int i = 1; i<num1; i++)
	{
		ncp=0;						//Setting test value back to 0
		if(num1%i!=0)					//If a number is not a factor of the inputted number
		{
			for(int j = 2; j<=i; j++)
			{
				if((i%j)==0)			//Finding the factors of the number that isnt a factor of the inputted number
				{
					if(num1%j==0)		//Checking if any of the factors of the number that isnt a factor of the inputted numbers
					{            		//match the factors of the inputted number
					ncp=1;
					}
				}
			}
			if(ncp==0)
			{
				cout<<i<<", ";
			}
		}
	}
	cout<<endl;
}
return 0;





}
