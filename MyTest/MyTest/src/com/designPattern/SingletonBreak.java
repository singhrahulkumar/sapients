package com.designPattern;

import java.io.Serializable;

public class SingletonBreak implements Serializable {

	private static SingletonBreak INSTANCE = null;

	private SingletonBreak() {

	}

	private Object readResolve() {
		return INSTANCE;

	}

	public static SingletonBreak getInstance() {

		if (INSTANCE == null) {
			synchronized (SingletonBreak.class) {
				if (INSTANCE == null)
					INSTANCE = new SingletonBreak();
			}
		}
		return INSTANCE;

	}

}
