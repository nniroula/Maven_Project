package firstMavenProject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.mavenProjectOne.UserLogIn;


public class TestLogin {
	UserLogIn ul = new UserLogIn();
	@Test
	public void invalidePasswordShouldFail() {
		int result = ul.userLogin("abc", "abc@123");
		assertEquals(0, result);
	}
	
	@Test
	public void validPasswordAndUsername() {
		int result2 = ul.userLogin("abc", "abc123");
		assertEquals(1, result2);
	}
}

