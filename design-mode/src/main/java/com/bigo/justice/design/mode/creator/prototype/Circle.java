package com.bigo.justice.design.mode.creator.prototype;

public class Circle extends Shape {

	Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Circle");
	}
}
