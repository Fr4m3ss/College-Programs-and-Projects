import java.util.Scanner;
public class Rock_Paper_Scissors_Main {
//Frankie Messina
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double x = 0;
		Rock_Paper_Scissors s = new Rock_Paper_Scissors();
		while(x != -99)
		{
		System.out.println("Would you like (1)Rock (2)Paper (3)Scissors? [(-99) EXIT]");
		x = in.nextInt();
		s.getPlayer(x);
		s.getComp();
		s.winner();
		}
		s.score();
		System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
