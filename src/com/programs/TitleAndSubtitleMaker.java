package com.programs;

import java.util.ArrayList;
import java.util.List;

public class TitleAndSubtitleMaker {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("# This is Title");
		list.add("## This is subtitle of title");
		list.add("## This is subtitle of title");
		list.add("## This is subtitle of title");
		list.add("# This is Title");
		list.add("## This is subtitle of title");
		list.add("# This is Title");
		list.add("## This is subtitle of title");
		list.add("# This is Title");
		list.add("## This is subtitle of title");
		list.add("## This is subtitle of title");
		convertTitleAndSubtitle(list);
	}
	
	public static void convertTitleAndSubtitle(List<String> list) {
		List<String> newlist = new ArrayList<>();
		int title = 0;
		int subtitle = 0;
		for(String str : list) {
			if(str.startsWith("# ")) {
				title++;
				subtitle = 0;
				newlist.add(str.replace("# ",String.valueOf(title).concat(". ")));
			}else if(str.startsWith("## ")) {
				subtitle++;
				newlist.add(str.replace("## ",String.valueOf(title).concat(".").concat(String.valueOf(subtitle)).concat(". ")));
			}
		}
		newlist.forEach(System.out::println);
	}
	

}
