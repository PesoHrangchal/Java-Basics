package pack1;

import java.util.Scanner;

/*Write a java program to input 5 elements of an array
 *and search for a number whether it is present in an 
 *array or not. If present print its position in the array.
 */
public class Array_Element {
	public static void main(String args[]) {
		int arr1[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("Enter the value for index "+i+":");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter a number to search in the array:");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<5;i++) {
			if(n==arr1[i]) {
				System.out.print(n+" is present in the array at index "+i);
				flag=true;
				break;
			}
		}
		if(flag!=true)
			System.out.println(n+" is not present in the array!");
		
	}
}
