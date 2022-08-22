package app.pack;
import java.util.*;
public class Arithmetic_Operations {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Choose the following Aritmetic Operations:-");
		System.out.println("Enter + for Addition.");
		System.out.println("Enter * for Multiplication.");
		System.out.println("Enter / for Division.");
		System.out.println("Enter - for Subtraction.");
		System.out.println("Enter Q to exit.");
		System.out.print("Enter your choice:");
		char op=sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.print("Enter two numbers to add:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Sum="+(a+b));
			break;
		case '*':
			System.out.print("Enter two numbers to multiply:");
			int c=sc.nextInt();
			int d=sc.nextInt();
			System.out.println("Product="+(c*d));
			break;
		case '/':
			System.out.print("Enter two numbers to divide:");
			int e=sc.nextInt();
			int f=sc.nextInt();
			System.out.println("Answer="+(float)(e/f));
			break;
		case '-':
			System.out.print("Enter two numbers to subtract:");
			int g=sc.nextInt();
			int h=sc.nextInt();
			System.out.println("Difference="+(g-h));
			break;
		case 'Q':
			System.exit(0);
			break;
		default:
			System.out.print("Invalid Input!");
			}
		}

	}
	
}
