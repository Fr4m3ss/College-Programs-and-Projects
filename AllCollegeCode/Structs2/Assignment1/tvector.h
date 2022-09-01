//Francesco Messina, Assignment izeArray(T*& arr, int oldSize, int newSize, const T initVal)
#include <iostream>
#include <utility>

template <typename T>   class TVectorIterator;    // forward declaration

// Declaration of class TVector

template <typename T>
class TVector
{
   friend class TVectorIterator<T>;

public:
   TVector();				// create empty vector
   TVector(T val, int num);		// create vector with num copies of val

   ~TVector();					// destructor
   TVector(const TVector<T>& v);		// copy constructor
   TVector<T>& operator=(const TVector<T>& v);  // copy assignment operator

   TVector(TVector && v);			// move constructor
   TVector<T>& operator=(TVector<T> && v);	// move assignment operator

   bool IsEmpty() const;		// checks to see whether container is empty
   void Clear();			// clear out vector, reset to empty
   int GetSize() const;			// return the size of the vector

   void InsertBack(const T& d);		// insert data d as last element
   void RemoveBack();			// remove last element of vector

   T& GetFirst() const;			// return first element of vector
   T& GetLast() const;			// return last element of vector

   TVectorIterator<T> GetIterator() const;  // return iterator to first item
   TVectorIterator<T> GetIteratorEnd() const; // return iterator to last item

   void SetCapacity(unsigned int c);	// reset the capacity of the vector
					//  to c.  Adjust size if c is smaller.

   // insert data element d just before item at pos position
   //  return iterator to the new data item
   TVectorIterator<T> Insert(TVectorIterator<T> pos, const T& d);

   // remove data item at position pos. Return iterator to the item 
   //  that comes after the one being deleted
   TVectorIterator<T> Remove(TVectorIterator<T> pos);

   // remove data item in range [pos1, pos2)
   //  i.e. remove all items from pos1 up through but not including pos2
   //  return iterator to the item that comes after the deleted items
   TVectorIterator<T> Remove(TVectorIterator<T> pos1, TVectorIterator<T> pos2);

   // print vector contents in order, separated by given delimiter
   void Print(std::ostream& os, char delim = ' ') const;

private:
   T* array;			// pointer to dynamic array of items
   unsigned int capacity;	// tracker for allocation of array
   unsigned int size;		// number of items in the array
   static T dummy;		// dummy object, for empty vector data returns
   				//  assuming type T has default construction
   static const unsigned int SPARECAPACITY = 10;
   TVectorIterator<T> itr;
   TVectorIterator<T> itrFirst;
   TVectorIterator<T> itrLast;
   void resizeArray(T*& arr, int oldSize, int newSize, const T initVal);
};

template <typename T>
T TVector<T>::dummy;		// initialization of static member

// stand-alone function for concatenating two TVector objects
template <typename T>
TVector<T> operator+(const TVector<T>& t1, const TVector<T>& t2);



// Declaration of class TVectorIterator

template <typename T>
class TVectorIterator
{
   friend class TVector<T>;

public:
   TVectorIterator();			// default constructor
   bool HasNext() const;		// next item available?
   bool HasPrevious() const;		// previous item available?
   TVectorIterator<T> Next();		// advance to next item
   TVectorIterator<T> Previous();	// move to previous item
   T& GetData() const;			// return data element of current node
private:
  unsigned int index;			// index of current item in vector
  T* ptr;				// pointer to the data item
  unsigned int vsize;			// size of associated vector
};

#include "tvector.hpp"		// bring in definition file here


