//Francesco Messina, Section 6/10
class House
{
public:
	House(int base, char border = 'X', char fill = '*');	//Constructor, Default Border "X", Default fill "*", base between 3 and 37
	
	void SetBorder(char border);
	void SetFill(char fill);
	
	int GetSize() const;
	
	int Perimeter() const;
	double Area() const;
	
	void Grow();
	void Shrink();
	
	void Draw() const;
	void Summary() const;

private:
	int baseSize;
	char borderChar;
	char fillChar;


};	
