package com.sandy.training.factories;

import com.sandy.training.model.Color;
import com.sandy.training.model.Instrument;

public abstract class AbstractFactory {
	public abstract Instrument getInstrument(String instrument);
	public abstract Color getColor(String color);
}
