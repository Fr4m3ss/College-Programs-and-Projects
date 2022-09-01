//BET.h Header file Francesco Messina
#include <iostream>
#include <stack>
#include <string>

using namespace std;

class BET
{
	private:	
	struct BinaryNode
	{
		string data;
		BinaryNode *l;
		BinaryNode *r;

		BinaryNode():l{nullptr},r{nullptr}
		{
			
		}
		BinaryNode(const string &dat, BinaryNode *le, BinaryNode *ri):data{dat},r{ri},l{le}
		{
			
		}
	};

	public:
	BET();
	BET(const string& postfix);
	BET(const BET&);
	~BET();
	bool buildFromPostfix(const string& postfix);
	const BET & operator= (const BET &);
	void printInfixExpression();
	void printPostfixExpression();
	size_t size();
	size_t leaf_nodes();
	bool empty();

	private:
	void printInfixExpression(BinaryNode *n);
	void makeEmpty(BinaryNode* &t);
	BinaryNode * clone(BinaryNode *t);
	void printPostfixExpression(BinaryNode *n);
	size_t size(BinaryNode *t);
	size_t leaf_nodes(BinaryNode *t);

	stack<BinaryNode*> stacc;
	BinaryNode *root;

	void clearStacc();
	bool isOperat(const string &s);
	bool isOperan(const string &s);
};
