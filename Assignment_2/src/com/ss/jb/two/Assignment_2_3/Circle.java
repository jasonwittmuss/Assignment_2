package com.ss.jb.two.Assignment_2_3;

public class Circle implements Shape {
	// Circle class
	Double radius;

	public Circle(Double radius) {
		// To define a Circle we need a radius
		this.radius = radius;
	}

	@Override
	public Double calculateArea() {
		// Area is PI*r^2
		return (this.radius * this.radius * Math.PI);
	}

	@Override
	public void display() {
		// Calling calculate area to display area
		System.out.println(calculateArea());
	}

}
