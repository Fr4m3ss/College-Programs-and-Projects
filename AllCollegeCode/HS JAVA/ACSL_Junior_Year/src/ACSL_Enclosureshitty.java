import java.util.*;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ACSL_Enclosureshitty {

	public static void main(String[] args) {
//BEGINNING BRACKETS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	

//Instantiations
int continueornot=0;
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
String regex = "(?<=[-+*/()])|(?=[-+*/()])";
Scanner string = new Scanner (System.in);
Scanner num = new Scanner (System.in);

//Actual Code!
//LOOP
while(continueornot==0)	
{
	
//INPUT
System.out.println("-INPUT EXPRESSION BELOW-");
expression = string.nextLine();
expression.split(regex);

//ARRAY INSTANTIATION
for (int i = 0; i <expression.split(regex).length; i++) 
{ 
x++;
}
String[] expressionArray = new String[x];

for (int i = 0; i <expressionArray.length; i++) 
{ 
expressionArray[i] = expression.split(regex)[i];
}

//CHECKING
for (int i = 0; i <expressionArray.length; i++) 
{ 
	if (expressionArray[i]== "{" )
	{
		openBracket=1;
	}
	if (expressionArray[i]== "[" )
	{
		openBox=1;
	}
	if (expressionArray[i]== "(" )
	{
		openPara=1;
	}
	if (expressionArray[i]== "}" )
	{
		closeBracket=1;
	}
	if (expressionArray[i]== "]" )
	{	
		closeBox=1;
	}
	if (expressionArray[i]== ")" )
	{
		closePara=1;
	}
}

for (int i = 0; i <expressionArray.length; i++) 
{ 
System.out.print(expressionArray[i]);
}
System.out.println();
System.out.println(expressionArray.length);
System.out.println(openBracket+openBox+openPara+closeBracket+closeBox+closePara);

//TESTING
	
	//OPENS
	String[] possibilities = new String[99];
	if(openBracket ==0)
	{
	for (int i = 0; i <1; i++) 
	{ 
	possibilities[i] = "1";
	}
	}
	if(openBox ==0)
	{
		for (int i = 0; i <expressionArray.length; i++) 
		{ 
			if(expressionArray[i]=="]")
			{
				i=expressionArray.length;
			}
			if(expressionArray[i]=="{")
			{
				passedOpenBracket=1;
				possibilities[l] = expressionArray[i+1];
				l++;
			}
			if (passedOpenBracket==1)
			{
				if (expressionArray[i]=="+"||expressionArray[i]=="-"||expressionArray[i]=="*"||expressionArray[i]=="/")
				{
					possibilities[l] = expressionArray[i+1];
					l++;
				}
			}
		}
	}
	if(openPara ==0)
	{
		
	}
	
	//CLOSINGS
	if(closeBracket ==0)
	{
		
	}
	if(closeBox ==0)
	{
		
	}
	if(closePara ==0)
	{
		
	}
		
//PRINTING
for (int i = 0; i <possibilities.length; i++) 
{ 
if(possibilities[i]!=null)
{
System.out.print(possibilities[i]+", ");
}
}

//CONTINUE OR NO?	
System.out.println();
System.out.println("Would you like to run again? Yes(0) or No(1)");
continueornot = num.nextInt();
}		
		
//END BRACKETS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
}

}
