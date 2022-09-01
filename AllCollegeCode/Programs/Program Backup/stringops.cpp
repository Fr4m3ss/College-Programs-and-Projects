/*Name: Frankie Messina
 *Date: 11/20/2019
 *Section: 4
 *Assignment: 6 (Program 1 - Basic String Operations)
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
 *Assumptions: The text entered will not contain stray whitespace.
 *All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <cctype>
#include <cstring>

using namespace std;

//Instantiating functions 
int wordCount(char a[]);
void vowelcount(char a[]);
int puncCount(char a[]);
int findSubString(char a[]);

int main()
{

//Instantiating Variables
	int run = 1;
	char b [10000]= "quit";
	
//While loop to run while the c-string is not quit
	while(run == 1)
	{

//Insantiating Variable
		char a[10000];	

//User input
		cout<<"Enter the string: "<<endl;
		cin.getline(a,10000);

//Checking if equal to quit
		if(strcmp(a,b)==0)
		{
			run = 0;
		}
		else
		{

//Calling functions
			cout<<"Number of words: "<<wordCount(a)<<endl;
			vowelcount(a);
			cout<<"Number of punctuations: "<<puncCount(a)<<endl;
		
//Printing if word is part of the string
			if(findSubString(a)==1)
			{
				cout<<"\"word\" is a part of this string."<<endl;
			}
			else
			{
				cout<<"\"word\" is not a part of this string."<<endl;
			}
		}
	}
}

int wordCount(char a[])
{

//Instantiating Variables
	int num = 0;
	int length = strlen(a);

//Finding spaces and counting them
	for(int i = 0; i<length; i++)
	{
		if(isspace(a[i]))
		{
			num++;
		}
	}

//Adding one more so it equals the number of words
	num++;
	return num;
}

void vowelcount(char a[])
{

//Instantiating Variables
	int numa = 0;
	int nume = 0;
	int numi = 0;
	int numo = 0;
	int numu = 0;

        int length = strlen(a);

//Counting Vowels
        for(int i = 0; i<length; i++)
        {
                if(a[i]=='A'||a[i]=='a')
                {
                        numa++;
                }
		if(a[i]=='E'||a[i]=='e')
                {
                        nume++;
                }
		if(a[i]=='I'||a[i]=='i')
                {
                        numi++;
                }
		if(a[i]=='O'||a[i]=='o')
                {
                        numo++;
                }
		if(a[i]=='U'||a[i]=='u')
                {
                        numu++;
                }
        }
	
//Printing Variable Counts
	cout<<"A: "<<numa<<endl; 
        cout<<"E: "<<nume<<endl;
        cout<<"I: "<<numi<<endl;
        cout<<"O: "<<numo<<endl;
        cout<<"U: "<<numu<<endl;	
}

int puncCount(char a[])
{

//Instantiating Variables
	int num = 0;
        int length = strlen(a);

//Counting the Punctuation
        for(int i = 0; i<length; i++)
        {
                if(ispunct(a[i]))
                {
                        num++;
                }
        }
        return num;
}

int findSubString(char a[])
{

//Instantiating Variables
	int num = 0;
	int length = strlen(a);	

//Checking the c-string for 4 consecutive letters w, o, r, and d in a row
	for(int i = 0; i<length-3; i++)
	{
		if(a[i]=='w')
		{
			if(a[i+1]=='o')
                	{
        	                if(a[i+2]=='r')
                		{
              				if(a[i+3]=='d')
                			{
        	                		num=1;
	                		}
                		}
	                }
		}
	}
	return num;
}
