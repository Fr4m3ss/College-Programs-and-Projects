//Francesco Messina, Final Project, Checkers Frame class
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.SecureRandom;
import javax.swing.*;

public class CheckersFrame extends JFrame
{
	static java.awt.Dimension bd;
	private final JDesktopPane jdp;

	public CheckersFrame()
	{
		//Menu Bar
                JMenuBar menuBar = new JMenuBar();

                //Options
                JMenu checkersOption = new JMenu("Checkers");
                JMenu quitOption = new JMenu("Quit");

                //Choices
                JMenuItem quitProgram = new JMenuItem("Quit Program");
                JMenuItem checkersLaunch = new JMenuItem("Launch Checkers");

                //Adding options to menu bar
                menuBar.add(checkersOption);
                menuBar.add(quitOption);

                //Adding choices to options
                quitOption.add(quitProgram);
                checkersOption.add(checkersLaunch);

                //Setting
                setJMenuBar(menuBar);
                jdp = new JDesktopPane();
                add(jdp); 
		
		//Listener for checkersLaunch menu item
                checkersLaunch.addActionListener
                (
                        new ActionListener()
                        {
                                @Override
                                public void actionPerformed(ActionEvent event)
                                {
                                        JInternalFrame frame = new JInternalFrame
                                        ("Checkers - Main Menu",true,true,true,true);
                                        tempPanel panel = new tempPanel();
                                        frame.add(panel, BorderLayout.CENTER);
                                        jdp.add(frame);
                                        frame.setSize(800,600);
                                        frame.setVisible(true);
                                }
                        }
                );
	
		//Listener for quitProgram menu item
                quitProgram.addActionListener
                (
			new ActionListener()
                        {
                                @Override
                                public void actionPerformed(ActionEvent event)
                                {
                                        System.exit(0);
                                }
                        }
                );
	}
}
