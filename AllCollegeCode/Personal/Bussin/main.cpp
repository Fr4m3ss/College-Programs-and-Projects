#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

double factorial(double x)
{
	double ans = x;
	for(double i = x - 1; i > 0; i--)
	{
		ans = ans * i;
	}
	return ans;
}

double sum(double x, int n)
{
	double odd = 1;
	double ans = 0.0;
	bool flip = true;

	for(int i = 0; i <= n; i++)
	{
		if(flip)
		{
			ans += ((pow(x, odd))/(factorial(odd)));
			flip = false;
		}
		else
		{
			ans -= ((pow(x, odd))/(factorial(odd)));
			flip = true;
		}
		odd += 2;
	}

	return ans;
}

int main()
{
	double x;
	int n;
	cout<<fixed<<setprecision(6);
	cout<<"Enter the value of x: ";
	cin>>x;
	cout<<"Enter the number of terms: ";
	cin>>n;
	cout<<"sin("<<x<<") = "<<sum(x,n)<<endl;
	cout<<"Margin of error: "<<(abs(sin(x)-sum(x,n)))<<endl;
	return 0;
}
