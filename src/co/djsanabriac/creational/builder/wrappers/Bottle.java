package co.djsanabriac.creational.builder.wrappers;

import co.djsanabriac.creational.builder.interfaces.Packing;

public class Bottle implements Packing{

	@Override
	public String pack() {
		return "Bottle";
	}

}
