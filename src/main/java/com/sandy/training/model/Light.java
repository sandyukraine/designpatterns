package com.sandy.training.model;

import com.sandy.training.visitor.StagePartVisitor;

public class Light implements StagePart {

	public void accept(StagePartVisitor stagePartVisitor) {
		stagePartVisitor.visit(this);
	}

}
