#include <iostream>
#include <string>

using namespace std;

int main()
{
	string input = "";
	string s1 = "";
	string s2 = "";
	string s3 = "";
	string s4 = "";
	string rinput = "";
	string rs1 = "";
        string rs2 = "";
        string rs3 = "";
        string rs4 = "";
	string hold = "";
	int temp = 0;
	int placeholder = 0;

	cout<<"Input String"<<endl;
	cin>>input;

	for(int i = 0; i<input.length(); i++)
	{
		if(input.at(i)!='*'&&temp==0)
		{
			s1=s1+input.at(i);	
		}
		else
		{	
			if(temp==0)
			{
				placeholder=i+1;
			}
			temp = 1;
		}
	}
	temp = 0;
	for(int i = placeholder; i<input.length(); i++)
        {
                if(input.at(i)!='*'&&temp==0)
                {
                        s2=s2+input.at(i);
                }
                else
                {
                        if(temp==0)
                        {
                                placeholder=i+1;
                        }
                        temp = 1;
                }
        }
	temp = 0;
	for(int i = placeholder; i<input.length(); i++)
        {
                if(input.at(i)!='*'&&temp==0)
                {
                        s3=s3+input.at(i);
                }
                else
                {
                        if(temp==0)
                        {
                                placeholder=i+1;
                        }
                        temp = 1;
                }
        }
	temp = 0;
        for(int i = placeholder; i<input.length(); i++)
        {
                if(input.at(i)!='*'&&temp==0)
                {
                        s4=s4+input.at(i);
                }
                else
                {
			if(temp==0)
                        {
                                placeholder=i+1;
                        }
                        temp = 1;
                }
        }
	//cout<<input<<" "<<s1<<" "<<s2<<" "<<s3<<" "<<s4<<endl;

	for(int i=s1.size()-1;i>=0;i--)
    	{
		hold+=s1[i];
 	}
	rs1=hold;
	
	hold = "";
		
	for(int i=s2.size()-1;i>=0;i--)
        {
                hold+=s2[i];
        }
        rs2=hold;

	hold = "";	

	for(int i=s3.size()-1;i>=0;i--)
        {
                hold+=s3[i];
        }
        rs3=hold;

	hold = "";
	
	for(int i=s4.size()-1;i>=0;i--)
        {
                hold+=s4[i];
        }
        rs4=hold;
	
	hold = "";

	rinput=rs1+'*'+rs2+'*'+rs3+'*'+rs4;
	
	cout<<input<<" "<<s1<<" "<<s2<<" "<<s3<<" "<<s4<<endl;
	cout<<rinput<<" "<<rs1<<" "<<rs2<<" "<<rs3<<" "<<rs4<<endl;
	

}
