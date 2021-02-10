package co.djsanabriac.creational.factory;

import co.djsanabriac.creational.factory.interfaces.Shape;
import co.djsanabriac.creational.factory.shapes.Circle;
import co.djsanabriac.creational.factory.shapes.Rectangle;
import co.djsanabriac.creational.factory.shapes.Square;

public class ShapeFactory {

	public static final String CIRCLE = "CIRCLE";
	public static final String RECTANGLE = "RECTANGLE";
	public static final String SQUARE = "SQUARE";
	
	/**
	 * 
	 * Returns the implementation of the shapeType arg
	 * 
	 * @param shapeType - Only the constants defined by this class <b>{CIRCLE, RECTANGLE, SQUARE}</b>
	 * @return
	 * 
	 */
	
	public Shape getShape(String shapeType) {
		
		if( CIRCLE.equalsIgnoreCase(shapeType) ) return new Circle(); 
		
		if( RECTANGLE.equalsIgnoreCase(shapeType) ) return new Rectangle(); 
		
		if( SQUARE.equalsIgnoreCase(shapeType) ) return new Square(); 
		
		return null;
	}
	
}
