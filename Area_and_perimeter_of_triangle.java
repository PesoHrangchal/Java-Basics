package app.pack;
/*Write a program to print the area and perimeter of a triangle 
 * having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
 * without any parameter in its constructor.*/
public class Area_and_perimeter_of_triangle {
	public static void main(String args[]) {
		int a=3;
		int b=4;
		int c=5;
		System.out.println(perimeter(a,b,c));
		System.out.print(area(a,b,c));
		}
	static int perimeter(int a,int b,int c) {
		return(a+b+c);
	}
	static double area(int a,int b,int c) {
		float s=(a+b+c)/2;
		float Area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return(Area);
	}
}
