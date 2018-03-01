package com.corejava.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTest {
	
	private static OptionalInt getAge() {
		
		return OptionalInt.of(0);
	//return OptionalInt.empty();
	}
	

	private static Optional<String> getName() {
		
		String name =null;
		
		return Optional.ofNullable(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> x = getName();
		
		String y =x.map(String::toUpperCase).orElse("Emptu");
		System.out.println(y);
		
		
		
		
		
		
		
		
		OptionalInt oi= getAge();
		System.out.println(oi.orElse(10));
	}

}
