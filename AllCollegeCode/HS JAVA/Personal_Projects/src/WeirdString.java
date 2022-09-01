import java.util.*;

public class WeirdString {
	/*
	Framess
	*/
	public static void main(String[] args) {
		int x = 6%3;
		System.out.println(0%10);
	
		
	}

	
	
	
	public static String reverse(String s)
    {
        if(s.length() < 2)
            return s;
    return reverse (s.substring(1)) + s.charAt(0);
    }


    public static String buildWeirdString(String s)
    {
        String a = s;
        String b = s;
        int n = 0;
        Boolean b1;
        String BKWD = "";
        //Backwards
        a = reverse(a);
      
        while(!Character.isLetter(a.charAt(n)))
        {
        	n=n+1;
        }
        a= a.replaceFirst(a.substring(n,n+1), "");
        
        for(int i = 0; i < a.length(); i++)
        {
        	if(a.substring(i,i+1).equalsIgnoreCase("a")||a.substring(i,i+1).equalsIgnoreCase("b")||a.substring(i,i+1).equalsIgnoreCase("c")||a.substring(i,i+1).equalsIgnoreCase("d")||a.substring(i,i+1).equalsIgnoreCase("e")||a.substring(i,i+1).equalsIgnoreCase("f")||a.substring(i,i+1).equalsIgnoreCase("g")||a.substring(i,i+1).equalsIgnoreCase("h")||a.substring(i,i+1).equalsIgnoreCase("i")||a.substring(i,i+1).equalsIgnoreCase("j")||a.substring(i,i+1).equalsIgnoreCase("k")||a.substring(i,i+1).equalsIgnoreCase("l")||a.substring(i,i+1).equalsIgnoreCase("m")||a.substring(i,i+1).equalsIgnoreCase("n")||a.substring(i,i+1).equalsIgnoreCase("o")||a.substring(i,i+1).equalsIgnoreCase("p")||a.substring(i,i+1).equalsIgnoreCase("q")||a.substring(i,i+1).equalsIgnoreCase("r")||a.substring(i,i+1).equalsIgnoreCase("s")||a.substring(i,i+1).equalsIgnoreCase("t")||a.substring(i,i+1).equalsIgnoreCase("u")||a.substring(i,i+1).equalsIgnoreCase("v")||a.substring(i,i+1).equalsIgnoreCase("w")||a.substring(i,i+1).equalsIgnoreCase("x")||a.substring(i,i+1).equalsIgnoreCase("y")||a.substring(i,i+1).equalsIgnoreCase("z"))
        	{
        		buildWeirdString(a);
        	}
        }
        
        
        
        return s;
    }


}
