package com.selenium;

import org.testng.annotations.Test;

public class testcase5 {
  @Test(groups = {"smoke"})
  public void display1() {
	  System.out.println("display");
  }
  @Test(groups = {"regression"})
  public void display2() {
	  System.out.println("display1");
  }
  @Test(groups = {"regression"})
  public void display3() {
	  System.out.println("display2");
  }
}
