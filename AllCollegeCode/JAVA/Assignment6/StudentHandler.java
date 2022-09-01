//Francesco Messina, Assignment 6, Student Handler class

import java.util.ArrayList;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.File;
import java.util.InputMismatchException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.StreamCorruptedException;

public class StudentHandler
{
	public ArrayList<Student> students;
	
	public StudentHandler()
	{
		students = new ArrayList<Student>();	
	}
	
	void saveStudents(Scanner s) throws Exception
	{
		try
		{
			s.nextLine();
			System.out.print("Please input the filename to save as: ");
			String fileName = s.nextLine();
			OutputStream os = new FileOutputStream(fileName);
			os = new BufferedOutputStream(os);
			os = new ObjectOutputStream(os);
			for(int i = 0; i < students.size(); i++)
			{
				((ObjectOutputStream) os).writeObject(students.get(i));
			}
			os.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error reading file: please try again");
		}
	}

	void loadStudents(Scanner s) throws Exception
	{
		try
		{
			boolean temp = true;
			s.nextLine();
			clearAllStudents();
			System.out.print("Please input the filename to load from: ");
			String fileName = s.nextLine();
			InputStream is = new FileInputStream(fileName);
			is = new BufferedInputStream(is);
			is = new ObjectInputStream(is);
			while(temp)
			{
				try
				{
					students.add((Student)((ObjectInputStream) is).readObject());
				}
				catch(EOFException e)
				{
					temp = false;	
				}
			}
			is.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error reading file: please try again");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error: File does not consist of only Student objects, please try another file.");
		}
		catch(StreamCorruptedException e)
		{
			System.out.println("Error: File does not consist of only Student objects, please try another file.");
		}
	}

	void addStudent(Scanner s)
	{
		boolean worked = false;
		while(!worked)
		{
			s.nextLine();
			System.out.println("Please input a first name: ");
			String first = s.nextLine();
			System.out.println("\nPlease input a last name: ");
			String last = s.nextLine();

			Student temp = new Student(first, last);
			try
			{
				System.out.print("\nPlease input student homework grades one at a time (negative value to finish): ");	
				double hwGrade = s.nextDouble(); 
				System.out.println("\n");
				if(hwGrade >= 0)
				{
					temp.addHW(hwGrade);
				}
				while(hwGrade >= 0)
				{
					System.out.print("\nPlease add another homework grade (negative value to finish): ");
					hwGrade = s.nextDouble();
					System.out.println("\n");
					if(hwGrade >= 0)
					{
						temp.addHW(hwGrade);
					}
				}
				
				System.out.print("\nPlease input student test grades one at a time (negative value to finish): ");
				double testGrade = s.nextDouble();
				System.out.println("\n");
				if(testGrade >= 0)
				{
					temp.addTest(testGrade);
				}
				while(testGrade >= 0)
				{
					System.out.print("\nPlease add another test grade (negative value to finish): ");
					testGrade = s.nextDouble();
					System.out.println("\n");
					if(testGrade >= 0)
					{
						temp.addTest(testGrade);
					}
				}
				students.add(temp);
				worked = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input, please try inputting the student again");
				temp.decrementStudentCount();
				s.next();
			}
		}
	}

	void printAllStudents()
	{	
		int max = 0;
		if(students.size() != 0)
		{
			max = students.get(students.size()-1).getNumStudents();
		}
		for(int i = 0; i < max; i++)
		{
			System.out.println(students.get(i));
		}
			if(max == 0)
			{
				System.out.println();
			}
			System.out.println("Printed " + max + " Student Records");
	}

	void clearAllStudents()
	{
		students.clear();
	}

	public static void main(String args[]) throws Exception
	{
		StudentHandler s = new StudentHandler();
		boolean valid = false;
		int choice = 0;
		Scanner num = new Scanner(System.in);

		while(choice != 6 || (choice <= 0 || choice > 6))
		{
			choice = 0;
			System.out.println("\n\n1: Print out all loaded students \n2: Add student \n3: Clear students \n4: Save students to file \n5: Load students from file \n6: Quit ");
			valid = false;
			
			System.out.print("\nPlease input the number of your choice: ");

			while(!valid)
			{
				try
				{
					choice = num.nextInt();
					valid = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Invalid choice, try again.");
					num.next();
				}
			}
			if(choice <= 0 || choice > 6)
			{
				System.out.println("Invalid choice, try again.");
			}
			
			if(choice == 1)
			{
				s.printAllStudents();
			}
			else if(choice == 2)
			{
				s.addStudent(num);
			}
			else if(choice == 3)
			{
				s.clearAllStudents();
			}
			else if(choice == 4)
			{
				s.saveStudents(num);	
			}
			else if(choice == 5)
			{
				s.loadStudents(num);
			}
			else if(choice == 6)
			{
				System.out.println("Goodbye!");
			}
		}
	}
}
