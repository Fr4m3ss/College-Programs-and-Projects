#include <iostream>
#include "house.h"
#include <cmath>
#include <iomanip>

using namespace std;

/*
        int baseSize; 
        char borderChar;
        char fillChar;
*/

  	
	House::House(int base, char border, char fill)
	{	
		if(base < 3)
		{
			baseSize = 3;
		}
		else if(base > 37)
		{
			baseSize = 37;
		}
		else
		{
			baseSize = base;
		}
		
		if(border <= '!'||border >= '~')
		{
			borderChar = 'X';
		}
		else
		{
			borderChar = border;
		}
		
		if(fill <= '!' || fill >= '~')
		{
			fillChar = '*';	
		}
		else
		{
			fillChar = fill;
		}
	}
	
        void House::SetBorder(char border)
	{
		if(border <= '!'||border >= '~')
                {       
                        borderChar = 'X';
                }
                else
                {       
                        borderChar = border;
                }
	}

        void House::SetFill(char fill)
	{	
		if(fill <= '!' || fill >= '~')
                {       
                        fillChar = '*';
                }
                else
                {       
                        fillChar = fill;
                }
	}
        
	int House::GetSize() const
	{
		return baseSize;
	}

        int House::Perimeter() const
        {
		return (baseSize*3)+2+(baseSize+2)*2;
	}

	double House::Area() const
	{
		double baseSize1 = baseSize;
		double baseSize2 = baseSize+2;
		return (baseSize1*baseSize1)+(.5*baseSize2)*((baseSize2*(sqrt(3)))/2);
	}

        void House::Grow()
	{
		if(baseSize+1 > 37)
		{
			baseSize = 37;
		}			
		else
		{
			baseSize++;
		}
	}

        void House::Shrink()
	{
		if(baseSize-1 < 3)
		{
			baseSize = 3;
		}
		else
		{
			baseSize--;
		}
	}

        void House::Draw() const
	{
		//TRIANGLE
		int triangle = baseSize+2;
		int revtriangle = baseSize+2;
		int printmod = 1;
		for(int i = 0; i < baseSize+1; i++)
		{
			triangle = triangle + 1;
			revtriangle = revtriangle - 1;
			int borderY = 0;
			printmod = 1;
			for(int j = 0; j < triangle; j++)	
			{
				if(i == 0)
				{
					if (j==triangle-2)
					{
						cout<<borderChar;
						borderY = 0;	
					}
					else
					{
						cout<<" ";
					}
				}
				else
				{
					if(j == triangle-3)
					{
						cout<<borderChar;
						borderY = 0;
					}
					else
					{	
						if(borderY == 1 && printmod%2 == 0)
						{
							cout<<fillChar;
							printmod++;
						}
						else
						{
							cout<<" ";
							printmod++;
						}
					}
				}
				if(i != 0)
				{
					if(j == revtriangle-1)
					{
						cout<<borderChar;
						printmod = 1;
						borderY = 1;
					}		
				}
			}
			cout<<endl;
		}

		//RECTANGLE
		int recMax = (baseSize+2)*2;
		for(int i = 0; i < baseSize; i++)
		{
		printmod = 1;
			for(int j = 0; j < (baseSize+2)*2; j++)
			{
				if(i == 0)
				{
					if(j == 0)
					{
						cout<<borderChar<<" "<<borderChar;
					}	
					else if(j==recMax-4)
					{
						cout<<borderChar<<" "<<borderChar;
					}
					else if (j<recMax-6)
					{
						if(printmod%2 == 0)
						{
							cout<<fillChar;
							printmod++;
						}
						else
						{
							cout<<" ";
							printmod++;
						}		
					}
				}
				else if(i == baseSize-1)
                                {       
                                        if(j == 0)
                                        {       
                                                cout<<"  "<<borderChar;
                                        }       
                                        else if(j==recMax-4)
                                        {       
                                                cout<<borderChar;
                                        }
                                        else if (j<recMax-6)
                                        {       
                                                if(printmod%2 == 0)
                                                {       
                                                        cout<<borderChar;
                                                        printmod++;
                                                }
                                                else    
                                                {       
                                                        cout<<" ";
                                                        printmod++;
                                                }
                                        }
                                }
				else
				{
					if(j == 0)
					{
						cout<<"  "<<borderChar;
					}
					else if(j == recMax-4)
					{
						cout<<borderChar;
					}
					else if(j < recMax-6)
					{
						if(printmod%2 == 0)
                                                {
                                                        cout<<fillChar;
                                                        printmod++;
                                                }
                                                else
                                                {
                                                        cout<<" ";
                                                        printmod++;
                                                }
					}
					
				}
			}
		cout<<endl;
		}			
	}
	
        void House::Summary() const
	{
	cout<<"House width and height base to roof = "<<baseSize<<" units."<<endl;
	cout<<"Perimeter of house = "<<House::Perimeter()<<" units."<<endl;
	cout<<fixed<<setprecision(2)<<"Area of the house = "<<House::Area()<<" units."<<endl;
	cout<<"House looks like:"<<endl;
	House::Draw();	
	}
	
