//Francesco Messina, Final Project, tempPanel Swapper
//This class is meant to be the middleman to swap between the menu and the game panels

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tempPanel extends JPanel implements ActionListener 
{
	//Instantiating Variables
    	CheckersMenu firstPanel = new CheckersMenu();
    	CheckersBoardPlay secondPanel = new CheckersBoardPlay();
    	JButton playButton = new JButton("Play");
    	JButton loadButton = new JButton("Load");
    	JButton quitButton = new JButton("Quit");
	boolean loaded = false;

	
    	public tempPanel() 
    	{
		//Formatting the panels
		secondPanel.setSize(800,600);
		setLayout(new BorderLayout());
        	add(firstPanel, BorderLayout.CENTER);
	
		setLayout( new GridBagLayout() );
                GridBagConstraints gbc = new GridBagConstraints();

                gbc.insets = new Insets(30, 0, 20, 20);
                
		//Setting up the buttons
                playButton.setFocusable(false);
                playButton.setSize(50, 50);
                gbc.gridx = 0;
                gbc.gridy = 1;
                add(playButton, gbc);
		playButton.addActionListener(this);

                loadButton.setFocusable(false);
                loadButton.setSize(50, 50);
                gbc.gridy = 2;
                add(loadButton, gbc);
		loadButton.addActionListener(this);

                quitButton.setFocusable(false);
                quitButton.setSize(50, 50);
                gbc.gridy = 3;
                add(quitButton, gbc);

		//Listeners for the buttons
		quitButton.addActionListener
                (
                        new ActionListener()
                        {
                                public void actionPerformed(ActionEvent e)
                                {
                                        System.exit(0);
                                }
                        }
                );

		loadButton.addActionListener
                (
                        new ActionListener()
                        {
                                public void actionPerformed(ActionEvent e)
                                {
                              		loaded = true;
					secondPanel.getLoad(loaded);
                                }
                        }
                );


    	}
 
 	//Method to switch between panels on button press
    	public void actionPerformed(ActionEvent e) 
	{
        	for (Component component : getComponents())
		{
            		if (firstPanel == component) 
			{
				setLayout(new BorderLayout());
	        	       	remove(secondPanel);
       			        add(firstPanel);
				remove(playButton);
				remove(loadButton);
				remove(quitButton);		
		        } 
			else 
			{
				if(loaded)
				{
					secondPanel.loadIt();
				}
				setLayout(new BorderLayout());
	       	        	remove(firstPanel);
	       		        add(secondPanel);
				remove(playButton);
				remove(loadButton);
				remove(quitButton);		
            		}
        		repaint();
        		revalidate();
    		}
    	}

	//Painting the background	
	@Override
        public void paintComponent(Graphics g)
        {
                super.paintComponent(g);
                this.setBackground(new Color(210,180,140));
        }
}
