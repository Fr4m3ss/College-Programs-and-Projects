//in2post.cpp Francesco Messina
#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <sstream>
#include "stack.h"

using namespace std;
using namespace cop4530;

int precedence(string str)
{
	int prec = 0;
	if(str == "(" || str == ")")
	{
		prec = 3;
	}
	else if(str == "*" || str == "/")
	{	
		prec = 2;
	}
	else if(str == "+" || str == "-")
	{
		prec = 1;
	}
	return prec;	
}

bool alnum(string str)
{
	for(int i = 0; i < int(str.size()); i++)
	{
		if(!isalnum(str[i]))
		{
			return false;
		}
	}
	return true;
}

void intoPost(vector<string> &in, vector<string> &post)
{
	Stack<string> stacc;
	int alnumer = 0;
	int oper = 0;
	int op = 0;
	int cl = 0;
	
	for(int i = 0; i < int(in.size()); i++)
	{
		string str = in[i];
		if(str == "+" || str == "-" || str == "/" || str == "*")
		{
			oper++;
		}
		else if(isalnum(str[0]))
		{
			alnumer++;
		}
	}

	for(int i = 0; i < int(in.size()); i++)
	{
		string str = in[i];
		if(str == "(")
		{
			op++;
		}
		else if(str == ")")
		{
			cl++;
		}
	}
	
	if(oper == (alnumer-1) && op == cl)
	{	
		cout<<"Postfix Expression: "<<endl;

		for(int i = 0; i < int(in.size()); ++i)
		{
			if(precedence(in[i]) != 0)
			{
				while(!stacc.empty() && (stacc.top() != "(") && precedence(stacc.top()) >= precedence(in[i]))
				{	
					post.push_back(stacc.top());
					cout<<stacc.top()<<" ";
					stacc.pop();
				}
				stacc.push(in[i]);
				if(in[i] == ")")
				{
					stacc.pop();
					while(stacc.top() != "(")
					{
						cout<<stacc.top()<<" ";
						post.push_back(stacc.top());
						stacc.pop();
					}
					stacc.pop();
				}
			}
			else if(alnum(in[i]))
			{
				post.push_back(in[i]);
				cout<<in[i]<<" ";
			}
		}	
		while(!stacc.empty())
		{
			cout<<stacc.top()<<" ";
			post.push_back(stacc.top());
			stacc.pop();
		}
		cout<<"\n";
	}
	if(op != cl)
	{
		cout<<"ERROR: Mismatched Parens"<<endl;
	}
	else if(oper != (alnumer-1))
	{
		if(oper < (alnumer-1))
		{
			cout<<"ERROR: Missing Operators"<<endl;
		}
		else if(oper > (alnumer-1))
		{
			cout<<"ERROR: Missing Operands"<<endl;
		}
	}
}


void eval(vector<string> & post)
{
	Stack<string> stacc;
	bool num = true;
	int alnumer = 0;
	int oper = 0;
	int op = 0;
	int cl = 0;
	
	for(int i = 0; i < int(post.size()); i++)
	{
		string str = post[i];
		if(str == "+" || str == "-" || str == "/" || str == "*")
		{
			oper++;
		}
		else if(isalnum(str[0]))
		{
			alnumer++;
		}
	}

	for(int i = 0; i < int(post.size()); i++)
	{
		string str = post[i];
		if(str == "(")
		{
			op++;
		}
		else if(str == ")")
		{
			cl++;
		}
	}
	
	if(oper == (alnumer-1) && op == cl)
	{
		cout<<"Postfix Evaluation: "<<endl;

		for(int i = 0; i < int(post.size()); i++)
		{
			if(alnum(post[i]))
			{
				for(int j = 0; j < int(post[j].size()); j++)
				{
					if(!isdigit(post[i][j]) && !(post[i][j] == '.'))
					{
						num = false;
					}
				}
			}
		}
		
		if(num)
		{
			for(int i = 0; i < int(post.size()); i++)
			{
				if(alnum(post[i]))
				{
					stacc.push(post[i]);
				}
				if(precedence(post[i]) != 0)
				{
					float ans;
					float operand1 = stof(stacc.top());
					stacc.pop();
					float operand2 = stof(stacc.top());
					stacc.pop();

					if(post[i][0] == '*')
					{
						ans = operand2 * operand1;
					}
					else if(post[i][0] == '/')
					{
						ans = operand2 / operand1;
					}
					else if(post[i][0] == '+')
					{
						ans = operand2 + operand1;
					}
					else if(post[i][0] == '-')
					{
						ans = operand2 - operand1;
					}
					stacc.push(to_string(ans));
				}
			}
			
			for(int i = 0; i < int(post.size()); i++)
			{
				cout<<post[i]<<" ";
			}
			cout<<"= "<<stacc.top()<<endl;
		}
		else
		{
			for(int i = 0; i < int(post.size()); i++)
			{
				cout<<post[i]<<" ";
			}
			cout<<endl;
		}
	}
}

int main()
{
	vector<string> infix;
	vector<string> postfix;

	string input;
	bool repeat = true;

	while(repeat)
	{
		cout<<"Enter Infix expression to be converted: (please type 'exit' to quit)"<<endl;
		getline(cin, input);
		infix.clear();
		postfix.clear();
		if(input != "exit")
		{
			stringstream tokenizedInput(input);

			while(tokenizedInput >> input)
			{
				infix.push_back(input);
			}
			intoPost(infix, postfix);
			eval(postfix);
		}
		else
		{
			repeat = false;
		}
	}
}

