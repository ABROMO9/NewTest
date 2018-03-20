package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
	
  @Test
  public void testSum() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("\nRunning Test -> testSum");
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumber(1, 2);
	  sa.assertEquals(result, 2);
	  System.out.println("\nLine after assert 1");
	  sa.assertEquals(result, 3);
	  System.out.println("\nLine after assert 2");
	  sa.assertAll();
  }
}
