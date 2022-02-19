package com.programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveConsecutiveStringWithThreshold {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("e");
		
		
		System.out.println(getShrunkArray(list, 3));
		//System.out.println(getShrunkArray1(list, 0));
	}	

	public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
		int i = 0;
		while (i < inputArray.size()) {
			if (i < 0)
				i = 0;
			int count = 1, j = i + 1;
			while (j < inputArray.size() && inputArray.get(j).equals(inputArray.get(i))) {
				count++;
				j++;
			}
			if (i < inputArray.size() && count >= burstLength) {
				while (count > 0) {
					inputArray.remove(i);
					count--;
				}
				i -= 3;
			}
			i++;
		}
		return inputArray;
	}
	
	
	static class Pair {
		String str;
		int count;

		Pair (String str, int count) {
			this.str = str;
			this.count = count;
		}

		@Override
		public String toString() {
			return "Pair [str=" + str + ", count=" + count + "]";
		}
		
	}
	// Using Stack
	public static List<String> getShrunkArray1(List<String> inputArray, int burstLength) {
		int n = inputArray.size();
		List<String> outputArray = new ArrayList<String>();
		
		Stack<Pair> stk = new Stack<Pair>();

		int count = 1;
		for (int i = 0; i < n; i++) {
			if (stk.isEmpty()) {
				stk.push(new Pair(inputArray.get(i), 1));
			}
			else if ((stk.peek().str).equals(inputArray.get(i))) {
				count = stk.peek().count + 1;
				stk.push(new Pair(inputArray.get(i), count));
				if (count >= burstLength) {
					while (count-- > 0) {
						stk.pop();
					}
				}
			}
			else {
				stk.push(new Pair(inputArray.get(i), 1));
			}
		}
		System.out.println(stk.toString());
		for (int i = 0; i < stk.size(); i++) {
			outputArray.add(stk.get(i).str);
		}
		return outputArray;
	}
}
