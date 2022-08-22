package app.pack;
import java.util.*;
public class Multiplication_table_of_n_numbers {
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter number of tables:");
			int n=s.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=10;j++) {
					System.out.println(i+"x"+j+"="+i*j);
				}
				System.out.println();
			}
		}
}
