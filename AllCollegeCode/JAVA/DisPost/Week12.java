//Francesco Messina, Discussion post week 12, Write a generic method that can reverse all elements in an array
import java.util.Collections;

public class Week12<T>
{
	private T[] array;
	private int size;

	public Week12(T[] temp, int tempSize)
	{
		array = temp;
		size = tempSize;
	}
	
	public void reverseArray()
	{
		for(int i = 0; i < size/2; i++)
		{
			T temp = array[i];
			array[i] = array[size - i - 1];		
			array[i - size - 1] = temp;
		}
	}
}
