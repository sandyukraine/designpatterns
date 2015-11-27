package com.sandy.training.model;

import com.sandy.training.visitor.StagePartVisitor;

public interface StagePart {

	void accept(StagePartVisitor stagePartVisitor);
}
