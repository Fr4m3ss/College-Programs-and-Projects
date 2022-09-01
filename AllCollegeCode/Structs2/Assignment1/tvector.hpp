//Francesco Messina, Assignment 1
#include <iostream>
#include <utility>

template <typename T>   class TVectorIterator;    // forward declaration

// Declaration of class TVector

template <typename T>
TVector<T>::TVector()
{
	capacity = SPARECAPACITY;
	size = 0;
	array = new T [capacity];	
	itr.index = 0;
	itr.vsize = 0;
	itr.ptr = &array[itr.index];

	itrFirst.index = 0;
	itrFirst.vsize = size;
	itrFirst.ptr = &array[itrFirst.index];
	
	itrLast.index = size;
	itrLast.vsize = size;
	itrLast.ptr = &array[itrLast.index];
}

template <typename T>
TVector<T>::TVector(T val, int num)
{
	capacity = SPARECAPACITY + num;
	size = num;
	array = new T [capacity];
	itr.index = 0;
	itr.vsize = size;
	itr.ptr = &array[itr.index];
	for(int i = 0; i < num; i++)
	{
		array[i] = val;
	}

	itrFirst.index = 0;
	itrFirst.vsize = size;
	itrFirst.ptr = &array[itrFirst.index];
	
	itrLast.index = size;
	itrLast.vsize = size;
	itrLast.ptr = &array[itrLast.index];
}

template <typename T>
TVector<T>::~TVector()					// destructor
{
	delete [] array;
	size = 0;
	capacity = 0;
}

template <typename T>
TVector<T>::TVector(const TVector<T>& v)		// copy constructor
{
        T temp = new T[v.capacity];
        for(int i = 0; i < size; i++)
        {   
                temp[i] = v.array[i];
        }   
        this.array = &temp;
	this.size = v.size;
	this.capacity = v.capacity;	
}

template <typename T>
TVector<T>& TVector<T>::operator=(const TVector<T>& v)  // copy assignment operator
{
	if(this != &v) 
	{
      	 	T temp = new T[v.capacity];
		for(int i = 0; i < size; i++)
		{   
			temp[i] = v.array[i];
		}   
		this.array = &temp;
		this.size = v.size;
		this.capacity = v.capacity;		
   	}
	return *this;
}

template <typename T>
TVector<T>::TVector(TVector && v)			// move constructor
{
	capacity = v.capacity; 
	size = v.size;
	array = new T[capacity];
	for (int i = 0; i < size; i++)  
	{
	        array[i] = v.array[i]; 
	}
}

template <typename T>
TVector<T>& TVector<T>::operator=(TVector<T> && v)	// move assignment operator
{
	 if(this != &v) 
	 {
	 	delete [] array;
		capacity = v.capacity;
		size = v.size;
		array = new T[capacity];
		for (int i = 0; i < size; i++)  
		{
			array[i] = v.array[i];
		}
	 }
	 return *this;
}

template <typename T>
bool TVector<T>::IsEmpty() const		// checks to see whether container is empty
{
	if(size == 0)
	{
		return true;
	}
	else
	{
		return false;
	}
	return false;
}

template <typename T>
void TVector<T>::Clear()			// clear out vector, reset to empty
{
	delete [] array;	
	capacity = SPARECAPACITY;
	size = 0;
	array = new T [capacity];
	itr = array.GetIterator();	
}

template <typename T>
int TVector<T>::GetSize() const			// return the size of the vector
{
	return size;
}

template <typename T>
void TVector<T>::InsertBack(const T& d)	// insert data d as last element
{
	if(size == capacity)
	{
		SetCapacity(capacity+capacity);
	}
	
	array[size] = d;
	size++;
}

template <typename T>
void TVector<T>::RemoveBack()			// remove last element of vector
{
	if(size >0)
	{
		size--;
	}
}

template <typename T>
T& TVector<T>::GetFirst() const			// return first element of vector
{
	if(!this.isEmpty())
	{
		return array[0];
	}
	else
	{
		return &dummy;
	}
}

template <typename T>
T& TVector<T>::GetLast() const			// return last element of vector
{	
	if(!this.isEmpty())
	{	
		return array[size-1];
	}
	else
	{
		return &dummy;
	}	
}

template <typename T>
TVectorIterator<T> TVector<T>::GetIterator() const  // return iterator to first item
{	
	TVectorIterator<T> temp;    
	temp.index = 0;
	temp.vsize = size;
	temp.ptr = array;
	return temp;
}

