package com.corejava.clone;

import java.util.Arrays;

public class Circle implements Cloneable {
public int radious;
public Integer[] x = new Integer[]{2,2,3};
public Integer p =10;
public Decorate decorate= new Decorate();

public Circle(int radious) {
	
	this.radious = radious;
}

@Override
public Circle clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Circle c = (Circle) super.clone();
	c.x=x.clone();
	//c.decorate=decorate
	return c;
}

@Override
public String toString() {
	return "Circle [radious=" + radious + ", x=" + Arrays.toString(x) + ", p=" + p + ", decorate=" + decorate + "]";
}






}
