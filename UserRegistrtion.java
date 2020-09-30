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
		//condition for email
	    String MOBILE = "^[0-9]{2}[\s][0-9]{10}$";
		System.out.println("Enter the  Mobile Format");
		String  input =sc.nextLine();
		Pattern pattern =Pattern.compile(MOBILE);
		Matcher matcher = pattern.matcher(input);
		System.out.println("Input String matches regex-"+matcher.matches());
		sc.close();
		

	}

}
