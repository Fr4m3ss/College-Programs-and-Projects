
import java.util.*;

public class conversion {

 

   public static void main(String[] args) {

       // TODO Auto-generated method stub

       int i=1;

       int octnum[] =new int[9];

       Scanner in= new Scanner(System.in);

       // now convert decimal to octal

       int decnum = hex2decimal(in.next());

       while(decnum != 0)

       {

          octnum[i++] = decnum%8;

          decnum = decnum/8;
          

       }

      for(int j=8; j>0; j--)

          System.out.print(octnum[j]);

      

  

   }

     public static int hex2decimal(String s)

       {

                String digits = "0123456789ABCDEF";

                s = s.toUpperCase();

                int val = 0;

                for (int i = 0; i < s.length(); i++)

                {

                    char c = s.charAt(i);

                    int d = digits.indexOf(c);

                    val = 16*val + d;

                }

                return val;

       }

}

 