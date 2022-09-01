//Francesco Messina, Discussion post week 11
//Read in a text file and output to a text file
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Week11
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		String sourceFile = "TestInput.txt";
		String destFile = "CopiedFile.txt";
		File source = new File(sourceFile);
		File dest = new File(destFile);
		if(source.isFile())
		{   
			if(dest.createNewFile())
			{   
				BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));
				Scanner text = new Scanner(source);
				while(text.hasNextLine())
				{   
					writer.write(text.nextLine() + '\n');
				}   
				text.close();
				writer.close();
				System.out.println("File " + sourceFile + " was copied to file " + destFile + " successfully. ");
			}   
			else
			{   
				System.out.println("File " + destFile + " already exists, and cannot be copied.");    
			}   
		}   
		else
		{   
			System.out.println("Error: Please Input A Valid File to Copy.");
		}   

	}
}
