package com.junit4.sample;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class SampleTest {

private Collection collection;
    
    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code        
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    }
 
    @Before
    public void setUp() {
        collection = new ArrayList();
    }
    
    @After
    public void tearDown() {
        collection.clear();
    }
 
    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
    }
    
    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
    }
    
    @Test
    public void whenAssertingEquality_thenEqual() {
    	String expected = "Chaman";
    	String actual = "Chaman";
    	assertEquals(expected, actual);
    }
}
