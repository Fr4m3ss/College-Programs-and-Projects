#include <iostream>
#include <fstream>

using namespace std;

int main()
{
	ifstream in;
	ofstream out;
	remove("result.txt");
	out.open("result.txt");
	in.open("traindata.csv");
	ifstream file("traindata.csv");
	string str = "";
	while(!file.eof())
	{
		getline(file,str, '\n');
		out<<str<<"\n";
	}

	return 0;
}
