package com.logicbig;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class MyServiceTest2 {

	@Test
	public void testDoSomething2() {
		MyService mock = Mockito.mock(MyService.class);
		Mockito.when(mock.doSomething()).thenReturn(10);//stubbing
		int i = mock.doSomething();
		Assert.assertEquals(i, 10);
	}
}
