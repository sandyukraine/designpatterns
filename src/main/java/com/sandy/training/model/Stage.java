package com.sandy.training.model;

import com.sandy.training.visitor.StagePartVisitor;

public class Stage implements StagePart {

	StagePart[] stageParts;
	
	public Stage() {
		stageParts = new StagePart[] {new Sound(), new Light(), new Decorations()};
	}
	
	public void accept(StagePartVisitor stagePartVisitor) {
		stagePartVisitor.visit(this);
		for (StagePart stagePart : stageParts) {
			stagePart.accept(stagePartVisitor);
		}
	}
	
	public int getPartsQuantity() {
		return stageParts.length;
	}
}