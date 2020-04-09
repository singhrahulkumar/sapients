package com.String;

public class TestImmutable {

	private int i;

	public TestImmutable(int i) {
		this.i = i;
	}

	public TestImmutable modify(int j) {
		if (this.i == j) {
			return this;
		} else {
			return (new TestImmutable(j));
		}

	}

}
