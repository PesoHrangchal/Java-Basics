package Sorting;

import java.util.Scanner;

//write a java program to input an array and use  a method which is having the array
//and the searched element in argument.Search the element using binary search and if 
//element is found return true otherwise return false.
public class B_Search_Method {
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();	
		}
		System.out.println("Enter the element to search:");
		int to_find=s.nextInt();
		boolean result=Search(to_find,arr);
		System.out.print(result);
	}
	static boolean Search(int a, int b[]) {
		int first=0;
		int last=b.length-1;
		int mid;
		while(last-first>1) {
		    mid=(first+last)/2;
			if(a>b[mid])
				first=mid+1;
			else
				last=mid-1;
		}
			if(a==b[first]){
				return true;
			}
			else if(b[last]==a) {
				return true;
				
			}else 
				return false;
	}
}
