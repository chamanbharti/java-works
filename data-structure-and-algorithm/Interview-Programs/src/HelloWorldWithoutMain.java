// step 1
public class HelloWorldWithoutMain {
	
	static 
	{
	System.out.println("hello");
	System.exit(0);
	}
}
//step 2
public class Test {
static {
System.out.println("HOLAAAA");
System.exit(1);
}

}

//step 3
abstract class Test extends javafx.application.Application
{

static 
{
System.out.println("hello");
System.exit(0);
}

}

Read more: http://www.java67.com/2014/02/can-you-run-java-program-without-main-method.html#ixzz5V3qNBq00