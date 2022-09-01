//simplying 


import java.util.Scanner;

public class FractionActionReal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Frankie Messina
		//Mod 9
		//AP Java
		
		Scanner num = new Scanner (System.in);
		System.out.println("What is the numerator of your first fraction?");
   	    int Numerator1 = num.nextInt();
   	    
   	    System.out.println("What is the denominator of your first fraction?");
	    int Denominator1 = num.nextInt();
	   
	    System.out.println("What is the numerator of your second fraction?");
   	    int Numerator2 = num.nextInt();
   	   
   	    System.out.println("What is the denominator of your second fraction?");
	    int Denominator2 = num.nextInt();
	    
	    System.out.println("Would you like to (1)Add (2)Subtract (3)Multiply or (4)Divide these fractions?");
	    int Equation = num.nextInt();
	    int numerator = 0;
	    int denominator = 0;
	    
	    
	    //Addition
	    if(Equation==1)
	    {
	    	numerator = (Numerator1 * Denominator2 + Numerator2* Denominator1 );
	    	denominator = (Denominator1 * Denominator2);
	    }
	    
	    //Subtraction
	    if(Equation==2)
	    {
	    	numerator = (Numerator1 * Denominator2 - Numerator2* Denominator1 );
	    	denominator = (Denominator1 * Denominator2);
	    }
	    
	    //Multiplication
	    if(Equation==3)
	    {
	    	numerator = (Numerator1 * Numerator2);
	    	denominator = (Denominator1 * Denominator2);
	    }
	    
	    //Division
	    if(Equation==4)
	    {
	    	numerator = (Numerator1 * Denominator2);
	    	denominator = (Denominator1 * Numerator2);	
	    }
	    
	    //Greatest Common Denominator
	    if(numerator != 0)
	    {
	    	int gcd = numerator;
	    	while(gcd>1 && (numerator % gcd != 0 || denominator % gcd != 0))
	   		{
	    		gcd --; 
	   		}
	    	numerator /=gcd;
	    	denominator /=gcd;
	    }
	    if (denominator<0)
	    {
	    	 numerator = -numerator;
	    	 denominator = -denominator;
	    }
	    
	    if(numerator==0 || denominator==1)
	    {
	    	 System.out.println("The answer is "+ numerator + "."); 
	    }
	    else
	    {
	    	 System.out.println("The answer is "+ numerator +"/"+ denominator+ ".");
        }
	    
	}

}
