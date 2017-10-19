package com.imooc.Shape;

public class Circle extends Shape {

	int R;
	
	@Override
	public int getRare() {
		// TODO Auto-generated method stub
		//return Math.PI * R * R;
		return 0;
	}

	@Override
	public int getCircum() {
		// TODO Auto-generated method stub
		//return Math.PI * R * 2;
		return 0;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

}
