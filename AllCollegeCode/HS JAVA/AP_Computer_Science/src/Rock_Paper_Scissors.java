 
import java.util.Random;
public class Rock_Paper_Scissors {
//Frankie Messina Mod 9
	Random run = new Random();
	
	private double player;
	private double comp;
	private int wins;
	private int ties;
	private int losses;
	

	public Rock_Paper_Scissors()
	{
		player=0;
		comp=0;
		wins=0;
		ties=0;
		losses=0;
	}
	
	public void getComp()
	{	
	int randomcomp = run.nextInt((3)+1);
	if (randomcomp == 1)
	{
		comp=1;
	}
	else if (randomcomp == 2)
	{
		comp=2;
	}
	else if (randomcomp == 3)
	{
		comp=3;
	}
	}
	
	public void getPlayer(double l1)
	{
		if(l1 == 1)
		{
		player=1;
		}
		else if (l1 == 2)
		{
		player=2;	
		}
		else if (l1 == 3)
		{
		player=3;	
		}
		else
		{
		player = 0;
		}
	}
	
	public void score()
	{
	System.out.println("Ok, Goodbye :)\nYou have "+wins+" wins\nYou have "+ties+" ties\nYou have "+losses+" losses");
	}
	
	public void winner()
	{
		 if(player==1 && comp==1 || player==2 && comp==2 || player==3 && comp==3)
		 {
			System.out.println("It is a Tie!"); 
			ties++;
			if(comp==1)
			{
				System.out.println("Computer chose Rock");
			}
			else if(comp==2)
			{
				System.out.println("Computer chose Paper");
			}
			else if(comp==3)
			{
				System.out.println("Computer chose Scissors");
			}
		 }
		 else if(player == 1 && comp == 3 || player == 2 && comp == 1 || player == 3 && comp == 2)
		 {
			System.out.println("You Win!"); 
			wins++;
			if(comp==1)
			{
				System.out.println("Computer chose Rock");
			}
			else if(comp==2)
			{
				System.out.println("Computer chose Paper");
			}
			else if(comp==3)
			{
				System.out.println("Computer chose Scissors");
			}
		 }
		 else if(player == 1 && comp == 2 || player == 2 && comp == 3 || player == 3 && comp == 1)
		 {
			System.out.println("You Lose!"); 
			losses++;
			if(comp==1)
			{
				System.out.println("Computer chose Rock");
			}
			else if(comp==2)
			{
				System.out.println("Computer chose Paper");
			}
			else if(comp==3)
			{
				System.out.println("Computer chose Scissors");
			}
		 }
		 
	}
}
