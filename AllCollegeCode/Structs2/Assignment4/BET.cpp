//BET.cpp Francesco Messina
#include <iostream>
#include "BET.h"

using namespace std;

//PUBLIC FUNCTIONS
BET::BET():root{nullptr}
{
	
}

BET::BET(const string& postfix):root{nullptr}
{
	buildFromPostfix(postfix);
}

BET::BET(const BET& rhs): root{nullptr}
{
    clearStacc();
    root = clone(rhs.root);
    stacc.push(root);
}

BET::~BET()
{
    	if(!empty())
	{
        	makeEmpty(root);
	}
    	if(root != nullptr)
	{
        	delete root;
	}
}

bool BET::buildFromPostfix(const string& postfix)
{
	bool ans = true;
	string post = postfix, token;
	if(!empty())
	{
		makeEmpty(root);
		clearStacc();
	}
	for(string::iterator itr = post.begin(); itr!= post.end(); ++itr)
	{
		token += *itr;
		if(*itr == ' ' || itr == (post.end()- 1))
		{
			if(*itr == ' ')	
			{
                		token.pop_back();
			}
            		if(isOperan(token))
			{
                		BinaryNode *n = new BinaryNode(token,nullptr,nullptr);
                		stacc.push(n);
            		}
            		else if(isOperat(token))
			{
                		BinaryNode *ri, *le;
                		if(!stacc.empty())
                    		{
					ri = stacc.top();
                    			stacc.pop();
                		}
                		else 
				{
					ans = false;
					break;
				}
              			if(!stacc.empty())
				{
                    			le = stacc.top();
                    			stacc.pop();
                		}
                		else 
				{
					ans = false; 
					break;
				}
                		BinaryNode *op = new BinaryNode(token,le,ri);
                		stacc.push(op);
            		}
            		token = "";
		}
	}	
	if(!stacc.empty())
	{
        	root = stacc.top(); 
        	if(stacc.size() > 1 && isOperan(root->data))
            	{
			ans = false;
		}
    	}
    	else 
	{
		ans = false;
	}

	if(!ans)
	{
        	cout<<"Invalid postfix expression"<<endl;
        	if(!empty())
		{
            		makeEmpty(root);
           		clearStacc();
        	}
    	}
	return ans;
}

const BET & BET::operator=(const BET& rhs)
{
    root = clone(rhs.root);
    clearStacc();
    stacc.push(root);
    return *this;
}

void BET::printInfixExpression()
{
    printInfixExpression(root);
    cout<<'\n';  
}

void BET::printPostfixExpression()
{
    printPostfixExpression(root);
    cout<<'\n';
}

size_t BET::size()
{
    return size(root);
}

size_t BET::leaf_nodes()
{
    return leaf_nodes(root);
}

bool BET::empty()
{
    return (root == nullptr);
}

//PRIVATE FUNCTIONS

void BET::printInfixExpression(BET::BinaryNode *n)
{
	 if(n != nullptr)
	 {
	 	
		 if((n->data == "*" || n->data == "/")&&(n->l->data == "+"|| n->l->data == "-"))
		 {
				cout<<"( ";
 		 }
		 printInfixExpression(n->l);
		 if((n->data == "*" || n->data == "/")&&(n->l->data == "+"|| n->l->data == "-"))
		 {
				cout<<") ";
 		 }

		 cout << n->data << " ";
		 if((n->data == "*" || n->data == "/")&&((n->r->data == "+"|| n->r->data == "-")||(n->r->data == "*"|| n->r->data == "/")))
		 {
				cout<<"( ";
		 }
		 if((n->data == "+" || n->data == "-")&&(n->r->data == "+"|| n->r->data == "-"))
		 {	
			cout<<"( ";
		 }	
		 printInfixExpression(n->r);
		 if((n->data == "*" || n->data == "/")&&((n->r->data == "+"|| n->r->data == "-")||(n->r->data == "*"|| n->r->data == "/")))
		 {
				cout<<") ";
		 }
		 if((n->data == "+" || n->data == "-")&&(n->r->data == "+"|| n->r->data == "-"))
		 {	
			cout<<") ";
		 } 	
	 }
}

void BET::makeEmpty(BinaryNode* &t)
{
	if(t != nullptr)
	{
		if(t->l != nullptr)
		{
			makeEmpty(t->l);
		}
		if(t->r != nullptr)
		{
			makeEmpty(t->r);
		}
		delete t;
	}
	t = nullptr;
}

BET::BinaryNode * BET::clone(BET::BinaryNode* t)
{
	if(t == nullptr)
    	{
		return nullptr;
	}
	else 
	{
		return (new BinaryNode{t->data,clone(t->l),clone(t->r)});
	}
}

void BET::printPostfixExpression(BET::BinaryNode *n)
{
	if(n != nullptr)
	{
        	printPostfixExpression(n->l);
	     	printPostfixExpression(n->r);
		cout<<n->data<<" ";
	}
}

size_t BET::size(BET::BinaryNode *t)
{
	if(t == nullptr)
	{
        	return 0;
	}
	else 
	{
		int ans = 1 + size(t->l) + size(t->r); 
		return ans;
	}
}

size_t BET::leaf_nodes(BET::BinaryNode *t)
{
	if(t == nullptr)
	{
        	return 0;
	}
    
    	if(t->l == nullptr && t->r == nullptr)
	{
        	return 1;
	}
    	else 
	{
		int ans = 0 + leaf_nodes(t->l) + leaf_nodes(t->r);
		return ans;
	}
}

void BET::clearStacc()
{
	while(!stacc.empty())
	{
        	stacc.pop();
	}
}

bool BET::isOperat(const string &s)
{
	bool temp = false;
	if(s == "+" || s == "-" || s == "/" || s == "*")
	{
		temp = true;
	}
	return temp;
}

bool BET::isOperan(const string &s)
{
	bool temp = false;
	if(isalnum(s[0]))
	{
		temp = true;
	}
	return temp;
}


