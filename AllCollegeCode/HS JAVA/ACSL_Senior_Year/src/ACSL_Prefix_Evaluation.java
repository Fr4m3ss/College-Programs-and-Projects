import java.io.*;
import java.util.*;

//import org.omg.Messaging.SyncScopeHelper;
public class ACSL_Prefix_Evaluation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("prefixtest.txt"));
		int c=0;
		while(c<5)
		{
		String tempEquation = input.nextLine();
		String[] equation = tempEquation.split(" ");
		equation=evaluate(equation);
		for(int i = 0; i<equation.length;i++)
		{
			System.out.print(equation[i]);
		}
		System.out.println();
		c++;
		}
	}
	public static String[] evaluate(String[] equation)
	{
		if(equation.length!=1)
		{
			for(int i = 0; i<equation.length;i++)
			{
				int tempVariable=0;
				String tempEq = "";
			if(equation[i].equals("+"))
			{
				if(!equation[i+1].equals("+")&&!equation[i+1].equals("-")&&!equation[i+1].equals("*")&&!equation[i+1].equals("/")&&!equation[i+1].equals("|")&&!equation[i+1].equals("@")&&!equation[i+1].equals(">")&&		!equation[i+2].equals("+")&&!equation[i+2].equals("-")&&!equation[i+2].equals("*")&&!equation[i+2].equals("/")&&!equation[i+2].equals("|")&&!equation[i+2].equals("@")&&!equation[i+2].equals(">"))	
				{
					tempVariable=Integer.parseInt(equation[i+1])+Integer.parseInt(equation[i+2]);
					for(int j = 0; j<i;j++)
					{
							tempEq=tempEq+" "+equation[j];
					}
					tempEq=tempEq+" "+tempVariable;
					for(int j = i+3; j<equation.length;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					equation = tempEq.split(" ");
					return evaluate(equation);
				}
			}
			if(equation[i].equals("-"))
			{
				if(!equation[i+1].equals("+")&&!equation[i+1].equals("-")&&!equation[i+1].equals("*")&&!equation[i+1].equals("/")&&!equation[i+1].equals("|")&&!equation[i+1].equals("@")&&!equation[i+1].equals(">")&&		!equation[i+2].equals("+")&&!equation[i+2].equals("-")&&!equation[i+2].equals("*")&&!equation[i+2].equals("/")&&!equation[i+2].equals("|")&&!equation[i+2].equals("@")&&!equation[i+2].equals(">"))	
				{
					tempVariable=Integer.parseInt(equation[i+1])-Integer.parseInt(equation[i+2]);
					for(int j = 0; j<i;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					tempEq=tempEq+" "+tempVariable;
					for(int j = i+3; j<equation.length;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					equation = tempEq.split(" ");
					return evaluate(equation);
				}
			}
			if(equation[i].equals("*"))
			{
				if(!equation[i+1].equals("+")&&!equation[i+1].equals("-")&&!equation[i+1].equals("*")&&!equation[i+1].equals("/")&&!equation[i+1].equals("|")&&!equation[i+1].equals("@")&&!equation[i+1].equals(">")&&		!equation[i+2].equals("+")&&!equation[i+2].equals("-")&&!equation[i+2].equals("*")&&!equation[i+2].equals("/")&&!equation[i+2].equals("|")&&!equation[i+2].equals("@")&&!equation[i+2].equals(">"))	
				{
					tempVariable=Integer.parseInt(equation[i+1])*Integer.parseInt(equation[i+2]);
					for(int j = 0; j<i;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					tempEq=tempEq+" "+tempVariable;
					for(int j = i+3; j<equation.length;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					equation = tempEq.split(" ");
					return evaluate(equation);
				}
			}
			if(equation[i].equals("/"))
			{
				if(!equation[i+1].equals("+")&&!equation[i+1].equals("-")&&!equation[i+1].equals("*")&&!equation[i+1].equals("/")&&!equation[i+1].equals("|")&&!equation[i+1].equals("@")&&!equation[i+1].equals(">")&&		!equation[i+2].equals("+")&&!equation[i+2].equals("-")&&!equation[i+2].equals("*")&&!equation[i+2].equals("/")&&!equation[i+2].equals("|")&&!equation[i+2].equals("@")&&!equation[i+2].equals(">"))	
				{
					tempVariable=Integer.parseInt(equation[i+1])/Integer.parseInt(equation[i+2]);
					for(int j = 0; j<i;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					tempEq=tempEq+" "+tempVariable;
					for(int j = i+3; j<equation.length;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					equation = tempEq.split(" ");
					return evaluate(equation);
				}
			}
			if(equation[i].equals("|"))
			{
				if(!equation[i+1].equals("+")&&!equation[i+1].equals("-")&&!equation[i+1].equals("*")&&!equation[i+1].equals("/")&&!equation[i+1].equals("|")&&!equation[i+1].equals("@")&&!equation[i+1].equals(">"))	
				{
					tempVariable=Math.abs(Integer.parseInt(equation[i+1]));
					for(int j = 0; j<i;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					tempEq=tempEq+" "+tempVariable;
					for(int j = i+2; j<equation.length;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					equation = tempEq.split(" ");
					return evaluate(equation);
				}
			}
			if(equation[i].equals("@"))
			{
				if(!equation[i+1].equals("+")&&!equation[i+1].equals("-")&&!equation[i+1].equals("*")&&!equation[i+1].equals("/")&&!equation[i+1].equals("|")&&!equation[i+1].equals("@")&&!equation[i+1].equals(">")&&	!equation[i+2].equals("+")&&!equation[i+2].equals("-")&&!equation[i+2].equals("*")&&!equation[i+2].equals("/")&&!equation[i+2].equals("|")&&!equation[i+2].equals("@")&&!equation[i+2].equals(">")&&!equation[i+3].equals("+")&&!equation[i+3].equals("-")&&!equation[i+3].equals("*")&&!equation[i+3].equals("/")&&!equation[i+3].equals("|")&&!equation[i+3].equals("@")&&!equation[i+3].equals(">"))	
				{
					if(Integer.parseInt(equation[i+1])>0)
					{
						tempVariable=Integer.parseInt(equation[i+2]);
					}
					else
					{
						tempVariable=Integer.parseInt(equation[i+3]);
					}
					for(int j = 0; j<i;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					tempEq=tempEq+" "+tempVariable;
					for(int j = i+4; j<equation.length;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					equation = tempEq.split(" ");
					return evaluate(equation);
				}
			}
			if(equation[i].equals(">"))
			{
				if(!equation[i+1].equals("+")&&!equation[i+1].equals("-")&&!equation[i+1].equals("*")&&!equation[i+1].equals("/")&&!equation[i+1].equals("|")&&!equation[i+1].equals("@")&&!equation[i+1].equals(">")&&	!equation[i+2].equals("+")&&!equation[i+2].equals("-")&&!equation[i+2].equals("*")&&!equation[i+2].equals("/")&&!equation[i+2].equals("|")&&!equation[i+2].equals("@")&&!equation[i+2].equals(">")&&!equation[i+3].equals("+")&&!equation[i+3].equals("-")&&!equation[i+3].equals("*")&&!equation[i+3].equals("/")&&!equation[i+3].equals("|")&&!equation[i+3].equals("@")&&!equation[i+3].equals(">"))	
				{
					if(Integer.parseInt(equation[i+1])>Integer.parseInt(equation[i+2])&&Integer.parseInt(equation[i+1])>Integer.parseInt(equation[i+3]))
					{
						tempVariable=Integer.parseInt(equation[i+1]);
					}
					else if(Integer.parseInt(equation[i+2])>Integer.parseInt(equation[i+1])&&Integer.parseInt(equation[i+2])>Integer.parseInt(equation[i+3]))
					{
						tempVariable=Integer.parseInt(equation[i+2]);
					} 
					else if(Integer.parseInt(equation[i+3])>Integer.parseInt(equation[i+2])&&Integer.parseInt(equation[i+3])>Integer.parseInt(equation[i+1]))
					{
						tempVariable=Integer.parseInt(equation[i+3]);
					} 
					for(int j = 0; j<i;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					tempEq=tempEq+" "+tempVariable;
					for(int j = i+4; j<equation.length;j++)
					{
						tempEq=tempEq+" "+equation[j];
					}
					equation = tempEq.split(" ");
					return evaluate(equation);
				}
			}
			}
		}
		return equation;
	}
}
