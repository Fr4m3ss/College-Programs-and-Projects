import java.util.*;

public class Factorial {
	/*
	Framess
	*/
	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		int total = 0;
		System.out.println("Input a number~ ");
		int input = num.nextInt();
		total = input;
		for(int i=(input-1); i>=1; i--)
		{
			total= total*i;
		}
		System.out.println(total);
	}

}
