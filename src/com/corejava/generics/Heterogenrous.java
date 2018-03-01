package com.corejava.generics;

public class Heterogenrous {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Favourites f = new Favourites();

f.putFavourite(String.class, "tt");
f.putFavourite(String.class, "yy");
f.putFavourite(Integer.class, 4);

String s = f.getFavourite(String.class);
Integer q= f.getFavourite(Integer.class);
System.out.println(s);
System.out.println(q);
	
	}

}
