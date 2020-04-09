package com.practiseQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateCharacterInString {

	public static void main(String[] args) {

		Set<Character> uniqueCharacter = new HashSet<>();
		List<Character> repCharacter = new ArrayList<>();

		String s = "abhisheke";

		for (Character c : s.toCharArray()) {
			if (!uniqueCharacter.add(c))
				repCharacter.add(c);
		}
		System.out.println(repCharacter);

	}

}
