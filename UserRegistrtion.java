package bridgelabz;
//importing packages
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {
	private String firstName;
	private String lastName;
	private String mobile;
	private String password;
	private String email;
	//method for checking first name
     public boolean firName(String firstName) throws InvalidException {
		if (firstName.matches("^[A-Z]{1}[a-zA-Z]{2,}$"))
			return true;
			else 
				throw new InvalidException ("Invalid FirstName");
	}
     //checking last name
	public boolean lastName(String lastName) throws InvalidException { 
		
		if(lastName.matches("^[A-Z]{1}[a-zA-Z]{2,}$"))
		     return true;
		 else
			 throw new InvalidException ("Invalid lastName ");	 
	}
	//checking email
	public boolean email(String email) throws InvalidException {
		if(email.matches("^abc(.[a-z0-9]{0,})?@bl.co(.in)?$"))
		     return true;
		else
			throw new InvalidException ("Invalid email");	
			
	}
	//checking mobile
	public  boolean mobile(String mobile) throws InvalidException {
		 if(mobile.matches("^[0-9]{2}[\s][0-9]{10}$"))
		     return true;
		 else
			 throw new InvalidException ("Invalid mobile ");	
	}
	//checking password
	public boolean password(String password) throws InvalidException {
		if(password.matches("^((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{8,})$"))
		     return true;
				 else
		 throw new InvalidException ("Invalid Password");	

	}


	
	public static void main(String[] args) throws InvalidException{
		UserRegistrtion obj=new UserRegistrtion();//object
		//taking inputs
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
       //try catch block
		try {
			System.out.println("Valid first name: "+obj.firName(firstName));
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Valid last name: "+obj.lastName(lastName));
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Valid Email: "+obj.email(Email));
		} catch (InvalidException e1) {
			e1.printStackTrace();
		}
		try {
			System.out.println("Valid Mobile number: "+obj.mobile(Mobile));
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Valid password: "+obj.password(Password));
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		// Patterns
}
}