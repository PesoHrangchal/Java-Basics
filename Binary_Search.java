package New.java;

import java.util.Scanner;
public class Binary_Search {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" integers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to Search:");
		int search=sc.nextInt();
		int first=0;
		int mid;
		boolean flag=false;
		while(flag==false) {
		    mid=(first+n)/2;
			if(search==arr[mid]) {
				System.out.println(search+" is found at index "+mid);
				flag=true;
			}
			else if(search>arr[mid])
				first=mid+1;
			else
				n=mid-1;
		}
	}
}
