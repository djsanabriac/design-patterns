package co.djsanabriac.factory.shapes;

import co.djsanabriac.factory.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
