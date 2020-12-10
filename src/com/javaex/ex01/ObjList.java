package com.javaex.ex01;

public class ObjList {

	private Object[] oArray;
	private int crtPos;
	//constructor
	public ObjList() {
		oArray = new Object[3];
		crtPos = 0;
	}
	//method
	
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}
	
}


