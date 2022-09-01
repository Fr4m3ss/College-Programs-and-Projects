import java.util.Scanner;
import java.util.*;

public class ACSL_Walker {

    public static void main(String[] args) {
        //Instantiations
        Scanner string = new Scanner (System.in);
        Scanner num = new Scanner (System.in);
        int repeat=0;

    int [][] array = new int [9][9];

    /*for (int i=9;i>1;i--)
    {
        for (int j=1;j<=array.length;j++)
        {
        	array[i][j]=octnum[j];
        }
    }*/

//////////////////////////////
  
   for(int r=8; r>0; r--) {
	   
	   int i=1;

	    int octnum[] =new int[9];	//Octal Value in Array

	    Scanner in= new Scanner(System.in);

	    // now convert decimal to octal

	    int decnum = hex2decimal(in.next());	//decnum = val = dec

	    while(decnum != 0)

	    {

	       octnum[i++] = decnum%8;

	       decnum = decnum/8;


	    }
	   
	    for(int c=1; c<9; c++)
	   {
		   array[r][c]=octnum[c];
		   
	   }
   }
   
   for(int r=8; r>0; r--) 
   {
	   System.out.println();
	   for(int c=8; c>0; c--)
	   {
		   System.out.print(array[r][c]+" ");
	   }
   }
   for(int i=5; i>=0; i--)
   {
  System.out.println("Input your data");
  int inputy = num.nextInt();
  int inputx = num.nextInt();
  String inputdir = string.nextLine();
  int inputmoves = num.nextInt();
  while(repeat<=inputmoves)
  {
	  String temp = inputdir;
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("U"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputy=inputy+1;
			  inputx=inputx+1;
			  inputdir="DL";
		  }
	  }
	  if(inputdir.equals("U"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputx=inputx+1;
			  inputdir="L";
		  }
	  }
	  if(inputdir.equals("U"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputy=inputy-1;
			  inputx=inputx+1;
			  inputdir="UL";
		  }
	  }
	  if(inputdir.equals("U"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputy=inputy-1;
			  inputdir="U";
		  }
	  }
	  if(inputdir.equals("U"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputy=inputy-1;
			  inputx=inputx-1;
			  inputdir="UR";
		  } 
	  }
	  if(inputdir.equals("U"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputx=inputx-1;
			  inputdir="R";
		  }
	  }
	  if(inputdir.equals("U"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputy=inputy+1;
			  inputx=inputx-1;
			  inputdir="DR";
		  }
	  }
	  }
	  //ALL OF THE RS-----------------------------------------------------------
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("R"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputy=inputy-1;
			  inputx=inputx+1;
			  inputdir="UL";
		  }
	  }
	  if(inputdir.equals("R"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputy=inputy-1;
			  inputdir="U";
		  }
	  }
	  if(inputdir.equals("R"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputy=inputy-1;
			  inputx=inputx-1;
			  inputdir="UR";
		  }
	  }
	  if(inputdir.equals("R"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputx=inputx-1;
			  inputdir="R";
		  }
	  }
	  if(inputdir.equals("R"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputy=inputy+1;
			  inputx=inputx-1;
			  inputdir="DR";
		  }
	  }
	  if(inputdir.equals("R"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputy=inputy+1;
			  inputdir="D";
		  }
	  }
	  if(inputdir.equals("R"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputy=inputy+1;
			  inputx=inputx+1;
			  inputdir="DL";
		  }
	  }
	  }
	  //ALL OF THE LS--------------------------------------------------
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("L"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputy=inputy+1;
			  inputx=inputx-1;
			  inputdir="DR";
		  }
	  }
	  if(inputdir.equals("L"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputy=inputy+1;
			  inputdir="D";
		  }
	  }
	  if(inputdir.equals("L"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputy=inputy+1;
			  inputx=inputx+1;
			  inputdir="DL";
		  }
	  }
	  if(inputdir.equals("L"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputx=inputx+1;
			  inputdir="L";
		  }
	  }
	  if(inputdir.equals("L"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputx=inputx+1;
			  inputy=inputy-1;
			  inputdir="UL";
		  }
	  }
	  if(inputdir.equals("L"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputy=inputy-1;
			  inputdir="U";
		  }
	  }
	  if(inputdir.equals("L"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputx=inputx-1;
			  inputy=inputy-1;
			  inputdir="UR";
		  }
	  }
	  }
	  //ALL OF THE DS-------------------------------------------------------------------
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("D"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputx=inputx-1;
			  inputy=inputy-1;
			  inputdir="UR";
		  }
	  }
	  if(inputdir.equals("D"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputx=inputx-1;
			  inputdir="R";
		  }
	  }
	  if(inputdir.equals("D"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputx=inputx-1;
			  inputy=inputy+1;
			  inputdir="DR";
		  }
	  }
	  if(inputdir.equals("D"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputy=inputy+1;
			  inputdir="D";
		  }
	  }
	  if(inputdir.equals("D"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputx=inputx+1;
			  inputy=inputy+1;
			  inputdir="DL";
		  }
	  }
	  if(inputdir.equals("D"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputx=inputx+1;
			  inputdir="L";
		  }
	  }
	  if(inputdir.equals("D"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputx=inputx+1;
			  inputy=inputy-1;
			  inputdir="UL";
		  } 
	  }
	  }
	  //ALL OF THE ULS-----------------------------------------------
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("UL"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputx=inputx+1;
			  inputdir="D";
		  }
	  }
	  if(inputdir.equals("UL"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputx=inputx+2;
			  inputdir="DL";
		  }
	  }
	  if(inputdir.equals("UL"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputy=inputy-1;
			  inputx=inputx+2;
			  inputdir="L";
		  }
	  }
	  if(inputdir.equals("UL"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputy=inputy-2;
			  inputx=inputx+2;
			  inputdir="UL";
		  }
	  }
	  if(inputdir.equals("UL"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputy=inputy-2;
			  inputx=inputx+1;
			  inputdir="U";
		  }
	  }
	  if(inputdir.equals("UL"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputy=inputy-2;
			  inputdir="UR";
		  }
	  }
	  if(inputdir.equals("UL"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputy=inputy-1;
			  inputdir="R";
		  }
	  }
	  }
	  //ALL OF THE URS-------------------------------------------------------------
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("UR"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputy=inputy-1;
			  inputdir="L";
		  }
	  }
	  if(inputdir.equals("UR"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputy=inputy-2;
			  inputdir="UL";
		  }
	  }
	  if(inputdir.equals("UR"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputy=inputy-2;
			  inputx=inputx+1;
			  inputdir="U";
		  }
	  }
	  if(inputdir.equals("UR"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputy=inputy-2;
			  inputx=inputx+2;
			  inputdir="UR";
		  }
	  }
	  if(inputdir.equals("UR"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputy=inputy-1;
			  inputx=inputx+2;
			  inputdir="R";
		  }
	  }
	  if(inputdir.equals("UR"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputx=inputx+2;
			  inputdir="DR";
		  }
	  }
	  if(inputdir.equals("UR"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputx=inputx+1;
			  inputdir="D";
		  }
	  }
	  }
	//ALL OF THE DRS---------------------------------------------------------------
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("DR"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputx=inputx-1;
			  inputdir="U";
		  }
	  }
	  if(inputdir.equals("DR"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputx=inputx-2;
			  inputdir="UR";
		  }
	  }
	  if(inputdir.equals("DR"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputx=inputx-2;
			  inputy=inputy+1;
			  inputdir="R";
		  }
	  }
	  if(inputdir.equals("DR"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputx=inputx-2;
			  inputy=inputy+2;
			  inputdir="DR";
		  }
	  }
	  if(inputdir.equals("DR"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputx=inputx-1;
			  inputy=inputy+2;
			  inputdir="D";
		  }
	  }
	  if(inputdir.equals("DR"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputy=inputy+2;
			  inputdir="DL";
		  }
	  }
	  if(inputdir.equals("DR"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputy=inputy+1;
			  inputdir="L";
		  } 
	  }
	  }
	  //ALL OF THE DLS------------------------------------------------------
	  if(temp.equals(inputdir))
	  {
	  if(inputdir.equals("DL"))
	  {
		  if(array[inputy][inputx]==1)
		  {
			  inputy=inputy+1;
			  inputdir="R";
		  }
	  }
	  if(inputdir.equals("DL"))
	  {
		  if(array[inputy][inputx]==2)
		  {
			  inputy=inputy+2;
			  inputdir="DR";
		  }
	  }
	  if(inputdir.equals("DL"))
	  {
		  if(array[inputy][inputx]==3)
		  {
			  inputx=inputx+1;
			  inputy=inputy+2;
			  inputdir="D";
		  }
	  }
	  if(inputdir.equals("DL"))
	  {
		  if(array[inputy][inputx]==4)
		  {
			  inputy=inputy+2;
			  inputx=inputx+2;
			  inputdir="DL";
		  }
	  }
	  if(inputdir.equals("DL"))
	  {
		  if(array[inputy][inputx]==5)
		  {
			  inputy=inputy+1;
			  inputx=inputx+2;
			  inputdir="L";
		  }
	  }
	  if(inputdir.equals("DL"))
	  {
		  if(array[inputy][inputx]==6)
		  {
			  inputx=inputx+2;
			  inputdir="UL";
		  }
	  }
	  if(inputdir.equals("DL"))
	  {
		  if(array[inputy][inputx]==7)
		  {
			  inputx=inputx+1;
			  inputdir="U";
		  } 
	  }
	  }
	  
		  
  repeat++;  
  }
    System.out.println(inputy+", "+inputx);
    }
    }
   /*{
	   for (int r=9;r>1;r--)
	    {
	        for (int c=1;c<=array.length;c++)
	        {
	        	array[r][c]=octnum[c];
	        }
	    }
	   
	   System.out.print(octnum[j]);
   
   		System.out.println(octnum);
   }



}*/
    
    
    
    public static void forOct(int[][] array, int[] octnum)
    {
    	for (int i=9;i>1;i--)
        {
            for (int j=1;j<=array.length;j++)
            {
            	array[i][j]=octnum[j];
            }
        }
    }

  public static int hex2decimal(String s)

    {

             String digits = "0123456789ABCDEF";

             s = s.toUpperCase();

             int val = 0;

             for (int i = 0; i < s.length(); i++)

             {

                 char c = s.charAt(i);

                 int d = digits.indexOf(c);
                 		
                 val = 16*val + d;

             }

             return val;	//Val = Dec

    }







}