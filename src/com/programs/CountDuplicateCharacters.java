/**
 * 
 */
package com.programs;

import java.util.stream.Collectors;

/**
 * @author tarkhand
 *
 */
public class CountDuplicateCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "My name is tarun khandelwal.";
		str = str.replace(" ", "");
		System.out.println(
				str.chars().boxed().collect(Collectors.groupingBy(c -> (char) c.intValue(), Collectors.counting())));
	}

}
