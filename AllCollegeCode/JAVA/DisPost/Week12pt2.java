//Francesco Messina, Discussion post week 12, Write a generic method that swaps just the first and last elements of an array
import java.util.Collections;

public class Week12pt2<T>
{
	private T[] array;
	private int size;

	public Week12pt2(T[] temp, int tempSize)
	{
		array = temp;
		size = tempSize;
	}
	
	public void reverseArray()
	{
		T temp = array[0];
		array[0] = array[size];
		array[size] = temp;
	}
}
