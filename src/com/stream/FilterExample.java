package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
		List l1 = new ArrayList<>();
		
		l1 = l.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(l1);
		
		l.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));
		
		List<String> names = Arrays.asList("Pooja","Rutuja","Shikha");
		
		names.stream().filter(n -> n.length()<6 && n.length()>2).forEach(n -> System.out.println(n));

	}

}
