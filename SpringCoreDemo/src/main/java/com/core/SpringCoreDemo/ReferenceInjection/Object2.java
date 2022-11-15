package com.core.SpringCoreDemo.ReferenceInjection;

public class Object2 {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Object2(int y) {
		super();
		this.y = y;
	}

	@Override
	public String toString() {
		return "Object2 [y=" + y + "]";
	}

	public Object2() {
		super();
	}
	

}
