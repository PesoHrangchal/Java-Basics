package app.pack;
import java.util.*;
public class Addition_using_do_while {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.print("Enter two number to be added:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
			System.out.print("Press 'y' and then press enter to perform another addition:");
			ch=sc.next().charAt(0);
		}while(ch=='y');
	}
}
