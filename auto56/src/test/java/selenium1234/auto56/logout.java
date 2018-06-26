package selenium1234.auto56;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class logout {
  @Test
  public void f() {
	  System.out.println("hi");
  }
  @BeforeClass
  public void beforeTest() {
	  System.out.println("hello");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("logout");
  }

}
