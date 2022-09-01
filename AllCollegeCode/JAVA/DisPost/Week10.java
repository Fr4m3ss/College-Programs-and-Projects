// Week 10 Discussion: Week10.java

import javax.swing.JFrame;

//for Exercise 27.6
import java.awt.Graphics;
import javax.swing.JPanel;

//Also Needed for Exercise 27.15
import java.awt.Color;
import java.awt.geom.GeneralPath;
import java.awt.Graphics2D;

public class Week10{
   public static void main(String args[]){
      JFrame frame = new JFrame("Week 10 Discussion");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      class Wk10JPanel extends JPanel {
         public void paintComponent(Graphics g){
            super.paintComponent(g);
            //PUT CODE HERE
	    //Excercies 27.6
	                 int size1 = 80;

	                  int size2 = 80;

	                   int x = 0;

	                    int y = 0;

	                     for(int i = 0; i < 8; i++)

		              {

		                   g.drawArc(x, y, size1, size2, 0, 360);

		                    size1-=10;

		                     size2-=10;

		                      x+=5;

		                       y+=5;

		                   }

         }
      }
      Wk10JPanel wk10JPanel = new Wk10JPanel(); 
      frame.add(wk10JPanel); 
      frame.setSize(400, 400); // set frame size
      frame.setVisible(true); // display frame
   }
} 



