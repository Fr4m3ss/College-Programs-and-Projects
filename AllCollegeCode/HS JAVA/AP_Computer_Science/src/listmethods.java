package arraylistpractice;

import java.util.ArrayList;

public class listmethods {
	
	//1a [done]
	public int findPosOfLargest(int[] num)
	{
		int max = num[0];
		int pos = 0;
		
		for(int i = 0; i<num.length; i++)
			if(num[i]>max)
				pos = i;
		return pos;
	}
	
	//1b [done]
	public Integer findLargest(ArrayList<Integer> num)
	{
		int max = num.get(0);
		int pos = 0;
		
		for(int i = 0; i<num.size(); i++)
			if(num.get(i)>max)
				pos = i;
		return pos;
	}

	//1c [done]
	public int findPosOfLargest(ArrayList<String> str)
	{
		String max = str.get(0);
		int pos = 0;
		
		for(int i = 0; i<str.size(); i++)
			if(((str.get(i)).compareTo(max))<0)
				pos = i;
		return pos;
				
	}

	//2a [done]
	public int[] createVectorFromArrayList(ArrayList<Integer> list)
	{
		int size = list.size();
		int [] vector = new int[size];
			for (int i = 0;i<list.size(); i++)
				vector[i] = list.get(i);
		
		return vector;
	}
	
	//2b [done]
	public void reverse(ArrayList<String> str)
	{
		for(int i = str.size()-1; i>=0; i--)
			System.out.print(str.get(i));
	}
	
	//3a [done]
	public int posInArray(int[] num, int value)
	{
		int pos = -1;	
		for(int i = 0; i<num.length; i++)
			if (num[i]==value)
				pos = i;
		return pos;
	}

	//3b [done]
	public int posInArrayList(ArrayList<Integer> list, Integer s)
	{
		int pos = -1;
		for(int i=0;i<list.size();i++)
			if(list.get(i)==s)
				pos = i;
		return pos;
		
		
	}

	//4 [done]
	public void removeAll(ArrayList<Integer> num, Integer s)
	{
		for(int i=0; i<num.size();i++)
			if(num.get(i)==s)
				num.remove(i);
	}

	//5 [done]
	public void insertIntoVector(String[] str, String ins)
	{
		String temp;
		int j;
		str[str.length-1]=ins;	
		
		for(int i=1;i<str.length;i++)
		{
			temp = str[i];
			j = i;
			while(j>0 && (str[j-1].compareTo(temp))>0)
			{
				str[j] = str[j-1];
				j--;
			}
			str[j] = temp;	
		}
	}

}
