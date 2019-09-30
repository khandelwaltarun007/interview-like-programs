package com.programs;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write an expression to check whether it is balanced or not.");
		System.out.print("Expression : ");
		String str = sc.nextLine();
		sc.close();
		Stack<Character> stack = new Stack<>();
		char[] ch = str.toCharArray();
		if (ch.length < 2) {
			System.out.println("Invalid String.");
			return;
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
				stack.push(ch[i]);
			} else if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
				if (validate(stack.lastElement(), ch[i]))
					stack.pop();
			}
		}
		if (stack.isEmpty())
			System.out.println("Expression is balanced.");
	}

	private static boolean validate(char c, char d) {
		if (c == '[' && d == ']') {
			return true;
		}
		if (c == '{' && d == '}') {
			return true;
		}
		if (c == '(' && d == ')') {
			return true;
		}
		return false;
	}
}
