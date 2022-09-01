import java.util.Scanner;
public class Trapezoid_Main_Frankie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trapezoid z = new Trapezoid();
		z.setbase1(10);
		z.setbase2(4);
		z.setHeight(2);
		System.out.println(z);
		//y has same trapezoid dimensions as z
		Trapezoid y = new Trapezoid(10,4,2);
		System.out.println("Base 1= "+y.getbase1());
		System.out.println("Base 2= "+y.getbase2());
		System.out.println("Height= "+y.getHeight());
		System.out.println("Area= "+y.area());
		
	}

}
