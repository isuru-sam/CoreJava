package com.corejava.comparable;

public class PhoneNumber implements Comparable<PhoneNumber> {

	Short areaCode;
	Short prefix;
	Short lineNum;

	@Override
	public int compareTo(PhoneNumber o) {

		int result = Short.compare(areaCode, o.areaCode);
		if (result == 0) {
			result = Short.compare(prefix, o.prefix);

		}

		if (result == 0) {
			result = Short.compare(lineNum, o.lineNum);
		}
		return result;
	}

}
