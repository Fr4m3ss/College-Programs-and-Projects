//Josh Abramoff
import java.util.Scanner;
import java.util.Random;
public class JoshTest {

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		Scanner num = new Scanner (System.in);
		Random gen = new Random();
		int play = 1;
		int playuser = 1;
		
		
		System.out.println("Will you like to play? (1)Yes (2)No");
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
    	 /*if (play==1)
    	 {
    		 System.out.println("What two numbers do you want me to pick between? ");
 			int num1 = num.nextInt();
 			//Thread.sleep(1500);
 			System.out.println("Okay! And the second number: ");
 			int num2 = num.nextInt();
			 int random1 = gen.nextInt((num2)+num1);
			 System.out.println("Alright, I'm thinking of a number between "+ num1 + " and " +num2+ ".");
				//Thread.sleep(1500);
				System.out.println(random1);
				System.out.print("Now, you try to guess: ");
    	 }
    	 else
    	 {
    		 
    	 }*/
    	 while(play==1)
		 {
    		int counter=0;
    		int random1 = gen.nextInt((100)+1);
    			while(playuser==1)
    			{
    				System.out.print("Try to guess the number between 1 and 100: ");
        			int user = num.nextInt();	
        			if(user>random1) 
        			{
        					System.out.println("Nope, too high!");
        					//Thread.sleep(1000);
        					System.out.println("How about another go? (1)Yes (2)No ");
        					counter++;
        					playuser = num.nextInt();
        			}
        			if(user<random1) 
        			{
        					System.out.println("Nope, too low!");
        					//Thread.sleep(1000);
        					System.out.println("How about another go? (1)Yes (2)No ");
        					counter++;
        					playuser = num.nextInt();
        			}
        			if(user==random1) 
        			{
        					System.out.println("Right on the money!");
        					counter++;
        					//Thread.sleep(1000);
        					System.out.println("Congradulations! It took you "+counter+" tries to get it!");
        					System.out.println("Want to play again? (1)Yes (2)No ");
        					play = num.nextInt();
        			}
    			}
    			if(playuser==2)
    			{
    				System.out.println("Well thats too bad. Better luck next time!");
    				break;
    			}		
		 }
			 if (play==2)
			 {
		          System.out.println("Goodbye!");
		      
		   }
		    	 
		    
		    }
	
		 }
			 
		 
		
		
		
		
		
		/*Scanner s = new Scanner(System.in);
		Random rand = new Random();
		
		//int  n = rand.nextInt(100) + 0;
		
		//OPENING DIALOGUE:
		///////////////////
		System.out.println("What two numbers do you want me to pick between? ");
		int num1 = s.nextInt();
		//Thread.sleep(1500);
		System.out.println("Okay! And the second number: ");
		int num2 = s.nextInt();
		
		//int  n = rand.nextInt(num2) + (num1-1);
		int n = rand.nextInt((num2)+num1);
		//int n = (int )(Math.random() * num2 + num1);
		
		System.out.println("Alright, I'm thinking of a number between "+ num1 + " and " +num2+ ".");
		//Thread.sleep(1500);
		System.out.println("I've got it!");
		//Thread.sleep(1000);
		System.out.println(n);
		System.out.print("Now, you try to guess: ");
		//Thread.sleep(1000);
		
		//USER INPUT
		////////////
		int user = s.nextInt();
		
		//IF STUFF
		//////////
		
		if(user>n) {
			System.out.println("Nope, too high!");
			//Thread.sleep(1000);
			System.out.println("How about another go? ");
			int user2 = s.nextInt();
			
			if(user2>n) {
				System.out.println("Too high!");
				//Thread.sleep(1000);
				System.out.println("Another go? ");
				int user3 = s.nextInt();
				
				if(user3>n) {
					System.out.println("Too High!");
					//Thread.sleep(1000);
					System.out.println("Another go? ");
					int user4 = s.nextInt();
				}
				if(user3<n) {
					System.out.println("Too Low!");
					//Thread.sleep(1000);
					System.out.println("Another go? ");
					int user4 = s.nextInt();
				}
			}
			if(user2<n) {
				System.out.println("Too Low!");
				//Thread.sleep(1000);
				System.out.println("One more try? ");
				int user3 = s.nextInt();
			}
		}
//		(._.)
		if(user<n) {
			System.out.println("You're too low!");
			//Thread.sleep(1000);
			System.out.println("Again? ");
			int user2 = s.nextInt();
			
			if(user2<n) {
				System.out.println("Too low!");
				//Thread.sleep(1000);
				System.out.println("One more try? ");
				int user3 = s.nextInt();
			}
			if(user2>n) {
				System.out.println("Too high!");
				//Thread.sleep(1000);
				System.out.println("Another go? ");
				int user3 = s.nextInt();
			}
		}
		
		if(user==n){
			System.out.println("Right on the money!");
			//Thread.sleep(1000);
			System.out.println("Congradulations!");
		}*/
		
		
		
		
		
		//System.out.println(n);
	




