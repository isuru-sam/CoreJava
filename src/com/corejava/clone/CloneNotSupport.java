package com.corejava.clone;

import java.io.ObjectOutputStream;

public class CloneNotSupport {
	protected Object clone1() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public final Object clone() throws java.lang.CloneNotSupportedException {
        throw new java.lang.CloneNotSupportedException();
}
	
	private final void writeObject(ObjectOutputStream out)
			throws java.io.IOException {
			        throw new java.io.IOException("Object cannot be serialized");
			}
	 
}
