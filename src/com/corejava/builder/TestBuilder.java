package com.corejava.builder;

import com.corejava.builder.NyPizza.Size;
import com.corejava.builder.Pizza.Topping;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pizza pizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.HAM).addTopping(Topping.MUSHROOM).build();
Pizza cal = new Calzone.Builder().addTopping(Topping.HAM).sauceInside().build();
	}

}
