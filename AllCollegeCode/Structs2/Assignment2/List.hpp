//Francesco Messina, Assignment 2: List.hpp
#include <iostream>
#include <string>
#include "List.h"

using namespace std;

template <typename T> class const_iterator;

//const iterator class

template <typename T>
List<T>::const_iterator::const_iterator() : current{nullptr}
{
	
}


template <typename T>
const T & List<T>::const_iterator::operator*() const
{
	return retrieve();	
}

template <typename T>
typename List<T>::const_iterator & List<T>::const_iterator::operator++()
{
	current = current->next;
	return *this;
}

template <typename T>
typename List<T>::const_iterator List<T>::const_iterator::operator++(int)
{
	const_iterator old = *this;
	++(*this);
	return old;
}

template <typename T>
typename List<T>::const_iterator & List<T>::const_iterator::operator--()
{
	current = current->prev;
	return *this;
}

template <typename T>
typename List<T>::const_iterator List<T>::const_iterator::operator--(int)
{
	const_iterator old = *this;
	--(*this);
	return old;
}

template <typename T>
bool List<T>::const_iterator::operator==(const const_iterator &rhs) const
{
	return current == rhs.current;	
}

template <typename T>
bool List<T>::const_iterator::operator!=(const const_iterator & rhs) const
{
	return !( *this == rhs );	
}

template <typename T>
T & List<T>::const_iterator::retrieve() const
{
	return current->data;
}

template <typename T>  
List<T>::const_iterator::const_iterator(typename List<T>::Node* p) : current{p} 
{

}  

template <typename T> class iterator;
//iterator class

template <typename T>
List<T>::iterator::iterator()
{

}

template <typename T>
T & List<T>::iterator::operator*() 
{
	return this->current->data; 
}

template <typename T>
const T & List<T>::iterator::operator*() const 
{ 
	return this->retrieve(); 
}

template <typename T>
typename List<T>::iterator & List<T>::iterator::operator++() 
{  
	this->current = this->current->next; 	
	return *this;
}

template <typename T>
typename List<T>::iterator List<T>::iterator::operator++(int)
{  
	iterator old = *this;
	this->current = this->current->next; 	
	return old;
}

template <typename T>
typename List<T>::iterator & List<T>::iterator::operator--()
{  
	this->current = this->current->prev;	
	return *this;
}

template <typename T>
typename List<T>::iterator List<T>::iterator::operator--(int)
{  
	iterator old = *this;
	this->current = this->current->prev;	
	return *this;
}

template<typename T>
List<T>::iterator::iterator(typename List<T>::Node* p) : List<T>::const_iterator{p}
{

}

template <typename T> class List;
//List Class

template <typename T>
List<T>::List() 
{
	init();	
}

template <typename T>
List<T>::List(const List<T> & rhs)
{
	init();
	for(auto itr = rhs.begin(); itr != rhs.end(); ++itr) 
	{
		push_back(*itr);
	}
}

template <typename T> 
List<T>::List( List<T> && rhs ) : theSize(rhs.theSize), head{rhs.head}, tail{rhs.tail}
{
	rhs.theSize = 0;	
	rhs.head = nullptr;		
	rhs.tail = nullptr;	
}

template <typename T>
List<T>::List(int num, const T & val) 
{
	init(); 
	int index;
	for(index = 0; index < num; index++)
	{
		push_back(val);
	}
}

template <typename T>
List<T>::List(typename List<T>::const_iterator start, typename List<T>::const_iterator end)
{
	init();
	for(auto itr= start; itr != end; ++itr)
	{	
		push_back(*itr); 
	}
}

template <class T>
List<T>::List(std::initializer_list<T> ilist)
{
	init();
	for(auto &i : ilist)
	{
		push_back(i);
	}
}

template <typename T>
List<T>::~List()
{
	clear();
	delete head;
	delete tail;
}

template <typename T>
const List<T> & List<T>::operator=(const List<T> & rhs)
{
	auto temp = rhs;
	swap(*this, temp);  	
	return *this;
}

template <typename T>
List<T> & List<T>::operator=(List<T> && rhs) 
{
	init(); 
	*this = std::move( rhs );	
	return *this;
}

template <class T>
List<T> & List<T>::operator=( std::initializer_list<T> ilist )
{
	if( this->theSize != 0 )
	{
		clear();
		init();
	}
	for( auto &i : ilist )
	{
		push_back(i);
	}
	return *this;
}

template <typename T>  
int List<T>::size() const  
{
	return theSize;
}

template <typename T> 
bool List<T>::empty() const 
{
	return size() == 0;
}

template <typename T> 
void List<T>::clear()
{
	while(!empty())
	{ 
		pop_back();
	}
}

