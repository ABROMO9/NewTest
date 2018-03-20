package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_EnableTimeout {
 
  @BeforeClass
  public void setUp() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void cleanUp() {
	  System.out.println("After class");
  }
  
  @Test(enabled=false)
  public void testMethod1() {
	  System.out.println("testMethod1");
  }
  
  @Test(timeOut=300)
  public void testMethod2() throws InterruptedException {
	  System.out.println("testMethod2");
	  Thread.sleep(200);
  }

}
