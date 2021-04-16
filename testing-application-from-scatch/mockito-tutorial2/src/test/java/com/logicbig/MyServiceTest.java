package com.logicbig;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {

	@Test
	public void testDoSomething() {
		MyService mock = Mockito.mock(MyService.class);
		int i = mock.doSomething();
		Assert.assertEquals(i, 0);
	}
}
