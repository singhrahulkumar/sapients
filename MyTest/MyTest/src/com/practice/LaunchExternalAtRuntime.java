package com.practice;

import java.io.IOException;

public class LaunchExternalAtRuntime {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("https://www.callicoder.com/java-singleton-design-pattern-example/");
	}
}
