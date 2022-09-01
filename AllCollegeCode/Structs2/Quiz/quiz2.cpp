#include <iostream>
#include <cstring>
#include <string>
#include <fstream>
#include <stack>

using namespace std;

int main()
{

	string fileName = "";
	cin>>fileName;
	ifstream input;
	input.open(fileName);
	stack<string> content;
	stack<char> checker;
	string word;
	int paren = 0;
	int squ = 0;
	int brack = 0;

	while(getline(input, word))
	{
		content.push(word);
	}
 

	string total_content = "";
	
	while(!content.empty())
	{
		string temp = content.top();
		total_content = temp + total_content;
		content.pop();
	}
	
	for(int i = 0; i < total_content.length(); i++)
	{
		checker.push(total_content[i]);
	}

	while(!checker.empty())
	{
		LOOP1:if(checker.top() == '{')
		{
			brack++;
			while(checker.top() != '}')
			{
				if(checker.top() == '(')
				{
					paren++;
				}
				else if(checker.top() == ')')
				{
					paren--;
				}
				else if(checker.top() == '[')
				{
					squ++;
				}
				else if(checker.top() == ']')
				{
					squ--;
				}
				else if(checker.top() == '{')
				{
					brack++;
				}
				checker.pop();
			}
			if(checker.top() == '}')
			{
				brack--;
				checker.pop();
			}
			if(paren != 0 || squ != 0)
			{	
				cout<<"Error: Missing parentheses or square bracket."<<endl;
				goto end;
			}
			else if(brack != 0)
			{
				brack--;
				goto LOOP1;
			}
		}
		LOOP2:if(checker.top() == '(')
		{
			paren++;
			while(checker.top() != ')')
			{
				if(checker.top() == '{')
				{
					brack++;
				}
				else if(checker.top() == '}')
				{
					brack--;
				}
				else if(checker.top() == '[')
				{
					squ++;
				}
				else if(checker.top() == ']')
				{
					squ--;
				}
				else if(checker.top() == '(')
				{
					paren++;
				}
				checker.pop();
			}
			if(checker.top() == ')')
			{
				paren--;
				checker.pop();
			}
			if(brack != 0 || squ != 0)
			{	
				cout<<"Error: Missing bracket or square bracket."<<endl;
				goto end;
			}
			else if(paren != 0)
			{
				paren--;
				goto LOOP2;
			}
		}
		LOOP3:if(checker.top() == '[')
		{
			squ++;
			while(checker.top() != ']')
			{
				if(checker.top() == '(')
				{
					paren++;
				}
				else if(checker.top() == ')')
				{
					paren--;
				}
				else if(checker.top() == '{')
				{
					brack++;
				}
				else if(checker.top() == '}')
				{
					brack--;
				}
				else if(checker.top() == '[')
				{
					squ++;
				}
				checker.pop();
			}
			if(checker.top() == ']')
			{
				squ--;
				checker.pop();
			}
			if(paren != 0 || brack != 0)
			{	
				cout<<"Error: Missing parentheses or bracket."<<endl;
				goto end;
			}
			else if(squ != 0)
			{
				squ--;
				goto LOOP3;
			}
		}
		checker.pop();
	}
	if(brack == 0 && paren == 0 && squ == 0)
	{
		cout<<"All symbols are appropriately balanced."<<endl;
	}
	end:;
}
