#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstdlib>
using namespace std;

int divider(int, int);

int main()
{
int x;
int y;

cout<<"Input 2 numbers"<<endl;
cin>>x>>y;

cout<<"="<<divider(x,y);

return 0;
}

int divider(int a, int b)
{
return (a/b);
}
