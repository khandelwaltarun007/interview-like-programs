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
		if(isValid(str)){
			System.out.println("Valid Expression.");
		}else {
			System.out.println("Invalid Expression.");
		}
		
	}

	public static boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (stack.isEmpty())
                return false;
            else {
                char ch1 = stack.peek();
                if (ch1 == '(' && ch == ')' || ch1 == '{' && ch == '}' || ch1 == '[' && ch == ']')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
