#include<iostream>
using namespace std;
int main()
{
	int a, b, c;
	double x, y, z;
	cout<<"Enter 3 integers: "<<endl;
	cin>>a>>b>>c;
	cout<<"Enter 3 doubles: "<<endl;
	cin>>x>>y>>z;
	
	cout<<"Is x the same as a? "<< (x==a) <<endl;
	cout<<"Is b less than 15? "<< (b<15) <<endl;
	cout<<"Is c greater than or equal to y+z? "<< (c>=(y+z))<<endl;
	
	cout<<"1 and 3 ? "<< ((x==a) && (c>=(y+z)))<<endl;
	cout<<"1 or 2 ? "<< ((x==a) || (b<15))<<endl;
	cout<<"not 2 ? "<< (!(b<15))<<endl;
	
	double quiz, hw, tests;
	cout<<"Enter total grades for quizzes, then homeworks, then tests!: "<<endl;
	cin>>quiz>>hw>>tests;
	
	double grade = quiz + hw + tests;
	if (grade >=70 && tests/45 >= 0.7)
	{
		cout<<"You Passed!"<<endl;
	}
	else
	{
		cout<<"You Failed!"<<endl;
	}

	//determine letter grade
	
	if(grade>=90)
		cout<<"A";
	else if (grade>=80&&grade<90)
		cout<<"B";
	else if (grade>=70&&grade<80)
		cout<<"C";
	else if (grade>=60&&grade<70)
		cout<<"D";
	else if (grade<60)
		cout<<"F";
	
	return 0; 
}
