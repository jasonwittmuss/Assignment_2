package com.ss.jb.two.Assignment_2_3;

public class Assignment_2_3 {
	public static void main(String[] args) {
		// Class that implements the rectangle, circle, and triangle class
		Rectangle r = new Rectangle(10.0, 5.0);
		Circle c = new Circle(100.0);
		Triangle t = new Triangle(10.0, 5.0);
		
		r.display();
		c.display();
		t.display();
	}
}
