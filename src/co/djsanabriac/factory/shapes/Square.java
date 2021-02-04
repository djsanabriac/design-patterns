package co.djsanabriac.factory.shapes;

import co.djsanabriac.factory.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
