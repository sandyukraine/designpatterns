package com.sandy.training.visitor;

import com.sandy.training.model.Decorations;
import com.sandy.training.model.Light;
import com.sandy.training.model.Sound;
import com.sandy.training.model.Stage;

public interface StagePartVisitor {
	void visit(Stage stage);
	void visit(Light light);
	void visit(Sound sound);
	void visit(Decorations decorations);
}
