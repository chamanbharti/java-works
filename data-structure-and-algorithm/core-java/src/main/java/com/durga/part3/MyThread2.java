package thread.durga.part3;

class MyThread_ extends Thread{
	
}
public class MyThread2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());//Thread[main,5,main]
		System.out.println(Thread.currentThread().getName());//main
		
		MyThread_ t = new MyThread_();
		System.out.println(t.getName());//Thread-0
		//set thread name
		Thread.currentThread().setName("Chaman");
		System.out.println(Thread.currentThread().getName());//Chaman
		
	}
}
