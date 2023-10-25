package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hi","hello","bye");
		
		//map transforms each element in a stream by applying a specified function to it.
		list.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		list.stream().map(n -> n.length()).forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		
		list2.stream().map(n -> n*3).forEach(System.out::println);
	}

}
