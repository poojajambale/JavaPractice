package com.exception;

public class StudentManager {
	public Student find(String studentID) throws StudentNotFoundException {
		
		if(studentID.equals("100")) {
			return new Student();
		}
		else {
			throw new StudentNotFoundException("Not Found this ID: " + studentID);
		}
		
	}
}
