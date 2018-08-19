package com.etudes.design.patterns.builder.demo;

import com.etudes.design.patterns.builder.domain.Meal;
import com.etudes.design.patterns.builder.service.impl.ChickenBurger;
import com.etudes.design.patterns.builder.service.impl.Coke;
import com.etudes.design.patterns.builder.service.impl.Pepsi;
import com.etudes.design.patterns.builder.service.impl.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
