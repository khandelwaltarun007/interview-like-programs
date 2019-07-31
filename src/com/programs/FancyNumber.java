package com.programs;

import java.util.regex.Pattern;

public class FancyNumber {
	public static void main(String[] args) {
		String number = "1234524123";

		String exp = "^000|111|222|333|444|555|666|777|888|999|012|123|234|345|456|567|678|789|987|876|765|654|543|432|321|210$";
		if (number.length() != 10) {
			System.out.println("number is not a mobile number");
		} else {
			Pattern pattern = Pattern.compile(exp);
			if (pattern.matcher(number).find()) {
				System.out.println("it is a fancy number");
			} else {
				System.out.println("it is not a fancy number");
			}
		}
	}
}
