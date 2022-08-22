package app.pack;
import java.util.*;
public class fibonacci_series {
	public static void main(String args[]) {
		int n=1;
		int a=0,b=1,c;
		do{
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
			n++;
		}while(n<=8);
	}
}
