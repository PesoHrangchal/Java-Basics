package Password;
/*2.)Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.*/

public class Incorrect_pwd_exe extends Exception{
	Incorrect_pwd_exe(String str){
		System.out.println(str);
	}

}
