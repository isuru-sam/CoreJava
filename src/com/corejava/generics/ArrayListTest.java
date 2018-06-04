package com.corejava.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Arrays covariant
 * Lists invariant
 * @author Isuru
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object[] obj=new Long[1];
obj[0]="eee";

Number[] i= new BigDecimal[1];

BigDecimal[] b = (BigDecimal[]) new Number[2];

//List<Integer> intlist = List.of(43);
//List<String>[] y= new ArrayList<String>[1];
//List<Object> l = new ArrayList<Long>();
	}

}
