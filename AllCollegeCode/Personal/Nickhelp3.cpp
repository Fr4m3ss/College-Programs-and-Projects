#include <iostream>

using namespace std;

int main()
{
double ht_in = 0;
double wt_lb = 0;
double BMI = 0;

cout<<"Input Height"<<endl;
cin>>ht_in;

for(wt_lb = 100; wt_lb<=200; wt_lb=wt_lb+2)
{
	BMI = ((703*wt_lb)/(ht_in*ht_in));
	cout<<BMI<<endl;
}


}