template <typename T>
void List<T>::reverse()
{
	if(!empty())
	{
		auto current_ptr=head;
		while(current_ptr != nullptr)
		{
			std::swap(current_ptr->next, current_ptr->prev);
			current_ptr=current_ptr->prev;
		}
	}
	swap(head, tail);
}

template <typename T> 
T & List<T>::front()
{
	return *begin();
}

template <typename T> 
const T & List<T>::front() const
{
	return *begin();  
}

template <typename T>
T & List<T>::back()
{
	return *(--end());  
}

template <typename T>
const T & List<T>::back() const 
{
	return *(--end());  
}

template <typename T>
void List<T>::push_front(const T & val)
{  
	insert(begin(), val);
}

template <typename T>
void List<T>::push_front( T && val) 
{  
	insert(begin(), std::move( val));
}

template <typename T>
void List<T>::push_back(const T & val)
{  
	insert(end(), val);  
}

template <typename T>
void List<T>::push_back(T && val)
{  
	insert( end(), std::move( val));
}

template <typename T>
void List<T>::pop_front()
{  
	erase(begin());
}

template <typename T>
void List<T>::pop_back()  
{ 
	erase(--end());
}

template <typename T>
void List<T>::remove(const T & val)
{  
	for(auto itr = begin(); itr != end(); ++itr)
	{
		if(*itr == val)		
		{
			erase(itr);
		}
	}
}

template <typename T>
template <typename PREDICATE>
void List<T>::remove_if(PREDICATE pred)
{
	for(iterator itr = begin(); itr != end(); itr++ )
	{
		if(pred(*itr))
		{
			erase(itr);
		}
	}
}

template <typename T>
void List<T>::print(std::ostream & os, char ofc) const 
{
	for(auto itr = begin(); itr != end(); ++itr)
	{	
		os << *itr << ofc;  
	}
}

template <typename T>
typename List<T>::iterator List<T>::begin()
{  
	if(!empty())
	{
		typename List<T>::iterator itr{head->next};
		return itr;
	}
}

template <typename T>
typename List<T>::const_iterator List<T>::begin() const
{
	if(!empty())
	{
		typename List<T>::const_iterator const_itr{head->next};
		return const_itr;
	}
}

template <typename T>
typename List<T>::iterator List<T>::end() 
{  
	typename List<T>::iterator itr{ tail };
	return itr;
}

template <typename T>
typename List<T>::const_iterator List<T>::end() const
{
	typename List<T>::const_iterator const_itr{tail};
	return const_itr;
}

template <typename T>
typename List<T>::iterator List<T>::insert(typename List<T>::iterator itr, const T & val)
{
	auto* p = itr.current;  
	theSize++;
	auto* nptr = new List<T>::Node{val, p->prev, p};
	p->prev->next = nptr;
	p->prev = nptr;
	typename List<T>::iterator iter{nptr};	
	return iter;
}

template <typename T>
typename List<T>::iterator List<T>::insert(typename List<T>::iterator itr, T && val)
{  
	auto* p = itr.current;	
	theSize++;
	auto* nptr = new List<T>::Node{ std::move( val ), p->prev, p};
	p->prev->next = nptr;
	p->prev = nptr;
	typename List<T>::iterator iter{nptr};	
	return iter;
}

template <typename T>
typename List<T>::iterator List<T>::erase(typename List<T>::iterator itr)
{
	auto* p = itr.current;
	typename List<T>::iterator value{p->next};
	p->prev->next = p->next;
	p->next->prev = p->prev; 
	delete p;   
	theSize--;		
	return value;
}

template <typename T>
typename List<T>::iterator List<T>::erase(typename List<T>::iterator start, typename List<T>::iterator end)
{
	for(auto itr = start; itr != end;)
	{
		itr = erase(itr);
	}
	return end;
}

template <typename T>
void List<T>::init()
{
	theSize = 0;
	head = new Node;
	tail = new Node;
	head->next = tail;
	tail->prev = head;
}

template <typename T>
bool operator==(const List<T> & lhs, const List<T> & rhs)
{
	bool flag = true;
	if( lhs.size() == rhs.size())
	{
		auto rhs_itr = rhs.begin();
		for(auto lhs_itr=lhs.begin(); lhs_itr !=lhs.end(); ++lhs_itr)
		{
			if(*lhs_itr != *rhs_itr)
			{ 
			 	flag = false;
			 	break;
			}
			++rhs_itr;
		}
		return flag;
	}
	else
		return false;
}

template <typename T>
bool operator!=(const List<T> & lhs, const List<T> & rhs)
{
	return !(lhs == rhs);
}

template <typename T>
std::ostream & operator<<(std::ostream & os, const List<T> & l)
{
	l.print(os);	
	return os;
}

