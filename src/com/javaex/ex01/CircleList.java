package com.javaex.ex01;

public class CircleList {
	
	//Circle의 배열을 담아 Circle 객체를 편하게 다루기위한 리스트
	//field
	private Circle[] cArray;
	private int crtPos;
	//constructor
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
	//method
	
	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos++;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}
	
	public int size() {
		return crtPos;
	}
	
}
