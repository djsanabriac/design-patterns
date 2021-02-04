package co.djsanabriac.abstract_factory.factories;

import co.djsanabriac.abstract_factory.interfaces.Shape;
import co.djsanabriac.abstract_factory.shapes.RoundedRectangle;
import co.djsanabriac.abstract_factory.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType) {

		if( shapeType.equalsIgnoreCase(RECTANGLE) ) return new RoundedRectangle();
		
		if( shapeType.equalsIgnoreCase(SQUARE) ) return new RoundedSquare();
		
		return null;
	}

}
