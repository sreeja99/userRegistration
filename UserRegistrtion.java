package bridgelabz;
//importing packages
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {
//	String FirstName ="^[A-Z]{1}[a-zA-Z]{2,}$";
//	Pattern pattern =Pattern.compile(FirstName);
//	String LastName ="^[A-Z]{1}[a-zA-Z]{2,}$";
//	Pattern pattern1 =Pattern.compile(LastName);
//	String EMAIL = "^abc(.[a-z0-9]{0,})?@bl.co(.in)?$";
//	Pattern pattern2 =Pattern.compile(EMAIL);
//	String MOBILE = "^[0-9]{2}[\s][0-9]{10}$";
//	Pattern  pattern3 =Pattern.compile(MOBILE);
//	String PASSWORD ="^((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{8,})$";
//	Pattern pattern4 =Pattern.compile(PASSWORD);
	private String firstName;
	private String lastName;
	private String mobile;
	private String password;
	private String email;
     public boolean firName(String firstName) {
		return (firstName.matches("^[A-Z]{1}[a-zA-Z]{2,}$"));
	}
	public boolean lastName(String lastName) { 
		
		return (lastName.matches("^[A-Z]{1}[a-zA-Z]{2,}$"));
	}
	public boolean email(String email) {
		return (email.matches("^abc(.[a-z0-9]{0,})?@bl.co(.in)?$"));
	}
	public  boolean mobile(String mobile) {
		 return(mobile.matches("^[0-9]{2}[\s][0-9]{10}$"));
	}
	public boolean password(String password) {
		return(password.matches("^((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{8,})$"));

	}


	
	public static void main(String[] args) throws InvalidException{
		UserRegistrtion obj=new UserRegistrtion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		System.out.println("Email");
		String Email=sc.nextLine();
		System.out.println("Enter the Mobile Format");
		String Mobile=sc.nextLine();
		System.out.println("Enter the  Password");
		String  Password=sc.nextLine();
 //       System.out.println("Is Input matching first name:"+obj.firName(firstName));
//		System.out.println("Is Input matching last name:"+obj.lastName(lastName));
//		System.out.println("Is Input matching email:"+obj.email(Email));
//		System.out.println("Is Input matching mobile :"+obj.mobile(Mobile));
//		System.out.println("Is Input matching password:"+obj.password(Password));
		boolean fName = obj.firName(firstName);
		try {
			if(fName=true) {
				System.out.println("First Name is:"+firstName);
			}
			else {
				throw new InvalidException("Invalid Password");
		}}catch(Exception e) {
			System.out.println("Exception : " + e);
		}
		boolean lName = obj.lastName(lastName);
		try {
			if(lName=true) {
				System.out.println("Last Name is:"+lastName);
			}
			else {
				throw new InvalidException("Invalid LAstName");
			}
		}catch(Exception e) {
			System.out.println("Exception : " + e);
		}
		boolean mob = obj.mobile(Mobile);
		try {
			if(mob=true) {
				System.out.println("Mobile:"+Mobile);
			}
			else {
				throw new InvalidException("Invalid mobile");
			}
		}catch(Exception e) {
			System.out.println("Exception : " + e);
		}
		boolean e_mail = obj.email(Email);
		try {
			if(e_mail=true) {
				System.out.println("Email is:"+Email);
			}
			else {
				throw new InvalidException("Invalid Email");
		}}catch(Exception e) {
			System.out.println("Exception : " + e);
		}
		boolean Pass = obj.password(Password);
		try {
			if(Pass=true) {
				System.out.println(" Password is:"+Password);
			}
			else {
				throw new InvalidException("Invalid Password");
		}
			}
		catch(Exception e) {
			System.out.println("Exception : " + e);
		}

		

	}

}
