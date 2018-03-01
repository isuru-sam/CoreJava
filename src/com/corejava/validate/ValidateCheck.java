package com.corejava.validate;

import java.util.Objects;

public class ValidateCheck {

	private static String  test(String s) {
		String  p =Objects.requireNonNull(s);
		return p.toUpperCase();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g=null;
String c =test(g);
System.out.println(c);
		
		
	}

}
