import java.util.Scanner;                                                     
public class String_Program {
//Frankie Mesina
//Mod 9
//Mr. Marascio
//1/28/17
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner instring = new Scanner(System.in);
		Scanner inint = new Scanner(System.in);
		Scanner inchar = new Scanner(System.in);
		int operation;
		String searchnum;
		String first;
		String second;
		int run=0;
		
		System.out.println("Enter String- ");
		String input = instring.nextLine();
		System.out.println();
		
		while(run!=2)
		{
			System.out.println();
			System.out.println("String- "+input);
			System.out.println();
			if(input.equalsIgnoreCase("bunny")||input.equalsIgnoreCase("rabbit")||input.equalsIgnoreCase("marascio"))
			{
				System.out.println("   //");
				System.out.println("  ('>");
				System.out.println("  /rr");
				System.out.println(" *|))_");
			}
			if(input.equalsIgnoreCase("bird")||input.equalsIgnoreCase("birb")||input.equalsIgnoreCase("leo")||input.equalsIgnoreCase("leon"))
			{
				System.out.println("   __ ");
				System.out.println("  ( ->");
				System.out.println("  / )|");
				System.out.println(" <_/_/");
				System.out.println("  ''''");
			}
			if(input.equalsIgnoreCase("frankie")||input.equalsIgnoreCase("life")||input.equalsIgnoreCase("game")||input.equalsIgnoreCase("framess")||input.equalsIgnoreCase("overwatch"))
			{
				System.out.println("            					    888           888      ");
				System.out.println("            					    888           888      ");
				System.out.println("            					    888           888      ");
				System.out.println(".d88b. 888  888 .d88b. 888d888888  888  888 8888b. 888888 .d8888b88888b.   ");
				System.out.println("d88  88b888  888d8P  Y8b888P   888  888  888     88b888   d88P    888  88b ");
				System.out.println("888  888Y88  88P88888888888    888  888  888.d888888888   888     888  888 ");
				System.out.println("Y88..88P Y8bd8P Y8b.    888    Y88b 888 d88P888  888Y88b. Y88b.   888  888 ");
				System.out.println(" Y88P    Y88P    Y8888 888      Y8888888P   Y888888  Y888  Y8888P 888  888 ");
			}
			if(input.equalsIgnoreCase("camille")||input.equalsIgnoreCase("camel")||input.equalsIgnoreCase("faggot"))
			{
				System.out.println("  ██████╗█████╗███╗   ████████████╗         ██ ███████╗    ██████╗ █████╗██████╗      █████╗████████╗    ██╗    ██████████╗ ██████╗██╗    ██╗ ");
				System.out.println(" ██╔════██╔══██████╗ ██████╔════██║         ██ ██╔════╝    ██╔══████╔══████╔══██╗    ██╔══██╚══██╔══╝    ██║    ██████╔══████╔═══████║    ██║ ");
				System.out.println(" ██║    █████████╔████╔███████╗ ██║         ██ ███████╗    ██████╔█████████║  ██║    ███████║  ██║       ██║ █╗ ██████║  ████║   ████║ █╗ ██║ ");
				System.out.println(" ██║    ██╔══████║╚██╔╝████╔══╝ ██║         ██╚════ ██║    ██╔══████╔══████║  ██║    ██╔══██║  ██║       ██║███╗██████║  ████║   ████║███╗██║ ");
				System.out.println(" ╚████████║  ████║ ╚═╝ ████████████████╗    ██ ███████║    ██████╔██║  ████████╔╝    ██║  ██║  ██║       ╚███╔███╔████████╔╚██████╔╚███╔███╔╝ ");
				System.out.println("  ╚═════╚═╝  ╚═╚═╝     ╚═╚══════╚══════╝    ╚═╚══════╝    ╚═════╝╚═╝  ╚═╚═════╝     ╚═╝  ╚═╝  ╚═╝        ╚══╝╚══╝╚═╚═════╝ ╚═════╝ ╚══╝╚══╝  ");
			}
			if(input.equalsIgnoreCase("ethan")||input.equalsIgnoreCase("themrhappypanda")||input.equalsIgnoreCase("nazi")||input.equalsIgnoreCase("swastika")||input.equalsIgnoreCase("hitler"))
			{
				System.out.println("卐 	           卐  卐 卐 卐 卐 卐 卐 ");
				System.out.println("卐                          卐");
				System.out.println("卐                          卐");
				System.out.println("卐                          卐");
				System.out.println("卐                          卐");
				System.out.println("卐                          卐");
				System.out.println("卐 卐 卐 卐 卐 卐 卐 卐 卐 卐 卐 卐 卐 ");
				System.out.println("                              卐                          卐");
				System.out.println("                              卐                          卐");
				System.out.println("                              卐                          卐");
				System.out.println("                              卐                          卐");
				System.out.println("                              卐                          卐");
				System.out.println("卐 卐 卐 卐 卐 卐 卐                          卐");
			}
			
			
			System.out.println();
			System.out.println("(1) Search for string/character");
			System.out.println("(2) Count the amount of times a string/character appears.");
			System.out.println("(3) Reverse/Rewrite your string so it is read backwards.");
			System.out.println("(4) Replace a string/charachter with another string/charachter of your choosing.");
			System.out.println("(5) Return the length of your final string/charachter.");
			System.out.print("Pick which operation you would like: ");
			operation = inint.nextInt();
			System.out.println();
			if(operation==1)//SEARCH
			{
			System.out.println("Search for- ");
			searchnum = instring.nextLine();
			System.out.println(input.indexOf(searchnum));
			}
			//----------------------------------------------------------------------------------------------------------
			else if(operation==2)//COUNT
			{
			System.out.println("Count:");
			String count = instring.nextLine();
			int c=0;
			for(int j=0;j <=input.length()-1; j++)
			{
			if(count.equals(input.substring(j,j+1)))
			{
			c++;
			}
			}
			System.out.println("Times it appears in the string: "+c);
			}
			//----------------------------------------------------------------------------------------------------------
			else if(operation==3)//REWRITE BACKWARDS
			{
			for(int k=input.length()-1; k>=0; k--)
			System.out.print(input.charAt(k));
			System.out.println("");
			}
			//----------------------------------------------------------------------------------------------------------
			else if(operation==4)//REPLACE
			{
			System.out.print("Replace: ");
			first = instring.nextLine();
			while(input.indexOf(first)==-1)
			{
			System.out.print("Your input is not in the String, please reenter what you would like to replace: ");
			first = instring.nextLine();
			}
			System.out.print("Replace "+first+ " with: ");
			second = instring.nextLine();
			input=input.replace(first,second);
			System.out.println("Your word is now: "+input);
			}
			//----------------------------------------------------------------------------------------------------------
			else if(operation==5)//LENGTH
			{
			System.out.println("The length is: "+input.length());	
			}
			
			System.out.println("Would you like to run again? (1)Yes (2)No");
			run = inint.nextInt();
			
		}
	}

}
