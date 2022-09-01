//Francesco Messina, Section 7, Program 5: "MyString"
//Let me just apologize to the grader who grades this: I did this in about 3 hours hyped up on sugar, 
//so I dont know how legible the code will be. Best of luck lol
#include <iostream>
#include <cstring>
#include "mystring.h"
using namespace std;


//I/O stream operators
std::ostream& operator<< (ostream& out, const MyString& str)
{
	for(int i = 0; i < str.currentSize; i++)
	{
		out << str.location[i];
	} 
	return out;	
}
std::istream& operator>> (istream& in, MyString& str)
{
	str.currentSize = 0;
   	str.maxSize = 1;
   	char holder = ' ';
   	while(holder == ' ')
  	{
       		in>>holder;
   	}
   	for(int i = 0; i < str.maxSize; i++)
   	{
		if(holder != ' ' && holder != '\n')
		{
           		str.currentSize++;
			if(str.currentSize == str.maxSize)
           		{
               			str.Grow(1);
           		}
           		str.location[i] = holder;
			in.get(holder);
   		}
	}
	in.putback(holder);
	return in;			
}
std::istream& getline (istream& in, MyString& str)
{
 	str.currentSize = 0;
        str.maxSize = 1;
	char holder;
	in.get(holder);
	for(int i = 0; i < str.maxSize; i++)
	{
		if(holder != '\n')
                {
                        str.currentSize++;
                        if(str.currentSize == str.maxSize)
                        {
                                str.Grow(1);
                        }
                        str.location[i] = holder;
                        in.get(holder);
                } 
        }
        return in;	
}
std::istream& getline (istream& in, MyString& str, char delim)
{
	str.currentSize = 0;
	str.maxSize = 1;
	char holder; 
        in.get(holder);
	for(int i = 0; i < str.maxSize; i++)
	{
		if(holder != delim)
		{
                        str.currentSize++;
                        if(str.currentSize == str.maxSize)
                        {
                                str.Grow(1);
                        }
                        str.location[i] = holder;
                        in.get(holder);
                } 
        }
        return in;	
}

//Addition (Concatenation) operator
MyString operator+ (const MyString& str1, const MyString& str2)
{
	MyString answer;
	answer.maxSize = str1.maxSize + str2.maxSize;
	answer.currentSize = str1.currentSize + str2.currentSize;
	answer.location = new char[answer.maxSize];
	int i;
	
	for(i = 0; i < str1.currentSize; i++)
	{
		answer.location[i] = str1.location[i];
	}
	for(int j = i; j < str2.currentSize+i; j++)
	{
		answer.location[j] = str2.location[j-i];
	}	

	return answer;	
}

//Extra-Credit removal operator (Boy I hope I did it well enough lol)
MyString operator- (const MyString& str1, const MyString& str2)
{
	MyString answer;
	answer.maxSize = str1.maxSize;
	answer.currentSize = str1.currentSize;
	answer.location = new char[answer.maxSize];
	MyString hold = str1;
	
	while(hold.indexOf(str2) != -1)
	{
		int temp = hold.indexOf(str2);   		
		for(int i = 0; i < temp; i++)
		{
			answer.location[i] = hold.location[i];
		}
		for(int i = temp + str2.currentSize; i < answer.maxSize; i++)
		{
			answer.location[i-str2.currentSize] = hold.location[i];
		}
		answer.Shrink(str2.currentSize);
		hold = answer;
	}
	return answer;
}

//Comparison operator (All were basically identical to eachother, just change the sign lol)
bool operator< (const MyString& str1, const MyString& str2)
{
	if(strcmp(str1.getCString(), str2.getCString()) < 0)
	{
		return true;
	}

	return false;		
}
bool operator> (const MyString& str1, const MyString& str2)
{
	if(strcmp(str1.getCString(), str2.getCString()) > 0)
	{
		return true;
	}	

	return false;
}
bool operator<=(const MyString& str1, const MyString& str2)
{
	if(strcmp(str1.getCString(), str2.getCString()) <= 0)
	{
		return true;
	}	
	
	return false;
}
bool operator>=(const MyString& str1, const MyString& str2)
{
	if(strcmp(str1.getCString(), str2.getCString()) >= 0)
	{
		return true;
	}	
	
	return false;
}

bool operator==(const MyString& str1, const MyString& str2)
{
	if(strcmp(str1.getCString(), str2.getCString()) == 0)
	{
		return true;
	}	
	
	return false;
}
bool operator!=(const MyString& str1, const MyString& str2)
{
	if(strcmp(str1.getCString(), str2.getCString()) != 0)
	{
		return true;
	}
	
	return false;		
}

//Constructors
MyString::MyString()
{
	maxSize = 0;
	currentSize = 0;
	location = new char[maxSize];	
}
MyString::MyString(const char* convert)
{
	maxSize = strlen(convert);
	currentSize = strlen(convert);
	location = new char[maxSize];
	for(int i = 0; i < strlen(convert); i++)
	{
		location[i] = convert[i];
	}
}
MyString::MyString(int num)
{
	int digits = 0;
	int tempNum = num;
  	while(tempNum != 0) 
      	{
		tempNum = tempNum / 10;
		digits++;
   	}
	
	maxSize = digits;
	currentSize = digits;
	location = new char[maxSize];
	
	for(int i = 0; i < digits; i++)
	{
		int power = 10;
		for(int j = 0; j < i; j++)
		{
			power = power*10;
		}
		power = power/10;
		int x = num/power;
        	x = x %10;
        	char temp = '0' + x;
        	location[currentSize-1-i] = temp;
	}
	
}

