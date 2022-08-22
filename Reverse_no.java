package app.pack;
import java.util.*;
public class Reverse_no {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number of minimum two digits:");
		int n=s.nextInt();
		int rev=0;
		while(n>0) {
			int temp=n%10;
			rev=rev*10+temp;
			n/=10;
		}
		System.out.print("Reverse="+rev);
	}
}