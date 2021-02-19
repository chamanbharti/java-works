package com.junit.test.hello_world;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.hello_world.Calculation;
import com.junit.hello_world.Calculation2;

public class TestCalculation2 {

	  @BeforeClass  
	    public static void setUpBeforeClass() throws Exception {  
	        System.out.println("before class");  
	    } 
	  
	  @Before
	  public void setUp() throws Exception {
		  System.out.println("before");
	  }
	@Test
	public void testFindMax() {
//		assertEquals(4, Calculation.findMax(new int[] {1,2,4,2}));
//		assertEquals(-1, Calculation.findMax(new int[] {-12,-1,-3,-4,-2}));
		
		assertEquals(4, Calculation.findMax2(new int[] {1,3,4,2}));
		assertEquals(-1, Calculation.findMax2(new int[] {-12,-1,-3,-4,-2}));
	}
	
	 @Test  
	    public void testCube(){  
	        System.out.println("test case cube");  
	        assertEquals(27,Calculation2.cube(3));  
	    }  
	    @Test  
	    public void testReverseWord(){  
	        System.out.println("test case reverse word");  
	        //assertEquals("nahk si eman ym",Calculation2.reverseWord("my name is khan"));  //pass
	        assertEquals("nahk is eman ym",Calculation2.reverseWord("my name is khan")); //fail
	    }  
	    @After  
	    public void tearDown() throws Exception {  
	        System.out.println("after");  
	    }  
	  
	    @AfterClass  
	    public static void tearDownAfterClass() throws Exception {  
	        System.out.println("after class");  
	    }  
}
