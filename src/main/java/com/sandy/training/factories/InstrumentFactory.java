package com.sandy.training.factories;

import com.sandy.training.model.Color;
import com.sandy.training.model.Drums;
import com.sandy.training.model.Guitar;
import com.sandy.training.model.Instrument;

public class InstrumentFactory extends AbstractFactory {

	@Override
	public Instrument getInstrument(String instrument) {
		if (instrument.equals("drums")) {
			return new Drums();
		} else if (instrument.equals("guitar")) {
			return new Guitar();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
