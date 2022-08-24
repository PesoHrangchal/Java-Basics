package app.pack;
import java.util.*;
public class Consonant_or_vowel {
		public static void main(String args[]) {
			Scanner c=new Scanner(System.in);
			System.out.print("Enter any letter:");
			char a=c.next().charAt(0);
			boolean flag=false;
			if(a>='A'&&a<='Z'||a>='a'&&a<='z') {
				if(a<='z'||(int)a<'Z') {
					if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U') {
						System.out.println("Vowel");
						flag=true;
					}
					else {
						System.out.println("Consonant");
						flag=true;
					}
				}
			}
			if(flag==false)
				System.out.print("Error! Invalid Input.");
		}
	}
