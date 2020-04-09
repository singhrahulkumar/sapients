package com.designPattern.bridge;

abstract class TV {
	Remote remote;
	
	abstract void on();

	abstract void off();

}

class Sony extends TV {
	//Remote remoteType;

	Sony(Remote r) {
		this.remote = r;
	}

	@Override
	void on() {
		System.out.println("Sony TV ON");
		remote.on();
	}

	@Override
	void off() {
		System.out.println("Sony TV OFF");
		remote.off();
	}
	

}

class Philips extends TV {
	//Remote remote;

	Philips(Remote r) {
		this.remote = r;
	}

	@Override
	void on() {
		System.out.println("Philips TV ON");
		remote.on();
	}

	@Override
	void off() {
		System.out.println("Philips TV OFF");
		remote.off();
	}
}

interface Remote {
	public void on();

	public void off();
}

class NewRemote implements Remote {

	@Override
	public void on() {
		System.out.println("On with new remote");
	}

	@Override
	public void off() {
		System.out.println("Off with new remote");
	}
}

class OldRemote implements Remote {

	@Override
	public void on() {
		System.out.println("On with old remote");
	}

	@Override
	public void off() {
		System.out.println("Off with old remote");
	}
}

public class BridgeDesignPattern {

	public static void main(String[] args) {
		TV sonyOldRemote = new Sony(new OldRemote());
		sonyOldRemote.on();
		sonyOldRemote.off();
		System.out.println();

		TV philipsNewRemote = new Philips(new NewRemote());
		philipsNewRemote.on();
		philipsNewRemote.off();
		System.out.println();
	}

}
