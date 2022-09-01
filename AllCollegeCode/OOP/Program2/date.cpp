//Francesco Messina, Section 6/10, Program 2: "Dates"
//A class for creating and using objects that will store valid dates of the year
#include <iostream>
#include <string>
#include <iomanip>
#include "date.h"

using namespace std;
	
	Date::Date(int month, int day, int year, char format)
	{
//Checking if the year is a century year or not
		int tempYear = year / 10 % 10;
                tempYear = tempYear * 10;
                tempYear += year % 10;
//Verifying that month is valid
		if(month < 1 || month > 12)
		{
			inMonth = 1;
			inDay = 1;
			inYear = 2000;
			inFormat = 'D';
		}
//Checking which month to verify if day is valid, and then if each year is valid
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			if(day < 1 || day > 31)	
			{
				inDay = 1;
				inMonth = 1;
				inYear = 2000;
				inFormat = 'D';
			}
			else if(year < 1)
                	{
                        	inYear = 2000;
                        	inMonth = 1;
                        	inDay = 1;
                       		inFormat = 'D';
                	}
			else
			{
				inYear = year;
                        	inMonth = month;
                        	inDay = day;
				if(format == 'D' || format == 'T' || format == 'L' || format == 'J')
                        	{
					inFormat = format;
				}
				else
				{
					inFormat = 'D';
				}
			}
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			if(day < 1 || day > 30)
			{
				inDay = 1;
				inMonth = 1;
				inYear = 2000;
				inFormat = 'D';
			}
			else if(year < 1)
                	{
                        	inYear = 2000;
                       		inMonth = 1;
                	        inDay = 1;
        	                inFormat = 'D';
	                }
			else
                        {
                                inYear = year;
                                inMonth = month;
                                inDay = day;
                                if(format == 'D' || format == 'T' || format == 'L' || format == 'J')
                                {
                                        inFormat = format;
                                }
                                else
                                {
                                        inFormat = 'D';
                                }
                        }

		}
		else if(month == 2)
		{
			if(day == 29 && tempYear != 0 && year%4 == 0)
			{
				inDay = day;
				inMonth = month;
				inYear = year;
				if(format == 'D' || format == 'T' || format == 'L' || format == 'J')
                                {
                                        inFormat = format;
                                }
                                else
                                {
                                        inFormat = 'D';
                                }
			}
			else if(day == 29 && tempYear == 0 && year%400 == 0)
			{
				inDay = day;
                                inMonth = month;
                                inYear = year;
                                if(format == 'D' || format == 'T' || format == 'L' || format == 'J')
                                {
                                        inFormat = format;
                                }
                                else
                                {
                                        inFormat = 'D';
                                }
			}
			else if(day < 1 || day > 28)
			{
				inDay = 1;
				inMonth = 1;
				inYear = 2000;
				inFormat = 'D';
			}
			else if(year < 1)
        	        {
                        	inYear = 2000;
                        	inMonth = 1;
                        	inDay = 1;
                        	inFormat = 'D';
 	                }
			else
                        {
                                inYear = year;
                                inMonth = month;
                                inDay = day;
                                if(format == 'D' || format == 'T' || format == 'L' || format == 'J')
                                {
                                        inFormat = format;
                                }
                                else
                                {
                                        inFormat = 'D';
                                }
                        }

		}
	}
	
	void Date::Input()
	{
		string userInput;
//Taking user input
		cout<<"Please enter a date: "<<endl;
		cin>>userInput;
		
//Finding positions of Slashes
		int firstSlash = userInput.find_first_of("/");
		int secondSlash = userInput.find_last_of("/");

//Setting the individual values to string objects		
		string mo = userInput.substr(0, firstSlash);
		string da = userInput.substr(firstSlash+1, secondSlash-firstSlash-1);
		string ye = userInput.substr(secondSlash+1, userInput.length());

//Converting string objects into int objects		
		int inputMonth = string_to_int(mo);
		int inputDay = string_to_int(da);
		int inputYear = string_to_int(ye);

//Verifying user input is valid, and if so, setting the date accordingly, but if not, recursing until they input a valid date	
		if(!Set(inputMonth, inputDay, inputYear))
		{
			cout<<"Invalid Date: "<<inputMonth<<"/"<<inputDay<<"/"<<inputYear<<endl;
			Input();
		}
		else
		{
			Set(inputMonth, inputDay, inputYear);
		}
	}
	
        void Date::Show() const
	{
		if(inFormat == 'D')
		{
			cout<<inMonth<<"/"<<inDay<<"/"<<inYear<<endl;
		}
		else if(inFormat == 'T')
		{
			string mo; 
			string da;
			string ye;
			int tempYear;
//Adding leading zeros to month if necessary
			if(inMonth < 10)
			{
				mo = "0";
				cout<<mo<<inMonth<<"/";
			} 
			else
			{
				mo = "";
				cout<<mo<<inMonth<<"/";
			}
//Adding leading zeros to month if necessary
			if(inDay < 10)
			{
				da = "0";
				cout<<da<<inDay<<"/";
			}
			else 	
			{
				da = "";
				cout<<da<<inDay<<"/";
			}
//Adding leading zeros to year if necessary, otherwise leaving it normal or removing digits as necessary	
			if(inYear < 10)
			{
				ye = "0";
				cout<<ye<<inYear<<endl;
			}
			else if(inYear > 99)
			{
				ye = "";
				tempYear = inYear / 10 % 10;
				tempYear = tempYear * 10;
				tempYear += inYear % 10;
				if(tempYear < 10)
				{
					ye = "0";
				}
				cout<<ye<<tempYear<<endl;
			}
			else
			{
				ye = "";
				cout<<ye<<inYear<<endl;
			}
		}
		else if(inFormat == 'L')
		{
//Converting int month into abbreviated months
			string mo;
			if(inMonth == 1)
			{
				mo = "Jan";
			}
			else if(inMonth == 2)
			{
				mo = "Feb";
			}
			else if(inMonth == 3)
                        {
			        mo = "Mar";
                        }
			else if(inMonth == 4)
                        {
			        mo = "Apr";
                        }
			else if(inMonth == 5)
                        {
			        mo = "May";
                        }
			else if(inMonth == 6)
                        {
                                mo = "June";
                        }
			else if(inMonth == 7)
                        {
                                mo = "July";
                        }
			else if(inMonth == 8)
                        {
                                mo = "Aug";
                        }
			else if(inMonth == 9)
                        {
                                mo = "Sept";
                        }
			else if(inMonth == 10)
                        {
                                mo = "Oct";
                        }
			else if(inMonth == 11)
                        {
                                mo = "Nov";
                        }
			else if(inMonth == 12)
                        {
                                mo = "Dec";
                        }
			cout<<mo<<" "<<inDay<<", "<<inYear<<endl;
		}
		else if(inFormat == 'J')
		{
//Calculating if year is a century year, and shortening it to 2 digits.
			int tempYear = inYear / 10 % 10;
                        tempYear = tempYear * 10;
                        tempYear += inYear % 10;
			
			int jDate = 0;
			string jZero = "";
			string yearZero = "";
			
//Setting tally of dates to jDate depending on month and day	
		  	if(inMonth == 1)
                        {
                        	jDate = inDay;
                        }
                        else if(inMonth == 2)
                        {
                                jDate = 31 + inDay;
                        }
                        else if(inMonth == 3)
                        {
                                jDate = 59 + inDay;
                        }
                        else if(inMonth == 4)
                        {
                                jDate = 90 + inDay;
                        }
                        else if(inMonth == 5)
                        {
                                jDate = 120 + inDay;
                        }
                        else if(inMonth == 6)
                        {
                                jDate = 151 + inDay;
                        }
                        else if(inMonth == 7)
                        {
                                jDate = 181 + inDay;
                        }
                        else if(inMonth == 8)
                        {
                                jDate = 212 + inDay;
                        }
                        else if(inMonth == 9)
                        {
                                jDate = 243 + inDay;
                        }
                        else if(inMonth == 10)
                        {
                                jDate = 273 + inDay;
                        }
                        else if(inMonth == 11)
                        {
                                jDate = 304 + inDay;
                        }
                        else if(inMonth == 12)
                        {
                                jDate = 334 + inDay;
                        }
			
//Checking if leap year in order to add an extra day if necessary
			if(tempYear != 0 && inYear % 4 == 0 && inMonth > 2)
			{
				jDate++;
			}
			else if(tempYear == 0 && inYear % 400 == 0 && inMonth > 2)
			{
				jDate++;
			}

//Checking if necessary to add a leading zero for printing purposes
			if(jDate < 100)
			{
				jZero = "0";
			}	
			if(tempYear < 10)
			{
				yearZero = "0";
			}
//Printing the date in Julian Format
			cout<<yearZero<<tempYear<<"-"<<jZero<<jDate<<endl;
		}
	}
        
	bool Date::Set(int m, int d, int y)
	{
//Checking if the year is a century year or not
		int tempYear = y / 10 % 10;
                tempYear = tempYear * 10;
                tempYear += y % 10;
//Verifying the year is valid
		if(y >= 1)
		{
//Verifying the month is valid
			if(m >= 1 && m <= 12)
                	{
//Checking the month and then verifying day is valid, and if so, setting the date accordingly
                		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
                		{
                        		if(d >= 1 && d <= 31)
                        		{
                               			inDay = d;
			       			inMonth = m;
			       			inYear = y;
						return true;
                        		}
					else
					{
						return false;
					}
                		}
                		else if(m == 4 || m == 6 || m == 9 || m == 11)
                		{
                       		 	if(d >= 1 && d <= 30)
                       	 		{
                        	        	inDay = d;
						inMonth = m;
						inYear = y;
						return true;
                        		}
					else
					{
						return false;
					}
                		}
                		else if(m == 2)
                		{
					if(d == 29 && tempYear != 0 && y % 4 == 0)
					{
						inDay = d;
						inMonth = m;
						inYear = y;
						return true;
					}
					else if(d == 29 && tempYear == 0 && y % 400 == 0)
					{
						inDay = d;
						inMonth = m;
						inYear = y;
						return true;
					}
                        		else if(d >= 1 && d <= 28)
                      			{
						inDay = d;
						inMonth = m;
						inYear = y;
						return true;
					}
					else
					{
						return false;
					}
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
        int Date::GetMonth() const
	{
		return inMonth;
	}
	
        int Date::GetDay() const
        {
		return inDay;
	}

	int Date::GetYear() const
	{
		return inYear;
	}
	
        bool Date::SetFormat(char f)
	{
		if(f == 'D')
		{
			inFormat = 'D';
			return true;
		}	
		else if(f == 'T')
		{
			inFormat = 'T';
			return true;
		}
		else if(f == 'L')
		{
			inFormat = 'L';
			return true;
		}
		else if(f == 'J')
		{
			inFormat = 'J';
			return true;
		}
		else
		{
			return false;
		}
	}
	
        void Date::Increment(int numDays)
	{
//Repeating as many days as told
		while(numDays !=0)
		{
			int tempYear = inYear / 10 % 10;
	                tempYear = tempYear * 10;
        	        tempYear += inYear % 10;
//Checking what month, and if adding one day would change the month, and if the month is 12, if it would change the year, and manipulating accordingly
			if(inMonth == 1 || inMonth == 3 || inMonth == 5 || inMonth == 7 || inMonth == 8 || inMonth == 10 || inMonth == 12)
			{	
				if(inMonth == 12 && inDay == 31)
				{
					inYear++;
					inMonth = 1;
					inDay = 1;
				}
				else if(inDay == 31)
				{
					inMonth++;
					inDay = 1;	
				}
				else 
				{
					inDay++;
				}
			}
			else if(inMonth == 4 || inMonth == 6 || inMonth == 9 || inMonth == 11)
			{                        
				if(inDay == 30)
				{
					inMonth++;
					inDay = 1;
				}
				else
				{
					inDay++;
				}
			}
			else if(inMonth == 2)
			{
				if(inDay == 29)
                                {
					inMonth++;
					inDay = 1;
                                }
				else if(inDay == 28 && tempYear != 0 && inYear % 4 == 0)
				{
					inDay++;
				}
				else if(inDay == 28 && tempYear == 0 && inYear % 400 == 0)
				{
					inDay++;
				}
                                else if(inDay == 28)
				{
					inMonth++;
					inDay = 1;
				}
				else
				{
					inDay++;
				}
			}
			numDays--;
		}	
	}
	
        int Date::Compare(const Date& d) const
	{
//Comparing Years
		if(inYear > d.inYear)
		{
			return 1;
		}
		else if(inYear < d.inYear)
		{
			return -1;
		}
		else if(inYear == d.inYear)
		{
//Comparing Months
			if(inMonth > d.inMonth)
			{
				return 1;
			}
			else if(inMonth < d.inMonth)
			{
				return -1;
			}
			else if(inMonth == d.inMonth)
			{
//Comparing Days
				if(inDay > d.inDay)
				{
					return 1;
				}
				else if(inDay < d.inDay)
				{
					return -1;
				}
				else if(inDay == d.inDay)
				{
					return 0;
				}
			}
		}
	}

//Converting from a string to an int by iterating through a string and returning the char values, converted to their ints equivalent (char value - '0' aka 48)
	int Date::string_to_int(string str)
	{
    		int value = 0;
    		for (string::iterator it = str.begin(); it != str.end(); it++) 
		{
        		int digit = (*it) - '0';
//Checks to make sure that chars are in fact numbers
			if (digit < 0 || digit > 9)
            		{
				return -1;
			}
			value *= 10;
        		value += digit;
    		}
    		return value;
	}	
