//Francesco Messina, practice problem 1 (Compute and print the sum (product, average) of the elements of a numerical array.)
import java.util.Scanner;
import java.util.Random;

class arraySumAvg
{
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		Random r = new Random();
		
		//Input
		System.out.println("Input length of array");
		int leng = num.nextInt();
		
		int sum = 0;
		double avg = 0.0;
		
		int [] arr = new int[leng];

		//Randomizing Array Data
		for(int i = 0; i < leng; i++)
		{
			arr[i] = r.nextInt(10);
		}

		//Calculating sum/avg
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			avg += arr[i];
		}

		avg = avg/arr.length;

		//Output
		System.out.println("Array is: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nAverage is: " + avg + "\nSum is: " + sum);

		System.out.println("Insert Bounds for printing the array (Head, then tail): ");
		int h = num.nextInt();
		int t = num.nextInt();
		System.out.println();
		boundedArrayPrint(arr, h, t);

	}
	
	//practice problem 3 (A method that prints all array elements that are between two given values (parameters))
	static void boundedArrayPrint(int arr[], int head, int tail)
	{
		if(head >= 0 && tail <= arr.length)
		{
			System.out.println("Array values between " + head + " and " + tail + ": ");
			for(int i = head; i <= tail; i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
		else
		{
			System.out.println("Invalid bounds.");
		}
	}

}

