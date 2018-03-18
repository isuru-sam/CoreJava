package com.corejava.annotations;

import java.util.HashSet;
import java.util.Set;

public class Bigram {
char first;
char second;
public Bigram(char first, char second) {
	
	this.first = first;
	this.second = second;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + first;
	result = prime * result + second;
	return result;
}
//@Override
public boolean equals(Bigram b) {
return b.first==first && b.second==second;
}

public static void main(String args[]) {
	Set<Bigram> s = new HashSet<>();
	for(int i=0;i<10;i++)
		for(char ch='a';ch<='z';ch++) {
			s.add(new Bigram(ch,ch));
		}
	
	System.out.println(s.size());
}
}
