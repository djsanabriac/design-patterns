package co.djsanabriac.abstract_factory.factories;

import co.djsanabriac.abstract_factory.interfaces.Shape;

public abstract class AbstractFactory {

	public static final String RECTANGLE = "RECTANGLE";
	public static final String SQUARE = "SQUARE";
	
	public abstract Shape getShape(String shapeType);
}
