package com.programs;

import java.util.Stack;
/**
 * The Leetcode file system keeps a log each time some user performs a change folder operation.
 * The operations are described below:
 * "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
 * "./" : Remain in the same folder.
 * "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
 * You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
 * 
 * The file system starts in the main folder, then the operations in logs are performed.
 * 
 * Return the minimum number of operations needed to go back to the main folder after the change folder operations.
 * 
 * Input: logs = ["d1/","d2/","../","d21/","./"]
 * Output: 2
 * Explanation: Use this change folder operation "../" 2 times and go back to the main folder.
 * 
 * Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
 * Output: 3
 * 
 * Input: logs = ["d1/","../","../","../"]
 * Output: 0
 * 
 */
public class CrawlerLogFolder {
	public static void main(String[] args) {
		System.out.println(minOperations(new String[] {"d1/","d2/","../","d21/","./"}));
	}

	public static int minOperations(String[] logs) {
		Stack<String> st = new Stack<>();
		for (String log : logs) {
			if (log.equals("../")) {
				if (!st.empty())
					st.pop();
				else
					continue;
			} else if (log.equals("./")) {
				continue;
			} else {
				st.push(log);
			}
		}
		return st.size();
	}
}
