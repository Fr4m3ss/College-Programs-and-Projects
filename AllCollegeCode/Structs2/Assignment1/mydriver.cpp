//Francesco Messina, Assignment 1
#include <iostream>
#include <string>
#include "tvector.h"

using namespace std;


template <typename T> 
void PrintList(const TVector<T>& v, string label)
{
   cout << label << " size is: " << v.GetSize() << "\n"
        << label << " = "; 
   v.Print(cout);
   cout << "\n\n";
}

int main()
{  
   
   TVector<int> v1;		// integer list

   for (int i = 0; i < 10; i++)
	v1.InsertBack(i*3);

   PrintList(v1, "v1");

   for (int i = 0; i < 8; i++)
        v1.Insert( v1.GetIterator(), (i+1) * 50 );

   PrintList(v1, "v1");

   v1.RemoveBack();
   PrintList(v1, "v1");

   v1.RemoveBack();
   PrintList(v1, "v1");

   v1.Remove(v1.GetIterator());
   PrintList(v1, "v1");

   v1.Remove(v1.GetIterator());
   PrintList(v1, "v1");

   // try an iterator, and some middle inserts/deletes
   cout << "Testing some inserts with an iterator\n\n";

   TVectorIterator<int> itr = v1.GetIterator();
   itr = v1.Insert(itr, 999);
   itr.Next();
   itr.Next();				// advance two spots
   itr = v1.Insert(itr, 888);
   itr.Next();				
   itr.Next();				
   itr.Next();				// advance three spots
   itr = v1.Insert(itr, 777);

   PrintList(v1, "v1");

   cout << "Testing some removes (with iterator)\n\n";

   itr.Next();   
   itr.Next();   			// advance two spots
   itr = v1.Remove(itr);		// delete current item
   PrintList(v1, "v1");

   for (int i = 0; i < 5; i++)
      itr.Previous();			// back 5 spots

   itr = v1.Remove(itr);		// delete current item
   PrintList(v1, "v1");
   
   // building another list

   cout << "Building a new list\n";
   TVector<int> v2;
   for (int i = 0; i < 10; i++)
      v2.InsertBack(i * 3 + 1);

   PrintList(v2, "v2");

   // Testing + overload:
   cout << "Testing operator+ overload\n";
   TVector<int> v3 = v1 + TVector<int>(100, 7);

   TVector<int> v4;
   v4 = v2 + v1;

   PrintList(v3, "v3");
   PrintList(v4, "v4");

   cout << "Testing a call to the 2-param delete\n";
   TVectorIterator<int> itr1 = v4.GetIterator();
   TVectorIterator<int> itr2 = v4.GetIterator();

   itr1.Next();
   itr1.Next();
   cout << "itr1 is attached to: " << itr1.GetData() << '\n';
   for (int i = 0; i < 8; i++)
      itr2.Next();
   cout << "itr2 is attached to: " << itr2.GetData() << '\n';
   
   cout << "Calling:  v4.Remove(itr1, itr2);\n";
   v4.Remove(itr1, itr2);   
   PrintList(v4, "v4");

	


TVector<string> str1;
 for (int i = 0; i < 10; i++)
        str1.InsertBack("String is fun");
PrintList(str1, "str1");
TVector<string> str2("Test", 20);
PrintList(str2, "str2");
str1.RemoveBack();
str2.RemoveBack();
PrintList(str2, "str2");
PrintList(str1, "str1");

TVectorIterator<string> itrstr1 = str1.GetIterator();
TVectorIterator<string> itrstr2 = str2.GetIterator();

str1.Remove(itrstr1);
str2.Remove(itrstr2);
PrintList(str2, "str2");
PrintList(str1, "str1");

TVector<double> double1(23.6, 23);

for (int i = 0; i < 23; i++)
        double1.Insert( double1.GetIterator(), (i+1) * double1.GetIterator().GetData() );
PrintList(double1, "double1");

TVectorIterator<double> itrd1 = double1.GetIterator();
TVectorIterator<double> itrd2 = double1.GetIteratorEnd();
for(int i = 0; i < 23; i++)
{
	itrd1.Next();
}
double1.Remove(itrd1,itrd2);
PrintList(double1, "double1");

/*	
while(itrstr1.HasNext())
{
	std::cout<<itrstr1.GetData()<<" ";
	itrstr1.Next();	
}

while(itrstr2.HasNext())
{
        itrstr2.Next();
}

while(itrstr2.HasPrevious())    
{
	std::cout<<itrstr2.GetData()<<" ";
        itrstr2.Previous();
}
*/
}
