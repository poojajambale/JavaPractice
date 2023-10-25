package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		List l1 = List.of('a','c','e','f');
		
		l.forEach((n) -> System.out.println(n));
		l1.forEach((n1) -> System.out.println(n1));
	}

}
