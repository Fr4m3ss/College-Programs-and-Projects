import java.util.Scanner;
public class TriangleMain {
	//Frankie Messina Mod 9

	public static void main(String[] args) {
		
		
		System.out.println("Triangle #1");
		
		Triangle s = new Triangle();
		Triangle t = new Triangle(3,4,5);
		
		System.out.println(s.getLeg1());
		System.out.println(s.getLeg2());
		System.out.println(s.getLeg3());
		
		s.setLeg1(7);
		s.setLeg2(5);
		s.setLeg3(3);
		
		// toString method prints all 3 legs ---See output paper
				
		System.out.println(s);
		System.out.println(t);
		
		double perim1 = s.perimeter();
		double perim2 = t.perimeter();
		
		System.out.println(perim1);
		System.out.println(t.area());
		
		System.out.println();
		
		if(t.isRightTriangle())
			System.out.println("t is a right triangle");
		else
			System.out.println("t is NOT a right triangle");
		
		if(s.isRightTriangle())
			System.out.println("s is a right triangle");
		else
			System.out.println("s is NOT a right triangle");
		/*
		//extra credit//
			
			
		if (t.IsIsosceles())
			System.out.println("t is an isosceles triangle");
		else
			System.out.println("t is NOT an isosceles triangle");
		
		t.setLeg1(4);
		
		if (t.IsIsosceles())
			System.out.println("t is an isosceles triangle");
		else
			System.out.println("t is NOT an isosceles triangle");
	
		*/
}

}
