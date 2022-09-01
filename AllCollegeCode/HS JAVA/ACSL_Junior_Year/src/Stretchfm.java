import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Stretch {

	/**
	 * @param args
	 */
	
	//DONT FORGET TO DO BLOCK CHECKING 
	//AND TO CHANGE START VALUE WHEN USING THE BLOCKS CAUSE CANT RETURN MULTIPLE THINGS
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("input2.txt"));
		int run=0;
		while(run<5)
		{
			int r= input.nextInt();
			int c= input.nextInt();
			int start= input.nextInt()-1;
			int firststart = start;
			int n= input.nextInt();
			int gridsize=1;
			int lastplaced=0;
			int nextplaced=1;
			String[][] temparray = new String[r][c];
			String tempanswer = "";
			
			//PLAYING BOARD
			String[][] array = new String[r][c];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = Integer.toString(gridsize++);
				}
			}
			
			//INSERTING BLOCKED CELLS
		for (int l = 0; l <n; l++) {
			int temp = input.nextInt();
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if(array[i][j].equals(Integer.toString(temp)))
					{
						array[i][j]="BLOCK";
					}
				}
			}
		}
			
			//PLACING FIRST BLOCK ON START POINT
		if(start+1==1||(start)%(array[0].length)==0)
		{
			while(((start+1)%array[0].length)!=0)
			{
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				if(nextplaced==1)
				{
					placeAlr(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=1;
					start=start+3;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=2;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(nextplaced==2&&firststart!=start&&0!=((start+1)%(array[0].length))&&0!=(start%(array[0].length))&&start+1!=1)
				{
					placeBtoplr(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=2;
					start=start+1+array[0].length+array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=3;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(nextplaced==3&&lastplaced!=2&&lastplaced!=5&&0!=((start+1)%(array[0].length))&&0!=(start%(array[0].length))&&start+1!=1)
				{
					placeBbotlr(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=3;
					start=start+1-array[0].length-array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=4;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(nextplaced==4&&lastplaced!=3&&0!=(start%(array[0].length))&&start+1!=1)
				{
					
					placeClr(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=4;
					start=start+2+array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}

				nextplaced=5;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(nextplaced==5&&0!=((start+1)%(array[0].length)))
				{
					placeDlr(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=5;
					start=start+2+array[0].length+array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=6;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(nextplaced==6)
				{
					placeElr(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=6;
					start=start+3+array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=1;
				if(start%array[0].length==0)
					break;
			}
				
				//PRINT BOARD	
			tempanswer=tempanswer.replaceAll("1", "A");
			tempanswer=tempanswer.replaceAll("2", "B");
			tempanswer=tempanswer.replaceAll("3", "B");
			tempanswer=tempanswer.replaceAll("4", "C");
			tempanswer=tempanswer.replaceAll("5", "D");
			tempanswer=tempanswer.replaceAll("6", "E");
			System.out.println(tempanswer);
		}
		else
		{
			start=start+2;
			
			while(((start)%array[0].length)!=0)
			{
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				if(nextplaced==1)
				{
					placeArl(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=1;
					start=start-3;
					tempanswer=tempanswer+lastplaced;
					}
				}
				if(start-1%array[0].length==0)
					break;
				nextplaced=2;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(start-1%array[0].length==0)
					break;
				if(nextplaced==2&&lastplaced!=3&&0!=((start-1)%(array[0].length))&&0!=(start%(array[0].length))&&start-1!=1)
				{
					placeBtoprl(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=2;
					start=start-1+array[0].length+array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=3;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(start-1%array[0].length==0)
					break;
				if(nextplaced==3&&lastplaced!=2&&lastplaced!=5&&0!=((start-1)%(array[0].length))&&0!=(start%(array[0].length))&&start-1!=1)
				{
					placeBbotrl(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=3;
					start=start-1-array[0].length-array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=4;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(start-1%array[0].length==0)
					break;
				if(nextplaced==4&&0!=(start%(array[0].length))&&start-1!=1)
				{
					
					placeCrl(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=4;
					start=start-2-array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=5;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(start-1%array[0].length==0)
					break;
				if(nextplaced==5&&lastplaced!=2&&0!=((start-1)%(array[0].length)))
				{
					placeDrl(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=5;
					start=start-2-array[0].length-array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				nextplaced=6;
				for(int i=0; i<array.length; i++){
					 for(int j=0; j<array[i].length; j++){
						 temparray[i][j]=array[i][j];
					 }   
				}
				if(start-1%array[0].length==0)
					break;
				if(nextplaced==6)
				{
					placeErl(array,start);
					if(!checkEquality(temparray, array)) 
					{
					lastplaced=6;
					start=start-3-array[0].length;
					tempanswer=tempanswer+lastplaced;
					}
				}
				if((start-1)%array[0].length==0)
					break;

				nextplaced=1;
				
			}
				
				//PRINT BOARD	
			/*for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println("");
			}*/
			tempanswer=tempanswer.replaceAll("1", "A");
			tempanswer=tempanswer.replaceAll("2", "B");
			tempanswer=tempanswer.replaceAll("3", "B");
			tempanswer=tempanswer.replaceAll("4", "C");
			tempanswer=tempanswer.replaceAll("5", "D");
			tempanswer=tempanswer.replaceAll("6", "E");
			System.out.println(tempanswer);
		}
			
		run++;
		}
		
	
	
		
	}

//PIECES~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public static String [][] placeAlr(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((s+1)%array[0].length!=0&&(s+2)%array[0].length!=0&&array[i][j].equals(Integer.toString(s+1))&&array[i][j+1].equals(Integer.toString(s+2))&&array[i][j+2].equals(Integer.toString(s+3)))
			{
				array[i][j]=" @";
				array[i][j+1]=" @";
				array[i][j+2]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeBtoplr(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i+1)*array[0].length<=array.length*array[0].length&&(i+2)*array[0].length<=array.length*array[0].length&&i+2<array.length&&array[i][j].equals(Integer.toString(s+1))&&array[i+1][j].equals(Integer.toString(s+1+array[0].length))&&array[i+2][j].equals(Integer.toString(s+1+array[0].length+array[0].length)))
			{
				array[i][j]=" @";
				array[i+1][j]=" @";
				array[i+2][j]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeBbotlr(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i-1)>=1&&(i-2)>=0&&array[i][j].equals(Integer.toString(s+1))&&array[i-1][j].equals(Integer.toString(s+1-array[0].length))&&array[i-2][j].equals(Integer.toString(s+1-array[0].length-array[0].length)))
			{
				array[i][j]=" @";
				array[i-1][j]=" @";
				array[i-2][j]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeClr(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i+1)*array[0].length<=array.length*array[0].length&&(j+1)%(array[0].length+1)!=0&&array[i][j].equals(Integer.toString(s+1))&&array[i+1][j].equals(Integer.toString(s+1+array[0].length))&&array[i+1][j+1].equals(Integer.toString(s+2+array[0].length)))
			{
				array[i][j]=" @";
				array[i+1][j]=" @";
				array[i+1][j+1]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeDlr(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i+2)<=array.length&&(i+1)*array[0].length<=array.length*array[0].length&&(i+2)*array[0].length<=array.length*array[0].length&&(j+1)%(array[0].length+1)!=0&&array[i][j].equals(Integer.toString(s+1))&&array[i][j+1].equals(Integer.toString(s+2))&&array[i+1][j+1].equals(Integer.toString(s+2+array[0].length))&&array[i+2][j+1].equals(Integer.toString(s+2+array[0].length+array[0].length)))
			{
				array[i][j]=" @";
				array[i][j+1]=" @";
				array[i+1][j+1]=" @";
				array[i+2][j+1]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeElr(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((j+1)%(array[0].length)!=0&&(j+2)%(array[0].length)!=0&&(i+1)*array[0].length<=array.length*array[0].length&&i+1<array.length&&array[i][j].equals(Integer.toString(s+1))&&array[i][j+1].equals(Integer.toString(s+2))&&array[i+1][j+1].equals(Integer.toString(s+2+array[0].length))&&array[i+1][j+2].equals(Integer.toString(s+3+array[0].length)))
			{
				//if((j-1)%(array[0].length)!=0&&(i-1)>=0&&array[i][j].equals(Integer.toString(s-1))&&array[i][j-1].equals(Integer.toString(s-2))&&array[i-1][j-1].equals(Integer.toString(s-2-array[0].length))&&array[i-1][j-2].equals(Integer.toString(s-3-array[0].length)))
				array[i][j]=" @";
				array[i][j+1]=" @";
				array[i+1][j+1]=" @";
				array[i+1][j+2]=" @";
			}
		}
	}
	return array;
}

public static boolean checkEquality(String[][] s1, String[][] s2) {
    if (s1 == s2)
        return true;

    if (s1 == null || s2 == null)
        return false;

	int n = s1.length;
    if (n != s2.length)
        return false;

    for (int i = 0; i < n; i++) {
        if (s1[i].length != s2[i].length)
            return false;

        for (int j = 0; j < s1[i].length; j++) {
            if (!s1[i][j].equals(s2[i][j]))
                return false;
        }
    }
    return true;
}

public static String [][] placeArl(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((s-2)%(array[0].length)!=0&&(s-3)%array[0].length!=0&&array[i][j].equals(Integer.toString(s-1))&&array[i][j-1].equals(Integer.toString(s-2))&&array[i][j-2].equals(Integer.toString(s-3)))
			{
				array[i][j]=" @";
				array[i][j-1]=" @";
				array[i][j-2]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeBtoprl(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i+1)*array[0].length<=array.length*array[0].length&&(i+2)*array[0].length<=array.length*array[0].length&&i+2<array.length&&array[i][j].equals(Integer.toString(s-1))&&array[i+1][j].equals(Integer.toString(s-1+array[0].length))&&array[i+2][j].equals(Integer.toString(s-1+array[0].length+array[0].length)))
			{
				array[i][j]=" @";
				array[i+1][j]=" @";
				array[i+2][j]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeBbotrl(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i-2)>=0&&array[i][j].equals(Integer.toString(s-1))&&array[i-1][j].equals(Integer.toString(s-1-array[0].length))&&array[i-2][j].equals(Integer.toString(s-1-array[0].length-array[0].length)))
			{
				array[i][j]=" @";
				array[i-1][j]=" @";
				array[i-2][j]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeCrl(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i-1)>=0&&(j-2)%(array[0].length)!=0&&array[i][j].equals(Integer.toString(s-1))&&array[i][j-1].equals(Integer.toString(s-2))&&array[i-1][j-1].equals(Integer.toString(s-2-array[0].length)))
			{
				array[i][j]=" @";
				array[i][j-1]=" @";
				array[i-1][j-1]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeDrl(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((i-2)>=0&&array[i][j].equals(Integer.toString(s-1))&&array[i-1][j].equals(Integer.toString(s-1-array[0].length))&&array[i-2][j].equals(Integer.toString(s-1-array[0].length-array[0].length))&&array[i-2][j-1].equals(Integer.toString(s-2-array[0].length-array[0].length)))
			{
				array[i][j]=" @";
				array[i-1][j]=" @";
				array[i-2][j]=" @";
				array[i-2][j-1]=" @";
			}
		}
	}
	return array;
}

public static String [][] placeErl(String array[][],int s){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if((j-1)%(array[0].length)!=0&&(i-1)>=0&&array[i][j].equals(Integer.toString(s-1))&&array[i][j-1].equals(Integer.toString(s-2))&&array[i-1][j-1].equals(Integer.toString(s-2-array[0].length))&&array[i-1][j-2].equals(Integer.toString(s-3-array[0].length)))
			{
				array[i][j]=" @";
				array[i][j-1]=" @";
				array[i-1][j-1]=" @";
				array[i-1][j-2]=" @";
			}
		}
	}
	return array;
}

//FINAL BRACKET BELOW
}
