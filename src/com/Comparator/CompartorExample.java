package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Comparator.Employee;

class Employee{
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}

public class CompartorExample {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "cjncs", 22));
		list.add(new Employee(2, "lmkjk", 10));
		list.add(new Employee(3, "ghyfy", 20));
		
		Comparator<Employee> c = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.age > o2.age)
					return 1;
				else if(o1.age < o2.age)
					return -1;
				return 0;
				
					
			}
		};
		
		Collections.sort(list, c);
		
		for(Employee s:list) {
			System.out.println(s.id+" "+s.name+" "+s.age);  
		}
	}

}
