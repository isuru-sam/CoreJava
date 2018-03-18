package com.corejava.enumtest;

public enum PayRollCalc {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
	private static final int MINS_PER_SHIFT = 8 * 60;
	private final PayType payType;
	PayRollCalc(PayType p) {
		this.payType = p;
	}
	
	private PayRollCalc() {
		this(PayType.WEEKDAY);
	}
	
	int pay(int minuteswork,int hourrate) {
		return payType.pay(minuteswork, hourrate);
	}
	
	private enum PayType{
		
		WEEKDAY {
			int overtimePay(int minswork,int payrate) {
				return minswork<=MINS_PER_SHIFT?0:(minswork-MINS_PER_SHIFT)*payrate/2;
			}
		},WEEKEND {
			int overtimePay(int minswork,int payrate) {
			return minswork*payrate/2;
			}
			};
		
		abstract int overtimePay(int mins,int payRate);
		
		int pay(int minswork,int payRate) {
			int baseppay=minswork*payRate;
			return baseppay+overtimePay(minswork, payRate);
		}
		
	}
}
