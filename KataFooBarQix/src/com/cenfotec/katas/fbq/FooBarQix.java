package com.cenfotec.katas.fbq;

public class FooBarQix {

	public static String process(int number) {
		Boolean concat = false;
		String value = number+"";
		if (number % 3 == 0) {
			value = "FOO";
			concat = true;
		}
		if (number % 5 == 0) {
			if (concat) {
				value = value +"BAR";
				concat = true;
			} else {
				value = "BAR";
			}
		}
		if (number % 7 == 0) {
			if (concat)
				value = value +"QIX";
			else
				value = "QIX";
		}
		return value;
	}

}
