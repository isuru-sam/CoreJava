package com.corejava.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] x= {1,2,3,4};
Integer y= x[2];
//free memory
x[2]  = null;
System.out.println(y);
System.out.println(x[2]);


//List<Integer>[] intList = new ArrayList<Integer>[5]; 
	}

}
