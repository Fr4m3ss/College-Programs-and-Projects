// main.cpp -- Bob Myers
//
// Driver program to demonstrate the behavior of the Mixed class
// 
// You can add more tests of your own, or write other drivers to test your
// class -- this is NOT a comprehensive set of tests.  This is just a
// sample, which should help check whether your function declarations are
// appropriate, and can test a few sample cases.

#include <iostream>
#include "mixed.h"

using namespace std;

int main()
{

  // demonstrate behavior of the two constructors and the << overload

  Mixed x(3,20,6), y(-4,9,2), m1(0,-35,10), m2(-1,-2,4), m3(4), m4(-11), m5;
  char answer;
  cout << "Initial values: \nx = " << x << "\ny = " << y
       << "\nm1 = " << m1 << "\nm2 = " << m2 << "\nm3 = " << m3 
       << "\nm4 = " << m4 << "\nm5 = " << m5 << "\n\n";

  // Trying Simplify
  x.Simplify();
  m1.Simplify();
  cout << "x simplified: " << x << " and m1 simplified " << m1 << "\n\n";

  // Trying ToFraction
  x.ToFraction();
  y.ToFraction();
  m1.ToFraction();
  cout << "Values as fractions: \nx = " << x << "\ny = " << y
       << "\nm1 = " << m1 << "\n\n";
 
  // demonstrate >> overload

  cout << "Enter first number: ";
  cin >> x;
  cout << "Enter second number: ";
  cin >> y;

  cout << "You entered:\n";
  cout << "  x = " << x << '\n';
  cout << "  y = " << y << '\n';

  // demonstrate comparison overloads
  if (x < y)	cout << "(x < y) is TRUE\n";
  if (x > y)	cout << "(x > y) is TRUE\n";
  if (x <= y)	cout << "(x <= y) is TRUE\n";
  if (x >= y)	cout << "(x >= y) is TRUE\n";
  if (x == y)	cout << "(x == y) is TRUE\n";
  if (x != y)	cout << "(x != y) is TRUE\n";

  if (y < x)    cout << "(x < y) is FALSE\n";
  if (y > x)    cout << "(x > y) is FALSE\n";
  if (y <= x)   cout << "(x <= y) is FALSE\n";
  if (y >= x)   cout << "(x >= y) is FALSE\n";
  if (y == x)   cout << "(x != y) is FALSE\n";
  if (y != x)   cout << "(x == y) is FALSE\n";


  // demonstrating Evaluate
  cout << "\nDecimal equivalent of " << x << " is " << x.Evaluate() << '\n';
  cout << "Decimal equivalent of " << y << " is " << y.Evaluate() << "\n\n";

  // demonstrating arithmetic overloads
  cout << "(x + y) = " << x + y << '\n';
  cout << "(x - y) = " << x - y << '\n';
  cout << "(x * y) = " << x * y << '\n';
  cout << "(x / y) = " << x / y << '\n';

  // demonstrating arithmetic that uses conversion constructor
  //  to convert the integer operand to a Mixed object
  cout << "(x + 10) = " << x + 10 << '\n';
  cout << "(x - 4) = " << x - 4 << '\n';
  cout << "(x * -13) = " << x * -13 << '\n';
  cout << "(x / 7) = " << x / 7 << '\n';


  cout << "here"<<endl;	
  Mixed test1(1, 2, 3);		//  1 2/3
  Mixed test2(2, 1, 2);		//  2 1/2
  cout << "here"<<endl;
  cout << test1++<<endl;			//  prints 1 2/3, m1 is now 2 2/3
  cout << ++test1<<endl;			//  prints 3 2/3, m1 is now 3 2/3
  cout << test2--<<endl;			//  prints 2 1/2, m2 is now 1 1/2
  cout << --test2<<endl;			//  prints 1/2  , m2 is now 0 1/2

  return 0;
}
