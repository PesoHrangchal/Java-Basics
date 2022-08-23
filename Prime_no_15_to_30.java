package app.pack;
import java.util.*;
public class Prime_no_15_to_30 {
	public static void main(String args[]) {
		for(int i=15;i<30;i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) 
				flag=true;
			}
			if(flag==false) {
				System.out.println(i);
			}
		}
	}
}
