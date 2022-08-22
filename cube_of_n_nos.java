package app.pack;
import java.util.*;
//Write a program in Java to display the cube of the number upto given an integer.
public class cube_of_n_nos {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of integers to display their cube:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int cube=i*i*i;
			System.out.println("Cube of "+i+"="+cube);
		}
	}
}
