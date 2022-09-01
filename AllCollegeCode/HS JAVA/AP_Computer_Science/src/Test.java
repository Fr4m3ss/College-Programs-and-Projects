import java.util.Scanner;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		int [] array = {2,5,2,5,2,6,6,7,8,4,9,0};
		Scanner hi = new Scanner(System.in); 
		System.out.println("What would you like to search for?");
		int thing = hi.nextInt();
	
		for(int i=0;i<array.length;i++)
		{
			if(thing==array[i])
			{
				c++;
			}
			if(thing==array[i])
			{
			System.out.println(i);	
			}
			if(c==0)
			{
			System.out.println("none");
			}
			else
			{
			System.out.println("in");
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
	}

}
