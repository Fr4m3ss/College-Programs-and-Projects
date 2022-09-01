/*Name: Frankie Messina
 *Date: 11/5/2019
 *Section: 4
 *Assignment: 5 (Program 2 - Matrix Norms)
 *Due Date: 11/7/2019
 *About this project: The purpose of this assignment is to make sure:
 *You understand and can work with C++ arrays.
 *You are comfortable with writing functions in C++.
 *You are familiar with repetitive structures (loops) and selection statements (if/else or switch)
 *in any combination and can use them in functions and to manipulate array data.
 *You can approach a complex problem, break it down into various parts, and put together a solution.
 *Assumptions: The matrix will always be within the bounds of 100 rows and 100 cols.
 *All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstdlib>
#include <cstring>
#include <cctype>
using namespace std;

//Declaring Constants
const int ROWCAP = 100;
const int COLCAP = 100;

//Instantiating Functions
void makeMatrix(int mat[][COLCAP], int row, int col);
int findNorm(int mat[][COLCAP], int row, int col);

int main()
{

//Instantiating Variables
	int row;
	int col;

//User Input
	cout<<"Enter the number of rows: "<<endl;
	cin>>row;
	cout<<"Enter the number of coloumns: "<<endl;
	cin>>col;
	cout<<"Enter the matrix: "<<endl;
	
//Making the matrix
	int matrix[ROWCAP][COLCAP];
	
//Calling the function makeMatrix() in order to set values
	makeMatrix(matrix, row, col);	

//Printing the matrix
	cout<<"The matrix entered was: "<<endl;
	for(int i = 0; i<row; i++)
        {
                for(int j = 0; j<col; j++)
                {
                        cout<<matrix[i][j]<<" ";
                }
        	cout<<" "<<endl;
	}
	
//Printing the Norm
	cout<<"The Maximum Absolute Coloumn Sum Norm is: "<<findNorm(matrix, row, col)<<endl;
	
	return 0;
}

//Function to assign values to the matrix
void makeMatrix(int mat[][COLCAP], int row, int col)
{

//Instantiating Variables
	int input;

//Taking User Input
	for(int i = 0; i<row; i++)
	{
		for(int j = 0; j<col; j++)
		{	
			cin>>input;
			mat[i][j]=input;
		}
	}
}

//Function to find Norm
int findNorm(int mat[][COLCAP], int row, int col)
{

//Instantiating Variables
	int temp = 0;
	int max;
	int runs=0;

//Calculating the Norm of the matrix
	for(int i = 0; i<col; i++)
	{	
		temp=0;
		for(int j = 0; j<row; j++)
		{
			temp+=mat[j][i];
		}
		runs++;
		if(runs==1)
		{
			max=temp;
		}
		else if(temp>max)
		{
			max=temp;
		}
	}

	return max;
	
}
