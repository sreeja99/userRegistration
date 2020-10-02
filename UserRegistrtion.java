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
     public boolean firName(String firstName)  {
		return (firstName.matches("^[A-Z]{1}[a-zA-Z]{2,}$"));
	}
     //checking last name
	public boolean lastName(String lastName)  { 
		
		return(lastName.matches("^[A-Z]{1}[a-zA-Z]{2,}$"));
	}
	//checking email
	public boolean email(String email) {
		return(email.matches("^abc(.[a-z0-9]{0,})?@bl.co(.in)?$"));
		    
			
	}
	//checking mobile
	public  boolean mobile(String mobile)  {
		 return(mobile.matches("^[0-9]{2}[\s][0-9]{10}$"));	
	}
	//checking password
	public boolean password(String password)  {
		return(password.matches("^((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{8,})$"));	

	}


	
	public static void main(String[] args) {
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
       //printing 
			System.out.println("Valid first name: "+obj.firName(firstName));
		
			System.out.println("Valid last name: "+obj.lastName(lastName));
		
			System.out.println("Valid Email: "+obj.email(Email));
	
			System.out.println("Valid Mobile number: "+obj.mobile(Mobile));
		
		
			System.out.println("Valid password: "+obj.password(Password));
		
		// Patterns
}
}