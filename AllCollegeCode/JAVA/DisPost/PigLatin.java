//Francesco Messina, Discussion post week 3: Pig Latin
import java.util.Scanner;

public class PigLatin 
{
	public static void main(String[] args) 
	{
		//Instantiating Variables and Scanners
		Scanner str = new Scanner(System.in);
		char hold = ' ';

		//User Input
		System.out.println("Enter a sentence and press Enter");
		String input = str.nextLine();
		
		//Putting each individual word into its own slot in an array of strings
		String[] phrase = input.split(" ");	
		
		//Running through the phrase
		for(int i = 0; i < phrase.length; i++)
		{
			//Taking out the current word
			char[] temp = new char[phrase[i].length()+2];
			
			//Running through the current word
			for(int j = 0; j < phrase[i].length() + 3; j++)
			{
				//Converting current word to pig latin
				if(j == 0)
				{
					hold = Character.toLowerCase(phrase[i].charAt(j));
				}
				else if(j < phrase[i].length())
				{
					temp[j-1] = phrase[i].charAt(j);
				}
				else
				{
					temp[j-1] = hold;
					temp[j] = 'a';
					temp[j+1] = 'y';
					j = phrase[i].length()+3;
				}
			}
			
			//Converting current word to a string and storing it back into the original words place
			String word = new String(temp);
			phrase[i] = word;
		}
		
		//Output
		System.out.println("The converted sentence is:");
		
		for(int i = 0; i < phrase.length; i++)
		{
			System.out.print(phrase[i] + " ");
		}
		System.out.println();
       	}
}
