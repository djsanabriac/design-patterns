package co.djsanabriac.builder.items;

import co.djsanabriac.builder.interfaces.Item;
import co.djsanabriac.builder.interfaces.Packing;
import co.djsanabriac.builder.wrappers.Wrapper;

public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
