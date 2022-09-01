//Frankie Messina
import java.util.*;
public class PhoneBook {
	public static void main(String[] args) {

		Scanner innum = new Scanner(System.in);
		Scanner instring = new Scanner(System.in);
		int choice = 0; 
		String name; 
		String number; 
		String zip;
		String search;
		ArrayList<personclass> book = new ArrayList<personclass>();
		
		while(choice!=8)
		{
        System.out.println("Welcome to your BRAND NEW PHONEBOOK :) Choose an action that you would like completed:");
        System.out.println("1. Create a new phonebook");
        System.out.println("2. Print your phonebook");
        System.out.println("3. Add person to your phonebook");
        System.out.println("4. Remove a person from your phonebook");
        System.out.println("5. Sort phonebook");
        System.out.println("6. Modify a person");
        System.out.println("7. Search for a person by name");
        System.out.println("8. Quit");
        System.out.print("Choice-");
        choice = innum.nextInt();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    
        if (choice==1)
        {
        System.out.println("-=Completed=-");	
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
        if (choice==2)
        {
        System.out.println(book);
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
        if (choice==3)
        {
        System.out.println("Enter the New Persons name, phone number, then zip code-");
        book.add(new personclass(instring.nextLine(),instring.nextLine(),instring.nextLine()));
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
        if (choice==4)
        {
        int r=0;
        System.out.println("What is the name of the person you would like to remove?");	
        String personname = instring.nextLine(); 
        for(int i=0;i<book.size();i++)
        	{
        	if(personname.equals(book.get(i).getName()))
        		{
        		book.remove(i);
        		r++;
        		}	
        	}
        if(r==0)
    	   {
    	   System.out.println("Person not found, please try again later.");
    	   }
        else
           {
           System.out.println("-=Remove Completed=-");	
           }
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~        
        if (choice==5)
        {
        int i,j,min;
       	personclass temp;
       	int n=book.size();
       	for(i=0;i<book.size()-1;i++)
       		{
       		min=i;
           	for(j=i+1;j<n;j++)
           		 if(book.get(j).compareTo(book.get(min))<0)
           			 min=j;
           		 if(min!=i)
           		 	{
           			 temp=book.get(i);
           			 book.set(i,book.get(min));
           			 book.set(min,temp);
           		 	}
           	}
       			
       	System.out.println("-=Sorted=-");
		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                
        if(choice==6) 
        {
        int p=0;
        System.out.println("Modify which person: ");
        search = instring.nextLine();
        for(int k = 0; k < book.size(); k++)
        	{
        	if(search.equals(book.get(k).getName()))
        		{
        		System.out.println("Person found. Enter new information: ");
        		personclass temp = new personclass(instring.nextLine(),instring.nextLine(),instring.nextLine());
        		book.set(k,temp);
        		p++;
        		}
        	}
        if(p==0)
        {
        	System.out.println("Person not found, retry action.");
        }
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~              
        if(choice==7)
        {
       	int c=0;
        System.out.print("Search for (by name): ");
        search = instring.nextLine();
        for(int j = 0; j < book.size(); j++)
             {
             if(search.equals(book.get(j).getName()))
                  {
                  System.out.println("Person found in index "+j);
                  c++;
                  System.out.println("Their info is as follows: "+book.get(j));
                  }
             }
        if(c==0)
        	{
        	System.out.println("Person not found, retry action.");
        	}
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~        
        if (choice==8)
        {
        System.out.println("Goodbye :)");
        	break;	
        }
        
		
        }
	}

}