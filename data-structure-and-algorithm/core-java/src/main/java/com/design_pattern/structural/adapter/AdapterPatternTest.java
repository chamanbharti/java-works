package design_pattern.structural.adapter;
/**
  So first of all we will have two classes – Volt (to measure volts) and Socket (producing constant volts of 120V).
 */

class Volt {
	
	private int volts;
	
	public Volt(int v) {
		this.volts = v;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
	
}

class Socket {
	
	public Volt getVolt() {
		return new Volt(120);
	}
}
/**
Now we want to build an adapter that can produce 3 volts, 12 volts and
default 120 volts. So first of all we will create an adapter interface with these
methods.
 */
interface SocketAdapter {
		
	public Volt get120Volt();
	public Volt get12Volt();
	public Volt get3Volt();
}
/**
Two Way Adapter Pattern
While implementing Adapter pattern, there are two approaches – class
adapter and object adapter, however both these approaches produce same
result.
1. Class Adapter – This form uses java inheritance and extends the
source interface, in our case Socket class.
2. Object Adapter – This form uses Java Composition and adapter
contains the source object.
B. Class Adapter Implementation
Here is the class adapter approach implementation of our adapter.

Using inheritance for adapter pattern
 */
class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = get12Volt();
		return convertVolt(v, 40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}

/**
 C. Object Adapter Implementation
 Here is the Object adapter implementation of our adapter.
 */
class SocketObjectAdapterImpl implements SocketAdapter {
	
	//Using Composition for adapter pattern
	private Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}

/**
Notice that both the adapter implementations are almost same and they
implement the SocketAdapter interface. The adapter interface can also be an
abstract class.
Here is a test program to consume our adapter implementation.
 */
public class AdapterPatternTest {

	public static void main(String[] args) {
		
		System.out.println("*** using testClassAdapter ***");
		testClassAdapter();
		System.out.println("*** using testObjectAdapter ***");
		testObjectAdapter();
	}
	
	private static void testClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(socketAdapter,3);
		System.out.println("v3 volts using object Adapter="+v3.getVolts());
		Volt v12 = getVolt(socketAdapter,12);
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		Volt v120 = getVolt(socketAdapter,120);
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
	
	private static void testObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketAdapter,3);
		System.out.println("v3 volts using object Adapter="+v3.getVolts());
		Volt v12 = getVolt(socketAdapter,12);
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		Volt v120 = getVolt(socketAdapter,120);
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
}
