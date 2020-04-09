package com.test;

class Engine {
	int speed;

	Engine(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public final class ImmutableClass {

	private final int id;
	private final String name;
	private final Engine e;

	public ImmutableClass(int id, String name, Engine e) {
		this.id = id;
		this.name = name;
		Engine e1 = new Engine(e.speed);
		this.e = e1;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Engine getE() {
		return e;
	}

	public static void main(String[] args) {

		Engine e = new Engine(50);
		ImmutableClass c = new ImmutableClass(1, "Abhishek", e);
		
		System.out.println(c.getE().getSpeed());
		e.setSpeed(70);
		System.out.println(c.getE().getSpeed());

	}

}
