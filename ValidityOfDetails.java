package bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

//import moodAnalyzer.MoodAnalyzer;

class ValidityOfDetails {

	@Test
	public void testFirstName() {
		//happy
		UserRegistrtion obj=new UserRegistrtion();
		boolean expected=true;
		boolean actual=obj.firName("Sreeja");
		Assert.assertEquals(expected, actual);
		//sad
		boolean expected1=false;
		boolean actual1=obj.firName("sreeja");
		Assert.assertEquals(expected1, actual1);
	}
	public void testlastName() {
		//happy
		UserRegistrtion obj=new UserRegistrtion();
		boolean expected=true;
		boolean actual=obj.lastName("Godishala");
		Assert.assertEquals(expected, actual);
		//sad
		boolean expected1=false;
		boolean actual1=obj.lastName("godishala");
		Assert.assertEquals(expected1, actual1);
	}
	public void testMobile() {
		//happy
		UserRegistrtion obj=new UserRegistrtion();
		boolean expected=true;
		boolean actual=obj.mobile("91 1234567890");
		Assert.assertEquals(expected, actual);
		//sad
		boolean expected1=false;
		boolean actual1=obj.mobile("38184798");
		Assert.assertEquals(expected1, actual1);
	}
	public void testEmail() {
		//happy
		UserRegistrtion obj=new UserRegistrtion();
		boolean expected=true;
		boolean actual=obj.email("abc@bl.co");
		Assert.assertEquals(expected, actual);
		//sad
		boolean expected1=false;
		boolean actual1=obj.email("ab@bl.co");
		Assert.assertEquals(expected1, actual1);
	}
	public void testPassword() {
		//happy
		UserRegistrtion obj=new UserRegistrtion();
		boolean expected=true;
		boolean actual=obj.password("sfaddT@3");
		Assert.assertEquals(expected, actual);
		//sad
		boolean expected1=false;
		boolean actual1=obj.password("hjh@3");
		Assert.assertEquals(expected1, actual1);
	}

}

