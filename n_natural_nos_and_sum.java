package app.pack;

import java.util.Scanner;

//Write a program in Java to display n terms of natural numbers and their sum.
public class n_natural_nos_and_sum {
	public static void main(String args[]) {
		System.out.print("Enter the number of terms:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.print("Sum="+sum);
	}
}
