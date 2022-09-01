//Francesco Messina, Assignment 5, Picture Frame class
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class pictureFrame extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.BLUE);

		int x;
		int y;
		int size;

		if(getSize().width>getSize().height)
		{
			size = getSize().height/4;
		}
		else
		{
			size = getSize().width/4;
		}
		
		x = getSize().height/10;
		y = getSize().width -(getSize().width*3/10);
		
		g.setColor(Color.YELLOW);
		g.fillOval(y,x,size,size);

		x = getSize().height-(getSize().height/10);
		y = getSize().height/10;

		g.setColor(new Color(102,51,0));
		g.fillRect(0,x,getSize().width,y);
	}
}
