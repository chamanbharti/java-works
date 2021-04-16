package com.service;


import com.model.Student;
public interface StudentUtil {

	// java 8 static method
	public static void calculateDetails(Student s) {
		//calculations
		// jdk 10 - local variable type inference
		var fee = s.getStdFee();
		var disc = fee * 10/100.0;
		var gst = fee * 12/100.0;
		
		
		//set it back to same object
		s.setStdFeeDisc(disc);
		s.setStdFeeGst(gst);
		
	}
}