//Automatics (Destructor, Copy Constructor, and Assignment Operator in that order)
MyString::~MyString()
{
	delete [] location;	
}
MyString::MyString(const MyString& str)
{
	maxSize = str.maxSize;
	currentSize = str.currentSize;
	location = new char[maxSize];
	for(int i = 0; i < currentSize; i++)
        {
                location[i] = str.location[i];
        }
}

MyString& MyString::operator=(const MyString& str)
{
	if(this != &str)
	{
		delete [] location;
		maxSize = str.maxSize;
        	currentSize = str.currentSize;                                                                                                             
		location = new char[maxSize];
        	for(int i = 0; i < currentSize; i++)                                                                                                                    
		{
               		location[i] = str.location[i];
		}
	}
	return *this;
}

//Just copy some of the + operator and have it assign to *this
MyString& MyString::operator+=(const MyString& str)
{
	int temp = this->currentSize;
	this->maxSize = this->maxSize + str.maxSize;
	this->currentSize = this->currentSize + str.currentSize;
	for(int i = temp; i < this->currentSize; i++)
	{
		this->location[i]= str.location[i-temp];
	}
	
	return *this;	
}
//This boy took me the longest to figure out, due to me forgetting to add the extra space to the index.
//It made me feel stupid >:(
char& MyString::operator[] (unsigned int index)
{
	if(index > currentSize && index > maxSize)
	{	
		int temp1 = currentSize;
		currentSize = index+1;
		maxSize = index+1;
		char* temp = new char[maxSize];
		for(int i = 0; i < temp1; i++)
        	{
                	temp[i] = location[i];
        	}
		for(int i = temp1; i < currentSize-1; i++)
		{
			temp[i] = ' ';
		}
        	delete [] location;
        	location = temp;
		
		return location[index];	
	}
	else if(index > currentSize && index <= maxSize)
	{
		int temp1 = currentSize+1;
		currentSize = index+1;
		for (int i = temp1; i < currentSize-1; i++)                                                                                                                     
		{
                        location[i] = ' ';
                }
		return location[index];
	}
	
	return location[index];
}

//Not sure how to avoid the warning???? Its works though! (at least I think so)		
//Figured it out: instead of returning '\0', i just converted *this into a cstring and printed out the null terminator in it lol
const char& MyString::operator[] (unsigned int index) const
{
	if(index > currentSize)
	{
		return this->getCString()[currentSize+1];
	}
	else
	{
		return location[index];
	}
}

//Insertion operator
MyString& MyString::insert(unsigned int index, const MyString& s)
{
	MyString temporary;
	temporary.maxSize = maxSize;
	temporary.currentSize = currentSize;
	temporary.location = new char[temporary.maxSize];
	for(int i = 0; i < currentSize; i++)
        {
		temporary.location[i] = location[i];
	}	 
	maxSize = temporary.maxSize + s.maxSize;
	currentSize = temporary.currentSize + s.currentSize;
	delete [] location;
	location = new char[maxSize];
	for(int i = 0; i < index; i++)
	{
		location[i] = temporary.location[i];
	}
	for(int i = index; i < s.currentSize + index; i++)
	{
		location[i] = s.location[i-index];
	}
	for(int i = s.currentSize + index; i < currentSize; i++)
	{
		location[i] = temporary.location[i-s.currentSize];
	}
	
	return *this;
}

//Indexing/Searching operator: utilize substring and the == overload for this  
int MyString::indexOf(const MyString& s) const
{
	int answer;
	
	for(int i = 0; i < currentSize - s.currentSize; i++)
	{
		if(substring(i, s.currentSize) == s.substring(0, s.currentSize))
		{
			answer = i;
			i = currentSize - s.currentSize;
		}
		else if(i == currentSize - s.currentSize - 1)
		{
			answer = -1;
		}
	}

	return answer;	
}

//You know what this is lol  
int MyString::getLength() const
{
	return currentSize;
}

//Just add an extra spot and make it the null terminator lol
const char* MyString::getCString() const
{
	char* answer = new char[currentSize+1];
	for(int i = 0; i < currentSize; i++)
	{
		answer[i] = location[i];
	}
	answer[currentSize] = '\0';
	return answer;
}

//Substring Operators (Just go to the index of the substring and add it to a smaller char array)
MyString MyString::substring(unsigned int start, unsigned int total) const
{
	MyString answer;
 	answer.maxSize = this->maxSize - start;
	answer.currentSize = this->currentSize - start;
	answer.location = new char[maxSize];
	for(int i = start; i < start + total; i++)
	{
		answer.location[i-start] = this->location[i];	
	}	
	
	return answer;
}
MyString MyString::substring(unsigned int start) const
{
	MyString answer;
	answer.maxSize = this->maxSize - start;
	answer.currentSize = this->currentSize - start;
	answer.location = new char[maxSize];
	for(int i = start; i < this->currentSize; i++)
	{
		answer.location[i-start] = this->location[i];
	}
	
	return answer;
}

//Self-Made grow and shrink functions to make life a lil easier ( probably didnt use them as effectively 
//as I could've, but oh well :P ) 
void MyString::Grow(int size)
{
	maxSize = currentSize + size;
	char* tempLocation = new char[maxSize];
	for(int i = 0; i < currentSize; i++)
	{
		tempLocation[i] = location[i];
	}
	delete [] location;
	location = tempLocation;		
}

void MyString::Shrink(int size)
{
	maxSize = currentSize - size;
	currentSize = currentSize - size;
	char* tempLocation = new char[maxSize];
	for(int i = 0; i < currentSize; i++)
	{
		tempLocation[i] = location[i];
	}
	delete [] location;
	location = tempLocation;
}



//Thank you for coming to my TED talk :D
