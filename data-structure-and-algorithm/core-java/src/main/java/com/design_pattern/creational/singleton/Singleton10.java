package design_pattern.creational.singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Emp implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	/*
	static final Emp obj = new Emp();
	private Emp(){}
	public static Emp getInstance(){
		return obj;
	}
	*/
	
	/*
	private static Emp obj ;
	private Emp(){}
	public static Emp getInstance(){
		if(obj == null) {
			obj = new Emp();
		}
		return obj;
	}
	
	*/
	
	/*
	private static Emp obj ;
	private Emp(){}
	static{
		try{
			obj=new Emp();
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static Emp getInstance() {
		return obj;
	}
	*/
	
	/*
	private static Emp obj ;
	private Emp(){}
	public static synchronized Emp getInstance() {
		if(obj == null) {
			obj = new Emp();
		}
		return obj;
	}
	
	*/
	
	/*
	private static Emp obj ;
	private Emp(){}
    public static Emp getInstance() {
		
		if(obj == null) {
			synchronized (Water.class) {
				if(obj == null) {
					obj = new Emp();
				}
			}
		}
		return obj;
	}
    */
    
    private Emp(){}
	private static class SingletonHelper{
		private static final Emp obj=new Emp();
	}
	
	public static Emp getInstance(){
		return SingletonHelper.obj;
	}
	/*
	 
	private static class Helper{
		private static final Emp obj = new Emp();
	}
	public static Emp getInstance(){
		return Helper.obj;
	}
	
	*/
//	protected Object readResolve() {
//		return getInstance();
//	}
	
}
public class Singleton10 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Emp obj=Emp.getInstance();
		//serialization
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println(obj.hashCode());
		oos.close();
		
		//deserialize from file to object
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp obj2=(Emp)ois.readObject();
		System.out.println(obj2.hashCode());
		ois.close();
	}
}
