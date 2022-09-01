//Francesco Messina, Section 7, Program 3: "Mixed Numbers"

#include <iostream>
#include <iomanip>
#include "mixed.h"

using namespace std;
	
//Both constructors
	Mixed::Mixed(int integerInput)
	{
//Setting the fraction to 0 and the integer to input
		integer = integerInput;
		numerator = 0;
		denominator = 1;
//Setting to negative if applicable
		if(integerInput < 0)
		{
			isNegative = true;
			integer = integer * -1;
		}
		else
		{
			isNegative = false;
		}
	}
        Mixed::Mixed(int integerInput, int numeratorInput, int denominatorInput)
	{
//Checking if the inputs are valid and setting them accordingly
		if(integerInput >= 0 && numeratorInput >= 0 && denominatorInput >0)
		{
                        integer = integerInput;
                        numerator = numeratorInput;
                        denominator = denominatorInput;
                        isNegative = false;
		}
		else if(integerInput < 0 && numeratorInput >= 0 && denominatorInput > 0)
		{
			integer = integerInput * -1;
			numerator = numeratorInput;
			denominator = denominatorInput;
			isNegative = true;
		}
		else if(integerInput == 0 && numeratorInput < 0 && denominatorInput > 0)
		{
			integer = integerInput;
                        numerator = numeratorInput * -1;
                        denominator = denominatorInput;
                        isNegative = true;
		}
		else
		{
                        integer = 0;
                        numerator = 0;
                        denominator = 1;
                        isNegative = false;
		}
	}

        double Mixed::Evaluate() const
	{
//Turning the mixed fraction into a fraction, then turning the fraction to a decimal number
		double answer = 0;
		answer = denominator * integer;
		answer = answer + numerator;
		answer = answer / denominator;
		if(isNegative)
		{
			answer = answer * -1;
		}
		return answer;
	}
        void Mixed::ToFraction()
	{
//Turning the mixed fraction into an improper fraction
		numerator = (integer * denominator) + numerator;
		integer = 0;
	}
        void Mixed::Simplify()
	{
		while(numerator > denominator)
		{
			numerator -= denominator;
			integer++;
		}
		int GCD = gcd(denominator, numerator);
 	 	numerator = numerator/GCD;
	  	denominator = denominator/GCD;
	}

        std::istream& operator>>(istream& in,  Mixed& m)
	{
		int temp;
		int temp2;
		char trash;
		int temp3;
		in >> temp >> temp2 >> trash >> temp3;
		
		if(temp < 0 && temp2 >= 0 && temp3 > 0)
		{
			m.integer = temp*-1;
        	        m.numerator = temp2;
	                m.denominator = temp3;
			m.isNegative = true;
		}
		else if(temp == 0 && temp2 < 0 && temp3 > 0)
                {
                        m.integer = temp;
                        m.numerator = temp2*-1;
                        m.denominator = temp3;
                        m.isNegative = true;
                }    	
		else if(temp >= 0 && temp2 >= 0 && temp3 > 0)
		{
			m.integer = temp;
                        m.numerator = temp2;
                        m.denominator = temp3;
                        m.isNegative = false;
		}
		else
		{
			m.integer = 0;
                        m.numerator = 0;
                        m.denominator = 1;
                        m.isNegative = false;
		}

		return in;
	}
        std::ostream& operator<<(ostream& out, const Mixed& m)
	{	
		if(m.isNegative)
		{
			if(m.integer == 0)
			{
				out<<"-"<<m.numerator<<"/"<<m.denominator;
			}
			else if(m.numerator == 0)
			{
				out<<"-"<<m.integer;
			}
			else
			{
				out<<"-"<<m.integer<<" "<<m.numerator<<"/"<<m.denominator;
			}
		}
		else
		{
			if(m.integer == 0 && m.numerator != 0)
                        {
                                out<<m.numerator<<"/"<<m.denominator;
                        }
                        else if(m.numerator == 0)
                        {
                                out<<m.integer;
                    	}
                        else
                        {
                                out<<m.integer<<" "<<m.numerator<<"/"<<m.denominator;
                        }
		}
		return out;
	}

        bool Mixed::operator<(const Mixed& m)
	{
		if(this->isNegative && !m.isNegative)
		{
                        if(this->integer*-1 < m.integer)
                        {
                                return true;
                        }
                        else if(this->integer*-1 > m.integer)
                        {
                                return false;
                        }
                        else if(this->integer*-1 == m.integer)
                        {
                                if(this->numerator*m.denominator*-1 < this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator)
                                {
                                        return false;
                                }
                        }
		}
		else if(!this->isNegative && m.isNegative)
		{
                        if(this->integer < m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer > m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer == m.integer*-1)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                        }			
		}
		else if(!this->isNegative && !m.isNegative)
		{
			if(this->integer < m.integer)
                        {
                                return true;
                        }
                        else if(this->integer > m.integer)
                        {
                                return false;
                        }
                        else if(this->integer == m.integer)
                        {
                     		if(this->numerator*m.denominator < this->denominator*m.numerator)
				{
					return true;
				}          
				else if(this->numerator*m.denominator > this->denominator*m.numerator)
				{
					return false;
				}
				else if(this->numerator*m.denominator == this->denominator*m.numerator)
				{
					return false;
				}
                        }
		}
		else if(this->isNegative && m.isNegative)
		{
                        if(this->integer*-1 < m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer*-1 > m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer*-1 == m.integer*-1)
                        {
                                if(this->numerator*m.denominator*-1*-1 < this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                        }
		}
	}
        bool Mixed::operator>(const Mixed& m)
	{
                if(this->isNegative && !m.isNegative)
                {
                        if(this->integer*-1 < m.integer)
                        {
                                return false;
                        }
                        else if(this->integer*-1 > m.integer)
                        {
                                return true;
                        }
                        else if(this->integer*-1 == m.integer)
                        {
                                if(this->numerator*m.denominator*-1 < this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator)
                                {
                                        return false;
                                }
                        }
                }
                else if(!this->isNegative && m.isNegative)
                {
                        if(this->integer < m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer > m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer == m.integer*-1)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                        }
                }
                else if(!this->isNegative && !m.isNegative)
                {
                        if(this->integer < m.integer)
                        {
                                return false;
                        }
                        else if(this->integer > m.integer)
                        {
                                return true;
                        }
                        else if(this->integer == m.integer)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator)
                                {
                                        return false;
                                }
                        }
                }
                else if(this->isNegative && m.isNegative)
                {
                        if(this->integer*-1 < m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer*-1 > m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer*-1 == m.integer*-1)
                        {
                                if(this->numerator*m.denominator*-1*-1 < this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                        }
                }

	}
        bool Mixed::operator<=(const Mixed& m)
	{
                if(this->isNegative && !m.isNegative)
                {
                        if(this->integer*-1 < m.integer)
                        {
                                return true;
                        }
                        else if(this->integer*-1 > m.integer)
                        {
                                return false;
                        }
                        else if(this->integer*-1 == m.integer)
                        {
                                if(this->numerator*m.denominator*-1 < this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator)
                                {
                                        return true;
                                }
                        }
                }
                else if(!this->isNegative && m.isNegative)
                {
                        if(this->integer < m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer > m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer == m.integer*-1)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                        }
                }
                else if(!this->isNegative && !m.isNegative)
                {
                        if(this->integer < m.integer)
                        {
                                return true;
                        }
                        else if(this->integer > m.integer)
                        {
                                return false;
                        }
                        else if(this->integer == m.integer)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator)
                                {
                                        return true;
                                }
                        }
                }
                else if(this->isNegative && m.isNegative)
                {
                        if(this->integer*-1 < m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer*-1 > m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer*-1 == m.integer*-1)
                        {
                                if(this->numerator*m.denominator*-1*-1 < this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                        }
                }		
	}
        bool Mixed::operator>=(const Mixed& m)
	{
                if(this->isNegative && !m.isNegative)
                {
                        if(this->integer*-1 < m.integer)
                        {
                                return false;
                        }
                        else if(this->integer*-1 > m.integer)
                        {
                                return true;
                        }
                        else if(this->integer*-1 == m.integer)
                        {
                                if(this->numerator*m.denominator*-1 < this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator)
                                {
                                        return true;
                                }
                        }
                }
                else if(!this->isNegative && m.isNegative)
                {
                        if(this->integer < m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer > m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer == m.integer*-1)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                        }
                }
                else if(!this->isNegative && !m.isNegative)
                {
                        if(this->integer < m.integer)
                        {
                                return false;
                        }
                        else if(this->integer > m.integer)
                        {
                                return true;
                        }
                        else if(this->integer == m.integer)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator)
                                {
                                        return true;
                                }
                        }
                }
                else if(this->isNegative && m.isNegative)
                {
                        if(this->integer*-1 < m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer*-1 > m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer*-1 == m.integer*-1)
                        {
                                if(this->numerator*m.denominator*-1*-1 < this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                        }
                }
	}
        bool Mixed::operator==(const Mixed& m)	
	{
                if(this->isNegative && !m.isNegative)
                {
                        if(this->integer*-1 < m.integer)
                        {
                                return false;
                        }
                        else if(this->integer*-1 > m.integer)
                        {
                                return false;
                        }
                        else if(this->integer*-1 == m.integer)
                        {
                                if(this->numerator*m.denominator*-1 < this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator)
                                {
                                        return true;
                                }
                        }
                }
                else if(!this->isNegative && m.isNegative)
                {
                        if(this->integer < m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer > m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer == m.integer*-1)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                        }
                }
                else if(!this->isNegative && !m.isNegative)
                {
                        if(this->integer < m.integer)
                        {
                                return false;
                        }
                        else if(this->integer > m.integer)
                        {
                                return false;
                        }
                        else if(this->integer == m.integer)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator)
                                {
                                        return true;
                                }
                        }
                }
                else if(this->isNegative && m.isNegative)
                {
                        if(this->integer*-1 < m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer*-1 > m.integer*-1)
                        {
                                return false;
                        }
                        else if(this->integer*-1 == m.integer*-1)
                        {
                                if(this->numerator*m.denominator*-1*-1 < this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                        }
                }
	}
        bool Mixed::operator!=(const Mixed& m)
	{
                if(this->isNegative && !m.isNegative)
                {
                        if(this->integer*-1 < m.integer)
                        {
                                return true;
                        }
                        else if(this->integer*-1 > m.integer)
                        {
                                return true;
                        }
                        else if(this->integer*-1 == m.integer)
                        {
                                if(this->numerator*m.denominator*-1 < this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator)
                                {
                                        return false;
                                }
                        }
                }
                else if(!this->isNegative && m.isNegative)
                {
                        if(this->integer < m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer > m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer == m.integer*-1)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                        }
                }
                else if(!this->isNegative && !m.isNegative)
                {
                        if(this->integer < m.integer)
                        {
                                return true;
                        }
                        else if(this->integer > m.integer)
                        {
                                return true;
                        }
                        else if(this->integer == m.integer)
                        {
                                if(this->numerator*m.denominator < this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator > this->denominator*m.numerator)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator == this->denominator*m.numerator)
                                {
                                        return false;
                                }
                        }
                }
                else if(this->isNegative && m.isNegative)
                {
                        if(this->integer*-1 < m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer*-1 > m.integer*-1)
                        {
                                return true;
                        }
                        else if(this->integer*-1 == m.integer*-1)
                        {
                                if(this->numerator*m.denominator*-1*-1 < this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 > this->denominator*m.numerator*-1)
                                {
                                        return true;
                                }
                                else if(this->numerator*m.denominator*-1 == this->denominator*m.numerator*-1)
                                {
                                        return false;
                                }
                        }
                }
	}
       
        Mixed Mixed::operator+(const Mixed& m)
	{
		if(!this->isNegative && !m.isNegative)
		{
			Mixed temp1(this->integer, this->numerator, this->denominator);
			Mixed temp2(m.integer, m.numerator, m.denominator);
			temp1.ToFraction();
			temp2.ToFraction();
			int denom = temp1.denominator*temp2.denominator;
			int num1 = temp1.numerator*temp2.denominator;
			int num2 = temp1.denominator*temp2.numerator; 
			Mixed answer(0, num1+num2, denom);
			answer.Simplify();
			return answer;
		}
		else if(this->isNegative && !m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1+num2, denom);
                        answer.Simplify();
                        return answer;
                }
                else if(!this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator*-1;
                        Mixed answer(0, num1+num2, denom);
                        answer.Simplify();
                        return answer;
                }
                else if(this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator*-1;
                        Mixed answer(0, num1+num2, denom);
                        answer.Simplify();
                        return answer;
                }
	}
        Mixed Mixed::operator-(const Mixed& m)
	{
                if(!this->isNegative && !m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1-num2, denom);
                        answer.Simplify();
                        return answer;
                }
                else if(this->isNegative && !m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1-num2, denom);
                        answer.Simplify();
                        return answer;
                }
                else if(!this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator*-1;
                        Mixed answer(0, num1-num2, denom);
                        answer.Simplify();
                        return answer;
                }
                else if(this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator*-1;
                        Mixed answer(0, num1-num2, denom);
                        answer.Simplify();
                        return answer;
                }
	}
        Mixed Mixed::operator*(const Mixed& m)
	{
                if(!this->isNegative && !m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1*num2, denom*denom);
                        answer.Simplify();
                        return answer;
                }
                else if(this->isNegative && !m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1*num2, denom*denom);
                        answer.Simplify();
                        return answer;
                }
                else if(!this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator*-1;
                        Mixed answer(0, num1*num2, denom*denom);
                        answer.Simplify();
                        return answer;
                }
                else if(this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator*-1;
                        Mixed answer(0, num1*num2, denom*denom);
                        answer.Simplify();
                        return answer;
                }		
	}
        Mixed Mixed::operator/(const Mixed& m)
	{
                if(!this->isNegative && !m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1*denom,num2*denom);
                        answer.Simplify();
                        return answer;
                }
                else if(this->isNegative && !m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1*denom, num2*denom);
                        answer.Simplify();
                        return answer;
                }
                else if(!this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator;
                        Mixed answer(0, num1*denom, num2*denom);
                        answer.Simplify();
                        return answer;
                }
                else if(this->isNegative && m.isNegative)
                {
                        Mixed temp1(this->integer, this->numerator, this->denominator);
                        Mixed temp2(m.integer, m.numerator, m.denominator);
                        temp1.ToFraction();
                        temp2.ToFraction();
                        int denom = temp1.denominator*temp2.denominator;
                        int num1 = temp1.numerator*-1*temp2.denominator;
                        int num2 = temp1.denominator*temp2.numerator*-1;
			if(num2*denom < 0 && num1*denom < 0)
			{
                        	Mixed answer(0, num1*denom*-1, num2*denom*-1);
				answer.Simplify();
				return answer;
                        }
			else if(num2*denom < 0 && num1*denom >= 0)
			{
				Mixed answer(0, num1*denom*-1, num2*denom*-1);
				answer.Simplify();
				return answer;
			}
			else
			{
				Mixed answer(0, num1*denom, num2*denom);
				answer.Simplify();
				return answer;
			}
                }
	}

        Mixed& Mixed::operator++()
	{
		integer++;
		return *this;	
	}
        Mixed Mixed::operator++(int)
	{
		Mixed temp = *this;
		integer++;
		return temp;
	}
        Mixed& Mixed::operator--()
	{
		integer--;
		return *this;
	}
        Mixed Mixed::operator--(int)
	{
		Mixed temp = *this;
		integer--;
		return temp;
	}
	
int Mixed::gcd(int a, int b) 
	{
		if(a < 0)
		{
			a = a * -1;
		}
		if(b < 0)
		{
			b = b * -1;
		}
 		int temp = a % b;
  		while (temp > 0)
    		{
      			a = b;
      			b = temp;
      			temp = a % b;
 	   	}
  		return b;
	}
