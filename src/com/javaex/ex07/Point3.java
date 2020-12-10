package com.javaex.ex07;

public class Point3 {
	//field
	private int x;
	private int y;
	
	//constructor;
	public Point3() {}

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//method g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//method
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + y;
		
		System.out.println(y+ "   "+result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point3 other = (Point3) obj;
		
		if (y != other.y)
			return false;
		return true;
	}

	
	
	
}
