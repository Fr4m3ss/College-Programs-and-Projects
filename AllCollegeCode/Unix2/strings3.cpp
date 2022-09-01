/* This program demonstrates arrays of CStrings (2D array of chars), C++ string
 * objects and an intro to pointers
 * An array of C-strings is essentially a two dimensional array of chars, where
 * each "row" can be considered a CString on its own.
 * A C++ string object is a variable of the C++ string class, which is a wrapper
 * around a CString, to allow programmer to work easily with strings.
 * Pointers are vaiables that can hold the address of another variable.
 */

#include<iostream>
#include<cstring>
#include<string>

using namespace std;

void sort(char arr[][100], int num);

int main()
{
	/* An array of chars is a C-String. We can treat it as a regular array
     * along with all the special properties that apply to C-strings alone
     * Naturally, we can extend this idea into an array of C-Strings, which is
     * an array of arrays of chars - a 2 dimensional array of chars.
     * Here, each array of chars (an entire row of the array) can be treated as
     * a CString. Then, we only need to specify the row for the array.
     * We can also refer to each character individually. Then, we need to specify
     * both the row and the column.
     * Here, we read in a bunch of names and then pass them into the sort function
     * and print them off after we sort.
     */
    char stringArray[10][100];
	
    cout<<"enter 10 strings: ";
    for(int i=0; i<10; i++)
        cin.getline(stringArray[i],100,'\n');  //read in one name at at time. stringArray[i] is a C-String

    sort(stringArray, 10);

    cout<<"The sorted strings are: \n";
    for(int i=0; i<10; i++)
        cout<<stringArray[i]<<endl;
    
	/* C++ offers a string class that makes it easier to work with strings. 
     * The string class let's us use "string" as a user defined composite data
     * type. We can create variables of type string.
     * The biggest advantage of the string class is memory management. We do not
     * have to check for bounds. C++ handles resizing the array for us. 
     * Internally a string object is still a CString, but C++ has just provided
     * us with tools to make it easier for us.
     * Here, we will demonstrate the 4 CString functions we learned about, using
     * C++ string objects.
     * To copy, we use the = sign instead of the strcpy function.
     * To get the length, we use the size function or length function instead of strlen
     * To concatenate, we use the += operator or the append function instead of strcat
     * To compare, we canjust use the relational operators (<, <=, >, >=, ==, !=)
     * instead of strcmp. Comparison is still done in lexicographic order, but
     * it is easier to read.
     * As we can see, we can use the same syntax we are used to with the numeric
     * data types.
     */

    string str;// = "Some text I want to put in this string";
	
	/* The syntax for getline is slightly different for string objects.
     * We start off with getline, move the cin inside as a parameter, and
     * pass in the string variable and the terminating character.
     * We leave out the size because C++ handles the size for us. 
     * As usual, the terminating character is aby default, the newline,
     * We need a cin.ignore() between a non-getline input and a getline input.
     */
    getline(cin,str,'\n');
	
	/* Size and Capacity
     * The capacity of a string is the amount of space allocated for the string
     * It is the maximum number of characters the string is capable of holding.
     * The size (or length) of the string is the number of characters in the 
     * string right now.
     */
	 
    cout<<"Str: "<<str<<"\nSize: "<<str.size()<<"\nCapacity: "<<str.capacity()<<endl;
	
	/* string is a class, so it contains functions that can act upon the 
     * variables of the string type. 
     * The syntax for these functions is: variable.function()
     * This is demonstrated above, when we called size and capacity
     */

    string newStr = str;	//use = instead of strcpy
    
    newStr = newStr + "Rectangles!";  // use + instead of strcat

	//use relational operators instead of strcmp
    if(newStr == str)
        cout<<"The strings are equal";
    else if(newStr < str)
        cout<<newStr<<" is first";
    else    cout<<str<<" is first";
    

	/* A variable has 5 properties: type, size, name, value and address
     * We can store the address of a variable in another variable.
     * This new variable that contains the address of another variable is called a pointer
     * We declare pointer using the * operator.
     * We get the address of a variable using the & operator.
     */
    double val = 4.5;

    double *ptr = &val;

    cout<<"Val: "<<val<<endl;
    cout<<"ptr: "<<ptr<<endl;
    cout<<"Address of val: "<<&val<<endl;
    cout<<"Address of ptr: "<<&ptr<<endl;
    cout<<"*ptr: "<<*ptr<<endl; //dereferencing

    /* Dereferencing the pointer is the process of accessing a variable through
     * the pointer. When we use * along with the pointer anywhere except for
     * declaration, we are dereferencing.
     * When we dereference, we are getting the value of the variable whose address
     * is stored in the pointer.
     */ 
    cout<<endl;

    return 0;
}

/* sort function
 * Same algorithm as naive bubble sort we used for integers
 * We use strcmp instead of relational operators and strcpy instead of = to copy
 */
void sort(char arr[][100], int num)
{
    char temp[100];
    for(int i=0; i<num-1; i++)
    {
        for(int j=0; j<num-i-1; j++)
        {
            if(strcmp(arr[j],arr[j+1]) > 0)
            {
                strcpy(temp, arr[j]);
                strcpy(arr[j],arr[j+1]);
                strcpy(arr[j+1],temp);
            }
        }
    }
}

