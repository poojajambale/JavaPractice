package com.exception;

public class Student {

	public static void main(String[] args) {
		StudentManager s = new StudentManager();

		try {
			s.find("10");
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
	}

}
