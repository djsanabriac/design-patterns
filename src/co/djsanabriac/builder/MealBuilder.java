package co.djsanabriac.builder;

import co.djsanabriac.builder.items.ChikenBurger;
import co.djsanabriac.builder.items.Coke;
import co.djsanabriac.builder.items.Pepsi;
import co.djsanabriac.builder.items.VegBurger;

public class MealBuilder {
	
	public Meal preapreVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal preapreNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChikenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
}