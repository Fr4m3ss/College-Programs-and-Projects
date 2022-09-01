//Francesco Messina, Section 7, Program 7: "Palindrome Stack"
#include <iostream>
#include <cstring>
#include <cctype>
#include "stack.h"

using namespace std;

int main()
{
	char input[101];
	cout<<"Please enter a string: "<<endl;
	cin.getline(input, 101);	
	char oInput[101];
	strcpy(oInput, input);
		
	for (int i = 0; oInput[i] != '\0'; i++)
	{
    		if (!isalpha(oInput[i]))
    		{	
        		for (int j = i; oInput[j] != '\0'; j++)
        		{
            			oInput[j] = oInput[j+1];
        		}
			i--;	
    		}
		for (int j = i; oInput[j] != '\0'; j++)
		{
			oInput[j] = tolower(oInput[j]);
		}
	}	
	
	Stack<char> s1;
	Stack<char> s2;
	
	if(strlen(oInput) %2 == 0)
	{
		for(int i = 0; i < (strlen(oInput)/2); i++)
		{
			s1.push(oInput[i]);	
		}
		for(int i = strlen(oInput); i > (strlen(oInput)/2); i--)
		{
			s2.push(oInput[i]);
		}
	}
	else
	{
		for(int i = 0; i < ((strlen(oInput)-1)/2); i++)
		{
			s1.push(oInput[i]);
		}
		for(int i = strlen(oInput); i > ((strlen(oInput)-1)/2); i--)
		{
			s2.push(oInput[i]);
		}
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//s1.printStack();
	//s2.printStack();		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	int pal = 1;	
	int run = 1;

	while(run == 1)
	{
		char temp1;
		char temp2;
		s1.pop(temp1);
		s2.pop(temp2);
		if(temp1 != temp2)
		{
			pal = 0;
		}
		if(s1.isStackEmpty() || s2.isStackEmpty())
		{
			run = 0;
		}
	}	
	
	if(pal == 1)
	{
		cout<<"\""<<input<<"\""<<"  IS a palindrome"<<endl;
	}
	else
	{
		cout<<"\""<<input<<"\""<<"  is NOT a palindrome"<<endl;
	}	
	
}
