package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        String word = "applepenapple";
        String[] dict = {"apple", "pen"};
        System.out.println(test(word, dict));
	}
	
	private static ArrayList<String> test(String word, String[] dict) {
	    ArrayList<String> list = new ArrayList<>();
		for (String str : dict) {
		    if (word.contains(str)) {
		        list.add(str);
		        word = word.replaceFirst(str, "");
		        if (word.equals("")) return list;
		        list.addAll(test(word, dict));
		        if (list.size() > 1 && list.get(list.size() - 1).equals(word)) {
		            list.remove(list.size() - 1);
		        }
		        list.remove(list.size() - 1);
		        word = str + word;
		    }
		}
		list.add(word);
		return list;
	}

	
}
    
}