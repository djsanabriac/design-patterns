package co.djsanabriac.builder;

import co.djsanabriac.builder.interfaces.Item;
import co.djsanabriac.builder.interfaces.Packing;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
