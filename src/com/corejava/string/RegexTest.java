package com.corejava.string;

import java.util.regex.Pattern;

public class RegexTest {
final static Pattern p =Pattern.compile("regex");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//right way significant performance gain
		p.matcher("string").matches();
	}

	
	//performance issue because of Pattern
	static boolean isRoman(String s ) {
		return s.matches("regex");
	}
	
	
}
