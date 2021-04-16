package com.logicbig;

import org.junit.runner.JUnitCore;

public class ProgrammaticTestRunner {

	public static void main(String[] args) {
	      JUnitCore junit = new JUnitCore();
	      junit.run(LifeCycleTest.class);
	      System.out.println("----------------");
	      junit.run(LifeCycleTest.class);
	  }
}
