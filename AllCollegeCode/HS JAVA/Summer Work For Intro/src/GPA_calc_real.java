import java.util.Scanner;

public class GPA_calc_real {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Frankie Messina
		//Mod 9
		//AP Java
		Scanner num = new Scanner (System.in);
		Scanner num2 = new Scanner (System.in);
		
		System.out.println("Students Name - ");
   	    String name = num2.nextLine();
   	    
   	    String lgrade1 = "Nyeh Heh Heh";
   	 String lgrade2 = "Nyeh Heh Heh";
   	String lgrade3 = "Nyeh Heh Heh";
   	String lgrade4 = "Nyeh Heh Heh";
  	    double gpa1 = 420.69;
  	  double gpa2 = 420.69;
  	double gpa3 = 420.69;
  	double gpa4 = 420.69;
  
   	    
   	 System.out.println("Name of course 1- ");
	    String course1 = num2.nextLine();
	    System.out.println("Weight of class (r)-regular (h)-honors (a)-ap-");
	    String weight1 = num2.nextLine();
	    System.out.println("Grade percentage- ");
	    int grade1 = num.nextInt();
	
	    System.out.println("Name of course 2- ");
	    String course2 = num2.nextLine();
	    System.out.println("Weight of class (r)-regular (h)-honors (a)-ap-");
	    String weight2 = num2.nextLine();
	    System.out.println("Grade percentage- ");
	    int grade2 = num.nextInt();
	    
	    System.out.println("Name of course 3- ");
	    String course3 = num2.nextLine();
	    System.out.println("Weight of class (r)-regular (h)-honors (a)-ap-");
	    String weight3 = num2.nextLine();
	    System.out.println("Grade percentage- ");
	    int grade3 = num.nextInt();
	    
