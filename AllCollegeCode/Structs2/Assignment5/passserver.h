//Francesco Messina, passserver.h
#ifndef PASSSERVER_H
#define PASSSERVER_H

#include <iostream>
#include <string>
#include <utility>
#include "hashtable.h"

using namespace std;

namespace cop4530
{
	class PassServer : private HashTable<string, string>
	{
		public:
		PassServer(size_t size = 101);
		~PassServer();
		
		bool find(const string& user);
		bool addUser(pair<string,string> &kv);
		bool addUser(pair<string,string> &&kv);
		bool removeUser(const string &k);
		bool changePassword(const pair<string,string> &p, const string& pass);
		bool load(const char* filename);
		bool write_to_file(const char* filename);
		void dump();
		size_t size();
		
		private:
		string encrypt(const string &str);
		static constexpr char SALT[] = "$1$########";
	
	};
}

#endif
