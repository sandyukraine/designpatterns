package com.sandy.training.factories;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equals("instrument")) {
			return new InstrumentFactory();
		} else if (choice.equals("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
