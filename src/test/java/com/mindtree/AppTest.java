package com.mindtree;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppTest {
  @Test
  public void Test1() {
	  System.out.println("At test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before test");
  }
  
  @AfterMethod
  public void postCondition(){
	  System.out.println("Post Test");
  }

}
