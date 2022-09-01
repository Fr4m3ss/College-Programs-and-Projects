#include <iostream>
using namespace std;

int main()
{
int a;
int b;
int total=0;
cout<<"Input 2 integers."<<endl;
cin>>a>>b;
for(int i = a; i<=b; i++)
{	
	if((i%3)==0)
	{
		total=total+i;
	}	
}
cout<<total;
return 0;
}
