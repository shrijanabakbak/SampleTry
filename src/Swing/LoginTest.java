package Swing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginTest {

	@Test
	void test() {
		Login ltest= new Login();
		
		boolean output= ltest.userLogin("Admin", "Admin");
		
		assertEquals(true,output);
	}

}
