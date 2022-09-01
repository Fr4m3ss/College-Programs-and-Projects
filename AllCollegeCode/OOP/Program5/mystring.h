//Francesco Messina, Section 7, Program 5: "MyString"
#include <iostream>
using namespace std;

class MyString
{
  friend ostream& operator<< (ostream& out, const MyString& str);
  friend istream& operator>> (istream& in, MyString& str);
  friend istream& getline (istream& in, MyString& str);
  friend istream& getline (istream& in, MyString& str, char delim);

  friend MyString operator+ (const MyString& str1, const MyString& str2);
  friend MyString operator- (const MyString& str1, const MyString& str2);

  friend bool operator< (const MyString& str1, const MyString& str2);
  friend bool operator> (const MyString& str1, const MyString& str2);
  friend bool operator<=(const MyString& str1, const MyString& str2);
  friend bool operator>=(const MyString& str1, const MyString& str2);
  friend bool operator==(const MyString& str1, const MyString& str2);
  friend bool operator!=(const MyString& str1, const MyString& str2);

public:
  MyString();				// empty string
  MyString(const char* convert);		// conversion from c-string
  MyString(int num);			// conversion from int
  ~MyString();				// destructor
  MyString(const MyString& str);		// copy constructor
  MyString& operator=(const MyString& str);   // assignment operator

  MyString& operator+=(const MyString& str);  // concatenation/assignment

  //bracket operators to access char positions
  char& operator[] (unsigned int index);
  const char& operator[] (unsigned int index) const;
  
  // insert s into the string at position "index"
  MyString& insert(unsigned int index, const MyString& s);
  
  // find index of the first occurrence of s inside the string
  //  return the index, or -1 if not found
  int indexOf(const MyString& s) const;
                   
  int getLength() const;		// return string length
  const char* getCString() const;	// return c-string equiv
  
  MyString substring(unsigned int start, unsigned int total) const;
  MyString substring(unsigned int start) const;

private:
int maxSize;
int currentSize;
char* location;
void Grow(int size); 
void Shrink(int size);
};
