//Frankie Messina 
//Side Note: I wrote position instead of pos for most because the way it looked started to bug me for some reason :P
import java.util.ArrayList;

public class ArrayWorksheet {
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public int findPosOfLargest(int[] num)
	{
		int max = num[0];
		int position = 0;
		for(int i = 0; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max = num[i];
				position = i;
			}
		}
		return position;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public Integer findLargest(ArrayList<Integer> num)
	{
		int max = num.get(0);
		int position = 0;
		for(int i = 0; i<num.size(); i++)
		{
			if(num.get(i)>max)
			{
				position = i;
			}
		}
		return position;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public int findPosOfLargest(ArrayList<String> str)
	{
		String max = str.get(0);
		int position = 0;
		for(int i = 0; i<str.size(); i++)
		{
			if(((str.get(i)).compareTo(max))<0)
			{
				position = i;
			}
		}
		return position;			
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public int[] createVectorFromArrayList(ArrayList<Integer> list)
	{
		int size = list.size();
		int [] vector = new int[size];
		for (int i = 0;i<list.size(); i++)
		{
			vector[i] = list.get(i);
		}
		return vector;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void reverse(ArrayList<String> str)
	{
		for(int i = str.size()-1; i>=0; i--)
		{
			System.out.print(str.get(i));
		}
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public int posInArray(int[] num, int value)
	{
		int position = -1;	
		for(int i = 0; i<num.length; i++)
		{
			if (num[i]==value)
			{
				position = i;
			}
		}
		return position;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public int posInArrayList(ArrayList<Integer> list, Integer s)
	{
		int position = -1;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==s)
			{
				position = i;
			}
		}
		return position;	
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void removeAll(ArrayList<Integer> num, Integer s)
	{
		for(int i=0; i<num.size();i++)
		{
			if(num.get(i)==s)
			{
				num.remove(i);
				i--;
			}
		}
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void insertIntoVector(String[] str, String ins)
	{
		String temp;
		int k;
		str[str.length-1]=ins;	
		
		for(int i=1;i<str.length;i++)
		{
			temp = str[i];
			k = i;
			while(k>0 && (str[k-1].compareTo(temp))>0)
			{
				str[k] = str[k-1];
				k--;
			}
			str[k] = temp;	
		}
	}

}
