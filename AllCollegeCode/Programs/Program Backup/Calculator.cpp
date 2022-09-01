/* Name: Frankie Messina
 * Date: 9/10/19 
 * Section: (Your section) 
 * Assignment: 1 (Squidward's Improvised Krusty Krab Calculator) 
 * Due Date: 9/13/19 
 * About this project: The purpose of this assignment is to:
 * Practice using the Unix terminal to create, edit, compile, debug, and run a c++ program.
 * Practice writing small programs in C++.
 * Use the iostream library to perform console input and output.
 * Use variables and arithmetic operators in C++ to do basic math.
 * Assumptions: Only positive numbers entered, and no 0 tickets. 
 * All work below was performed by Frankie Messina. 
 */

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	//Initialization
	const double krabbyPatties = 3.69;
	const double fries = 1.89;
	const double kelpShake = 2.65;
	const double salesTax = 0.018;
	int numPatties;
	int numFries;
	int numShakes;
	double subtotal;
	double total;
	int checks;
	
	//User Input
	cout<<"Howdy, and Welcome to the Krusty Krab!"<<endl;
	cout<<"How many Krabby Patties would you like?"<<endl;
	cin>>numPatties;
	cout<<"How many Kelp Shakes would you like?"<<endl;
        cin>>numShakes;
	cout<<"How many orders of Fries would you like?"<<endl;
	cin>>numFries;
	
	//Splitting Checks
	cout<<"Would you like to split your check? If so, please enter how many people will be splitting the bill, and if not, please enter 1"<<endl;
	cin>>checks;
	
	//Calculating Total After Splitting Checks
	subtotal = ((krabbyPatties*numPatties)+(fries*numFries)+(kelpShake*numShakes))/checks;
	total = (((krabbyPatties+(krabbyPatties*salesTax))*numPatties)+((fries+(fries*salesTax))*numFries)+((kelpShake+(kelpShake*salesTax))*numShakes))/checks;
	
	//Printing Totals
	cout<<setprecision(4);
	cout<<"Your subtotal per person is $"<<subtotal<<"."<<endl;
	cout<<"Your tax per person is $"<<total-subtotal<<"."<<endl;
	cout<<"Your total per person is $"<<total<<"."<<endl;
	
	


}

