#include <iostream>
using namespace std;

double rectangleArea(double base, double height);

int main()
{
double base;
double height;
double depth;

double volume;
double surfaceArea;

cout<<"enter Base"<<endl;
cin>>base;
cout<<"enter Height"<<endl;
cin>>height;
cout<<"enter Width"<<endl;
cin>>depth;
volume=rectangleArea(base, height)*depth;
cout<<"Volume is = "<<volume<<endl;
surfaceArea=(rectangleArea(base, height)*2)+(rectangleArea(base,depth)*2)+(rectangleArea(depth,height)*2);
cout<<"Surface Area is = "<<surfaceArea<<endl;
}

double rectangleArea(double base, double height)
{
double answer = base*height;
return answer;
}
