//Francesco Messina, Assignment 5, DesktopFrame
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class DesktopFrame extends JFrame
{
	private final JDesktopPane jdp;

	public DesktopFrame()
	{
		//Menu Bar
		JMenuBar menuBar = new JMenuBar();	
		
		//Options
		JMenu createOption = new JMenu("Create");       
		JMenu quitOption = new JMenu("Quit");       
		
		//Choices
		JMenuItem quitProgram = new JMenuItem("Quit Program");      
		JMenuItem pictureFrame = new JMenuItem("Picture Frame");
		JMenuItem moveablePictureFrame = new JMenuItem("Moveable Picture Frame");

		//Adding options to menu bar
		menuBar.add(createOption);
		menuBar.add(quitOption);
	
		//Adding choices to options
		quitOption.add(quitProgram);	
		createOption.add(pictureFrame);
		createOption.add(moveablePictureFrame);

		//Setting
		setJMenuBar(menuBar);
		jdp = new JDesktopPane();
		add(jdp);
		
		//Listener for pictureFrame menu item
		pictureFrame.addActionListener
		(
			new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent event)
				{
					JInternalFrame frame = new JInternalFrame
					("Picture Frame",true,true,true,true);
					pictureFrame panel = new pictureFrame();
					frame.add(panel, BorderLayout.CENTER);
					jdp.add(frame);
					frame.setSize(400,400);
					frame.setVisible(true);
				}
			}
		);
		
		//Listener for moveablePictureFrame menu item
		moveablePictureFrame.addActionListener
		(
			new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent event)
				{
					JInternalFrame frame = new JInternalFrame
					("Moveable Picture Frame",true,true,true,true);
					moveablePictureFrame panel = new moveablePictureFrame();
					frame.add(panel, BorderLayout.CENTER);
					jdp.add(frame);
					frame.setSize(400,400);
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
