package com.logicbig;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class ProcessorTest {

	@Test
	public void processTest() {
		MyService myService = Mockito.mock(MyService.class);
		Mockito.when(myService.doSomething()).thenReturn(10);
		
		MyProcessor myProcessor = new MyProcessor(myService);
		String returnedValue = myProcessor.process();
		Assert.assertEquals(returnedValue, "My Integer is: 10");
	}
}
