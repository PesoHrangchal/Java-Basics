package String;

import java.util.Scanner;

//WAP to input a string and reverse it without using any inbuilt method.
public class Reverse_String {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.print(rev);
		}
}

