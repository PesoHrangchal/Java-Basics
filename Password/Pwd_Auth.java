package Password;

/*2.)Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.*/

import java.util.Scanner;

public class Pwd_Auth {
	  public static void main(String args[]) throws Incorrect_pwd_exe{
	    {
	        String   a, b;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter Password: ");
	        a = s.nextLine();
	        
	        System.out.print("Verify password: ");
	        b = s.nextLine();
	        try {
	        		if(a.equals(b))
	        		{
	        			System.out.println("Authentication Successful");
	        		}
	        		else
	        		{
	        			throw new Incorrect_pwd_exe("Authentication Failure");
	        		}
	        } catch(Incorrect_pwd_exe e) {
	        	System.out.println(e.getMessage());
	        }
	        }
	    }
}
