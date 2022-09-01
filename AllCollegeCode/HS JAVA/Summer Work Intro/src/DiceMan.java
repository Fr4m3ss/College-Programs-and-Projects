import java.util.*; 
public class DiceMan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Scanner num = new Scanner (System.in);
		Random gen = new Random();
		Random gen2 = new Random();
		 int play = 1;
		 System.out.println("Will you insert coin to play? (1)Yes (2)No");
    	 int begin = num.nextInt();
    	 if(begin==1)
    	 {
    		 System.out.println("Ok, here we go!");
             play=1;
    	 }
    	 else
    	 {
          System.out.println("Goodbye!");
          play=0;
    	 }
    	 int longest = 0;
		 int current = 0;
		 while(play==1)
		 {
			 
			 int random1 = gen.nextInt((6)+1);
			 int random2 = gen2.nextInt((6)+1);
			 int randoms1 =(random1+random2);
			 System.out.println("roll:"+randoms1);
			 System.out.println("(1)Higher or (2)Lower");
			 
			 int random3 = gen.nextInt((6)+1);
			 int random4 = gen2.nextInt((6)+1);
			 int randoms2 =(random3+random4);
			 
			 int input = in.nextInt();
	         
			 if (input==1 && randoms2>randoms1 || input==2 && randoms2<randoms1)
		    {
				 
				 if(current>= longest)
				 {
						 longest++;
				 }
				 current++;
				
				 System.out.println("Nice Job!");
				 System.out.println("current:"+current);
				 System.out.println("longest:"+longest);
				 
		    }
			 else
			 {
				 System.out.println("Game Over");
				 System.out.println("It Was "+randoms2);
				 System.out.println("current:"+current);
				 System.out.println("longest:"+longest);
				 current=0;
		    	 System.out.println("Will you insert coin to play again? (1)Yes (2)No");
		    	 int stop = num.nextInt();
		    	 if(stop==1)
		    	 {
		    		 
		    	 }
		    	 else
		    	 {
		          System.out.println("Goodbye!");
		          play=0;
		    	 }
		    	 
		    
		    }
	
		 }
			 
		 }
		 
	

	}

