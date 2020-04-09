package com.designPattern.adapterDesignPattern;

public class PenAdapter implements Pen{

	@Override
	public void write(String args) {

		PilotPen pp = new PilotPen();
		pp.mark(args);
	}
	
	
}
