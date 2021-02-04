package co.djsanabriac.abstract_factory.factories;

import co.djsanabriac.abstract_factory.interfaces.Shape;
import co.djsanabriac.abstract_factory.shapes.Rectangle;
import co.djsanabriac.abstract_factory.shapes.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {

		if( shapeType.equalsIgnoreCase(RECTANGLE) ) return new Rectangle();
		
		if( shapeType.equalsIgnoreCase(SQUARE) ) return new Square();
		
		return null;
	}

}
