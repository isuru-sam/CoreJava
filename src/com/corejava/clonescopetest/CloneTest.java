package com.corejava.clonescopetest;

import java.awt.Color;

import com.corejava.clone.Circle;

public class CloneTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
Circle c = new Circle(2);
Circle d =(Circle)c.clone();
System.out.println(d);
d.x[0]=1000;
d.p=2000;
d.decorate.color=Color.BLACK;
System.out.println(d);
System.out.println(c);
	}

}
