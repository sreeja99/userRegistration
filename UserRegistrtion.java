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
		String EMAIL= "^abc([.+-][0-9])?([0-9]{1,3})?@[a-z0-9]{1,}.[a-z]{3}(.[a-z]{2,})?$";
		System.out.println("Enter the  Email");
		String  input =sc.nextLine();
		Pattern pattern =Pattern.compile(EMAIL);
		Matcher matcher = pattern.matcher(input);
		System.out.println("Input String matches regex-"+matcher.matches());
		sc.close();
		

	}

}
