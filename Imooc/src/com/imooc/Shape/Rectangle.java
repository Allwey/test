package com.imooc.Shape;

public class Rectangle extends Shape {

	int length;
	int width;
	
	@Override
	public int getRare() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public int getCircum() {
		// TODO Auto-generated method stub
		return  2 * (length + width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
