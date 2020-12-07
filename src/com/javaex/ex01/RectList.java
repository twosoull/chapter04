package com.javaex.ex01;

public class RectList {
	
	//field
	private Rectangle[] rArray;
	private int crtPos;
	
	//constructor
	public RectList() {
		rArray = new Rectangle[3];
		crtPos = 0 ;
	}
	
	//method g/s
	
	//method
	public void add(Rectangle r) {
		rArray[crtPos] = r;
		crtPos++;
	}
	
	public Rectangle get(int index) {
		return rArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
