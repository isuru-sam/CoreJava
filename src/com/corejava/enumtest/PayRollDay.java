package com.corejava.enumtest;

public enum PayRollDay {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	private static final int MINS_PER_SHIFT = 8 * 60;

	int pay(int mintesworked, int payRate) {

		int base = mintesworked * payRate;
		int overtimePay;
		switch (this) {
		case SATURDAY:
		case SUNDAY:
			overtimePay = base / 2;
			break;
		default:
			overtimePay = mintesworked <= MINS_PER_SHIFT ? 0 : (mintesworked - MINS_PER_SHIFT) * payRate / 2;

		}
		return base+overtimePay;
	}
}
