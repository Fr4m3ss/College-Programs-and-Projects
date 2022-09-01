// Discussion 8: Phone.java

// Note: phone number must be input in the form #######.
// Only the digits 2 through 9 are recognized.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;

public class Phone {
   private static final String[][] letters = { {" ", " ", " "}, {" ", " ", " "}, {"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"}, {"P", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y"} };

   private int[] phoneNumber;

   // output letter combinations to file
   public void calculate(int phoneNumber) {


      int[] digits = new int[7];

      //TODO: Write the code which parses "phoneNumber"
      //and populutes the "digits" matrix; 
      // Also define a null Formatter called "output"
      
      int mult = 1000000;
      for(int i = 0; i < 7; i++)
      {
      		digits[i] = phoneNumber/mult;
		phoneNumber -= (mult*digits[i]);
		mult /= 10;
      }
      Formatter output = null;

      try {
         //TODO: Write the code which would allow the 
         //"output" to output to a file called phone.txt
      		output = new Formatter("phone.txt");

      } 
      catch (SecurityException securityException) {
         System.err.println(
            "You do not have write access to 'phone.txt'");
         System.exit(1);
      } 
      catch (FileNotFoundException fileNotFoundException) {
         System.err.println("Error creating file 'phone.txt'");
         System.exit(1);
      } 

      System.out.println("Please wait...");

      try {
		
         // TODO: output all possible combinations to the phone.txt 
         // file using the Formatter
	 String [] answer = new String[7];
	 String ans = "";
	 for(int a = 0; a < 3; a++)
	 {
	 	answer[0] = letters[digits[0]][a];
	 	for(int b = 0; b < 3; b++)
		{
			answer[1] = letters[digits[1]][b];
			for(int c = 0; c < 3; c++)
			{
				answer[2] = letters[digits[2]][c];
				for(int d = 0; d < 3; d++)
				{
					answer[3] = letters[digits[3]][d];
					for(int e = 0; e < 3; e++)
					{
						answer[4] = letters[digits[4]][e];
						for(int f = 0; f < 3; f++)
						{
							answer[5] = letters[digits[5]][f];
							for(int g = 0; g < 3; g++)
							{
								answer[6] = letters[digits[6]][g];
								ans = "";
								for(int h = 0; h < answer.length; h++)
								{
									ans += answer[h];
								}
								output.format("%s\n",ans);
							}
						}
					}
				}
			}
		}
	 }
      }
      catch (IllegalFormatException illegalFormatException) {
         System.err.println("Error in format of output.");
         System.exit(1);
      } 
      catch (FormatterClosedException formatterClosedException) {
         System.err.println(
            "Error sending output; File has been closed.");
         System.exit(1);
      } 
      finally {
         System.out.println("Done.");

         if (output != null) {
            output.close(); // close output stream
         }
      } 
   } 
} 
