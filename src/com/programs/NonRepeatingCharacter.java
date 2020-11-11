package com.programs;

import java.util.Map;
import java.util.TreeMap;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "zzzzzbbbccccddehhhhiii";

		int[] countingArray = new int[128];
		str.chars().forEach(value -> countingArray[value]++);
		int nonRepeatingCharAsInt = 0;
		for (int i = 0; i < countingArray.length; i++) {
			if (countingArray[i] == 1) {
				nonRepeatingCharAsInt = i;
				break;
			}
		}
		System.out.println("character = " + Character.valueOf((char) nonRepeatingCharAsInt));

		abc(str);
	}

	public static void abc(String str) {
		Map<Character, Integer> map = new TreeMap<>();
		char[] ch = str.toCharArray();
		for (Character chara : ch) {
			if (map.containsKey(chara)) {
				map.put(chara, map.get(chara) + 1);
			} else {
				map.put(chara, 1);
			}
		}

		for (Map.Entry<Character, Integer> mapper : map.entrySet()) {
			if (mapper.getValue() == 1) {
				System.out.println("character = "+mapper.getKey());
				return;
			}
		}
	}
}