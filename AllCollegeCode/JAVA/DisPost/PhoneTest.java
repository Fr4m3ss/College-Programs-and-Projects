// Exercise 15.7 Solution: PhoneTest.java
// Testing the Phone class.
import java.util.Scanner;
import java.util.NoSuchElementException;

public class PhoneTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      Phone application = new Phone();
      System.out.print(
         "Enter phone number (digits greater than 1 only): ");

      try {
         application.calculate(scanner.nextInt());
      } 
      catch (NoSuchElementException elementException) {
         System.err.println("Error inputting data.");
      } 
   } 
} 
