package com.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentGrade {

	public static void main(String[] args) {

		Function<Student, String> f = s -> {
			if (s.getMarks() >= 80)
				return "A";
			else if (s.getMarks() >= 70)
				return "B";
			else if (s.getMarks() >= 60)
				return "C";
			else
				return "F";
		};

		ArrayList<Student> al = new ArrayList<>();
		populate(al);
		check(f, al);

	}

	private static void check(Function<Student, String> f, ArrayList<Student> al) {
		for (Student s : al) {
			System.out.println(f.apply(s));
		}
	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("AB", 89));
		al.add(new Student("cc", 75));
		al.add(new Student("bb", 55));
	}

}
