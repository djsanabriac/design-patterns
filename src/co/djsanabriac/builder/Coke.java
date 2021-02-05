package co.djsanabriac.builder;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 5000.0f;
	}

}
