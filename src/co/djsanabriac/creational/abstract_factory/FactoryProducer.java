package co.djsanabriac.creational.abstract_factory;

import co.djsanabriac.creational.abstract_factory.factories.AbstractFactory;
import co.djsanabriac.creational.abstract_factory.factories.RoundedShapeFactory;
import co.djsanabriac.creational.abstract_factory.factories.ShapeFactory;

public class FactoryProducer{

	public static AbstractFactory getFactory(Boolean rounded) {
		
		if(rounded) {
			return new RoundedShapeFactory();
		}
		
		return new ShapeFactory();
	}

}
