import java.util.Scanner;
public class Trapezoid {
//Frankie Messina Mod 9
	
	private double base1;
	private double base2;
	private double height;

	public Trapezoid()
	{
		base1=0;
		base2=0;
		height=0;
	}
	
	public double getbase1()
	{
		return base1;
	}
	public double getbase2()
	{
		return base2;
	}
	public double getHeight()
	{
		return height;
	}
	
	public Trapezoid(double l1, double l2, double h)
	{
		base1=l1;
		base2=l2;
		height=h;
	}
	
	public void setbase1(double l1)
	{
		base1=l1;
	}
	public void setbase2(double l2)
	{
		base2=l2;
	}
	public void setHeight(double h)
	{
		height=h;
	}

	public double area()
	{
	return (.5*(base1+base2))*height;
	}
	
	
	public String toString()
	{
		 return "Base 1 = "+getbase1()+
				"\nBase 2 = "+getbase2()+
				"\nHeight = "+getHeight()+
				"\nArea= "+area();
	}
}
