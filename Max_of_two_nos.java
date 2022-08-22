package app.pack;
import java.util.*;

public class Max_of_two_nos {
	public static void main(String args[]) {
		System.out.print("Enter two numbers:");
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		if(a>b) {
			System.out.println(a);
		}else
			System.out.println(b);
	}
}
