package com.vagrant.testCases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class WissenTest {

       public static void main(String[] args) {
             // TODO Auto-generated method stub

             WissenTest obj = new WissenTest();
             Map<Character, Integer> mp = new HashMap<Character, Integer>();
             mp = obj.max("Hello world");

             System.out.println("Max occurances character with count");

             for (Map.Entry<Character, Integer> e : mp.entrySet()) {
                    System.out.println(e.getKey() + "  " + e.getValue());
             }

             mp.clear();
             mp = obj.min("Hello world");

             System.out.println("Min occurances character with count");
             for (Map.Entry<Character, Integer> e : mp.entrySet()) {
                    System.out.println(e.getKey() + "  " + e.getValue());
             }

       }

       private Map<Character, Integer> getOccuranceWithCount(String str) {

             char strChar[] = str.toCharArray();
             Map<Character, Integer> mp = new HashMap<Character, Integer>();// H 1 E1 L3
             for (char c : strChar) {
                    if (c != ' ') {
                           if (mp.containsKey(c)) {
                                 mp.put(c, mp.get(c) + 1);
                           } else {
                                 mp.put(c, 1);
                           }
                    }
             }
             return mp;
       }

       private List<Entry<Character, Integer>> getSortedEntryList(Map<Character, Integer> mp) {
             Set<Entry<Character, Integer>> entry = mp.entrySet();
             List<Entry<Character, Integer>> list = new ArrayList(entry);
             Collections.sort(list, new Comparator<Entry<Character, Integer>>() {
                    @Override
                    public int compare(Entry<Character, Integer> e1, Entry<Character, Integer> e2) {
                           return e2.getValue().compareTo(e1.getValue());
                    }
             });// l 3, o2

             return list;
       }

       private Map<Character, Integer> max(String str) {
             Map<Character, Integer> mp = getOccuranceWithCount(str);
             List<Entry<Character, Integer>> list = getSortedEntryList(mp);
             Map<Character, Integer> tm = new TreeMap<Character, Integer>();
             int maxValue = list.get(0).getValue();
             for (Entry<Character, Integer> e : list) {
                    if (e.getValue() == maxValue) {
                           tm.put(e.getKey(), e.getValue());
                    }
             }
             return tm;
       }

       private Map<Character, Integer> min(String str) {
             Map<Character, Integer> mp = getOccuranceWithCount(str);
             List<Entry<Character, Integer>> list = getSortedEntryList(mp);
             Map<Character, Integer> tm = new TreeMap<Character, Integer>();
             int minValue = list.get(list.size() - 1).getValue();
             for (Entry<Character, Integer> e : list) {
                    if (e.getValue() == minValue) {
                           tm.put(e.getKey(), e.getValue());
                    }
             }
             return tm;
       }

}

