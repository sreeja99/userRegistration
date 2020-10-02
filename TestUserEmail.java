package bridgelabz;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class TestUserEmail {
	private String Input;
	private boolean Output;
	private UserRegistrtion userEmail;
	public TestUserEmail(String Input,boolean Output) {
		this.Input=Input;
		this.Output=Output;
	}
	@Before
	public void intialize() {
		userEmail = new UserRegistrtion();
	}
	@Parameterized.Parameters
	public static Collection emails() {
		return Arrays.asList(new Object [][] {{"abc@yahoo.com",true},{"abc@.com",true},{"abc@1.com",true}});
	}
	@Test
	public void testMultipleEntryTest() {
	System.out.println("Input:"+Input);
	Assert.assertEquals(Output,userEmail.email(Input));
	}
}


