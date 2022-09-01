//Francesco Messina, Section , Program 6: "Student List"
#include <cstring>
#include <iostream>
#include <string>
#include "studentlist.h"

using namespace std;

int main()
{
	StudentList s1;
	
	char choice;
	int run = 1;
	
	while(run == 1)
	{
		cout<<"                *** Student List menu ***\n\n";
        	cout<<"        I       Import students from a file\n";
        	cout<<"        S       Show student list (brief)\n";
       		cout<<"        E       Export a grade report (to file)\n";
        	cout<<"        M       Show this Menu\n";
        	cout<<"        Q       Quit Program\n";
		cin>>choice;
		
		if(choice == 'i' || choice == 'I')
		{
			char* temp;
			string temp1;
			cout<<"Enter filename: ";	
			cin>>temp1;
			temp = const_cast<char*>(temp1.c_str());
;
			if(!s1.ImportFile(temp))
			{
				cout<<"Invalid file. No data imported\n";
			}

		}
		else if(choice == 's' || choice == 'S')
		{
			s1.ShowList();
		}
		else if(choice == 'e' || choice == 'E')
		{
			char* temp;
			string temp1;
			cout<<"Enter filename: ";
			cin>>temp1;

			temp = strcpy(new char[temp1.length() + 1], temp1.c_str());

			if(!s1.CreateReportFile(temp))
			{
				cout<<"Invalid file. No data exported\n";
			}

			delete[] temp;
		}
		else if(choice == 'm' || choice == 'M')
		{
			//nothing lol, itll just rerun	
		}
		else if(choice == 'q' || choice == 'Q')
		{
			cout<<"Goodbye!"<<endl;
			run = 0;
		}
	}


}
