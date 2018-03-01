package com.corejava.concurrentmodification;

import java.util.ArrayList;
import java.util.List;

public class ForLoopTest {

	public static void main(String[] args) {
		
List<String> myList = new ArrayList<String>();
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		// TODO Auto-generated method stub
		for(int i = 0; i<myList.size(); i++){
			System.out.println(myList.get(i));
			if(myList.get(i).equals("3")){
				//myList.remove(i);
				//myList.remove(i+1);
				//i--;
				myList.add("6");
				myList.add("7");
			}
		}
	
	
	for(String s :myList) {
	if(s.equals("3")) {
		System.out.println("here");
		myList.remove(s);
	}
	}}

}
