package Sorting;
//Bubble Sort of array element
public class Bubble_sort {
	public static void main(String args[]) {
		int arr[]= {3,4,2,7,1,5};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
