package com.consumer;

import java.util.ArrayList;
import java.util.function.*;

public class StudentDriver {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		populate(al);

		Predicate<Student> p = s -> s.getMarks() >= 60;
		Function<Student, String> f = s1 -> {
			if (s1.getMarks() >= 80)
				return "A";
			else if (s1.getMarks() >= 60)
				return "B";
			else
				return "F";
		};

		Consumer<Student> c = s1 -> {

			System.out.println("Student Name:" + s1.getName() + ": Student Marks" + s1.getMarks() + ": Student Grade:"
					+ f.apply(s1));
		};

		check(p, c, al);

	}

	private static void check(Predicate<Student> p, Consumer<Student> c, ArrayList<Student> al) {

		ArrayList<Student> al1 = new ArrayList<>();
		for (Student s : al) {
			if (p.test(s)) {
				c.accept(s);
			}

		}

	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("aa", 64));
		al.add(new Student("bb", 55));
		al.add(new Student("cb", 67));
		al.add(new Student("db", 86));
		al.add(new Student("eb", 88));
	}

}
