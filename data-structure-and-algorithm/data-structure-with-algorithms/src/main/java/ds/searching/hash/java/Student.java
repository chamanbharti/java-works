package ds.searching.hash.java;

public class Student {

	private int studentRollNo;
	 
    private String studentName;
 
    public Student(int studentId, String studentName) {
        super();
        this.studentRollNo = studentId;
        this.studentName = studentName;
    }
 
    public int getStudentRollNo() {
        return studentRollNo;
    }
 
    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }
 
    public String getStudentName() {
         return studentName;
    }
 
 
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
 
    public int hashCode() {
        return this.studentName.length();
    }
 
    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        if (studentName == null) {
            if (other.studentName != null)
                return false;
        } else if (!studentName.equals(other.studentName))
            return false;
        return true;
    }
}
