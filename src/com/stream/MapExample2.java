package com.stream;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class MapExample2 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "sfef", 25000));
		list.add(new Employee(2, "cjdhfj", 29000));
		list.add(new Employee(3, "csfas", 30000));
		
		list.stream().filter(n -> n.salary > 25000).map(n -> n.salary).forEach(System.out::println);
	}

}
