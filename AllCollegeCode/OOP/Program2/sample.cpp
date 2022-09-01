#include <iostream>
#include "date.h"

using namespace std;

int main()
{
   Date d1;		// should default to 1/1/2000
   Date d2(4,10,1992,'T');  // should init to 4/10/1992

   //display dates to the screen
   cout << "\nDate d1 is: ";
   d1.Show();			  
   cout << "\nDate d2 is: ";
   d2.Show();
 
   d1.Input();			// Allow user to enter a date for d1
   cout << "\nDate d1 is: ";
   d1.Show();			
                            
   d1.SetFormat('L');		// change format of d1 to "Long" format
   cout << "\nDate d1 is: ";
   d1.Show();			// print d1 -- should show now in long format
  
   d1.SetFormat('T');           // change format of d1 to "Long" format
   cout << "\nDate d1 is: ";
   d1.Show();                   // print d1 -- should show now in long format

   Date d3;
   d3.Input();
   cout << "\nDate d3 is: ";
   d3.Show();
   cout<<"shift one day"<<endl;
   d3.Increment();
   d3.Show();
   cout<<"shift 1095 days (3 years)"<<endl;
   d3.Increment(1095);
   d3.Show();
   cout<<"shift 365 days (1 year1)"<<endl;
   d3.Increment(365);
   d3.Show();
   cout<<"shift 1461 days (4 years and one day)"<<endl;
   d3.Increment(1461);
   d3.Show();
   //   functionality.
 

  Date d4(12,25,2003);		// Dec 25, 2003
  Date d5(5,18,2002);		// May 18, 2002

  cout<<d4.Compare(d5)<<endl;		// returns 1  (since d2 comes first)
  cout<<d5.Compare(d4)<<endl;		// returns -1 (calling object is d2, comes first)

  Date d6;
  Date d7;
  
  cout<<d6.Compare(d7)<<endl;
  cout<<d7.Compare(d6)<<endl;

  Date d8(2,1,1998,'J');
  d8.Show();
  Date d9(5,17,2002,'J');
  d9.Show();
  Date d10(5,17,2004,'J');
  d10.Show();
  Date d11(2,28,2004,'J');
  Date d12(2,29,2004,'J');
  Date d13(3,1,2003,'J');
  Date d14(3,1,2004,'J');
  d11.Show();
  d12.Show();
  d13.Show();
  d14.Show();


 }
