package co.djsanabriac.abstract_factory.shapes;

import co.djsanabriac.abstract_factory.interfaces.Shape;

public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}

}
