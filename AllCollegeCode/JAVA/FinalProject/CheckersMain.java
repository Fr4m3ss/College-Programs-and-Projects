//Francesco Messina, Final project, Checkers Main
import javax.swing.JFrame;
import java.awt.Dimension;

public class CheckersMain
{
	public static void main(String args[])
	{
		//Starting up game
		CheckersFrame cFrame = new CheckersFrame();
		cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cFrame.setSize(800, 600);
		cFrame.setMinimumSize(new Dimension(600,450));
		cFrame.setVisible(true);
	}
}
