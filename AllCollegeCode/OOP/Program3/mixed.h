//Francesco Messina, Section 7, Program 3: "Mixed Numbers"i
#include <iostream>
using namespace std;

class Mixed
{
public:
	Mixed(int integerInput = 0);
        Mixed(int integerInput, int numeratorInput, int denominatorInput);
	
	double Evaluate() const;
	void ToFraction();
	void Simplify();

	friend std::istream& operator>>(std::istream& in,  Mixed& m);
	friend std::ostream& operator<<(std::ostream& out, const Mixed& m);
	
	bool operator<(const Mixed& m);
        bool operator>(const Mixed& m);
        bool operator<=(const Mixed& m);
        bool operator>=(const Mixed& m);
        bool operator==(const Mixed& m);
        bool operator!=(const Mixed& m);
	
	Mixed operator+(const Mixed& m);
        Mixed operator-(const Mixed& m);
        Mixed operator*(const Mixed& m);
        Mixed operator/(const Mixed& m);

	Mixed& operator++(); 
	Mixed operator++(int);
	Mixed& operator--();
        Mixed operator--(int);
	
private:
	int integer;
	int numerator;
	int denominator;
	bool isNegative;
	int gcd(int a, int b);
};

