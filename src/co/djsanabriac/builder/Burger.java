package co.djsanabriac.builder;

import co.djsanabriac.builder.interfaces.Item;
import co.djsanabriac.builder.interfaces.Packing;

public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
