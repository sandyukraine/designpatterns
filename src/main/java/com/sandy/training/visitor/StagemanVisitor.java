package com.sandy.training.visitor;

import com.sandy.training.model.Decorations;
import com.sandy.training.model.Light;
import com.sandy.training.model.Sound;
import com.sandy.training.model.Stage;

public class StagemanVisitor implements StagePartVisitor {

	public void visit(Stage stage) {
		System.out.println("Checking stage");
		System.out.println("Stage consists of " + stage.getPartsQuantity() + " parts to check.");
	}

	public void visit(Light light) {
		System.out.println("Checking light");
	}

	public void visit(Sound sound) {
		System.out.println("Checking sound");
	}

	public void visit(Decorations decorations) {
		System.out.println("Checking decorations");
	}

}
