package co.djsanabriac.creational.builder.items;

import co.djsanabriac.creational.builder.interfaces.Item;
import co.djsanabriac.creational.builder.interfaces.Packing;
import co.djsanabriac.creational.builder.wrappers.Wrapper;

public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
