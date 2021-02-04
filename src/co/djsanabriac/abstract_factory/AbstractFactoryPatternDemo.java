package co.djsanabriac.abstract_factory;

import co.djsanabriac.abstract_factory.factories.AbstractFactory;
import co.djsanabriac.abstract_factory.interfaces.Shape;

public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		
		//Get no rounded shapes factory
		AbstractFactory af = FactoryProducer.getFactory(false);
		
		Shape s1 = af.getShape(AbstractFactory.RECTANGLE);
		s1.draw();
		
		Shape s2 = af.getShape(AbstractFactory.SQUARE);
		s2.draw();
		
		//Get rounded shapes factory
		af = FactoryProducer.getFactory(true);
		
		Shape s3 = af.getShape(AbstractFactory.RECTANGLE);
		s3.draw();
		
		Shape s4 = af.getShape(AbstractFactory.SQUARE);
		s4.draw();
		
	}
	
}
