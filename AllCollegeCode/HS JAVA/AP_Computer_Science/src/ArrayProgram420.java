import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class ArrayProgram420 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = 0;
		double a = 0;
	
		Scanner hi = new Scanner(System.in); 
		Random run = new Random();
		
		System.out.println("How many random numbers would you like?");
		int randos = hi.nextInt();
		if(randos==0)
		{
		System.out.println("No Numbers (0)");
		System.out.println("No Average (0)");
		}
		else
		{
		int [] array = new int[randos];
		for(int i=0;i<array.length;i++)
		{
		int rando = run.nextInt((100)+1);
		array[i]=rando;
		a=a+array[i];
		c++;
		System.out.print(array[i]+" ");
		if(c % 15 == 0)
		{
		System.out.println();	
		}
		if(i==(array.length-1))
		{
		a=a/c;
		System.out.println("\nAverage= "+a);
		}
		}
		
		
		}
		
	}

}
