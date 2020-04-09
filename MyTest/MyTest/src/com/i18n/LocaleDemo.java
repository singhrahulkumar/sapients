package com.i18n;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {

		Locale l = Locale.getDefault();
		System.out.println(l.getCountry() + " " + l.getLanguage());
		System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage() + " " + l.getDisplayName());
		Locale l1 = new Locale("hi", "IN");
		System.out.println(l1.getDisplayCountry() + " " + l1.getDisplayLanguage());
		Locale.setDefault(l1);
		l = Locale.getDefault();
		System.out.println(l.getCountry() + " " + l.getLanguage());
		String[] s = Locale.getISOCountries();
		String[] s1 = Locale.getISOLanguages();
		for (String c : s) {
			System.out.print(c + ", ");
		}
		System.out.println(
				"====================================================================================================================================");
		for (String c1 : s1) {
			System.out.print(c1 + ", ");
		}
		
		Locale[] l2 = Locale.getAvailableLocales();
		for (Locale locale : l2) {
			System.out.print(locale.getCountry()+"<--->"+locale.getLanguage()+", ");
		}
		
	}

}
