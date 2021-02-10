package co.djsanabriac.creational.builder;

import co.djsanabriac.creational.builder.items.ChikenBurger;
import co.djsanabriac.creational.builder.items.Coke;
import co.djsanabriac.creational.builder.items.Pepsi;
import co.djsanabriac.creational.builder.items.VegBurger;

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