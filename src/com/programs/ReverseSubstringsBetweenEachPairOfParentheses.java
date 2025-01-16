package com.programs;

import java.util.Stack;

/**
 * You are given a string s that consists of lower case English letters and
 * brackets.
 * 
 * Reverse the strings in each pair of matching parentheses, starting from the
 * innermost one.
 * 
 * Your result should not contain any brackets.
 * 
 * Example 1:
 * Input: s = "(abcd)" Output: "dcba"
 * 
 * Example 2:
 * Input: s = "(u(love)i)" Output: "iloveu"
 * 
 * Explanation: The substring "love" is reversed first, then the whole string is
 * reversed.
 * 
 * Example 3:
 * Input: s = "(ed(et(oc))el)" Output: "leetcode"
 * 
 * Explanation: First, we reverse the substring "oc", then "etco", and finally,
 * the whole string.
 */
public class ReverseSubstringsBetweenEachPairOfParentheses {
	public static void main(String[] args) {
		String str = "(ed(et(oc))el)";
		System.out.println(reverseParentheses(str));
	}

	public static String reverseParentheses(String s) {
		Stack<String> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				st.push("(");
			} else if (c == ')') {
				StringBuilder rev = new StringBuilder();
				while (!st.empty() && !st.peek().equals("(")) {
					rev.append(new StringBuilder().append(st.pop()).reverse());
				}
				st.pop();
				st.push(rev.toString());
			} else {
				st.push(String.valueOf(c));
			}
		}

		StringBuilder result = new StringBuilder();
		while (!st.empty()) {
			result.insert(0, st.pop());
		}
		return result.toString();
	}
}
