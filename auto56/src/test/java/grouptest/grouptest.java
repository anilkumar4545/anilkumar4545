package grouptest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class grouptest {

	WebDriver driver;
	@Test(groups="flavour")
	public void f() {
		System.out.println("iam venila");
	}
		
		@Test(groups="fruit")
		public void g() {
			System.out.println("iam icecream");
		}
		}
	
	
	

	


