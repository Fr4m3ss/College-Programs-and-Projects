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
		if(i==(array.length-1))
		{
		a=a/c;
		System.out.println("\nAverage= "+a);
		}
		}
		
		}
		
	}
}
		
		/*
 Scanner hi = new Scanner(System.in); 
		System.out.println("What would you like to search for?");
		int thing = hi.nextInt();
		for(int i=0;i<array.length;i++)
		{
			if(thing==array[i])
			{
				c++;
			}
		}
		System.out.println("It appears "+c+" times.");
 */
		
		
		
		
		
		/*
		  int sum = age[0]+ age[1] + age[2] + age[4];
		System.out.println(sum);
		*/
		
		
		
		
		/*
		 * for(int i=0;i<5;i++)
		{
			System.out.println(age[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"\t");
		}
		*/



