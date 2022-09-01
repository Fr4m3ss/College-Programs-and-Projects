//Francesco Messina, Section , Program 6: "Student List"
#include <iostream>
#include <string>

using namespace std;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class student
{
public:
student(char* f, char* l, char* c);
virtual const char* getFname() const=0;
virtual const char* getLname() const=0;
virtual int getCourse() const=0;
virtual double calculate()=0;
virtual int getFinal() const=0;
virtual char letter()=0;

protected:
char firstName[22];
char lastName[22];
char course [9];
};

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class english : public student
{
public:
english(char* f, char* l, char* c, double tp, double mt, double fe);
double calculate();
int getCourse() const;
int getFinal() const;
const char* getFname() const;  
const char* getLname() const;  
char letter();
private:
double termPaper;
double midTerm;
double finalExam;

};

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class history : public student
{
public:
history(char* f, char* l, char* c, double at, double pr, double mt, double fe);
double calculate();
int getCourse() const;
int getFinal() const;
const char* getFname() const;  
const char* getLname() const; 
char letter(); 
private:
double attendance;
double project;
double midTerm;
double finalExam;

};

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class math : public student
{
public:
math(char* f, char* l, char* c, double q1, double q2, double q3, double q4, double q5, double t1, double t2, double fe);
double calculate();
int getCourse() const;
int getFinal() const;
const char* getFname() const;  
const char* getLname() const;  
char letter();
private:
double quiz1;
double quiz2;
double quiz3;
double quiz4;
double quiz5;
double test1;
double test2;
double finalExam;

};
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

class StudentList
{
public:  //Basic Class Functions
StudentList(); //Constructor (empty list)
~StudentList();  //Destructor
//Functions  
bool ImportFile(const char* filename); 
bool CreateReportFile(const char* filename);
void ShowList() const;
private:
student** list;    
int maxSize;
void grow(int size);
};
