package com.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2);
		List<Integer> l2 = Arrays.asList(3,4);
		List<Integer> l3 = Arrays.asList(5,6);
		
		List<List<Integer>> list = Arrays.asList(l1,l2,l3);
		
		list.stream().flatMap(n -> n.stream().map(x -> x+1)).forEach(System.out::println);
	}

}
