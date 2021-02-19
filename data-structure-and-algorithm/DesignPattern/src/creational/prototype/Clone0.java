package creational.prototype;

class Student implements Cloneable{
	
	int rollno=0;
	String name=null;
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	void display(){
		System.out.println(rollno+" "+name);
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
}
public class Clone0 {
	public static void main(String[] args){
		
		Student s1 = new Student(11, "Chaman");
		s1.display();
		
		Student s2=null;
		try {
			s2 = (Student)s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		s2.display();
	}

}
