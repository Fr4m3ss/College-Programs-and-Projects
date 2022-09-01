#include <iostream>
using namespace std;

#include "mystring.h"

int main()
{
   MyString s1;
   MyString s2("Hello, World");
   MyString s3 = "Welcome to Florida, have a nice day";
   MyString s4 = 12345;

   cout << "s1 = " << s1 << '\n';
   cout << "s2 = " << s2 << '\n';
   cout << "s3 = " << s3 << '\n';
   cout << "s4 = " << s4 << '\n';
   cout << '\n';

   cout << "Making the calls:\n"
        << "\tcin >> s1\n"
        << "\tgetline(cin, s2, ',')\n"
        << "\tgetline(cin, s3)\n";
   cout << "Enter some sentences: ";
  
   cin >> s1;
   getline(cin,s2,',');
   getline(cin,s3);

   cout << "\nNew string values:\n";

   cout << "s1 = " << s1 << '\n';
   cout << "s2 = " << s2 << '\n';
   cout << "s3 = " << s3 << '\n';
   cout << "---------------------------\n";

// ----------------------------------
/*const MyString s = "I love Java";
  MyString t = "I love C++";

  // these two calls use the const version above
     char ch = s[4];		// ch now stores 'v'
	cout<<ch<<endl;
       ch = s[7];			// ch now stores 'J'
 	cout<<ch<<endl;
         // these calls use the non-const version above
           t[0] = 'U';
	for(int i = 0; i < t.getLength(); i++)
	{
		cout<<t[i];
	}
				// s is now "U love C++"
             t[3] = 'i';	
 for(int i = 0; i < t.getLength(); i++)
        {
                cout<<t[i];
        }
		// s is now "U live C++"
*/

/*
 const MyString s = "Howdy";	// length of s is 5 characters
  char ch = s[10];	        // ch now stores '\0'
cout<<"CH>"<<ch<<"<"<<endl;

  MyString t = "Hello";         // length of t is 5 characters 
  t[7] = 'b';                   // t is now "Hello  b"  (length is now 8)
  for(int i = 0; i < t.getLength(); i++)
        {
                cout<<t[i];
        } 
*/
   s1 = "Dog";
   s2 = "Food";
   MyString result = s1 + s2;
   cout << "result = " << result << '\n';

   s1 += s2;
   cout << "s1 = " << s1 << endl;

   const MyString s5 = "The concatenation of the catapult is a catamaran";
   cout << "s5 = " << s5 << endl;
   cout << "s5.indexOf(\"cat\") returns " << s5.indexOf("cat") << '\n';
   cout << "s5.indexOf(\"dog\") returns " << s5.indexOf("dog") << '\n';

   cout << "s5.getLength() = " << s5.getLength() << '\n';

   cout << "s5[4] = " << s5[4] << '\n';
   cout << "s5[10] = " << s5[10] << '\n';
   cout << "s5[15] = " << s5[15] << '\n';
   cout << "s5[52] = ascii " << static_cast<int>(s5[52]) << '\n';

   cout << "s5.substring(10,16) = " << s5.substring(10,16) << '\n';
   cout << "s5.substring(23) = " << s5.substring(23) << '\n';

   cout << "-----------------------------\n";

   MyString words = "Greetings, Earthling";

   cout << "words = " << words << '\n';
   cout << "words.getLength() = " << words.getLength() << '\n';
   words[0] = 'K';
   words[4] = 'p';
   words[16] = 'z';

   cout << "words = " << words << '\n';
   words[25] = 'Q';
   cout << "words = " << words << '\n';

   words.insert(11, "Insane ");
   cout << "words = " << words << '\n';
	
   cout << "-----------------------------\n";

   MyString x = "apple", y = "apply";
   cout << "x = " << x << '\n';
   cout << "y = " << y << '\n';

   if (x < y)		cout << "x < y is true\n";
   if (x > y)		cout << "x > y is true\n";
   if (x <= y)		cout << "x <= y is true\n";
   if (x >= y)		cout << "x >= y is true\n";
   if (x == y)		cout << "x == y is true\n";
   if (x != y)		cout << "x != y is true\n";


   MyString st1 = "The bobcat concatenated the catapult with the catamaran";
   MyString ts1 = "cat";
   MyString results1 = st1 - ts1;
   cout<<"RESULTS: "<<results1<<endl;

}
