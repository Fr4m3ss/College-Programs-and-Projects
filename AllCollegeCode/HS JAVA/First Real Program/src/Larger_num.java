import java.util.Scanner;

public class Larger_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner (System.in);
		System.out.println("x=");
   	    int x = num.nextInt();
		System.out.println("y=");
	    int y = num.nextInt();
	    if(x>y)
	    {
	    	System.out.println("The greater number is x, which equals "+x);
	    }
	    else
	    {
	    	if(y>x)
	    	{
	    		System.out.println("The greater number is y, which equals "+y);
	    	}
	    	else
	    	{
	    		System.out.println("Both numbers are the same. "+x+" = "+y);
	    	}
	    }
	}

}
