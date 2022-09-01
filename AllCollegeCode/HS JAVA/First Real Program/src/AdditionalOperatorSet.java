import java.util.*;
public class AdditionalOperatorSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random f = new Random();
    Scanner in = new Scanner(System.in);
    int n=0;
    int roll = f.nextInt(2)+1;
    System.out.print("Enter 1 for Heads and 2 for Tails-> ");
    int guess = in.nextInt();
    n++;
    
   if(guess!=roll)
    {
    		System.out.println("You are wrong\n");
    }
   else
   {
	   System.out.println("You got it!");
   }
    

	}

}
