 /*
 *Name: Frankie Messina
 *Date: 9/22/2019
 *Section: 4
 *Assignment: 2 (Estimating the Damage of a Sharknado)
 *Due Date: 9/26/19
 *About this project: The purpose of this assignment is to
 *Use basic unix commands to navigate through the file system.
 *Write, compile and run programs on the command line.
 *Use the iostream library to perform console input and output.
 *Use variables and arithmetic operators in C++ to do basic math.
 *Familiarize yourself with selection statements (if . . . else and switch).
 *Use fundamental algorithmic error checking (checking the validity of user input).
 *Assumptions: The user will only enter the proper type of data, an uppercase charachter for the reference letter and a floating point number for the others.
 *All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <iomanip>
using namespace std;
int main()
{

//Instantiating Variables
char sharkType;
double windspeed, duration, sharkWeight, damage;

//Printing a choice menu
cout<<"  USER INPUT MENU:"<<endl;
cout<<"Basking Shark     - B"<<endl;
cout<<"Great White Shark - G"<<endl;
cout<<"Hammerhead Shark  - H"<<endl;
cout<<"Whale Shark       - W"<<endl;
cout<<"Bull Shark        - U"<<endl;
cout<<"Lemon Shark       - L"<<endl;

//User input
cout<<"What type of Shark: "<<endl;
cin>>sharkType;
cout<<"What is the Windspeed: "<<endl;
cin>>windspeed;
cout<<"What is the Duration: "<<endl;
cin>>duration;

//Setting Shark Weight
switch (sharkType)
{
	case 'B':
	sharkWeight=14500;
	break;

	case 'G':
	sharkWeight=2270;
	break;

	case 'H':
	sharkWeight=230;
	break;

	case 'W':
	sharkWeight=21000;
	break;

	case 'U':
	sharkWeight=130;
	break;

	case 'L':
	sharkWeight=183;
	break;
	
	default:
	sharkWeight=-99;
	break;
}


//Converting Windspeed
windspeed*=0.447;

//Calculating Damage
damage=windspeed * sharkWeight * duration;

//Error Checking
if(sharkWeight==-99)
{
	cout<<"Error: You entered an invalid Shark type, please try again!"<<endl;	
}
else
{

//Printing Damage
	cout.setf(ios::fixed);
	cout.precision(2);
	cout<<"Cost of damage: $"<<damage<<endl;
}

}


