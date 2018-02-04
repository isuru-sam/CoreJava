package com.corejava.clone;

public class CircleTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
Circle c = new Circle(3);
Circle d = (Circle)c.clone();
System.out.println(d);

	}

}
