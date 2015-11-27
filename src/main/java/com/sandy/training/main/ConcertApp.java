package com.sandy.training.main;

import com.sandy.training.model.Stage;
import com.sandy.training.model.StagePart;
import com.sandy.training.visitor.StagemanVisitor;

public class ConcertApp {

	public static void main(String[] args) {
		StagePart stage = new Stage();
		stage.accept(new StagemanVisitor());
	}
}
