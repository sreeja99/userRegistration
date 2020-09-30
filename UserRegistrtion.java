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
		//condition for password
		String PASSWORD ="^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
		System.out.println("Enter the  Password");
		String  input =sc.nextLine();
		Pattern pattern =Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(input);
		System.out.println("Input String matches regex-"+matcher.matches());
		sc.close();
		

	}

}
