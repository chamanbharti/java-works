package com.Array_ArrayList;

public class Student implements Comparable<Student>{
	private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public int compareTo(Student comparestu) {
		int compareage=((Student)comparestu).getStudentage();
        // For Ascending order
        return this.studentage-compareage;

         //For Descending order do like this 
        //return compareage-this.studentage;
	}
	/*public int compareTo(Student st) {
		if(studentage == st.studentage)
			return 0;
		else if(studentage > st.studentage)
			return 1;
		else 
			return -1;
	}*/

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
    

}
