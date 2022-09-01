import java.util.Scanner;


public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stringinput = new Scanner (System.in);
		System.out.print("Enter Number-> ");
	    int carName = stringinput.nextInt();
		System.out.print("Enter Number-> ");
		int carName2 = stringinput.nextInt();
		System.out.print("Enter Letters-> ");
		int carName3 = stringinput.nextInt();
		
		int math= carName*carName2;
		
		System.out.println("Test      "+math+"    "+carName3);
		
		
		
		}

}
