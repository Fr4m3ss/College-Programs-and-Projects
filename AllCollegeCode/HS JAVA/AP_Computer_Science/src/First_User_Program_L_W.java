import java.util.Scanner;


public class First_User_Program_L_W {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Length Here~ ");
		int length =input.nextInt();
		System.out.println("Enter Width Here~ ");
		int width =input.nextInt();
		int Area = length*width;
		int Perimeter = length*2 + width*2;
		System.out.println("The Area Is~ "+Area);
		System.out.println("");
		System.out.println("The Perimeter Is~ "+Perimeter);
	}

}
