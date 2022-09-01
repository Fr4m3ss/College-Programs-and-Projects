import java.util.*;

public class GOOGLE_INTERVIEW_SUBSEQUENCE {
	/*
	Framess
	*/
	public static void main(String[] args) {
	Scanner num = new Scanner (System.in);
	Scanner str = new Scanner (System.in);

	String answer="";
	String tempAnswer="";
	int continu=0;
		
		System.out.println("Input STR 1");
		String s1 = str.nextLine();
		System.out.println("Input STR 2");
		String s2 = str.nextLine();
		
		for(int i=0; i<s1.length(); i++)
		{
			continu=i;	
			for(int k=0; k<s2.length(); k++)
			{
				if (s1.substring(continu, continu+1).equals(s2.substring(k, k+1)))
				{
					tempAnswer=tempAnswer.substring(0,tempAnswer.length())+s2.substring(k, k+1);
					System.out.println(tempAnswer);
					if(k==(s2.length()-1))
					{
						if(tempAnswer.length()> answer.length())
						{
						answer=tempAnswer;
						}
						tempAnswer="";
					}
				}
				if(s1.length()!=continu&&s2.length()!=continu)
				{
				continu++;
				}
			}
		}
		System.out.println("The answer is "+answer);
	}

}
