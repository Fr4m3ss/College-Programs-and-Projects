import java.util.*;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ACSL_Enclosure {

	public static void main(String[] args) {
//BEGINNING BRACKETS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	

//Instantiations
int continueornot=0;
Scanner string = new Scanner (System.in);
Scanner num = new Scanner (System.in);

//Actual Code!
//LOOP
while(continueornot==0)	
{
	String expression;
	int x=0;
	int l=0;
	int openBracket=0;
	int closeBracket=0;
	int openBox=0;
	int closeBox=0;
	int openPara=0;
	int closePara=0;
	int passedOpenBracket=0;
	int passedOpenBox=0;
	int passedOpenPara=0;
	int passedClosedBracket=0;
	int passedClosedBox=0;
	int passedClosedPara=0;
	int[] possibilities = new int[99];
//INPUT
System.out.println("-INPUT EXPRESSION BELOW-");
expression = string.nextLine();

//ARRAY INSTANTIATION
String[] expressionArray = new String[expression.length()];

for (int i = 0; i <expressionArray.length; i++) 
{ 
expressionArray[i] = expression.substring(i, i+1);
}

//CHECKING
for (int i = 0; i <expressionArray.length; i++) 
{ 
	if (expressionArray[i].equals("{"))
	{
		openBracket=1;
	}
	if (expressionArray[i].equals("["))
	{
		openBox=1;
	}
	if (expressionArray[i].equals("("))
	{
		openPara=1;
	}
	if (expressionArray[i].equals("}"))
	{
		closeBracket=1;
	}
	if (expressionArray[i].equals("]"))
	{	
		closeBox=1;
	}
	if (expressionArray[i].equals(")"))
	{
		closePara=1;
	}
}

for (int i = 0; i <expressionArray.length; i++) 
{ 
System.out.print(expressionArray[i]);
}

//TESTING
	
	//OPENS
	if(openBracket ==0)
	{
		for (int i = 0; i <expressionArray.length; i++) 
		{ 
			if(expressionArray[i].equals("["))
			{
				passedClosedBox=1;
			}
				if (expressionArray[i].equals("+")||expressionArray[i].equals("-")||expressionArray[i].equals("*")||expressionArray[i].equals("/"))
				{
						if (passedClosedBox==0)
						{
							if(!expressionArray[i].equals("}")&&!expressionArray[i+1].equals("}")&&!expressionArray[i+2].equals("}"))
							possibilities[l] = i;
							l++;	
						}	
				}
			if(expressionArray[i].equals(")"))
			{
				i=expressionArray.length;
			}
		}
	}
	if(openBox ==0)
	{
		for (int i = 0; i <expressionArray.length; i++) 
		{ 
			if(expressionArray[i].equals("{"))
			{
				passedOpenBracket=1;
				possibilities[l] = i+2;
				l++;
			}
			if(expressionArray[i].equals("("))
			{
				passedOpenPara=1;
			}
			if(expressionArray[i].equals(")"))
			{
				passedOpenPara=0;
			}
			if(expressionArray[i].equals("]"))
			{
				passedClosedBox=1;
			}
			if (passedOpenBracket==1)
			{
				if (expressionArray[i].equals("+")||expressionArray[i].equals("-")||expressionArray[i].equals("*")||expressionArray[i].equals("/"))
				{
					if (passedOpenPara==0)
					{
						if (passedClosedBox==0)
						{
							if(!expressionArray[i].equals("]")&&!expressionArray[i+1].equals("]")&&!expressionArray[i+2].equals("]")&&!expressionArray[i+3].equals("]")&&!expressionArray[i+4].equals("]"))
							possibilities[l] = i+2;
							l++;	
						}
					}
				}
			}
			if(expressionArray[i].equals("]"))
			{
				i=expressionArray.length;
			}
		}
	}
	if(openPara ==0)
	{
		for (int i = 0; i <expressionArray.length; i++) 
		{ 
			if(expressionArray[i].equals("["))
			{
				passedOpenBox=1;
				possibilities[l] = i+2;
				l++;
			}
			if(expressionArray[i].equals(")"))
			{
				passedClosedPara=1;
			}
			if (passedOpenBox==1)
			{
				if (expressionArray[i].equals("+")||expressionArray[i].equals("-")||expressionArray[i].equals("*")||expressionArray[i].equals("/"))
				{
						if (passedClosedPara==0)
						{
							if(!expressionArray[i].equals(")")&&!expressionArray[i+1].equals(")")&&!expressionArray[i+2].equals(")")&&!expressionArray[i+3].equals(")")&&!expressionArray[i+4].equals(")"))
							possibilities[l] = i+2;
							l++;	
						}	
				}
			}
			if(expressionArray[i].equals(")"))
			{
				i=expressionArray.length;
			}
		}
	}
	
	//CLOSINGS
	if(closeBracket ==0)
	{
		for (int i = 0; i <expressionArray.length; i++) 
		{ 
			if(expressionArray[i].equals("]"))
			{
				passedClosedBox=1;
			}
			if (passedClosedBox==1)
			{
				if (expressionArray[i].equals("+")||expressionArray[i].equals("-")||expressionArray[i].equals("*")||expressionArray[i].equals("/"))
				{
					possibilities[l] = i+1;
					l++;		
				}
			}
			if(i==expressionArray.length-1)
			{
				possibilities[l] = i+2;
				l++;;
			}
		}
	}
	if(closeBox ==0)
	{
		for (int i = 0; i <expressionArray.length; i++) 
		{ 
			if(expressionArray[i].equals("["))
			{
				passedOpenBox=1;
			}
			if(expressionArray[i].equals(")"))
			{
				passedClosedPara=1;	
			}
			if (passedOpenBox==1)
			{
				if (expressionArray[i].equals("+")||expressionArray[i].equals("-")||expressionArray[i].equals("*")||expressionArray[i].equals("/"))
				{
					if (passedClosedPara==1)
					{
							possibilities[l] = i+1;
							l++;	
					}
				}
			}
			if(expressionArray[i].equals("}"))
			{
				possibilities[l] = i+1;
				l++;
			}
		}
	}
	if(closePara ==0)
	{
		for (int i = 0; i <expressionArray.length; i++) 
		{ 
			if(expressionArray[i].equals("("))
			{
				passedOpenPara=1;
			}
			if (passedOpenPara==1)
			{
				if (expressionArray[i].equals("+")||expressionArray[i].equals("-")||expressionArray[i].equals("*")||expressionArray[i].equals("/"))
				{
							if(!expressionArray[i].equals("(")&&!expressionArray[i-1].equals("(")&&!expressionArray[i-2].equals("(")&&!expressionArray[i-3].equals("(")&&!expressionArray[i-4].equals("("))
							possibilities[l] = i+1;
							l++;		
				}
			}
			if(expressionArray[i].equals("]"))
			{
				possibilities[l] = i+1;
				l++;
			}
		}
	}
		
//PRINTING
System.out.println();
for (int i = 0; i <possibilities.length; i++) 
{ 
if(possibilities[i]!=0)
{
System.out.print(possibilities[i]+",");
}
}

//CONTINUE OR NO?	
System.out.println();
}		
		
//END BRACKETS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
}

}
