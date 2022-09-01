/*Name: Frankie Messina
 *Date: 11/5/2019
 *Section: 4
 *Assignment: 5 (Program 1 - Array Operations)
 *Due Date: 11/7/2019
 *About this project: The purpose of this assignment is to make sure:
 *You understand and can work with C++ arrays.
 *You are comfortable with writing functions in C++.
 *You are familiar with repetitive structures (loops) and selection statements (if/else or switch)
 *in any combination and can use them in functions and to manipulate array data.
 *You can approach a complex problem, break it down into various parts, and put together a solution.
 *Assumptions: The array will always contain at least 1 element and at most 99 elements.
 *All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstdlib>
#include <cstring>
#include <cctype>
using namespace std;

//Instantiating Functions
void makeArray (double arr[], int size);
void printArray(double arr[], int size);
int remove(double arr[], int size);
void insert(double arr[], int size);
void sort(double arr[], int size);
void cyclicShift(double arr[],int size);

//Instantiating Constants
const int CAPACITY = 100;

int main()
{

//Instantiating Variables
	int arraySize;
	int repeat = 0;
	
//User Input
	cout<<"Enter the number of elements you want to enter (Max 100): "<<endl;
	cin>>arraySize;
	cout<<"Enter "<<arraySize<<" numbers"<<endl;
	
//Making the array
	double array[CAPACITY];

//Calling the makeArray() function to assign values to array
	makeArray(array, arraySize);
	
//Repeating menu until Exit option is chosen
	while(repeat==0)
	{

//Instantiating Variables
	 	int option;

//User Input
        	cout<<"1. Insert an element"<<endl;
       		cout<<"2. Remove an element"<<endl;
        	cout<<"3. Print the array"<<endl;
       		cout<<"4. Cyclic Right shift"<<endl;
        	cout<<"5. Sort the array"<<endl;
        	cout<<"6. Exit"<<endl;
        	cout<<"Enter your option: ";
        	cin>>option;

//Choosing the Option that user inputted
       		if(option==1)
        	{
                	insert(array, arraySize);
			arraySize++;
        	}
        	else if(option==2)
        	{
			arraySize=arraySize-remove(array,arraySize);
        	}
        	else if(option==3)
        	{
                	cout<<"The array is: "<<endl;
                	printArray(array,arraySize);
        	}
        	else if(option==4)
        	{
			cyclicShift(array,arraySize);
        	}
      	  	else if(option==5)
        	{	
			sort(array,arraySize);
        	}
       		else if(option==6)
        	{
        	        repeat=1;
			cout<<"Goodbye!"<<endl;
	        }
		else
		{
			cout<<"Invalid Choice."<<endl;
		}
		cout<<endl;
	}
	
	return 0;
}

//Function to assign variables to array
void makeArray(double arr[], int size)
{	

//Instantiating Variables
	double userInput;

//User Input
	for(int i = 0; i<size; i++)
	{
		cin>>userInput;
		arr[i]=userInput;
	}
}

//Function to Print out the array
void printArray(double arr[], int size)
{

//Printing the array
	for(int i = 0; i<size; i++)
	{
		cout<<arr[i]<<" ";	
	}
	cout<<endl;
}

//Function to remove elements from the array
int remove(double arr[], int size)
{

//Instantiating Variables
	double input;
	int found=0;        
	int still=1;
	int count=0;
		
//User Input
        cout<<"Enter the element: "<<endl;
        cin>>input;
	
//Looping if the input is still in the array
	while(still == 1)
	{
		found = 0;
		still = 0;

//Checking if input is still in the array
   		for(int i = 0; i<size; i++)
        	{
                	if(arr[i]==(input))
                	{
                		still = 1;
                	}
        	}

//Removing the element from the array
		for(int i = 0; i<size; i++)
        	{
                	if(arr[i]==(input))
                	{
				if(found==0)
				{
					count++;
				}
                    		found=1;    
                	}
                	if(found==1)
                	{
                        	arr[i]=arr[i+1];
                	}
        	}
		
	}
//Confirming that the Function ran properly
        cout<<"Element deleted."<<endl;
	return count;
}

//Function to insert an element into the array
void insert(double arr[], int size)
{

//Instantiating Variables
	double input;
	int pos;
	double temparr[size];
	
//User Input
	cout<<"Enter the number: "<<endl;
	cin>>input;
	cout<<"Enter the position: "<<endl;
	cin>>pos;
	
//Setting a temp array equal to original array
	for(int i = 0; i<size; i++)
	{
		temparr[i]=arr[i];
	}
	
//Inserting value into the array and replacing all of the other values with the old ones
	for(int i = 0; i<=size; i++)
	{
		if(i==(pos))
		{
			arr[i]=input;
		}
		
		if(i>(pos))
		{
			arr[i]=temparr[i-1];	
		}
	}	

//Confirming the function ran properly
	cout<<"Element Inserted."<<endl;
}

//Function to Sort the array
void sort(double arr[], int size)
{

//Instantiating Variables
	double x;
	int j;

//Sorting the array
	for(int i = 1; i<size; i++)
	{
		x=arr[i];	
		j=i-1;
		while(j>=0&&arr[j]>x)
		{
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=x;
	}
}

//Function to perform a Cyclic Shift on the array
void cyclicShift(double arr[],int size)
{

//Instantiating Variables
	double temp=arr[size-1];

//Performing the Cyclic Shift
	for(int i = size-1; i>0; i--)
	{
		arr[i]=arr[i-1];
	}
	arr[0]=temp;

//Confirming the function ran properly
	cout<<"Elements shifted."<<endl;
}
