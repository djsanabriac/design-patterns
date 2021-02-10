package co.djsanabriac.creational.builder.wrappers;

import co.djsanabriac.creational.builder.interfaces.Packing;

public class Wrapper implements Packing{

	@Override
	public String pack() {
		return "Wrapper";
	}

}
