//Frankie


import java.util.Scanner;

public class FractionAction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    
	    //Addition
	    if(Equation==1)
	    {
    	int Numerators11 = (Numerator1 * Denominator2);
    	int Numerators111 = (Numerator2 * Denominator1);
    	int Numerators1 = (Numerators11 + Numerators111 );
	    int Denominators1 = (Denominator1 * Denominator2);
   	    System.out.println("The answer is "+ Numerators1 +"/"+ Denominators1+ ".");
	    }
	    
	    //Subtraction
	    if(Equation==2)
	    {
	    int Numerators22 = (Numerator1 * Denominator2);
	   	int Numerators222 = (Numerator2 * Denominator1);
	   	int Numerators2 = (Numerators22 - Numerators222 );
	    int Denominators2 = (Denominator1 * Denominator2);
   	    System.out.println("The answer is "+ Numerators2 +"/"+ Denominators2+ ".");
	    }
	    
	    //Multiplication
	    if(Equation==3)
	    {
	    int Numerators3 = (Numerator1 * Numerator2);
	    int Denominators3 = (Denominator1 * Denominator2);
	    System.out.println("The answer is "+ Numerators3 +"/"+ Denominators3+ ".");
	    }
	    
	    //Division
	    if(Equation==4)
	    {
	    int Numerators4 = (Numerator1 * Denominator2);
		int Denominators4 = (Denominator1 * Numerator2);
		System.out.println("The answer is "+ Numerators4 +"/"+ Denominators4+ ".");	
	    }
	}

}
