package bridgelabz;
//importing packages
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {
	String FirstName ="^[A-Z]{1}[a-zA-Z]{2,}$";
	Pattern pattern =Pattern.compile(FirstName);
	String LastName ="^[A-Z]{1}[a-zA-Z]{2,}$";
	Pattern pattern1 =Pattern.compile(LastName);
	String EMAIL = "^abc(.[a-z0-9]{0,})?@bl.co(.in)?$";
	Pattern pattern2 =Pattern.compile(EMAIL);
	String MOBILE = "^[0-9]{2}[\s][0-9]{10}$";
	Pattern  pattern3 =Pattern.compile(MOBILE);
	String PASSWORD ="^((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{8,})$";
	Pattern pattern4 =Pattern.compile(PASSWORD);
	private String firstName;
	private String lastName;
	private String mobile;
	private String password;
	private String email;
     public boolean firName(String firstName) {
		Matcher matcher=pattern.matcher(firstName);
		return (matcher.matches());
	}
	public boolean lastName(String lastName) { 
		Matcher matcher1=pattern1.matcher(lastName);
		return (matcher1.matches());
	}
	public boolean email(String email) {
		Matcher matcher2=pattern2.matcher(email);
		return (matcher2.matches());
	}
	public  boolean mobile(String mobile) {
		Matcher matcher3 = pattern3.matcher(mobile);
		 return(matcher3.matches());
	}
	public boolean password(String password) {
		Matcher matcher4 = pattern4.matcher(password);
		return(matcher4.matches());

	}


	
	public static void main(String[] args) {
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
        System.out.println("Is Input matching first name:"+obj.firName(firstName));
		System.out.println("Is Input matching last name:"+obj.lastName(lastName));
		System.out.println("Is Input matching email:"+obj.email(Email));
		System.out.println("Is Input matching mobile :"+obj.mobile(Mobile));
		System.out.println("Is Input matching password:"+obj.password(Password));

		

	}

}
