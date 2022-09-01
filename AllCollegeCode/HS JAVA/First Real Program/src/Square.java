import java.util.Scanner;
public class Square {

	
	private double side;

	public Square()
	{
		side=0;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public Square(double s)
	{
		side=s;
	}
	
	public void setSide(double s)
	{
		side=s;
	}
	
	public double area()
	{
		return side*side;
	}
	
	public double perimeter()
	{
		return side*4;
	}
	
	public String toString()
	{
		return "Side= "+getSide()+
				"\nArea= "+area()+
				"\nPerimeter= " +perimeter();
	}
}
