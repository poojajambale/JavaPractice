package com.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if(age > o.age)
			return 1;
		else if(age < o.age)
			return -1;
		else
			return 0;
	}
}

public class ComparableExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "sjahska", 16));
		list.add(new Student(2, "lmkjk", 22));
		list.add(new Student(3, "ghyfy", 20));
		
		Collections.sort(list);

		for(Student s:list) {
			System.out.println(s.id+" "+s.name+" "+s.age);  
		}
	}

}
