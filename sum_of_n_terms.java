package app.pack;
import java.util.*;
public class sum_of_n_terms {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of terms:");
		int n=s.nextInt();
		float sum=0;
		for(float i=1;i<=n;i++) {
			sum=sum+(1/i);
		}
		System.out.print(sum);
	}
}
