//Francesco Messina, hashtable.hpp
#include <iostream>

using namespace std;
using namespace cop4530;

template <typename K, typename V>
HashTable<K, V>::HashTable(size_t size)
{
	table.resize(prime_below(size));
	currentSize = 0;
}

template <typename K, typename V>
HashTable<K, V>::~HashTable()
{
	clear();
}

template <typename K, typename V>
bool HashTable<K, V>::contains(const K &k) const
{
	auto & pList = table[myhash(k)];

	for(auto & temp : pList)
	{
		if(temp.first == k)
		{
			return true;
		}
	}
	return false;
}

template <typename K, typename V>
bool HashTable<K, V>::match(const Key& kv) const
{
	auto & pList = table[myhash(kv.first)];

	if(pList.size()>0)
	{
		for(auto & temp : pList)
		{
			if(temp.first == kv.first)
			{
				if(temp.second == kv.second)
				{
					return true;
				}
			}
		}
		return false;
	}
	else
	{
		return false;
	}
}

template <typename K, typename V>
bool HashTable<K, V>::insert(const Key& kv)
{
	auto & pList = table[myhash(kv.first)];
	if(pList.size()>0)
	{
		for(auto & temp : pList)
		{
			if(temp.first == kv.first)
			{
				if(temp.second == kv.second)
				{
					return false;
				}
				else
				{
					temp.second = kv.second;
					break;
				}
			}
			else
			{
				pList.push_back(kv);
				break;
			}
		}
	}
	else
	{
		pList.push_back(kv);
	}
	currentSize++;
	if(currentSize > table.size())
	{
		rehash();
	}
	return true;

}

template <typename K, typename V>
bool HashTable<K, V>::insert(Key&& kv)
{
	auto & pList = table[myhash(kv.first)];
	if(pList.size()>0)
	{
		for(auto & temp : pList)
		{
			if(temp.first == kv.first)
			{
				if(temp.second == kv.second)
				{
					return false;
				}
				else
				{
					swap(temp.second,kv.second);
					break;
				}
			}
			else
			{
				pList.push_back(move(kv));
				break;
			}
		}
	}
	else
	{
		pList.push_back(move(kv));
	}
	currentSize++;
	if(currentSize > table.size())
	{
		rehash();
	}
	return true;
}

template <typename K, typename V>
bool HashTable<K, V>::remove(const K& k)
{
	auto & pList = table[myhash(k)];
	bool ans = false;
	unsigned int ind = 0;
	for(auto & temp : pList)
	{
		if(temp.first == k)
		{
			ans = true;
			auto itr = pList.begin();
			advance(itr,ind);
			pList.erase(itr);
			--currentSize;
			break;
		}
		ind++;
	}
	return ans;
}

template <typename K, typename V>
void HashTable<K, V>::clear()
{
	make_empty();	
}

template <typename K, typename V>
bool HashTable<K, V>::load(const char* filename)
{
	ifstream infile;
	infile.open(filename);

	string line;
	while(getline(infile,line))
	{
		istringstream iss(line);
		string user,pass;
		iss>>user>>pass;
		pair<string,string> p = make_pair(user,pass);
		insert(p);
	}
	infile.close();
	return true;
}

template <typename K, typename V>
void HashTable<K, V>::dump() const
{
	int gInd = 0;
	for(auto & temp : table)
	{
		int ind = 0;
		cout<<"v["<<gInd++<<"]: ";
		for(auto & x : temp)
		{
			if(++ind>1)
			{
				cout<<":";
			}
			cout<<x.first<<" "<<x.second;
		}
		cout<<"\n";
	}
}

template <typename K, typename V>
size_t HashTable<K, V>::size()
{
	return currentSize;	
}

template <typename K, typename V>
bool HashTable<K, V>::write_to_file(const char* filename)
{
	ofstream ofile;
	ofile.open(filename);
	for(auto & temp : table)
	{
		for(auto & x : temp)
		{
			ofile<<x.first<<" "<<x.second<<"\n";
		}
	}
	ofile.close();
	return true;

}

template <typename K, typename V>
void HashTable<K, V>::make_empty()
{
	for(auto & temp : table)
	{
		temp.clear();
	}
	currentSize = 0;
}

template <typename K, typename V>
void HashTable<K,V>::rehash()
{
	vector<list<pair<K,V>>> oldTable = table;
	oldTable.resize(prime_below(2*table.size()));
	for(auto &temp : table)
	{
		temp.clear();
	}

	currentSize = 0;
	for(auto &temp : oldTable)
	{
		for(auto &x : temp)
		{
			insert(move(x));
		}
	}
}

template <typename K, typename V>
size_t HashTable<K, V>::myhash(const K& k) const
{
	size_t val = 0;
	for(auto ch : k)
	{
		val = 37*val+ch;
	}
	return val%table.size();
}

// returns largest prime number <= n or zero if input is too large
// This is likely to be more efficient than prime_above(), because
// it only needs a vector of size n
template <typename K, typename V>
unsigned long HashTable<K, V>::prime_below (unsigned long n)
{
  if (n > max_prime)
    {
      std::cerr << "** input too large for prime_below()\n";
      return 0;
    }
  if (n == max_prime)
    {
      return max_prime;
    }
  if (n <= 1)
    {
		std::cerr << "** input too small \n";
      return 0;
    }

  // now: 2 <= n < max_prime
  std::vector <unsigned long> v (n+1);
  this->setPrimes(v);
  while (n > 2)
    {
      if (v[n] == 1)
	return n;
      --n;
    }

  return 2;
}

//Sets all prime number indexes to 1. Called by method prime_below(n) 
template <typename K, typename V>
void HashTable<K, V>::setPrimes(std::vector<unsigned long>& vprimes)
{
  int i = 0;
  int j = 0;

  vprimes[0] = 0;
  vprimes[1] = 0;
  int n = vprimes.capacity();

  for (i = 2; i < n; ++i)
    vprimes[i] = 1;

  for( i = 2; i*i < n; ++i)
    {
      if (vprimes[i] == 1)
        for(j = i + i ; j < n; j += i)
          vprimes[j] = 0;
    }
}

