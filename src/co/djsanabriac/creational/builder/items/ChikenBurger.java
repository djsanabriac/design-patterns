package co.djsanabriac.creational.builder.items;

public class ChikenBurger extends Burger{

	@Override
	public String name() {
		return "ChikenBurger";
	}

	@Override
	public float price() {
		return 20000.0f;
	}

}
