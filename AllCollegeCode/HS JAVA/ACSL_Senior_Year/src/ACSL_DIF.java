import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ACSL_DIF {
	/*
	Framess
	*/
	public static void main(String[] args) throws FileNotFoundException {
		int runs = 0;
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(new File("diffinput.txt"));
		while(runs !=5)
		{
			runs++;
			String word = "";
			int wordL = 0;
			int start = 0;
			int runagain = 0;
			String A = input.nextLine();
			String B = input.nextLine();
			String anospace = "";
			String bnospace = "";
			String commonstringa = "";
			String commonstringb = "";
			String commonstringanospace = "";
			String commonstringbnospace = "";
			String algo2 = "";
			String value = "";
			String[] alist = A.split("\\W+");
			String[] blist = B.split("\\W+");
			
			for(int i = 0; i<alist.length;i++)
			{
			anospace=anospace+alist[i];
			}
			for(int i = 0; i<blist.length;i++)
			{
			bnospace=bnospace+blist[i];
			}
			for(int i = 0; i<alist.length;i++)
			{
				word=alist[i];
				wordL=word.length();
				start=0;
				runagain=0;
				for(int j = 0; j<blist.length;j++)
				{
					if(blist[j].length()>=alist[i].length())
					{
						
						if(alist[i].equals(blist[j].substring(start, start+wordL))&&runagain==0)
						{
							
							if(commonstringa.equals(""))
							{
								commonstringa=commonstringa+alist[i];
								runagain=1;
							}
							else
							{
								commonstringa=commonstringa+" "+alist[i];
								runagain=1;
							}
						
							commonstringanospace=commonstringanospace+alist[i];
							
							bnospace=bnospace.replaceFirst(bnospace.substring(start, wordL), "");
							
						}
					}
				}
			}
			for(int i = 0; i<blist.length;i++)
			{
				word= blist[i];
				wordL=word.length();
				start=0;
				runagain=0;
				for(int j = 0; j<alist.length;j++)
				{
					if(alist[j].length()>=blist[i].length())
					{
						if(blist[i].equals(alist[j].substring(start, start+wordL))&&runagain==0)
						{
							if(commonstringb.equals(""))
							{
								commonstringb=commonstringb+blist[i];
								runagain=1;
							}
							else
							{
								commonstringb=commonstringb+" "+blist[i];
								runagain=1;
							}
						
							commonstringbnospace=commonstringbnospace+blist[i];
							
							anospace=anospace.replaceFirst(anospace.substring(start, wordL), "");
							
						}
					}
				}
			}
		//ALGORITHM 2_----------------------------------------------------------------------------------------------------------------------------------
		for(int i = 0; i<commonstringanospace.length();i++)
		{
			value=commonstringanospace.substring(i, i+1);
			for(int j = 0; j<commonstringbnospace.length();j++)
			{
				if (value.equals(commonstringbnospace.substring(j, j+1)))
				{
					algo2=algo2+value;
					commonstringbnospace=commonstringbnospace.replaceFirst(commonstringbnospace.substring(0, j+1), "");
					j=commonstringbnospace.length()-1;
				}
			}
			if (algo2.equals(""))
			{
				algo2="NONE";
			}
		}
		System.out.println(algo2);
		}
		}
		

}