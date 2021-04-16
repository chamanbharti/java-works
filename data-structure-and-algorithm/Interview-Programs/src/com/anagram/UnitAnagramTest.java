package com.anagram;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitAnagramTest {

	@Test public void testIsAnagram() { 
		assertTrue(Anagram1.isAnagram("word", "wrdo")); 
		assertTrue(Anagram2.isAnagram("mary", "army")); 
		assertTrue(Anagram2.isAnagram("stop", "tops")); 
		assertTrue(Anagram4.isAnagram("boat", "btoa")); 
		assertFalse(Anagram4.isAnagram("pure", "in")); 
		assertFalse(Anagram4.isAnagram("fill", "fil")); 
		assertFalse(Anagram4.isAnagram("b", "bbb")); 
		assertFalse(Anagram4.isAnagram("ccc", "ccccccc")); 
		assertTrue(Anagram4.isAnagram("a", "a")); 
		assertFalse(Anagram4.isAnagram("sleep", "slep")); 
		} 
	@Test public void testIAnagram() { 
		assertTrue(Anagram4.isAnagram("word", "wrdo")); 
		assertTrue(Anagram4.isAnagram("boat", "btoa")); 
		assertFalse(Anagram4.isAnagram("pure", "in")); 
		assertFalse(Anagram4.isAnagram("fill", "fil")); 
		assertTrue(Anagram4.isAnagram("a", "a")); 
		assertFalse(Anagram4.isAnagram("b", "bbb")); 
		assertFalse(Anagram4.isAnagram("ccc", "ccccccc")); 
		assertFalse(Anagram4.isAnagram("sleep", "slep")); 
		} 
	@Test public void testcheckAnagram() { 
		assertTrue(Anagram1.isAnagram("word", "wrdo")); 
		assertFalse(Anagram2.isAnagram("b", "bbb")); 
		assertFalse(Anagram4.isAnagram("ccc", "ccccccc")); 
		assertTrue(Anagram4.isAnagram("a", "a")); 
		assertFalse(Anagram4.isAnagram("sleep", "slep")); 
		assertTrue(Anagram4.isAnagram("boat", "btoa")); 
		assertFalse(Anagram4.isAnagram("pure", "in")); 
		assertFalse(Anagram4.isAnagram("fill", "fil")); 
		} 
}
/*
 Output 
 Testsuite: StringAnagramTest Tests run: 3, Failures: 0, Errors: 0, Time elapsed: 0.094 sec

 */