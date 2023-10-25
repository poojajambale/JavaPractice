package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Cab{
	public void bookCab();
}

@FunctionalInterface
interface Ola{
	public void bookOla(String source, String destination);
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		Cab cab = () -> System.out.println("Cab is booked.");
		cab.bookCab();
		
		Ola ola = (source, destination) -> System.out.println("Ola is booked from "+source+" to "+destination);
		ola.bookOla("Pune", "Mumbai");
	}

}
