package app.pack;

import java.util.Scanner;

public class Multiply_without_operator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int product=0;
		for(int i=0;i<b;i++) {
			product+=a;
		}
		System.out.print(product);
	}
}
