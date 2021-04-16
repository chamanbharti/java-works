package aop.hello_world;

import org.springframework.stereotype.Component;

@Component
public class Operation {

	public  void  sum(int x,int y) {
		System.out.println("sum is = "+(x+y));
	}
}
