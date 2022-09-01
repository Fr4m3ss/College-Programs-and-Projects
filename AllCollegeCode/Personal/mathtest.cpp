#include<iostream>
using namespace std;

class mathtest
{
        int main()
        {
                int x = 6;
                int count = 0;
                while(x <= 1000000000000)
                {
                        x = x*2;
                }
                cout<<x<<endl;
                return 0;
        }
};
