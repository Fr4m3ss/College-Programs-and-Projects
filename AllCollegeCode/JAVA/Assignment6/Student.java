//Francesco Messina, Assignment 6, Student Class
//Student.java

//Add comments at appropriate lines, indicating where changes where made

//You should be able to serialize the Student class after making changes to it

import java.util.ArrayList;
//Importing Serializable
import java.io.Serializable;

//Adding implementation of serializable
public class Student implements Serializable{ 

	//data
    private ArrayList<Double> testGrades;
    private ArrayList<Double> hwGrades;
    private String fname, lname;
    private double grade = 0;		
    private static int totalStudents = 0;	
    
    //constructors
    public Student() {this("", "");}
    public Student(String f, String l) {
		testGrades = new ArrayList<Double>();
		hwGrades = new ArrayList<Double>();
		fname = new String(f);
		lname = new String(l);
		totalStudents++;
    }

    //gets
    public static int getNumStudents() {
        return totalStudents;
    }
    public double getGrade() {
        return grade;
    }
    public String getLast() {
        return lname;
    }
    public String getFirst() {
        return fname;
    }

    //sets, resets
    public void setname(String f, String l) {
        fname = f; 
        lname = l;
    }
    public static void resetStudentCount() {
        totalStudents = 0;
    }
       
    //Increments, Decrements
    public static void incrementStudentCount() {
        totalStudents++;
    }
    public static void decrementStudentCount() {
        totalStudents--;
    }
    
    //Add grade; calculate new average 
    public void addHW(double hw) {
        hwGrades.add(hw); 
        calcGrade();
    }
    public void addTest(double test) {
        testGrades.add(test); 
        calcGrade();
    }

    //Calculate final grade with tests and homeworks counting for 50% each
    //Returns true if there are values for both test and homework
    //False if either has zero entries
    public boolean calcGrade() {
		double testAvg = 0;
		double hwAvg = 0;
		boolean complete = true;
	
		for (Double d: testGrades) 
            testAvg += d;	
		for (Double d: hwGrades) 
            hwAvg += d;
	
		if (testGrades.size() >= 1) 
            testAvg /= testGrades.size();
		else 
            complete = false;
	
		if (hwGrades.size() >= 1) 
            hwAvg /= hwGrades.size();
	 	else 
            complete = false;
	
		grade = (testAvg + hwAvg) / 2;
		return complete;
    }
    
    //override of toString to print out student information
    public String toString() {
		StringBuilder theString = new StringBuilder("");
		theString.append("First name: " + fname);
		theString.append("\nLast name: " + lname);
		theString.append("\nFinal Grade: " + grade + "\n");
		return theString.toString();
    }   
}








