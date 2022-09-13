package String;
//Write a program to delete all consonants from the string "Hello, have a good day".
public class Del_consonant {
	public static void main(String args[]) {
		String str="Hello, have a good day.";
		char vowels[]= {'a','e','i','o','u','A','E','I','O','U'};
		String sb;
		for(int i=0;i<sb.length();i++) {
			for(int j=0;j<vowels.length;j++) {
				if(sb.charAt(i)!=vowels[j]){
					sb.deleteCharAt(i);
				}
			}
		}
		System.out.print(sb);
	}
}

