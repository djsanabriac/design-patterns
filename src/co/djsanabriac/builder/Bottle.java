package co.djsanabriac.builder;

import co.djsanabriac.builder.interfaces.Packing;

public class Bottle implements Packing{

	@Override
	public String pack() {
		return "Bottle";
	}

}
