package com.vagrant.testCases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.testng.collections.Lists;

public class practiceClass {
	public static void main(String[] args) {
		System.out.println("GfG!");

		practiceClass pc = new practiceClass();
		pc.getCount("AlokShrivastava");
	}

	public void getCount(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<String> set = new HashSet<String>();

		List<Object> l1 = set.stream().collect(Collectors.toList());

		List<String> l3 = new ArrayList<>(set);

		List<String> l2 = Lists.newArrayList(set);

		char[] c = str.toUpperCase().toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (!map.containsKey(c[i])) {
				map.put(c[i], 1);
			} else {
				map.put(c[i], map.get(c[i]) + 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
