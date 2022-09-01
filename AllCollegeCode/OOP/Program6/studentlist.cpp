//Francesco Messina, Section , Program 6: "Student List
#include <iostream>
#include <iomanip>
#include <string>
#include <cstring>
#include <fstream> 
#include "studentlist.h"

using namespace std;

StudentList::StudentList()
{
	maxSize = 0;
	list = new student*[maxSize];	
}

StudentList::~StudentList()
{
	delete [] list;
}

bool StudentList::ImportFile(const char* filename)
{
	ifstream in;
	in.open(filename);
	if(!in)
	{
		in.close();
		return false;	
	}
	else
	{
		int temp;
		in >> temp;
		int currentSize = maxSize;
		grow(temp);
		
		for(int i = currentSize; i < temp+currentSize; i++)
		{	
			char fname[22];
			char lname[22];
			char courtemp[9];
			in.ignore();
			in.getline(lname, 21, ',');
			in.ignore();
			in.getline(fname, 21);	
			in.getline(courtemp, 8, ' ');
			if(strcmp(courtemp, "English") == 0)
			{
				double tp, mt, fe;
				in>>tp>>mt>>fe;
				list[i] = new english(fname, lname, courtemp, tp, mt, fe);
			}	
			else if(strcmp(courtemp, "History") == 0)
			{
				double at, pr, mt, fe;
				in>>at>>pr>>mt>>fe;
				list[i] = new history(fname, lname, courtemp, at, pr, mt, fe);	
			}
			else if(strcmp(courtemp, "Math") == 0)
			{
				double q1, q2, q3, q4, q5, t1, t2, fe;
				in>>q1>>q2>>q3>>q4>>q5>>t1>>t2>>fe;
				list[i] = new math(fname, lname, courtemp, q1, q2, q3, q4, q5, t1, t2, fe);	
			}
		
		}

		in.close();	
		return true;
	}
}

bool StudentList::CreateReportFile(const char* filename)
{
	ofstream out;
	out.open(filename);
	if(!out)
	{
		out.close();
		return false;
	}
	else
	{
		out<<"Student Grade Summary\n---------------------\n\nENGLISH CLASS\n\n";
		out<<"Student                                   Final Final   Letter\n";
		out<<"Name                                      Exam  Avg     Grade\n";
		out<<"----------------------------------------------------------------------\n";
		for(int i = 0; i < maxSize; i++)
		{
			if(list[i]->getCourse() == 1)
			{
				out<<list[i]->getFname()<<" "<<list[i]->getLname()<<" ";
				for(int j = 0; j < (40-strlen(list[i]->getFname())-strlen(list[i]->getLname())); j++)
				{
					out<<" ";
				}
				out<<fixed;
				out.precision(2);	
				out<<list[i]->getFinal()<<"    "<<list[i]->calculate()<<"   "<<list[i]->letter()<<'\n';
			}
		}
		
		out<<"\n\nHISTORY CLASS\n\n";
		out<<"Student                                   Final Final   Letter\n";
	 	out<<"Name                                      Exam  Avg     Grade\n"; 	
		out<<"----------------------------------------------------------------------\n";			
		for(int i = 0; i < maxSize; i++)
		{
			if(list[i]->getCourse() == 2)
			{
				out<<list[i]->getFname()<<" "<<list[i]->getLname()<<" ";
				for(int j = 0; j < (40-strlen(list[i]->getFname())-strlen(list[i]->getLname())); j++)
				{
					out<<" ";
				}
				out<<fixed;
				out.precision(2);
				out<<list[i]->getFinal()<<"    "<<list[i]->calculate()<<"   "<<list[i]->letter()<<'\n';			
			}		
		}
		out<<"\n\nMATH CLASS\n\n";
		out<<"Student                                   Final Final   Letter\n";
		out<<"Name                                      Exam  Avg     Grade\n";
		out<<"----------------------------------------------------------------------\n";
		for(int i = 0; i < maxSize; i++)
		{
			if(list[i]->getCourse() == 3)
			{
				out<<list[i]->getFname()<<" "<<list[i]->getLname()<<" ";
				for(int j = 0; j < (40-strlen(list[i]->getFname())-strlen(list[i]->getLname())); j++)
				{
					out<<" ";
				}
				out<<fixed;
				out.precision(2);
				out<<list[i]->getFinal()<<"    "<<list[i]->calculate()<<"   "<<list[i]->letter()<<'\n';
			}
		}		
		out<<"\n\nOVERALL GRADE DISTRIBUTION\n\n";
		int a,b,c,d,f;
		a=0;b=0;c=0;d=0;f=0;
		for(int i = 0; i < maxSize; i++)
		{
			
        		if(list[i]->calculate() > 89)
        		{
                		a++;
        		}
       		 	else if(list[i]->calculate()>79)
        		{
                		b++;
			}
        		else if(list[i]->calculate()>69)  
			{
                		c++;
        		}
        		else if(list[i]->calculate()>59)
        		{
                		d++;
			}
        		else
        		{
                		f++;
			} 
		}
		out<<"A:   "<<a<<"\nB:   "<<b<<"\nC:   "<<c<<"\nD:   "<<d<<"\nF:   "<<f;

		out.close();
		return true;
	}
}

