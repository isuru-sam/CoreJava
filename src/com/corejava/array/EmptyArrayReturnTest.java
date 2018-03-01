package com.corejava.array;

import java.util.List;

import com.corejava.common.Point;

public class EmptyArrayReturnTest {
	
	private static Point[] getPoints(List<Point> points) {
		
	return points.toArray(new Point[0]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
