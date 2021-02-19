package spring5.di.setter_constructor;

public class Student {

//	 String studentName;
	private int id;
	private String studentName;
	
	//setter getter
//	public String getStudentName() {
//		return studentName;
//	}
//
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("setStudentName is called"); 
	}

	public void displayStudentInfo() {
	System.out.println("Student name is : "+studentName);
	System.out.println("Student id is : "+id);
}
	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//		System.out.println("setId is called"); 
//	}

	//constructor
	
//	public Student(int id, String studentName) {
//		super();
//		this.id = id;
//		this.studentName = studentName;
//	}
//	public void displayStudentInfo() {
//		System.out.println("Student name is : "+studentName);
//		System.out.println("Student id is : "+id);
//	}
}
