package bridgelabz;
//importing packages
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//welcome statement
		System.out.println("Welcome to User Registration Program");
		//condition for last name
		String lastName ="^[A-Z]{1}[a-zA-Z]{2,}$";
		System.out.println("Enter the  Last Name");
		String  input =sc.next();
		Pattern pattern =Pattern.compile(lastName);
		Matcher matcher = pattern.matcher(input);
		System.out.println("Input String matches regex-"+matcher.matches());
		sc.close();
		

	}

}