template <typename T>
TVectorIterator<T> TVector<T>::GetIteratorEnd() const // return iterator to last item
{
	TVectorIterator<T> temp;
	temp.index = size-1;
        temp.vsize = size;
	temp.ptr = array+(size-1);
	return temp;
}

template <typename T>
void TVector<T>::SetCapacity(unsigned int c)	// reset the capacity of the vector
{
	capacity = c;	
	if(capacity < size) 
	{
        	size = capacity;
   	}

    	T *newArray = new T[capacity];
    	for(int i = 0; i < size; i++) 
	{
        	newArray[i] = array[i];
   	}

    	delete[] array;
    	array = newArray;
}

// insert data element d just before item at pos position
//  return iterator to the new data item

template <typename T>
TVectorIterator<T> TVector<T>::Insert(TVectorIterator<T> pos, const T& d)
{
	int i,t;
	t = pos.index;
	if(size == capacity)
	{
		SetCapacity(capacity+capacity);
	} 
	
	for(i = size - 1; i >= t; i--) 
	{
        	array[i + 1] = array[i];
    	}
	array[i+1] = d;
	size++;
	pos.index = i+1;
    	pos.vsize = size;
    	pos.ptr = array + i+1;
	
	return pos;
}

// remove data item at position pos. Return iterator to the item 
//  that comes after the one being deleted

template <typename T>
TVectorIterator<T> TVector<T>::Remove(TVectorIterator<T> pos)
{
	int t = pos.index;
	int i;
	for(i = pos.index; i < size - 1; i++)
	{
		array[i] = array[i + 1];
	}
	size--;
	pos.index = t;
	pos.vsize = size;
	pos.ptr = array + pos.index;
	return pos;
}

// remove data item in range [pos1, pos2)
//  i.e. remove all items from pos1 up through but not including pos2
//  return iterator to the item that comes after the deleted items

template <typename T>
TVectorIterator<T> TVector<T>::Remove(TVectorIterator<T> pos1, TVectorIterator<T> pos2)
{
	TVectorIterator<T> pos;
	int p1,p2,i,j;
	p1 = pos1.index;
	p2 = pos2.index;
	i = p1;
	j = p2;

	for(i = p1; i <= p2; i++)
	{
		array[i] = array[j++];
	}
	size = size - (p2-p1);

	pos.index = i;
	pos.ptr = array + i;
	pos.vsize = size;
	return pos;
}

// print vector contents in order, separated by given delimiter

template <typename T>
void TVector<T>::Print(std::ostream& os, char delim) const
{
	for(int i = 0; i < size; i++)
	{
		os<<array[i]<<delim;
	}
}

// stand-alone function for concatenating two TVector objects
template <typename T>
TVector<T> operator+(const TVector<T>& t1, const TVector<T>& t2)
{
	TVectorIterator<T> itr1temp, itr2temp;
	itr1temp = t1.GetIterator();
	itr2temp = t2.GetIterator();
	TVector<T> temp;
	while(itr1temp.HasNext())
	{
		temp.InsertBack(itr1temp.GetData());
		itr1temp.Next();
	}
	while(itr2temp.HasNext())
	{
		temp.InsertBack(itr2temp.GetData());
		itr2temp.Next();
	}
	return temp;
}

// Declaration of class TVectorIterator

template <typename T>
TVectorIterator<T>::TVectorIterator()			// default constructor
{
	index = 0;
	ptr = NULL;
	vsize = 0;
}

template <typename T>
bool TVectorIterator<T>::HasNext() const		// next item available?
{
	return (index <= (vsize-1));	
}

template <typename T>
bool TVectorIterator<T>::HasPrevious() const		// previous item available?
{
	return (index >= 0);	
}

template <typename T>
TVectorIterator<T> TVectorIterator<T>::Next()		// advance to next item
{
	if(HasNext())
	{
		index++;
		*ptr++;
	}
	return *this;
}

template <typename T>
TVectorIterator<T> TVectorIterator<T>::Previous()	// move to previous item
{
	if(HasPrevious())
	{
		index--;
		*ptr--;
	}
	return *this;
}

template <typename T>
T& TVectorIterator<T>::GetData() const			// return data element of current node
{
	if(index < 0 || index > vsize) 
	{
		return TVector<T>::dummy;
	}
	else
	{
	    return *ptr;
	}
	return *ptr;	
}
