import java.util.Scanner;
public class Gpa_Revised {

	/**
	 * @param args
	 */
	public static String letterGrade(double numbergradetemp) 
	{
	   String lettergradetemp = "O Boi";
	   
		if (numbergradetemp >= 96)    
		  {
		    lettergradetemp = "A";
		    
		  }
		  else if (numbergradetemp <= 95 && numbergradetemp >= 92)
		  {
		    lettergradetemp = "A";
		   
		  }
		  else if (numbergradetemp <= 91 && numbergradetemp >= 88)
		  {
		    lettergradetemp = "B";
		    
		  }
		  else if (numbergradetemp <= 87 && numbergradetemp >= 84)
		  {
		    lettergradetemp = "B";
		  }
		  else if (numbergradetemp <= 83 && numbergradetemp >= 80)
		  {
		    lettergradetemp = "C";
		    
		  }
		  else if (numbergradetemp <= 79 && numbergradetemp >= 76)
		  {
		    lettergradetemp = "C";
		    
		  }
		  else if (numbergradetemp <= 75 && numbergradetemp >= 72)
		  {
		    lettergradetemp = "D";
		   
		  }
		  else if (numbergradetemp <= 71 && numbergradetemp >= 68)
		  {
		    lettergradetemp = "D";
		   
		  }
		  else if (numbergradetemp <= 67)
		  {
		    lettergradetemp = "F";
		   
		  }
		  return lettergradetemp;	
	}
	public static double gpa(double lettergradetemp) 
	{
		 double gpatemp = 0;
		  if (lettergradetemp >= 96)    
		  {
		    gpatemp = 4.5;
		  }
		  else if (lettergradetemp <= 95 && lettergradetemp >= 92)
		  {
		    gpatemp = 4.0;
		  }
		  else if (lettergradetemp <= 91 && lettergradetemp >= 88)
		  {
		    gpatemp = 3.5;
		  }
		  else if (lettergradetemp <= 87 && lettergradetemp >= 84)
		  {
		    gpatemp = 3.0;
		  }
		  else if (lettergradetemp <= 83 && lettergradetemp >= 80)
		  {
		    gpatemp = 2.5;
		  }
		  else if (lettergradetemp <= 79 && lettergradetemp >= 76)
		  {
		    gpatemp = 2.0;
		  }
		  else if (lettergradetemp <= 75 && lettergradetemp >= 72)
		  {
		    gpatemp = 1.5;
		  }
		  else if (lettergradetemp <= 71 && lettergradetemp >= 68)
		  {
		    gpatemp = 1.0;
		  }
		  else if (lettergradetemp <= 67)
		  {
		    gpatemp = 0.0;
		  }
		  return gpatemp;
		 }
	public static double weight(String weight) 
	{
		double weightextra = 0;
		if (weight.equalsIgnoreCase("r"))
		{
		weightextra=0;	
		}
		
		if (weight.equalsIgnoreCase("h"))
		{
			weightextra=1.0;	
		}
		
		if (weight.equalsIgnoreCase("a"))
		{
			weightextra=1.5;	
		}
		return weightextra;
	}
	public static double avgGpa(double tempgpa1, double tempgpa2, double tempgpa3, double tempgpa4) 
	{
		double temptotalgpa;
		  temptotalgpa = (tempgpa1 + tempgpa2 + tempgpa3 + tempgpa4) / 4.0;
		  return temptotalgpa;
	}
	public static void main(String[] args)
	{
	Scanner num = new Scanner(System.in);
	Scanner string = new Scanner(System.in);
	
	String classname1, classname2, classname3, classname4;
	String classweight1, classweight2, classweight3, classweight4;
	double classgrade1, classgrade2, classgrade3, classgrade4;
	
	System.out.println("Name of student>>>>> ");
	String name = string.nextLine();
	
	System.out.println("Name of class 1>>>> ");
	classname1 = string.nextLine();
	System.out.println("Weight of class 1 (r)regular (h)Honors (a)ap >>>> ");
	classweight1 = string.nextLine();
	System.out.println("Grade of class 1>>>> ");
	classgrade1 = num.nextDouble();
	
	
	System.out.println("Name of class 2>>>> ");
	classname2 = string.nextLine();
	System.out.println("Weight of class 2 (r)regular (h)Honors (a)ap >>>> ");
	classweight2 = string.nextLine();
	System.out.println("Grade of class 2>>>> ");
	classgrade2 = num.nextDouble();
	
	
	System.out.println("Name of class 3>>>> ");
	classname3 = string.nextLine();
	System.out.println("Weight of class 3 (r)regular (h)Honors (a)ap >>>> ");
	classweight3 = string.nextLine();
	System.out.println("Grade of class 3>>>> ");
	classgrade3 = num.nextDouble();
	
	
	System.out.println("Name of class 4>>>> ");
	classname4 = string.nextLine();
	System.out.println("Weight of class 4 (r)regular (h)Honors (a)ap >>>> ");
	classweight4 = string.nextLine();
	System.out.println("Grade of class 4>>>> ");
	classgrade4 = num.nextDouble();
	
	double gpa1 = gpa(classgrade1) + weight(classweight1);
	double gpa2 = gpa(classgrade2)+ weight(classweight2);
	double gpa3 = gpa(classgrade3) + weight(classweight3);
	double gpa4 = gpa(classgrade4) + weight(classweight4);
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Students Name- "+name);
	System.out.println(classname1+"- "+letterGrade(classgrade1));
	System.out.println(classname2+"- "+letterGrade(classgrade2));
	System.out.println(classname3+"- "+letterGrade(classgrade3));
	System.out.println(classname4+"- "+letterGrade(classgrade4));
	System.out.println("GPA- "+ avgGpa(gpa1, gpa2, gpa3, gpa4));
	}

}
