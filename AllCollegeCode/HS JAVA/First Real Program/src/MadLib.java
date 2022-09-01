import java.util.Scanner;


public class MadLib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stringinput = new Scanner (System.in);
		System.out.print("Enter A Silly Word");
		String SillyWord1 = stringinput.nextLine();
		Scanner stringinput1 = new Scanner (System.in);
		System.out.print("Enter A Last Name");
		String LastName = stringinput1.nextLine();
		Scanner stringinput2 = new Scanner (System.in);
		System.out.print("Enter An Illness");
		String Illness = stringinput2.nextLine();
		Scanner stringinput3 = new Scanner (System.in);
		System.out.print("Enter A Plural Noun");
		String PluralNoun = stringinput3.nextLine();
		Scanner stringinput4 = new Scanner (System.in);
		System.out.print("Enter An Adjective");
		String Adjective1 = stringinput4.nextLine();
		Scanner stringinput5 = new Scanner (System.in);
		System.out.print("Enter An Adjective");
		String Adjective2 = stringinput5.nextLine();
		Scanner stringinput6 = new Scanner (System.in);
		System.out.print("Enter A Silly Word");
		String SillyWord2 = stringinput6.nextLine();
		Scanner stringinput7 = new Scanner (System.in);
		System.out.print("Enter A Place");
		String Place = stringinput7.nextLine();
		Scanner numberinput = new Scanner (System.in);
		System.out.print("Enter A Number");
		int Number = numberinput.nextInt();
		Scanner stringinput8 = new Scanner (System.in);
		System.out.print("Enter An Adjective");
		String Adjective3 = stringinput8.nextLine();
		
		System.out.println("Here Is Your Story>>>>");
	    System.out.println("Dear School Nurse,");
	    System.out.println(SillyWord1 +" " + LastName + " will not be attending school today. ");
	    System.out.println("He/she has come down with a case of " + Illness + " and has horrible ");
	    System.out.println( PluralNoun + " and a/an " + Adjective1 + " fever. We have made an");
	    System.out.println("appointment with the " + Adjective2 + " Dr." + SillyWord2 + ", who studied ");
	    System.out.println( "for many years in " + Place + " and has " + Number + " diplomas in ");
	    System.out.println(  "pediatrics. He will send you all the information you need. Thank you!");
	    System.out.println( "Sincerely,");
	    System.out.println( "      Mr/Mrs." + Adjective3 );
				
				;
		
	}

}
