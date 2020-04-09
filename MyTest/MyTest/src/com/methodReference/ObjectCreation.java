package com.methodReference;

interface demo {
	public ObjectCreation get();
}

public class ObjectCreation {

	public ObjectCreation() {
		System.out.println("Object created");
	}

	public static void main(String[] args) {
		demo d = ObjectCreation::new;
		System.out.println(d);

		demo d1 = () -> {
			ObjectCreation o1 = new ObjectCreation();
			return o1;
		};
		ObjectCreation o = d.get();
		System.out.println(o);
		

	}

}
