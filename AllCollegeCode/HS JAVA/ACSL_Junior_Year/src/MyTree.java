import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.io.*;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyTree {
	String inputString= new String();
    Node root;
    int totalnodes = 0; //keeps track of the inorder number for horiz. scaling 
    int maxheight=0;//keeps track of the depth of the tree for vert. scaling
    int thesum=0;
    MyTree() {
      root = null;
    }
   
    public int treeHeight(Node t){
	if(t==null) return -1;
          else return 1 + max(treeHeight(t.left),treeHeight(t.right));
    }
    public int max(int a, int b){
	  if(a>b) return a; else return b;
    }

    public void computeNodePositions() {
      int depth = 1;
      inorder_traversal(root, depth);
            
    }
  
  
//traverses tree and computes x,y position of each node, stores it in the node

    public void inorder_traversal(Node t, int depth) { 
     
      if (t != null) {
      	inorder_traversal(t.left, depth + 1); //add 1 to depth (y coordinate) 
        t.xpos = totalnodes++; //x coord is node number in inorder traversal
        t.ypos = depth; // mark y coord as depth
        inorder_traversal(t.right, depth + 1);
      }
}
    
    
    @SuppressWarnings("unused")
	public void checkDuplicate(String phrase) { 
    	ArrayList<String> OwOstring = new ArrayList<String>();
        ArrayList<Integer> OwOnum = new ArrayList<Integer>();
        String test = "";
        int total=0;
        phrase.replaceAll(" ", "");
        for(int i=0; i<phrase.length();i++)
        {	
    		int pos= 0;
    		int num=0;
    		String temp=phrase.substring(i,i+1);
    		temp=temp.toLowerCase();
    		for(int k=0; k<OwOstring.size();k++)
    		{
    			if(OwOstring.get(k).toLowerCase().equals(temp))
    			{
    				num=1;
    				pos=k;
    			}
    		}
    		if(num==1)
    		{
    			OwOnum.set(pos,OwOnum.get(pos)+1);
    		}
    		else
    		{
    			OwOstring.add(0, phrase.substring(i,i+1).toLowerCase());
    			OwOnum.add(0,1);
    		}
        }
        Collections.reverse(OwOstring);
        Collections.reverse(OwOnum);
        for(int i=0; i<OwOstring.size();i++)
        {
        	if(OwOstring.get(i).equals(" "))
        	{
        		OwOstring.remove(i);
        		OwOnum.remove(i);
        	}
        }
    	for(int i=0; i<OwOnum.size();i++)
        {
        	System.out.println(OwOstring.get(i)+"="+OwOnum.get(i));
        }
    	for(int i=0; i<OwOstring.size();i++)
        {
        	test+=OwOstring.get(i);
        }
    	
    	
    	try(  PrintWriter out = new PrintWriter( "test2.txt" )  ){
            out.println( test );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    	//Check Right or Left
    	/*
    	int right=0;
    	int left=0;
    	int compare=0;
  
    	
    	for(int i=0;i<OwOstring.size();i++)
    	{
    		right=0;
    		left=0;
    		for(int k=i+1;k<OwOstring.size();k++)
        	{
    		compare=OwOstring.get(i).compareTo(OwOstring.get(k));
        	if(compare<0)
        	{
        		left++;
        	}
        	if(compare>0)
        	{
        		right++;
        	}
        	}
    	
    		if(right==0&&left!=0)
    		{
    			System.out.println(OwOstring.get(i));
    			total+=OwOnum.get(i);
    		}
    		if(right!=0&&left==0)
    		{
    			System.out.println(OwOstring.get(i));
    			total+=OwOnum.get(i);
    		}
    		
    	}
    	System.out.println("TOTAL="+total);
    		
    	
    	*/
    	
  }
    
/* below is standard Binary Search tree insert code, creates the tree */

    public Node insert(Node root, String s) { // Binary Search tree insert
    	 
    	if (root == null) {
        root = new Node(s, null, null);
        return root;
      }
      else {
    	 
    	  	if (s.compareTo((String)(root.data)) <= 0)
                     root.left = insert(root.left, s);
                 else
                     root.right = insert(root.right, s);
        
    	  	return root;
      }
    	
    }
    
    public String check(Node root) {
    	if(root!=null)
    	{
    		if(root.left==null&&root.right==null)
        	{
    			return "";
        	}
        	else if(root.left!=null&&root.right!=null)
        	{
        		return check(root.left)+check(root.right);
        	}
        	else if(root.left!=null&&root.right==null)
        	{
        		return (String)(root.data)+check(root.left);
        	}
        	else if(root.left==null&&root.right!=null)
        	{
        		return (String)(root.data)+check(root.right);
        	}
    	}
    		return "";
    }
    
    public int totaler(String phrase, String Total) 
    {
    	 int total=0;
    	 phrase=phrase.toLowerCase();
    	    for (int i=0; i<Total.length(); i++) 
    	    {
    	        for(int k = 0; k<phrase.length(); k++) 
    	        {
    	            if (phrase.charAt(k) == Total.charAt(i)) 
    	            {
    	                 total++;
    	            }
    	        }
    	    }
    	    return total;
    }
    
    /*
     	N
     L 		R
     ReTuRn-ansel+OwOstring(a)=OwOnum(i)
     */
}
