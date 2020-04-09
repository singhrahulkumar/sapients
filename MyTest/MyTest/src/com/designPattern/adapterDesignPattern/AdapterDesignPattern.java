package com.designPattern.adapterDesignPattern;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		AssignmentWork a = new AssignmentWork();
		Pen p = new PenAdapter();
		a.setP(p);
		a.writeAssignment("Write Assignment");
	}

}
