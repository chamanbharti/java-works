package com.mvc;

public class MVCPattern {
	public static void main(String[] args) {
		
		//fetch student record based on his roll no from the database
		Student model = retrieveStudentFromDatabase();
		
		//Create a view : to write student details on console
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		
		//Update model data
		controller.setStudentName("Palak Goyal");
		controller.updateView();
	}

	private static Student retrieveStudentFromDatabase() {

		Student student = new Student();
		student.setName("Chaman Bharti");
		student.setRollNo("122687095");
		return student;
	}

}
