package co.djsanabriac.creational.builder.items;

import co.djsanabriac.creational.builder.wrappers.Bottle;
import co.djsanabriac.creational.builder.interfaces.Item;
import co.djsanabriac.creational.builder.interfaces.Packing;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
