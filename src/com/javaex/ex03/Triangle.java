package com.javaex.ex03;

public class Triangle {
	// field
	private int width;
	private int height;

	// constructor
	public Triangle() {

	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// method g/s

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
	//method 일반
	
	public void draw() {
		System.out.println("삼각형 (가로:"+width+", 세로:"+height+") 를 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
