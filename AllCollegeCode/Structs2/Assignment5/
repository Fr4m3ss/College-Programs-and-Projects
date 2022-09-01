//Francesco Messina, hashtable.h
#ifndef HASHTABLE_H
#define HASHTABLE_H
#include <iostream>
#include <vector>
#include <list>
#include <utility>
#include <fstream>
#include <sstream>
#include <algorithm>
#include <cstring>

using namespace std;

namespace cop4530
{
	
	template<typename K, typename V>
	class HashTable
	{
		public:
		typedef pair<K,V> Key;

		explicit HashTable(size_t size = 101);
		~HashTable();
		bool contains(const K &k) const;
		bool match(const Key& kv) const;
		bool insert(const Key& kv);
		bool insert(Key&& kv);
		bool remove(const K& k);
		void clear();
		bool load(const char* filename);
		void dump() const;
		size_t size();
		bool write_to_file(const char* filename);

		private:
		void make_empty();
		void rehash();
		size_t myhash(const K& k) const;
		unsigned long prime_below(unsigned long);
		void setPrimes(std::vector<unsigned long>&);
		size_t currentSize;
		
		protected:
		// max_prime is used by the helpful functions provided
		// to you.
		static const unsigned int max_prime = 1301081;
		// the default_capacity is used if the initial capacity 
		// of the underlying vector of the hash table is zero. 
		static const unsigned int default_capacity = 11;

		vector<list<Key>> table;

	};

#include "hashtable.hpp"
} 
#endif
