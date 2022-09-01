import java.util.*;

class main
{
	public static void main(String [] args)
	{
		String x = "Elyssa";
		String y = "Yuri";
		String ans  = "";
		if(x == "Yuri")
		{
			ans = x + y;
		}
		else
		{
			ans = y+x;
		}
		System.out.println("Hello World " + x + " "+y+" "+ans);
	}
};
