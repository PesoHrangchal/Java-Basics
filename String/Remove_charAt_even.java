package String;

import java.util.Scanner;

//write a java program to remove the characters at even indexes 
//and then print the new string without using any method for removing
public class Remove_charAt_even {
	public static void main(String args[]) {
		Scanner c=new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=c.nextLine();
		String new_str="";
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				new_str+=str.charAt(i);
			}
		}
		System.out.println(new_str);
	}
}

