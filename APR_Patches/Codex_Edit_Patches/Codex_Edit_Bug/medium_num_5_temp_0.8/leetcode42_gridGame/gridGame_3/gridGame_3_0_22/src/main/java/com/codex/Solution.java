package com.codex;

import java.util.*;

public class Solution {
public class HelloWorld{
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> subs = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            subs.add(s.substring(i, i + k));
        }
        Collections.sort(subs);
        smallest = subs.get(0);
        largest = subs.get(subs.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
}