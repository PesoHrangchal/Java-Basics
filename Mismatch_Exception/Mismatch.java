package Mismatch_Exception;

/*Write a program to throw a user-defined exception "String Mismatch Exception", if
two strings are not equal (ignore the case)..*/

import java.util.Scanner;

public class Mismatch {
	
		public static void main(String args[]) throws StringMismatchException {
			Scanner sc= new Scanner(System.in);
	String str="welcomehome";
	System.out.println(str);
	System.out.print("Enter the  String same as shown above:");
	String a=sc.next();
		try {
			if (str.equalsIgnoreCase(a)) {
				System.out.println("The entered string is  equal to the given string");
			}else {
				throw new  StringMismatchException("The entered string doesn't match the given string");
			}
			
		} catch ( StringMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
