import java.util.*;

public class What_You_Need_For_GPA_CALC {

	public static void main(String[] args) {
		
		Scanner string = new Scanner (System.in);
		Scanner num = new Scanner (System.in);
		
		System.out.println("What is your name?");
   	    String name = string.nextLine();
   	    System.out.println("So your name is " + name);
		
		String test = "Howdy";
		System.out.println("String= " + test);
		
		int number = 1;
		System.out.println("Integer= " + number);
		
		int numberWrong = 4/3;
		System.out.println("Integer if it were a decimal= " + numberWrong);
		
		double numberRight = 4.0/3.0;
		System.out.println("Double if it were a decimal= " + numberRight);
		
		double numberPrecise = 420.69;
		System.out.println("Double= " + numberPrecise);
		
	}
}
