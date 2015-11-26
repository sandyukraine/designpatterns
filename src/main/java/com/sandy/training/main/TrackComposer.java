package com.sandy.training.main;

import com.sandy.training.factories.AbstractFactory;
import com.sandy.training.factories.FactoryProducer;
import com.sandy.training.model.Color;
import com.sandy.training.model.Instrument;

public class TrackComposer {

	public static void main(String[] args) {
		
		AbstractFactory instrumentFactory = FactoryProducer.getFactory("instrument");
		
		Instrument drums = instrumentFactory.getInstrument("drums");
		drums.set();
		
		Instrument guitar = instrumentFactory.getInstrument("guitar");
		guitar.set();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color redColor = colorFactory.getColor("red");
		redColor.fill();
		
		Color greenColor = colorFactory.getColor("green");
		greenColor.fill();
	}

}
