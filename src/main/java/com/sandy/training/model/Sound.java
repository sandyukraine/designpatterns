package com.sandy.training.model;

import com.sandy.training.visitor.StagePartVisitor;

public class Sound implements StagePart {

	public void accept(StagePartVisitor stagePartVisitor) {
		stagePartVisitor.visit(this);
	}

}
