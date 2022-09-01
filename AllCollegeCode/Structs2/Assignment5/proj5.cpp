//Francesco Messina, proj5.cpp
#include <iostream>
#include "passserver.h"

using namespace std;
using namespace cop4530;

void Menu();
void getSSize(size_t& sSize);
void getUser(string& user);
pair<string,string> addNewUser();

int main()
{
	char input;
	bool run = true;
	size_t serSize;

	getSSize(serSize);
	PassServer passServer(serSize);

	while(run)
	{
		while(cin.get(input) && run)
		{
			if(input == 'x')
			{
				run = false;
				break;
			}
			else if(input == 'l')
			{
				string filename;
				cout<<"\nEnter password file name to load from: ";
				cin>>filename;
				if(!passServer.load(filename.c_str()))
				{
					cout<<"\nError: Cannot open file "<<filename<<endl;
				}
			}
			else if(input == 'a')
			{
				pair<string,string> nUser = addNewUser();
				if(passServer.addUser(nUser))
				{
					cout<<"\nUser "<<nUser.first<<" added."<<endl;
				}
				else
				{
					cout<<"Failed!"<<endl;
				}
			}
			else if(input == 'r')
			{
				string user;
				getUser(user);
				if(passServer.removeUser(user))
				{
					cout<<"\nUser: "<<user<<" deleted."<<endl;
				}
				else
				{
					cout<<"Failed!"<<endl;
				}
			}
			else if(input == 'c')
			{
				string user,pass,newPass;
				getUser(user);
				cout<<"Enter password: ";
				cin>>pass;
				cout<<"\nEnter new password: ";
				cin>>newPass;
				if(passServer.changePassword(make_pair(user,pass),newPass))
				{
					cout<<"\nPassword changed for user "<<user<<endl;
				}
				else
				{
					cout<<"\n*****Error: Could not change user password"<<endl;
				}
			}
			else if(input == 'f')
			{
				string user;
				getUser(user);
				if(passServer.find(user))
				{
					cout<<"\nUser '"<<user<<"' found."<<endl;
				}
				else
				{
					cout<<"User '"<<user<<"' not found."<<endl;
				}
			}
			else if(input == 'd')
			{
				passServer.dump();
			}
			else if(input == 's')
			{
				cout<<"Size of hashtable: "<<passServer.size()<<endl;
			}
			else if(input == 'w')
			{
				string filename;
				cout<<"\nEnter password file name to write to: ";
				cin>>filename;
				if(!passServer.write_to_file(filename.c_str()))
				{
					cout<<"\nError: Cannot write file "<<filename<<endl;
				}
			}
			else
			{
				string nll;
				nll+= input;
				if(nll != "\0")
				{
					Menu();
				}
			}
		}
		run = false;
	}
}

void Menu()
{
  cout << "\n\n";
  cout << "l - Load From File" << endl;
  cout << "a - Add User" << endl;
  cout << "r - Remove User" << endl;
  cout << "c - Change User Password" << endl;
  cout << "f - Find User" << endl;
  cout << "d - Dump HashTable" << endl;
  cout << "s - HashTable Size" << endl;
  cout << "w - Write to Password File" << endl;
  cout << "x - Exit program" << endl;
  cout << "\nEnter choice : ";
}

void getSSize(size_t& sSize)
{
	cout<<"Enter preferred hash table capacity: ";
	cin>>sSize;
	cout<<"\n";
}

void getUser(string& user)
{
	cout<<"Enter username: ";
	cin>>user;
}

pair<string,string> addNewUser()
{
	string user,pass;
	getUser(user);
	cout<<"Enter password: ";
	cin>>pass;
	return make_pair(user,pass);
}
