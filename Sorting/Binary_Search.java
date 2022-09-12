package Sorting;

//Write a java program to input an array and search an element using binary search
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
		int last=n-1;
		int mid;
		while(last-first>1) {
		    mid=(first+last)/2;
			if(search>arr[mid])
				first=mid+1;
			else
				last=mid-1;
		}
			if(search==arr[first]){
				System.out.println(search+" is found at index "+first);
			}
			else if(arr[last]==search) {
				System.out.println(search+" is found at index "+(last));
				
			}else 
				System.out.println(search+" is not found!");
	}
}
