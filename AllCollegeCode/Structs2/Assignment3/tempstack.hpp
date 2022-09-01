//Stack.hpp Francesco Messina
#include <iostream>
#include "stack.h"

using namespace std;

template <typename T>
Stack<T>::Stack()
{
	syze = 0;
	first = 0;
	stacc = new T[syze];
}

template <typename T>
Stack<T>::~Stack()
{
	delete [] stacc;
}


template <typename T>
Stack<T>::Stack (const Stack<T>& x)
{
	syze = x.syze;
	first = x.first;
	stacc = new T[syze];

	for(int i = 0; i < first; i++)
	{
		stacc[i] = x.stacc[i];
	}
}

template <typename T>
Stack<T>::Stack(Stack<T> && x)
{
	x.first = -1;
	x.stacc = std::vector<T>();
}

template <typename T>
Stack<T>& Stack<T>::operator= (const Stack <T>& x)
{
	if(&x != this)
	{
		delete [] stacc;

		syze = x.syze;
		first = x.first;
		stacc = new T[syze];

		for(int i = 0; i < top; i++)
		{
			stacc[i] = x.stacc[i];
		}
	}
	return *this;
}

template <typename T>
Stack<T> & Stack<T>::operator=(Stack<T> && x)
{
	std::swap(first, x.fisrt);
	std::swap(stacc, x.stacc);
}

template <typename T>
bool Stack<T>::empty() const
{
	return (size() <= 0);
}

template <typename T>
void Stack<T>::clear()
{
	while(!empty())
	{
		pop();
	}
}

template <typename T>
void Stack<T>::push(const T& x)
{
	first++;
	stacc.push_back(x);
}

template <typename T>
void Stack<T>::push(T && x)
{
	first++;
	stacc.push_back(std::move(x));
}

template <typename T>
void Stack<T>::pop()
{
	stacc.pop_back();
	first--;
}

template <typename T>
T& Stack<T>::top()
{
	return stacc[first];
}

template <typename T>
const T& Stack<T>::top() const
{
	return stacc[first];
}

template <typename T>
int Stack<T>::size() const
{
	return syze;
}

template <typename T>
void Stack<T>::print(std::ostream& os, char ofc = ' ') const
{
	for(auto itr = stacc.begin(); itr != stacc.end(); ++itr)
	{
		os << *itr << ofc;
	}
}

template <typename T>
std::ostream& operator<< (std::ostream& os, const Stack<T>& a)
{
	a.print(os);
	return os;
}

template <typename T>
bool operator== (const Stack<T>& a, const Stack <T>& b)
{
	if(a.size() == b.size())
	{
		Stack<T> atemp = a, btemp = b;
		while(!atemp.empty() && !btemp.empty())
		{
			if(atemp.top() != btemp.top())
			{
				return false;
			}
			atemp.pop();
			btemp.pop();
		}
		return true;
	}
	else
	{
		return false;
	}
}

template <typename T>
bool operator!= (const Stack<T>& a, const Stack <T>& b)
{
	return (!(a == b));
}

template <typename T>
bool operator<= (const Stack<T>& a, const Stack <T>& b)
{
	if(a == b)
	{
		return true;
	}
	Stack<T> atemp = a, btemp = b;
	while(!atemp.empty())
	{
		if(btemp.empty())
		{
			return true;
		}
		if(atemp.top() > btemp.top())
		{
			return false;
		}
		atemp.pop();
		btemp.pop();
	}
	return true;
}


