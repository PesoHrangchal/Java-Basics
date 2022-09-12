package Matrix_Transpose;

import java.util.Scanner;
//Write a java program to print transpose of a matrix
public class Transpose_Matrix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row=sc.nextInt();
		System.out.println("Enter number of column:");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter element at index no. "+i+","+j+":");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Matrix:-");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transposed Matrix:-");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}

