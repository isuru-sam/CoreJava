package com.corejava.strings;

import java.awt.Color;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Point p = new Point(2,3);
Point q= new ColorPoint(2, 3, Color.BLACK);
Point r=new ColorPoint(2,3,Color.BLACK);
System.out.println(p.equals(q));

System.out.println(q.equals(p));
//violation of transitivity
System.out.println(q.equals(r));



	}

}
