package com.stream;

import java.util.Date;

public final class ImmutableClass {

	private Date i;
	private int j;

	public ImmutableClass(Date i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public Date getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	@Override
	public String toString() {
		return "ImmutableClass [i=" + i + ", j=" + j + "]";
	}

}
