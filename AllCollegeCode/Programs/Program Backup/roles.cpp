/*Name: Frankie Messina
 *Date: 12/4/2019
 *Section: 4
 *Assignment: 7 (Program 2 - Dungeons and Dragons)
 *Due Date: 12/6/2019
 *About this project: The purpose of this assignment is to make sure:
 *You are familiar with certain basic unix commands and can use them effectively.
 *You are familiar with the basics of shell scripting
 *You understand and can work with strings in C++, both C-Strings and C++ string objects.
 *You are familiar with dynamic memory allocation and two dimensional arrays.
 *You are familiar with the concepts of bounds checking and maintaining state.
 *You can work with pointers, structures, and files in C++.
 *You can approach a complex problem, break it down into various parts, and put together a solution.
 *Assumptions: 
 *All work below was performed by Frankie Messina.
 */

#include <iostream>
#include <fstream>

using namespace std;

//Initializing/Creating Structures
//Structure for Moves
struct Move
{
	char name[50];
	int damage;
};

//Structure for Characters
struct Character
{
	char name[50];
	char char_class[50];
	int hitPoints;
	int armorClass;
	bool isAlive;
	char moveName[50];
};

//Structure for Attacks
struct Attack
{
	char name[50];
	char moveName[50];
	char target[50];
	int roll;
};

//Instantiating Functions
void print1(Move m, ofstream &out);
void print2(Character m, ofstream &out);
void print3(Attack m, ofstream &out);
void print(Character m, ofstream &out);
int compare(char *arr1, char *arr2);
void sort(Character m[], int n, char sortBy);

//Main Function
int main()
{

//Creating arrays of structures
	Move *moves;
	Character *characters;
	Attack *attacks;
	
//Instantiating Variables
	int m;
	int n;
	int k;
	char placeholder[50];

//Taking input from characters.txt
	ifstream(input);
	input.open("characters.txt");
	
//Error Checking
	if(!input)
	{
		cout<<"Error opening file \"characters.txt\""<<endl;
	}
	else
	{

//Taking input for moves
		input>>m;
		moves = new Move[m];
	
		for(int i = 0; i<m; i++)
		{	
			input.getline(moves[i].name,50 ,'\t');
			input>>moves[i].damage;
			input.getline(placeholder,50,'\n');
		}
		
//Taking input for characters
		input>>n;
		characters = new Character[n];
		input.ignore();	
	
		for(int i = 0; i<n; i++)
		{	
			input.getline(characters[i].name,50,'\t');
			input.getline(characters[i].char_class,50 ,'\t');
			input>>characters[i].hitPoints;
			input>>characters[i].armorClass;
			input.getline(placeholder,50,'\t');
			input.getline(characters[i].moveName,50,'\n');
			characters[i].isAlive=true;
		}

	}

	input.close();
		
//Taking input from session.txt
	input.open("session.txt");
        
//Error Checking
	if(!input)
        {
                cout<<"Error opening file \"session.txt\""<<endl;
        }
        else
        {

//Taking input for attacks
                input>>k;
        	attacks = new Attack[k];
		input.getline(placeholder,50,'\n');
		for(int i = 0; i<k; i++)
		{
			input.getline(attacks[i].name, 50, '\t');
                        input.getline(attacks[i].moveName, 50,'\t');
                        input.getline(attacks[i].target, 50, '\t');
			input>>attacks[i].roll;
			input.getline(placeholder,50,'\n');
		}
	}

        input.close();

//Enacting the attacks if possible
	for(int i = 0; i<k; i++)
	{
		for(int j = 0; j<n; j++)
		{
//Checking if names match, special moves match, and the attacker is alive or not
			if(compare(attacks[i].name,characters[j].name)==1&&compare(attacks[i].moveName,characters[j].moveName)==1&&characters[j].isAlive)
			{
				for(int k = 0; k<n; k++)
				{
//Checking if targets name matches, the roll is higher than targets armor class, and if target is alive or not
					if(compare(attacks[i].target,characters[k].name)==1&&attacks[i].roll>=characters[k].armorClass&&characters[k].isAlive)
					{
						for(int l = 0; l<m; l++)
						{
//Checking the moves names to see if they match
							if(compare(attacks[i].moveName,moves[l].name)==1)
							{
								//cout<<attacks[i].name<<" "<<attacks[i].target<<" "<<attacks[i].moveName<<" "<<attacks[i].roll<<endl;
//Deducting moves damage from targets hit points
								characters[k].hitPoints=characters[k].hitPoints-moves[l].damage;
//Checking if characters health is below 0 or not
								if(characters[k].hitPoints<0)
								{
									characters[k].isAlive=false;
								}
							}
						}
					}
				}
			}
		}
	}

//Outputting the alive players
	ofstream(output);
	output.open("alive.txt");

//Error Checking
	if(!output)
	{
		cout<<"Output Failed"<<endl;
	}
	else
	{
//The commented out segment was for testing purposes only
/*		for(int i = 0; i<m; i++)
		{
			print1(moves[i], output);
		}
		for(int i = 0; i<n; i++)
		{
			print2(characters[i], output);
		}
		for(int i = 0; i<k; i++)
		{
			print3(attacks[i], output);
		}
*/		
//Printing the alive characters to the txt file
		for(int i = 0; i<n; i++)
		{
			if(characters[i].isAlive)
			{
				print(characters[i], output);
			}
		}
	}
	
//Closing Output Stream
	output.close();

//Deleting the Dynamic Arrays
	delete[] moves;
	delete[] characters;
	delete[] attacks;
	return 0;
}

//Print out Moves
void print1(Move m, ofstream &out)
{
	out<<m.name<<" "<<m.damage<<endl;
}

//Print out Characters
void print2(Character m, ofstream &out)
{
	out<<m.name<<" "<<m.char_class<<" "<<m.hitPoints<<" "<<m.armorClass<<" "<<m.moveName<<endl;
}

//Print out Attacks
void print3(Attack m, ofstream &out)
{
	out<<m.name<<" "<<m.moveName<<" "<<m.target<<" "<<m.roll<<" "<<endl;
}

//Print out Alive Characters
void print(Character m, ofstream &out)
{
	out<<m.name<<" "<<m.hitPoints<<endl;
}

//Compare function to see if names of char arrays are equal or not
int compare(char *arr1, char *arr2)
{
//Instantiating Variables
    int i;
    int r=0;
    i=0;

//Checking every single character in char array to see if they are equal or not
    while(arr1[i]==arr2[i]&&r==0)
    {
        if(arr1[i]=='\0'||arr2[i]=='\0')
	{
        	r = 1;        
	}
        i++;
    }

    return r;
}
/*
void sort(Character m[], int n, char sortBy)
{
	if(sortBy=='n')
	{
		for(int i = 0; i<n; i++)
		{
			
		}
	}
	else if(sortBy=='h')
	{
		for(int i = 0; i<n; i++)
		{
			if(m[i].hitPoints<m[i+1].hitPoints)
			{
				char temp[50] = {m[i].name};
				int temphp=m[i].hitPoints;
				m[i].name=(m[i+1]).name;
				m[i].hitPoints=m[i+1].hitPoints;
				m[i+1].name=temp;
				m[i+1].hitPoints=temphp;
			}
		}
	}
}
*/
