#include <string>

class Date
{
public:
	Date(int month = 1, int day = 1, int year = 2000, char format = 'D');
	void Input();
	void Show() const;
	
	bool Set(int m, int d, int y);
	
	int GetMonth() const;
	int GetDay() const;
	int GetYear() const;
	
	bool SetFormat(char f);
	
	void Increment(int numDays = 1);
	
	int Compare(const Date& d) const;	


private:
	int inMonth;
	int inDay;
	int inYear;
	char inFormat;
	static int string_to_int(std::string str);
};
