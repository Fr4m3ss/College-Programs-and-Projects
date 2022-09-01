import java.util.Scanner;
public class Triangle {
//Frankie Messina Mod 9
	
	private double leg1;
	private double leg2;
	private double leg3;
	private double S;

	public Triangle()
	{
		leg1=0;
		leg2=0;
		leg3=0;
		S=0;
	}
	
	public double getLeg1()
	{
		return leg1;
	}
	public double getLeg2()
	{
		return leg2;
	}
	public double getLeg3()
	{
		return leg3;
	}
	
	public Triangle(double l1, double l2, double l3)
	{
		leg1=l1;
		leg2=l2;
		leg3=l3;
		S= (l1+l2+l3)/2;
	}
	
	public void setLeg1(double l1)
	{
		leg1=l1;
	}
	public void setLeg2(double l2)
	{
		leg2=l2;
	}
	public void setLeg3(double l3)
	{
		leg3=l3;
	}
	public boolean isRightTriangle()
	{
	if(leg1*leg1 + leg2*leg2 == leg3*leg3 || leg1*leg1 + leg3*leg3 == leg2*leg2 || leg2*leg2 + leg3*leg3 == leg1*leg1 )
	{
		return true;
	}
		else
	return false;
	}
	
	
	public double area()
	{
	return Math.sqrt(S*((S-leg1)*(S-leg2)*(S-leg3)));
	}
	
	public double perimeter()
	{
	return (leg1+leg2+leg3);		
	}
	
	public String toString()
	{
		 return "Leg 1 = "+getLeg1()+
				"\nLeg 2 = "+getLeg2()+
				"\nLeg 3 = "+getLeg3()+
				"\nArea= "+area()+
				"\nPerimeter= " +perimeter();
	}
}
