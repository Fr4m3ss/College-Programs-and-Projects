import java.util.*; import java.io.*;
public class ACSL_Digit_Reassembly {
	//Framess
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
        String input;
        int n=0;
        for (int k = 0; k<5; k++)
		{	
        int outputNum=0; 
		int remainZero= 0;
		input = in.next(); 
		n=in.nextInt();
		remainZero= n-(input.length()%n);
		for(int i=0;i<remainZero; i++)
			input = input+"0";
		for(int i=0;i<input.length(); i=i+n)
			outputNum+=Integer.parseInt(input.substring(i, i+n));
		System.out.println(outputNum);
		}
    }
}
