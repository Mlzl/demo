package com.bigo.justice.design.mode.creator.prototype;

public class Square extends Shape {

	Square() {
		type = "square";
	}

	@Override
	void draw() {
		System.out.println("square");
	}
}
