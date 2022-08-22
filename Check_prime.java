package app.pack;
import java.util.*;

public class Check_prime {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				flag=false;
				break;
		}
		if(flag==true) {
			System.out.print("Prime Number");
		}else {
			System.out.print("Not Prime Number");
		}
	}
}