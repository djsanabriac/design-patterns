package co.djsanabriac.creational.factory.shapes;

import co.djsanabriac.creational.factory.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
