package Sorting;
//WAP to input an array in random order and then sort it using bubble sort and then
//search for a given element from that sorted array
import java.util.Scanner;

public class B_Sort_and_B_Search {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			}
		//print unsorted array
		System.out.println("Unsorted Array:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
		//sorting
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		//print sorted array
		System.out.println("Sorted Array:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
		System.out.print("Enter element to search:");
		int search=sc.nextInt();
		boolean flag=false;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==search) {
				System.out.println(search+" is found at index "+ k);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println(search+" is not found in the array!");
		}
	}
}
