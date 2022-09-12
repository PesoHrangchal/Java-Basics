package Mismatch_Exception;

/*Write a program to throw a user-defined exception "String Mismatch Exception", if
two strings are not equal (ignore the case).*/

public class StringMismatchException extends Exception {
	 StringMismatchException(String str){
		 System.out.println(str);
	 }

}
