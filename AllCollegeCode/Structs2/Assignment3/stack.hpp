//Stack.hpp Francesco Messina
#include <iostream>

using namespace std;

template <typename T>
Stack<T>::Stack()
{

}

template <typename T>
Stack<T>::~Stack()
{
	stacc.clear();
}


template <typename T>
Stack<T>::Stack (const Stack<T>& x)
{
	*this = x;
}

template <typename T>
Stack<T>::Stack(Stack<T> && x)
{
	*this = x;
}

template <typename T>
Stack<T>& Stack<T>::operator= (const Stack <T>& x)
{
	if(&x != this)
	{
		stacc = x.stacc;
	}
	return *this;
}

template <typename T>
Stack<T> & Stack<T>::operator=(Stack<T> && x)
{
	stacc = x.stacc;
	return *this;
}

template <typename T>
bool Stack<T>::empty() const
{
	return stacc.empty();
}

template <typename T>
void Stack<T>::clear()
{
	stacc.clear();
}

template <typename T>
void Stack<T>::push(const T& x)
{
	stacc.push_back(x);
}

template <typename T>
void Stack<T>::push(T && x)
{
	stacc.push_back(x);
}

template <typename T>
void Stack<T>::pop()
{
	stacc.pop_back();
}

template <typename T>
T& Stack<T>::top()
{
	return stacc.back();
}

template <typename T>
const T& Stack<T>::top() const
{
	return stacc.back();
}

template <typename T>
int Stack<T>::size() const
{
	return stacc.size();
}

template <typename T>
void Stack<T>::print(std::ostream& os, char ofc) const
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
	return a.getVec() == b.getVec();
}

template <typename T>
bool operator!= (const Stack<T>& a, const Stack <T>& b)
{
	return (!(a == b));
}

template <typename T>
bool operator<= (const Stack<T>& a, const Stack <T>& b)
{
	return a.getVec() <= b.getVec();
}

template <typename T>
std::vector<T> Stack<T>::getVec() const
{
	return stacc;
}
