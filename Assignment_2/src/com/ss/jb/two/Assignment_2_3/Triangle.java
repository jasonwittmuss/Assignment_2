package com.ss.jb.two.Assignment_2_3;

public class Triangle implements Shape {
	// Triangle class
	Double base;
	Double height;

	public Triangle(Double base, Double height) {
		// To define a Triangle we need a base and a height
		this.base = base;
		this.height = height;
	}

	@Override
	public Double calculateArea() {
		// Area is base*height/2
		return (this.base * this.height / 2);
	}

	@Override
	public void display() {
		// Calling calculate area to display area
		System.out.println(calculateArea());
	}
}
