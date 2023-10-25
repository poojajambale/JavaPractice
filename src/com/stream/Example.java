package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,1,3,4,3);
		
		l.stream().distinct().forEach(System.out::println);
		System.out.println("======");
		
		long count = l.stream().distinct().count();
		System.out.println(count);
		System.out.println("======");
		
		l.stream().limit(3).forEach(System.out::println);
		System.out.println("======");
		
		l.stream().sorted().forEach(System.out::println);
		System.out.println("======");
		
		l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("======");
		
		Object arr[] = l.stream().toArray();
		System.out.println(arr.length);
		
	}

}
