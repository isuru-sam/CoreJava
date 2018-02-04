package com.corejava.comparable;

public class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{
String s;
	public CaseInsensitiveString(String s) {
	
	this.s = s;
}
	@Override
	public int compareTo(CaseInsensitiveString o) {
		// TODO Auto-generated method stub
		return String.CASE_INSENSITIVE_ORDER.compare(s, o.s);
	}

}
