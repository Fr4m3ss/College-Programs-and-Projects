// Code for popping up a window that displays a custom component
// in this case we are displaying a Binary Search tree  
// reference problem 4.38 of Weiss to compute tree node x,y positions

// input is a text file name that will form the Binary Search Tree

//     java DisplaySimpleTree textfile


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisplaySimpleTree extends JFrame {
  JScrollPane scrollpane;
  DisplayPanel panel;
  

  public DisplaySimpleTree(MyTree t) {
    panel = new DisplayPanel(t);
    panel.setPreferredSize(new Dimension(300, 300));
    scrollpane = new JScrollPane(panel);
    getContentPane().add(scrollpane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    pack();  // cleans up the window panel
  }

  public static void main(String[] args) throws NumberFormatException, IOException {

    MyTree t = new MyTree(); // t is Binary tree we are displaying
    Scanner s = new Scanner(System.in);
    String Total="";
    BufferedReader br = new BufferedReader(new FileReader("c_4_duplicates_sr_sample.txt"));
    String word;
   
    // read in the characters to create the Binary Search Tree
      
    	String phrase = (br.readLine());//"americancomputerscienceleague";//"aakash";// 
        for(int i=0;i<phrase.length();i++) { 
        word=phrase.substring(i,i+1);
        word=word.toLowerCase(); // use lower case only
        t.root = t.insert(t.root, word);  //insert word into Binary Search Tree
        t.inputString= t.inputString + " " + word; // add word to input string
      }
    t.checkDuplicate(phrase);
    t.computeNodePositions(); //finds x,y positions of the tree nodes
    //System.out.println(t.root.sum);
    t.maxheight=t.treeHeight(t.root); //finds tree height for scaling y axis
    DisplaySimpleTree dt = new DisplaySimpleTree(t);//get a display panel
    dt.setVisible(false); //show the display
    
    
    
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    
    
    MyTree t1 = new MyTree(); // t is Binary tree we are displaying
    BufferedReader br1 = new BufferedReader(new FileReader("test2.txt"));
    String word1;
   
    // read in the characters to create the Binary Search Tree
      
    	String phrase1 = (br1.readLine());//"americancomputerscienceleague";//"aakash";// 
        for(int i=0;i<phrase1.length();i++) 
        { 
        word1=phrase1.substring(i,i+1);
        word1=word1.toLowerCase(); // use lower case only
        t1.root = t1.insert(t1.root, word1);  //insert word into Binary Search Tree
        t1.inputString= t1.inputString + " " + word1; // add word to input string
        }
    t1.computeNodePositions(); //finds x,y positions of the tree nodes
    //System.out.println(t.root.sum);
    t1.maxheight=t1.treeHeight(t1.root); //finds tree height for scaling y axis
    Total=t1.check(t1.root);
    System.out.println(Total);
    System.out.println(t1.totaler(phrase,Total));
    
    
    DisplaySimpleTree dt1 = new DisplaySimpleTree(t1);//get a display panel
    dt1.setVisible(true); //show the display
  
    
    
    
  }
}
