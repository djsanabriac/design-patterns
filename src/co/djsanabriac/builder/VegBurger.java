package co.djsanabriac.builder;

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
