package com.corejava.enumtest;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetTest {

	enum Style {BOLD,ITALIC,UNDELINE};
	
	void applyStyles(Set<Style> styles) {
		System.out.println(styles);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSetTest t =new EnumSetTest();
		t.applyStyles(EnumSet.allOf(Style.class));
	}

}
