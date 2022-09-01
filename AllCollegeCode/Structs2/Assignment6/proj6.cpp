//Francesco Messina, Project 6

#include <iostream>
#include <iomanip>
#include <string>
#include <map>
#include <vector>

using namespace std;

void printTopChar(map<string, pair<int, int>> &map, int loop);
void printTopNum(map<string, pair<int, int>> &map, int loop);
void printTopWord(map<string, pair<int, int>> &map, int loop);

int main()
{
	map<string, pair<int, int>> charM;
	map<string, pair<int, int>> numM;
	map<string, pair<int, int>> wordM;
	
	char c;
	string cha;
	string num;
	string word;
	int ccount = 0;
	int ncount = 0;
	int wcount = 0;

	while(!cin.eof())
	{
		ccount++;
		cin.get(c);
		cha += c;
		if(cin.fail())
		{
			if(word.size() > 0)
			{
				if(wordM.find(word) == wordM.end())
				{
					wordM.insert(make_pair(word, make_pair(1, ccount)));
					wcount++;
				}
				else
				{
					++wordM[word].first;
				}
				word = "";
			}
			else if(num.size() > 0)
			{
				if(numM.find(num) == numM.end())
				{
					numM.insert(make_pair(num, make_pair(1, ccount)));
					ncount++;
				}
				else
				{
					++numM[num].first;
				}
				num = "";
			}
			break;
		}
		else if(isdigit(c) != 0)
		{
			num += c;
			if(word.size() > 0)
			{
				if(wordM.find(word) == wordM.end())
				{
					wordM.insert(make_pair(word, make_pair(1, ccount)));
					wcount++;
				}
				else
				{
					++wordM[word].first;
				}
				word = "";
			}
		}
		else if(isalpha(c) != 0)
		{
			word += tolower(c);
			if(num.size() > 0)
			{
				if(numM.find(num) == numM.end())
				{
					numM.insert(make_pair(num, make_pair(1, ccount)));
					ncount++;
				}
				else
				{
					++numM[num].first;
				}
				num = "";
			}
		}
		else
		{
			if(word.size() > 0)
			{
				if(wordM.find(word) == wordM.end())
				{
					wordM.insert(make_pair(word, make_pair(1, ccount)));
					wcount++;
				}
				else
				{
					++wordM[word].first;
				}
				word = "";
			}
			else if(num.size() > 0)
			{
				if(numM.find(num) == numM.end())
				{
					numM.insert(make_pair(num, make_pair(1, ccount)));
					ncount++;
				}
				else
				{
					++numM[num].first;
				}
				num = "";
			}
		}
		++charM[cha].first;
		cha = "";
	}
	printTopChar(charM, ccount);
	printTopWord(wordM, wcount);
	printTopNum(numM, ncount);

}

void printTopChar(map<string, pair<int, int>> &map, int loop)
{
	int counter = 0;
    	std::map<string, pair<int, int>>::iterator temp = map.begin();	
	if(loop > 10)
	{
		loop = 10;
	}
	if(loop > map.size())
	{
		loop = map.size();
	}
	cout << "Total "<< map.size() << " different characters, " << loop << " most used characters:" << endl;
	for(int i = 0; i < loop; i++)
	{
		int value = 0;
		for(std::map<string, pair<int, int> >::iterator it = map.begin(); it != map.end(); ++it)
		{
			if(it->second.first > value || (it->second.first == value && (it->second.second < temp->second.second)))
			{
				value = it->second.first;
				temp = it;
				counter++;
			}
		}
		cout << "No. " << i << ": ";
		if(temp->first == "\t")
		{
			cout << "\\t" << "		" << value << endl;
		}
		else if(temp->first == "\n")
		{
			cout << "\\n" << "		" << value << endl;
		}
		else
		{
			cout << temp->first << "		" << value << endl;
		}
		map.erase(temp);
	}
}				

void printTopWord(map<string, pair<int, int>> &map, int loop)
{
    	int counter = 0;
	std::map<string, pair<int, int>>::iterator temp = map.begin();	
	if(loop > 10)
	{
		loop = 10;
	}	
	if(loop > map.size())
	{
		loop = map.size();
	}
	cout << endl << "Total "<< map.size() << " different words, " << loop << " most used words:" << endl;
	for(int i = 0; i < loop; i++)
	{
		int value = 0;
		for(std::map<string, pair<int, int>>::iterator it = map.begin(); it != map.end(); ++it)
		{
			if(it->second.first > value || (it->second.first == value && (it->second.second < temp->second.second)))
			{
				value = it->second.first;
				temp = it;
				counter++;
			}
		}
		cout << "No. " << i << ": " << temp->first << "		" << value << endl;
		map.erase(temp);
	}
}				

void printTopNum(map<string, pair<int, int>> &map, int loop)
{
	int counter = 0;
	std::map<string, pair<int, int>>::iterator temp = map.begin();
	if(loop > 10)
	{
		loop = 10;  
	}
	if(loop > map.size())
	{
		loop = map.size();
	}
	cout << endl << "Total "<< map.size() << " different numbers, " << loop << " most used numbers:" << endl;
	for(int i = 0; i < loop; i++)
	{
		int value = 0;
		for(std::map<string, pair<int, int> >::iterator it = map.begin(); it != map.end(); ++it)
		{
			if(it->second.first > value || (it->second.first == value && (it->second.second < temp->second.second)))
			{
				value = it->second.first;
				temp = it;
				counter++;
			}
		}
		cout << "No. " << i << ": " << temp->first << "		" << value << endl;
		map.erase(temp);
	}
}
