package co.djsanabriac.creational.builder.items;

public class VegBurger extends Burger{

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 15000.0f;
	}

}