void StudentList::ShowList() const
{	
	cout<<"Last                 First                    Course\n\n";
	for(int i = 0; i < maxSize; i++)
	{
		cout<<list[i]->getFname();
		for(int j = 0; j < (21-strlen(list[i]->getFname())); j++)
		{
			cout<<" ";
		}
		cout<<list[i]->getLname();
		for(int j = 0; j < (23-strlen(list[i]->getLname())); j++)
		{
			cout<<" ";
		}
		if(list[i]->getCourse() == 1)
		{
			cout<<"English\n";
		}
		else if(list[i]->getCourse() == 2)
		{
			cout<<"History\n";
		} 
		else if(list[i]->getCourse() == 3) 
		{
			cout<<"Math\n";
		}
	}
}

void StudentList::grow(int size)
{
        maxSize += size;
	student** tempList = new student*[maxSize];
        for(int i = 0; i < maxSize; i++)
        {
                tempList[i] = list[i];
        }
        delete [] list;
        list = tempList;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
student::student(char* f, char* l, char* c)
{
	strcpy(firstName, f);
	strcpy(lastName, l);
	strcpy(course, c);
	
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
english::english(char* f, char* l, char* c, double tp, double mt, double fe) : student(f, l, c)
{
	termPaper = tp;
	midTerm = mt;
	finalExam = fe;	
}

double english::calculate()
{
	return ((termPaper*.25)+(midTerm*.35)+(finalExam*.4));
}

int english::getCourse() const
{
	return 1;	
}

int english::getFinal() const
{
	return (int) finalExam;
}

const char* english::getFname() const
{
	return firstName;
} 

const char* english::getLname() const
{
	return lastName;
}

char english::letter()
{
	if(calculate() > 89)
	{
		return 'A';
	}
	else if(calculate()>79)
	{
		return 'B';
	}
	else if(calculate()>69)
	{
		return 'C';
	}
	else if(calculate()>59)
	{
		return 'D';
	}
	else
	{
		return 'F';
	}
}   
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
history::history(char* f, char* l, char* c, double at, double pr, double mt, double fe) : student(f, l, c)
{
	attendance = at;
	project = pr;
	midTerm = mt;
	finalExam = fe;
}

double history::calculate()
{
	double answer;
	answer = (attendance*(.1))+(project*(.3))+(midTerm*(.3))+(finalExam*(.3));
	return answer;
}

int history::getCourse() const
{
	return 2;	
}

int history::getFinal() const
{
	return (int) finalExam;
}

const char* history::getFname() const
{
	return firstName;	
}  
const char* history::getLname() const
{
	return lastName;	
}

char history::letter()
{
        if(calculate() > 89)
        {
                return 'A';
        }
        else if(calculate()>79)
        {
                return 'B';
	}
        else if(calculate()>69)  
	{
                return 'C';
        }
        else if(calculate()>59)
        {
                return 'D';
	}
        else
        {
                return 'F';
	}
}  
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
math::math(char* f, char* l, char* c, double q1, double q2, double q3, double q4, double q5, double t1, double t2, double fe) : student(f, l, c)
{
	quiz1 = q1;
	quiz2 = q2;
	quiz3 = q3;
	quiz4 = q4;
	quiz5 = q5;
	test1 = t1;
	test2 = t2;
	finalExam = fe;
}

double math::calculate()
{
	double answer;
	answer = (((quiz1+quiz2+quiz3+quiz4+quiz5)/5)*(.2))+(test1*(.25))+(test2*(.25))+(finalExam*(.3));
	return answer;	
}

int math::getCourse() const
{
	return 3;	
}

int math::getFinal() const
{
	return (int) finalExam;
}

const char* math::getFname() const
{
	return firstName;	
}  

const char* math::getLname() const  
{
	return lastName;
}

char math::letter()
{
        if(calculate() > 89)
        {
                return 'A';
        }
        else if(calculate()>79)
        {
                return 'B';
	}
        else if(calculate()>69)  
	{
                return 'C';
        }
        else if(calculate()>59)
        {
                return 'D';
	}
        else
        {
                return 'F';
	} 
}

