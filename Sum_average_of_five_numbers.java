package app.pack;
//Write a program in Java to input 5 numbers from keyboard and find their sum and average.
import java.util.Scanner;

public class Sum_average_of_five_numbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter five numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		float avg=(float)sum/5;
		System.out.println("Sum="+sum);
		System.out.print("Average="+avg);
	}
}
