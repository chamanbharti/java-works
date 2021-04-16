package com.jvm.classloader_subsystem.initialization;

public class Initialization {

	public static void main(String[] args) {
		/*
		 * Initialization:
		 * in this phase all static variables will be assigned with original values and 
		 * static blocks will be executed from top to bottom and from parent to child.
		 * Note:while loading,linking and initialization if any error occurs 
		 * then we will get runtime exception saying 
		 * java.lang.LinkageError. Of course VerifyError is child class of LinkageError only
		 * 
		 * 
		 */
	}
}
