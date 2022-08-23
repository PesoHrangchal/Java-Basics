package app.pack;

import java.util.Scanner;

public class power {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int p=1;
		for(int i=0;i<b;i++) {
			p*=a;
		}
		System.out.print(a+" raised to the power of "+b+"="+p);
	}
}
