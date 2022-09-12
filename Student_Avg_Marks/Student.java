package Student_Avg_Marks;
import java.util.*;
/*Write a program to print the roll number and average marks of 8 students
 *in three subjects (each out of 100). The marks are entered by user.
 */
public class Student {
	public static void main(String[] args) {
        int roll;
        float a,b,c;
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=8; i++){
                System.out.print("Enter Your Roll Number: ");
                roll = sc.nextInt();

                System.out.print("Enter the marks in English: ");
                a= sc.nextFloat();
                System.out.print("Enter the marks in Science: ");
                b = sc.nextFloat();
                System.out.print("Enter the marks in Maths: ");
                c = sc.nextFloat();

                if(a<=100 && b<=100 && c<=100){
                	float avg = (a + b + c) / 3;
                    System.out.printf("Average Mark of Roll Number %s is:  %.1f\n", roll, avg);
                }
                else{
                    System.out.println("Please Enter Your Marks: ");
                }
            }
    }
}