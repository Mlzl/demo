package com.bigo.justice.design.mode.creator.prototype;

public class Rectangle extends Shape {

	Rectangle() {
		type = "rectangle";
	}

	@Override
	void draw() {
		System.out.println("rectangle");
	}
}
