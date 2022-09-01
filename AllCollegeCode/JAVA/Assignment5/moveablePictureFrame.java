//Francesco Messina, Assignment 5, Moveable Picture Frame class
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Point;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;

public class moveablePictureFrame extends JPanel
{
	private static int x = 0;
	private static int y = 0;
	private static int size1 = 0;
	private static int size2 = 0;
	private boolean start = true;

	public moveablePictureFrame()
	{
		JCheckBox yn = new JCheckBox("Move on Drag"); 
		setLayout(new BorderLayout()); 
		yn.setBackground(Color.WHITE);
		add(yn,BorderLayout.PAGE_START);
			
		addMouseMotionListener
		(
			new MouseMotionAdapter()
			{
				public void mouseDragged(MouseEvent e) 
				{  
					if(yn.isSelected())
					{
						movePoint(e.getY(),e.getX(),size1,size2); 
					}
				}
			}
		);
		addComponentListener
		(
			new ComponentAdapter()
			{
				public void componentResized(ComponentEvent e)
				{
					if(!yn.isSelected())
					{
						start = true;
						repaint();
					}
				}
			}
		);
		yn.addItemListener
		(
			new ItemListener()
			{
				public void itemStateChanged(ItemEvent e)
				{
					if(!yn.isSelected())
					{
						start = true;
						repaint();
					}
				}
			}
		);

	}     

	private void movePoint(int x1, int y1, int size3, int size4)
	{
		if ((x!=x1) || (y!=y1)) 
		{
	    		x=x1-size4/2;
			y=y1-size3/2;
	    		repaint();
    		}
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		size2 = getSize().height/10*3;
		size1 = getSize().width/10*3;
	
		if(start)
		{
			x = getSize().height/2-(getSize().height/10*3)/2;
			y = getSize().width/2-(getSize().width/10*3)/2; 
			start = false;
		}

		g.setColor(Color.GREEN);
		g.fillOval(y,x,size1,size2);
	}
}
