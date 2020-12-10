package com.javaex.ex01;

public class MyList <T>{

	private T[] oArray;
	private int crtPos;
	//constructor
	public MyList() {
		oArray = (T[])new Object[3];
		crtPos = 0;
	}
	//method
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public T get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}
	
}
