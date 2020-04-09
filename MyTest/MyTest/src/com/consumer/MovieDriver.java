package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieDriver {

	public static void main(String[] args) {

		ArrayList<Movie> al = new ArrayList<>();
		populate(al);

		Consumer<ArrayList<Movie>> c = mlist -> {
			for (Movie m : mlist) {
				System.out.println(m.getHero() + ":" + m.getName() + ":" + m.getHeroi());
			}
		};
		
		c.accept(al);

	}

	private static void populate(ArrayList<Movie> al) {

		al.add(new Movie("aaa", "aaa", "aaa"));
		al.add(new Movie("baa", "aaa", "aaa"));
		al.add(new Movie("caa", "aaa", "aaa"));
		al.add(new Movie("daa", "aaa", "aaa"));

	}

}
