package bridgelabz;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

//import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
class TestUserEmail {
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
