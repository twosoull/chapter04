package com.javaex.ex03;

public class Circle {
	// field
	public int radius;

	// constructor
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}
	// method g/s

	public void draw() {
		System.out.println("원 [ 반지름: " + radius + "] 을 그렸습니다");
	}

	public int getRadius() {
		return radius;
	}

	// method
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
