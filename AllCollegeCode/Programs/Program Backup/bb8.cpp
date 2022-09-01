#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
        double diameter;
        double length;
        const double PI = 3.14;
        cout<<"What is BB-8's diameter?"<<endl;
        cin>>diameter;
        cout<<"What is the distance BB-8 must travel?"<<endl;
        cin>>length;
        double rolls;
        rolls= PI * diameter;
        rolls=length/rolls;
        cout<<scientific;
        cout<<"BB-8 must roll "<<rolls<<" times!"<<endl;

        return 0;
}

