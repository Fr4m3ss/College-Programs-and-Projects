#include <iostream>
#include <string>

using namespace std;

int main()
{
	int arr[10];
	int even = 0;
	int total = 0;
	for(int i = 0; i < 10; i++)
	{
		cin>>arr[i];
	}
	
	for(int i = 0; i < 10; i++)
	{
		cout<<arr[i]<< " "<<endl;
	}
	
	for(int i = 0; i<10; i++)
	{
		if(even==0||even%2==0)
		{
			total+=arr[i];
		}
		even++;
	}
	cout<<total<<endl;

}
