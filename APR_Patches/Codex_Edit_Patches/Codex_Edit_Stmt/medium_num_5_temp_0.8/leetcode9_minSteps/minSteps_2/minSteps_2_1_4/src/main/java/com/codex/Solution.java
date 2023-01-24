package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }


    public int firstUniqChar(String s) {
        
        int[] sArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(sArray[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }


    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new LinkedList<Integer>();
        if(p.length() > s.length()){
            return result;
        }
        int[] sArray = new int[26];
        int[] pArray = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            pArray[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            if(Arrays.equals(sArray, pArray)){//Objects.equals(sArray, pArray)//Compares the two specified arrays of ints for equality.
                result.add(i);
            }
            sArray[s.charAt(i) - 'a']--;
            sArray[s.charAt(i + p.length()) - 'a']++;
        }
        if(Arrays.equals(sArray, pArray)){
                result.add(s.length() - p.length());
            }
        return result;
    }


    public boolean isValid(String s) {
        
        if(s == null || s.length() < 1){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '('){//The equals() method compares two strings, and returns true if the strings are equal, and false if not.
                stack.pop();
            }else if(!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }else if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
}