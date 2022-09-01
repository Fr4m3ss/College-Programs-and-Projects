//Francesco Messina, passserver.cpp
#include <iostream>
#include <unistd.h>
#include <crypt.h>
#include "passserver.h"

using namespace std;
using namespace cop4530;

constexpr char PassServer::SALT[];

PassServer::PassServer(size_t size) : HashTable<string,string>(size)
{
	
}

PassServer::~PassServer()
{
	
}

bool PassServer::find(const string &user)
{
	return HashTable<string,string>::contains(user);
}

bool PassServer::addUser(pair<string, string> &kv)
{
	pair<string,string> encryptedKV = make_pair(kv.first,encrypt(kv.second));
	return HashTable<string,string>::insert(encryptedKV);
}

bool PassServer::addUser(pair<string,string> &&kv)
{
	return false;
}

bool PassServer::removeUser(const string &k)
{
	return HashTable<string,string>::remove(k);
}

bool PassServer::changePassword(const pair<string,string> &p, const string & pass)
{
	if(find(p.first))
	{
		pair<string,string> oldEncrypt = make_pair(p.first,encrypt(p.second));
		if(HashTable<string,string>::match(oldEncrypt))
		{
			pair<string,string> encryptedKV = make_pair(p.first,encrypt(pass));
			if(!HashTable<string,string>::match(encryptedKV))
			{
				return HashTable<string,string>::insert(encryptedKV);
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	else
	{
		return false;
	}
}

bool PassServer::load(const char *filename)
{
	return HashTable<string,string>::load(filename);
}

bool PassServer::write_to_file(const char* filename)
{
	return HashTable<string,string>::write_to_file(filename);
}
void PassServer::dump()
{
	HashTable<string,string>::dump();
}
size_t PassServer::size()
{
	return HashTable<string,string>::size();
}
string PassServer::encrypt(const string &str)
{
	return crypt(str.c_str(),PassServer::SALT);
}
