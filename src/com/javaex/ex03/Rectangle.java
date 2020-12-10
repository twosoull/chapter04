package com.javaex.ex03;

public class Rectangle {
	// field
	private int width;
	private int height;

	// constructor
	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	//method g/s
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	// method

	public void draw() {
		System.out.println("사각형 (가로 = "+ width + ", 세로 ="+height+")를 그렸습니다.");
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
