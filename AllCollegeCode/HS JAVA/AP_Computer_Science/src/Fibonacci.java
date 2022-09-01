import java.util.Scanner;
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double reset = 1;
		while (reset==1)
		{
		Scanner e = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int c = 2;
		System.out.println("What Fibonacci Number would you like? (1,2,3, etc.)");
		int input = e.nextInt();
		if (input == 1 || input == 2) 
		{
			System.out.println("The Fibonacci Number is ~ 1 ");
			System.out.println("Would you like to do another? (1)Yes or (2)No");
			int r = e.nextInt();
			if(r == 1)
			{
				reset=1;
			}
			else if (r == 2)
			{
				reset=0; 
			}
		}
		else
		{
		for (int i = 3; i <= input; i++)
		{
		c= a+b;
		a = b;
		b = c;
		}
		System.out.println("The Fibonacci Number is ~ "+c);
		System.out.println("Would you like to do another? (1)Yes or (2)No");
		int r = e.nextInt();
		if(r == 1)
		{
			reset=1;
		}
		else if (r == 2)
		{
			reset=0;
		}
		}
	}

}
}