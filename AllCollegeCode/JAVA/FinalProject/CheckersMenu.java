//Francesco Messina, Final Project, Checkers Menu
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;

public class CheckersMenu extends JPanel
{
        public CheckersMenu()
        {
		//Making title screen
		JLabel title = new JLabel("-=CHECKERS=-");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont (title.getFont().deriveFont(34.0f));
		setLayout(new BorderLayout()); 
		title.setBackground(new Color(210,180,140));
		add(title,BorderLayout.NORTH);
	
		//Centering title if screen is resized
		addComponentListener
                (
                        new ComponentAdapter()
                        {
                                public void componentResized(ComponentEvent e)
                                {
                                	title.setHorizontalAlignment(JLabel.CENTER);
                                }
                        }
                );
	}
	
	//Setting background color
	@Override
        public void paintComponent(Graphics g)
        {
                super.paintComponent(g);
         	this.setBackground(new Color(210,180,140));
        }

}

