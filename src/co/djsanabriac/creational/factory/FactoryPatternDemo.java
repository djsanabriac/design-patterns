package co.djsanabriac.creational.factory;

import co.djsanabriac.creational.factory.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory sf = new ShapeFactory();
		
		Shape s1 = sf.getShape(ShapeFactory.CIRCLE);
		s1.draw();
		
		Shape s2 = sf.getShape(ShapeFactory.RECTANGLE);
		s2.draw();
		
		Shape s3 = sf.getShape(ShapeFactory.SQUARE);
		s3.draw();
		
	}

}
