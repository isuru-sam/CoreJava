package com.corejava.comparable;

import java.util.Comparator;
import static java.util.Comparator.comparingInt;
public class PhoneNumber8  {
	Short areaCode;
	Short prefix;
	Short lineNum;
	
	
	
	private static final Comparator<PhoneNumber8> COMPARATOR =
			comparingInt((PhoneNumber8 pn) ->pn.areaCode).
			thenComparing(pn->pn.prefix).thenComparing(pn->pn.lineNum);
	
	
	
	
	
}
