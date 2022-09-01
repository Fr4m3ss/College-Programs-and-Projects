import java.util.*;
import java.io.*;
import java.awt.*;
import java.applet.Applet;

/**
 * @author maxrosenberg and Framess
 *
 */
public class Chemputer_Final {
	public void main(String[] args) {
        //Intstantiantions~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		int cont = 1;
		//Program~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		while(cont==1)
		{
			String [] PerTab= {"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","CrII","CrIII","MnII","MnIII","FeII","FeIII","CoII","CoIII","NiII","NiIII","CuI","CuII","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","SnII","SnIV","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","AuI","AuIII","HgI","HgII","Tl","PbII","PbIV","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt"};
			String [] PolyTab= {"H2PO4","HCO3","HSO3","HSO4","C2H3O2","OH","MnO4","CN","ClO","ClO2","ClO3","ClO4","NO2","NO3","HPO4","CO3","SO3","SO4","S2O3","C2O4","CrO4","Cr2O7","SiO3","PO4","PO3","BO3","AsO4","NH4","H3O"};
			int [] PerTabVal= {1,0,1,2,3,4,-3,-2,-1,0,1,2,3,4,-3,-2,-1,0,1,2,0,0,0,2,3,2,3,2,3,2,3,2,3,1,2,2,3,4,-3,-2,-1,0,1,2,0,0,0,0,0,0,0,0,1,2,3,2,4,-3,-2,-1,0,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,1,2,3,2,4,-3,-2,-1,0,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			int [] PerTabValNeg= {1,0,1,2,3,-4,-3,-2,-1,0,1,2,3,-4,-3,-2,-1,0,1,2,0,0,0,2,3,2,3,2,3,2,3,2,3,1,2,2,3,-4,-3,-2,-1,0,1,2,0,0,0,0,0,0,0,0,1,2,3,2,-4,-3,-2,-1,0,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,1,2,3,2,-4,-3,-2,-1,0,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			int [] PolyTabVal= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-2,-2,-2,-2,-2,-2,-2,-2,-2,-3,-3,-3,-3,1,1};
			Scanner inputstr = new Scanner(System.in); 
			Scanner inputnum = new Scanner(System.in); 
			int firstElChar=0;
			int secondElChar=0;
			int firstEl1Char=0;
			int secondEl1Char=0;
			int firstEl2Char=0;
			int secondEl2Char=0;
			String firstDouble="";
			String secondDouble="";
			String thirdDouble="";
			String fourthDouble="";
			Double c1=1.0;
			Double c2=1.0;
			Double c3=1.0;
			Double c4=1.0;
			int s1=0;
			int s2=0;
			int s3=0; 
			int s4=0;
			int s5=0;
			int s6=0;
			int s7=0;
			int s8=0;
			
			System.out.println("(1) Synthesis reaction or (2)Double Replacement Reaction?");
			int choice = inputnum.nextInt();
		
			
			
// CHOICE 1 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~			
		if(choice==1)
		{
		System.out.println("What is your first element?");
		String firstEl = inputstr.nextLine();
		System.out.println("What is your second element?");
		String secondEl = inputstr.nextLine();
		for(int i=0;i<PerTab.length;i++)
		{
			if(firstEl.equals(PerTab[i]))
			{
				firstElChar=PerTabVal[i];
			}
			if(secondEl.equals(PerTab[i]))
			{
				secondElChar=PerTabValNeg[i];
			}
		}
		for(int i=0;i<PolyTab.length;i++)
		{
			if(firstEl.equals(PolyTab[i]))
			{
				firstElChar=PolyTabVal[i];
			}
			if(secondEl.equals(PolyTab[i]))
			{
				secondElChar=PolyTabVal[i];
			}	
		}
		
		if(firstElChar+secondElChar==0)
		{
			System.out.println(firstEl+secondEl);
		}
		else if((2*firstElChar)+secondElChar==0)
		{
			System.out.println(firstEl+"₂"+secondEl);
		}
		else if(firstElChar+(2*secondElChar)==0)
		{
			System.out.println(firstEl+secondEl+"₂");
		}
		else if((3*firstElChar)+secondElChar==0)
		{
			System.out.println(firstEl+"₃"+secondEl);
		}
		else if(firstElChar+(3*secondElChar)==0)
		{
			System.out.println(firstEl+secondEl+"₃");
		}
		else if((4*firstElChar)+secondElChar==0)
		{
			System.out.println(firstEl+"₄"+secondEl);
		}
		else if(firstElChar+(4*secondElChar)==0)
		{
			System.out.println(firstEl+secondEl+"₄");
		}
		else if((2*firstElChar)+(3*secondElChar)==0)
		{
			System.out.println(firstEl+"₂"+secondEl+"₃");
		}
		else if((3*firstElChar)+(2*secondElChar)==0)
		{
			System.out.println(firstEl+"₃"+secondEl+"₂");
		}
		else 
		{
			System.out.println("Invalid combination: Please try again");
		}
		
		
		
		
		System.out.println("Run again? (1) Yes (2-Infinity) No");
		cont = inputnum.nextInt();
		if(cont !=1)
		{
			System.out.println("Goodbye!");
		}
		}
// CHOICE 2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
		
		
		
		else if(choice==2)
		{
			System.out.println("What is the first element of your first compound?");
			String firstEl1 = inputstr.nextLine();
			System.out.println("What is the second element of your first compound?");
			String secondEl1 = inputstr.nextLine();
			
			System.out.println("What is the first element of your second compound?");
			String firstEl2 = inputstr.nextLine();
			System.out.println("What is the second element of your second compound?");
			String secondEl2 = inputstr.nextLine();
			
			for(int i=0;i<PerTab.length;i++)
			{
				if(firstEl1.equals(PerTab[i]))
				{
					firstEl1Char=PerTabVal[i];
				}
				if(secondEl1.equals(PerTab[i]))
				{
					secondEl1Char=PerTabValNeg[i];
				}
				if(firstEl2.equals(PerTab[i]))
				{
					firstEl2Char=PerTabVal[i];
				}
				if(secondEl2.equals(PerTab[i]))
				{
					secondEl2Char=PerTabValNeg[i];
				}
			}
			for(int i=0;i<PolyTab.length;i++)
			{
				if(firstEl1.equals(PolyTab[i]))
				{
					firstEl1Char=PolyTabVal[i];
				}
				if(secondEl1.equals(PolyTab[i]))
				{
					secondEl1Char=PolyTabVal[i];
				}
				if(firstEl2.equals(PolyTab[i]))
				{
					firstEl2Char=PolyTabVal[i];
				}
				if(secondEl2.equals(PolyTab[i]))
				{
					secondEl2Char=PolyTabVal[i];
				}
			}
			if(firstEl1Char+secondEl1Char==0)
			{
				firstDouble=(firstEl1+secondEl1);
				s1=1;
				s2=1;
			}
			else if((2*firstEl1Char)+secondEl1Char==0)
			{
				firstDouble=(firstEl1+"₂"+secondEl1);
				s1=2;
				s2=1;
			}
			else if(firstEl1Char+(2*secondEl1Char)==0)
			{
				firstDouble=(firstEl1+secondEl1+"₂");
				s1=1;
				s2=2;
			}
			else if((3*firstEl1Char)+secondEl1Char==0)
			{
				firstDouble=(firstEl1+"₃"+secondEl1);
				s1=3;
				s2=1;
			}
			else if(firstEl1Char+(3*secondEl1Char)==0)
			{
				firstDouble=(firstEl1+secondEl1+"₃");
				s1=1;
				s2=3;
			}
			else if((4*firstEl1Char)+secondEl1Char==0)
			{
				firstDouble=(firstEl1+"₄"+secondEl1);
				s1=4;
				s2=1;
			}
			else if(firstEl1Char+(4*secondEl1Char)==0)
			{
				firstDouble=(firstEl1+secondEl1+"₄");
				s1=1;
				s2=4;
			}
			else if((2*firstEl1Char)+(3*secondEl1Char)==0)
			{
				firstDouble=(firstEl1+"₂"+secondEl1+"₃");
				s1=2;
				s2=3;
			}
			else if((3*firstEl1Char)+(2*secondEl1Char)==0)
			{
				firstDouble=(firstEl1+"₃"+secondEl1+"₂");
				s1=3;
				s2=2;
			}
			else 
			{
				System.out.println("Invalid combination: Please try again");
			}
			if(firstEl2Char+secondEl2Char==0)
			{
				secondDouble=(firstEl2+secondEl2);
				s3=1;
				s4=1;
			}
			else if((2*firstEl2Char)+secondEl2Char==0)
			{
				secondDouble=(firstEl2+"₂"+secondEl2);
				s3=2;
				s4=1;
			}
			else if(firstEl2Char+(2*secondEl2Char)==0)
			{
				secondDouble=(firstEl2+secondEl2+"₂");
				s3=1;
				s4=2;
			}
			else if((3*firstEl2Char)+secondEl2Char==0)
			{
				secondDouble=(firstEl2+"₃"+secondEl2);
				s3=3;
				s4=1;
			}
			else if(firstEl2Char+(3*secondEl2Char)==0)
			{
				secondDouble=(firstEl2+secondEl2+"₃");
				s3=1;
				s4=3;
			}
			else if((4*firstEl2Char)+secondEl2Char==0)
			{
				secondDouble=(firstEl2+"₄"+secondEl2);
				s3=4;
				s4=1;
			}
			else if(firstEl2Char+(4*secondEl2Char)==0)
			{
				secondDouble=(firstEl2+secondEl2+"₄");
				s3=1;
				s4=4;
			}
			else if((2*firstEl2Char)+(3*secondEl2Char)==0)
			{
				secondDouble=(firstEl2+"₂"+secondEl2+"₃");
				s3=2;
				s4=3;
			}
			else if((3*firstEl2Char)+(2*secondEl2Char)==0)
			{
				secondDouble=(firstEl2+"₃"+secondEl2+"₂");
				s3=3;
				s4=2;
			}
			else 
			{
				System.out.println("Invalid combination: Please try again");
			}
			if(firstEl1Char+secondEl2Char==0)
			{
				thirdDouble=(firstEl1+secondEl2);
				s5=1;
				s6=1;
			}
			else if((2*firstEl1Char)+secondEl2Char==0)
			{
				thirdDouble=(firstEl1+"₂"+secondEl2);
				s5=2;
				s6=1;
			}
			else if(firstEl1Char+(2*secondEl2Char)==0)
			{
				thirdDouble=(firstEl1+secondEl2+"₂");
				s5=1;
				s6=2;
			}
			else if((3*firstEl1Char)+secondEl2Char==0)
			{
				thirdDouble=(firstEl1+"₃"+secondEl2);
				s5=3;
				s6=1;
			}
			else if(firstEl1Char+(3*secondEl2Char)==0)
			{
				thirdDouble=(firstEl1+secondEl2+"₃");
				s5=1;
				s6=3;
			}
			else if((4*firstEl1Char)+secondEl2Char==0)
			{
				thirdDouble=(firstEl1+"₄"+secondEl2);
				s5=4;
				s6=1;
			}
			else if(firstEl1Char+(4*secondEl2Char)==0)
			{
				thirdDouble=(firstEl1+secondEl2+"₄");
				s5=1;
				s6=4;
			}
			else if((2*firstEl1Char)+(3*secondEl2Char)==0)
			{
				thirdDouble=(firstEl1+"₂"+secondEl2+"₃");
				s5=2;
				s6=3;
			}
			else if((3*firstEl1Char)+(2*secondEl2Char)==0)
			{
				thirdDouble=(firstEl1+"₃"+secondEl2+"₂");
				s5=3;
				s6=2;
			}
			else 
			{
				System.out.println("Invalid combination: Please try again");
			}
			if(firstEl2Char+secondEl1Char==0)
			{
				fourthDouble=(firstEl2+secondEl1);
				s7=1;
				s8=1;
			}
			else if((2*firstEl2Char)+secondEl1Char==0)
			{
				fourthDouble=(firstEl2+"₂"+secondEl1);
				s7=2;
				s8=1;
			}
			else if(firstEl2Char+(2*secondEl1Char)==0)
			{
				fourthDouble=(firstEl2+secondEl1+"₂");
				s7=1;
				s8=2;
			}
			else if((3*firstEl2Char)+secondEl1Char==0)
			{
				fourthDouble=(firstEl2+"₃"+secondEl1);
				s7=3;
				s8=1;
			}
			else if(firstEl2Char+(3*secondEl1Char)==0)
			{
				fourthDouble=(firstEl2+secondEl1+"₃");
				s7=1;
				s8=3;
			}
			else if((4*firstEl2Char)+secondEl1Char==0)
			{
				fourthDouble=(firstEl2+"₄"+secondEl1);
				s7=4;
				s8=1;
			}
			else if(firstEl2Char+(4*secondEl1Char)==0)
			{
				fourthDouble=(firstEl2+secondEl1+"₄");
				s7=1;
				s8=4;
			}
			else if((2*firstEl2Char)+(3*secondEl1Char)==0)
			{
				fourthDouble=(firstEl2+"₂"+secondEl1+"₃");
				s7=2;
				s8=3;
			}
			else if((3*firstEl2Char)+(2*secondEl1Char)==0)
			{
				fourthDouble=(firstEl2+"₃"+secondEl1+"₂");
				s7=3;
				s8=2;
			}
			else 
			{
				System.out.println("Invalid combination: Please try again");
			}
			
			
			//PRINTING THE ACTUAL BALANCE HELL YEAH BOI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			if((c1*s1)!=(c3*s5)||(c1*s2)!=(c3*s8)||(c2*s3)!=(c4*s7)||(c2*s4)!=(c4*s6))
			{
				c1=2.0;
				c4=(c1*s2)/s8;
				c2=(c4*s7)/s3;
				c3=(c2*s4)/s6;
			}
			
				int p5 = c1.intValue();
				int p6 = c2.intValue();
				int p7 = c3.intValue();
				int p8 = c4.intValue();

				String p1=String.valueOf(p5);
				String p2=String.valueOf(p6);
				String p3=String.valueOf(p7);
				String p4=String.valueOf(p8);
				
				if(p1.equals("1"))
				{
					p1="";
				}
				if(p2.equals("1"))
				{
					p2="";
				}
				if(p3.equals("1"))
				{
					p3="";
				}
				if(p4.equals("1"))
				{
					p4="";
				}
				
				System.out.println(p1+firstDouble+" + "+p2+secondDouble+" => "+p3+thirdDouble+" + "+p4+fourthDouble);
		
		
				
			
			System.out.println("Run again? (1) Yes (2-Infinity) No");
			cont = inputnum.nextInt();
			if(cont !=1)
			{
				System.out.println("Goodbye!");
			}
		}
		
		else
		{
			System.out.println("Error, incorrect input, please try again.");
		}
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
}
	

}