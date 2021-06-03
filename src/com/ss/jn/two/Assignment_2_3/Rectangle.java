package com.ss.jn.two.Assignment_2_3;

public class Rectangle implements Shape {
	// Rectangle class
	Double length;
	Double width;

	public Rectangle(Double length, Double width) {
		// To define a rectangle we need a length and a width
		this.length = length;
		this.width = width;
	}

	@Override
	public Double calculateArea() {
		// Area is length*width
		return (this.length * this.width);
	}

	@Override
	public void display() {
		// Calling calculate area to display area
		System.out.println(calculateArea());
	}

}
