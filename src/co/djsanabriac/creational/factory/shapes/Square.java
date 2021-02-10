package co.djsanabriac.creational.factory.shapes;

import co.djsanabriac.creational.factory.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
