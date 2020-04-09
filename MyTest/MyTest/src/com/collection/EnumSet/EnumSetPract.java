package com.collection.EnumSet;

import java.util.EnumSet;

public class EnumSetPract {

	public static void main(String[] args) {
		EnumSet<GFG> set1, set2, set3, set4,set5,set6;
		set1 = EnumSet.of(GFG.CODE, GFG.LEARN, GFG.CONTRIBUTE, GFG.QUIZ);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(GFG.class);
		set4 = EnumSet.range(GFG.CODE, GFG.QUIZ);
		set5 = EnumSet.copyOf(set4);
		set6 = set5.clone();
		
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4);
		System.out.println("Set 5: " + set5);
		System.out.println("Set 6: " + set6);
	}

}

enum GFG {
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
}
