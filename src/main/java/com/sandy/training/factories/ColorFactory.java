package com.sandy.training.factories;

import com.sandy.training.model.Color;
import com.sandy.training.model.Green;
import com.sandy.training.model.Instrument;
import com.sandy.training.model.Red;

public class ColorFactory extends AbstractFactory {

	@Override
	public Instrument getInstrument(String instrument) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color.equals("red")) {
			return new Red();
		} else if (color.equals("green")) {
			return new Green();
		}
		return null;
	}

}
