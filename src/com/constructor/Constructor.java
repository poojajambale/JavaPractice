package com.constructor;

public class Constructor {
String name;
int no;
	
	public Constructor(String name,int no) {
		this.name = name;
		this.no = no;
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor("Pooja",1);
		System.out.println(c.name);
		System.out.println(c.no);
	}

}

