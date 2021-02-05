package co.djsanabriac.builder.items;

import co.djsanabriac.builder.wrappers.Bottle;
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