	    System.out.println("Name of course 4- ");
	    String course4 = num2.nextLine();
	    System.out.println("Weight of class (r)-regular (h)-honors (a)-ap-");
	    String weight4 = num2.nextLine();
	    System.out.println("Grade percentage- ");
	    int grade4 = num.nextInt();
	//grade1
	    if (grade1>=96)
 	    {
	    	lgrade1 = "A";
 	    	gpa1 = 4.5;
 	    }
 	    else
 	    {
 	    	if (grade1>=92)
	 	    {
 	    		lgrade1 = "A";
 	    		gpa1 = 4.0;
	 	    }
	 	    else
	 	    {
	 	    	if (grade1>=88)
		 	    {
	 	    		lgrade1 = "B";
	 	    		gpa1 = 3.5;
		 	    }
		 	    else
		 	    {
		 	    	if (grade1>=84)
			 	    {
		 	    		lgrade1 = "B";
		 	    		gpa1 = 3.0;
			 	    }
			 	    else
			 	    {
			 	    	if (grade1>=80)
				 	    {
			 	    		lgrade1 = "C";
			 	    		gpa1 = 2.5;
				 	    }
				 	    else
				 	    {
				 	    	if (grade1>=76)
					 	    {
				 	    		lgrade1 = "C";
				 	    		gpa1 = 2.0;
					 	    }
					 	    else
					 	    {
					 	    	if (grade1>=72)
						 	    {
					 	    		lgrade1 = "D";
					 	    		gpa1 = 1.5;
						 	    }
						 	    else
						 	    {
						 	    	if (grade1>=68)
							 	    {
						 	    		lgrade1 = "D";
						 	    		gpa1 = 1.0;
							 	    }
							 	    else
							 	    {
							 	    	if (grade1>=0)
								 	    {
							 	    		lgrade1 = "F";
							 	    		gpa1 = 0.0;
								 	    }
								 	  
							 	    }	
						 	    }	
					 	    }	
				 	    }
			 	    }
		 	    }
	 	    }
 	    }
	    if(weight1.equalsIgnoreCase("r"))
	    {
	    gpa1=gpa1+0;
	    }
	    else 
	    {
	    	if(weight1.equalsIgnoreCase("h"))
	    	{
	    		gpa1=gpa1+1;
	    	}
	    	else
	    	{
	    		if(weight1.equalsIgnoreCase("a"))
	    		{
	    			gpa1=gpa1+1.5;
	    		}
	    	}
	    }
	//grade2
	    if (grade2>=96)
 	    {
	    	lgrade2 = "A";
 	    	gpa2 = 4.5;
 	    }
 	    else
 	    {
 	    	if (grade2>=92)
	 	    {
 	    		lgrade2 = "A";
 	    		gpa2 = 4.0;
	 	    }
	 	    else
	 	    {
	 	    	if (grade2>=88)
		 	    {
	 	    		lgrade2 = "B";
	 	    		gpa2 = 3.5;
		 	    }
		 	    else
		 	    {
		 	    	if (grade2>=84)
			 	    {
		 	    		lgrade2 = "B";
		 	    		gpa2 = 3.0;
			 	    }
			 	    else
			 	    {
			 	    	if (grade2>=80)
				 	    {
			 	    		lgrade2 = "C";
			 	    		gpa2 = 2.5;
				 	    }
				 	    else
				 	    {
				 	    	if (grade2>=76)
					 	    {
				 	    		lgrade2 = "C";
				 	    		gpa2 = 2.0;
					 	    }
					 	    else
					 	    {
					 	    	if (grade2>=72)
						 	    {
					 	    		lgrade2 = "D";
					 	    		gpa2 = 1.5;
						 	    }
						 	    else
						 	    {
						 	    	if (grade2>=68)
							 	    {
						 	    		lgrade2 = "D";
						 	    		gpa2 = 1.0;
							 	    }
							 	    else
							 	    {
							 	    	if (grade2>=0)
								 	    {
							 	    		lgrade2 = "F";
							 	    		gpa2 = 0.0;
								 	    }
								 	  
							 	    }	
						 	    }	
					 	    }	
				 	    }
			 	    }
		 	    }
	 	    }
 	    }
	    if(weight2.equalsIgnoreCase("r"))
	    {
	    gpa2=gpa2+0;
	    }
	    else 
	    {
	    	if(weight2.equalsIgnoreCase("h"))
	    	{
	    		gpa2=gpa2+1;
	    	}
	    	else
	    	{
	    		if(weight2.equalsIgnoreCase("a"))
	    		{
	    			gpa2=gpa2+1.5;
	    		}
	    	}
	    }
	//grade3
	    if (grade3>=96)
 	    {
	    	lgrade3 = "A";
 	    	gpa3 = 4.5;
 	    }
 	    else
 	    {
 	    	if (grade3>=92)
	 	    {
 	    		lgrade3 = "A";
 	    		gpa3 = 4.0;
	 	    }
	 	    else
	 	    {
	 	    	if (grade3>=88)
		 	    {
	 	    		lgrade3 = "B";
	 	    		gpa3 = 3.5;
		 	    }
		 	    else
		 	    {
		 	    	if (grade3>=84)
			 	    {
		 	    		lgrade3 = "B";
		 	    		gpa3 = 3.0;
			 	    }
			 	    else
			 	    {
			 	    	if (grade3>=80)
				 	    {
			 	    		lgrade3 = "C";
			 	    		gpa3 = 2.5;
				 	    }
				 	    else
				 	    {
				 	    	if (grade3>=76)
					 	    {
				 	    		lgrade3 = "C";
				 	    		gpa3 = 2.0;
					 	    }
					 	    else
					 	    {
					 	    	if (grade3>=72)
						 	    {
					 	    		lgrade3 = "D";
					 	    		gpa3 = 1.5;
						 	    }
						 	    else
						 	    {
						 	    	if (grade3>=68)
							 	    {
						 	    		lgrade3 = "D";
						 	    		gpa3 = 1.0;
							 	    }
							 	    else
							 	    {
							 	    	if (grade3>=0)
								 	    {
							 	    		lgrade3 = "F";
							 	    		gpa3 = 0.0;
								 	    }
								 	  
							 	    }	
						 	    }	
					 	    }	
				 	    }
			 	    }
		 	    }
	 	    }
 	    }
	    if(weight3.equalsIgnoreCase("r"))
	    {
	    gpa3=gpa3+0;
	    }
	    else 
	    {
	    	if(weight3.equalsIgnoreCase("h"))
	    	{
	    		gpa3=gpa3+1;
	    	}
	    	else
	    	{
	    		if(weight3.equalsIgnoreCase("a"))
	    		{
	    			gpa3=gpa3+1.5;
	    		}
	    	}
	    }
	//grade4
	    if (grade4>=96)
 	    {
	    	lgrade4 = "A";
 	    	gpa4 = 4.5;
 	    }
 	    else
 	    {
 	    	if (grade4>=92)
	 	    {
 	    		lgrade4 = "A";
 	    		gpa4 = 4.0;
	 	    }
	 	    else
	 	    {
	 	    	if (grade4>=88)
		 	    {
	 	    		lgrade4 = "B";
	 	    		gpa4 = 3.5;
		 	    }
		 	    else
		 	    {
		 	    	if (grade4>=84)
			 	    {
		 	    		lgrade4 = "B";
		 	    		gpa4 = 3.0;
			 	    }
			 	    else
			 	    {
			 	    	if (grade4>=80)
				 	    {
			 	    		lgrade4 = "C";
			 	    		gpa4 = 2.5;
				 	    }
				 	    else
				 	    {
				 	    	if (grade4>=76)
					 	    {
				 	    		lgrade4 = "C";
				 	    		gpa4 = 2.0;
					 	    }
					 	    else
					 	    {
					 	    	if (grade4>=72)
						 	    {
					 	    		lgrade4 = "D";
					 	    		gpa4 = 1.5;
						 	    }
						 	    else
						 	    {
						 	    	if (grade4>=68)
							 	    {
						 	    		lgrade4 = "D";
						 	    		gpa4 = 1.0;
							 	    }
							 	    else
							 	    {
							 	    	if (grade4>=0)
								 	    {
							 	    		lgrade4 = "F";
							 	    		gpa4 = 0.0;
								 	    }
								 	  
							 	    }	
						 	    }	
					 	    }	
				 	    }
			 	    }
		 	    }
	 	    }
 	    }
	    if(weight4.equalsIgnoreCase("r"))
	    {
	    gpa4=gpa4+0;
	    }
	    else 
	    {
	    	if(weight4.equalsIgnoreCase("h"))
	    	{
	    		gpa4=gpa4+1;
	    	}
	    	else
	    	{
	    		if(weight4.equalsIgnoreCase("a"))
	    		{
	    			gpa4=gpa4+1.5;
	    		}
	    	}
	    }
	    double gpafinal = (gpa1+gpa2+gpa3+gpa4)/4; 
	 System.out.println("Student Name: "+name);
	 System.out.println(course1+": "+lgrade1);
	 System.out.println(course2+": "+lgrade2);
	 System.out.println(course3+": "+lgrade3);
	 System.out.println(course4+": "+lgrade4);
	 System.out.println("GPA: "+gpafinal);
//<<<<<<blazn' it
	    
	    
	    
	    
	}
	}
   	    