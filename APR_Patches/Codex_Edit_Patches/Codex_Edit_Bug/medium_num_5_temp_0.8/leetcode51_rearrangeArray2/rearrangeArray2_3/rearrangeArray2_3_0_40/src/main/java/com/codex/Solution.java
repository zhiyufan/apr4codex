package com.codex;

import java.util.*;

public class Solution {

    static int[] sort(int[] nums) {
        int[] newArray = new int[nums.length];
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positives.add(nums[i]);
            } else {
                negatives.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (positives.size() > 0 && negativeIndex == 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex == 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            } else if (positives.size() > 0 && negativeIndex > 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex > 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            }

            if (newArray[i] >= 0) {
                positiveIndex = i;
            } else {
                negativeIndex = i;
            }
        }

        return newArray;
    }

    static String output;
    
    static String getName(String s) {
        String firstName = "";
        String lastName = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(i < s.indexOf(" ")) {
                firstName = firstName + s.charAt(i);
            } else {
                lastName = lastName + s.charAt(i);
            }
        }
        
        String fullName = lastName + ", " + firstName;
        
        return fullName;
    }
    
    static String getName2(String s) {
        String fullName = "";
        
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                for(int j = i + 1; j < s.length(); j++) {
                    fullName = fullName + s.charAt(j);
                }
                fullName = fullName + ", ";
                for(int k = 0; k < i; k++) {
                    fullName = fullName + s.charAt(k);
                }
            }
        }
        
        return fullName;
    }
    
    public static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    public static String reverseString(String s) {
        String newString = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            newString = newString + s.charAt(i);
        }
        return newString;
    }
    
    public static int[] reverseArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--) {
            newArray[nums.length - 1 - i] = nums[i];
        }
        return newArray;
    }
    
    public static int[] reverseArray2(int[] nums) {
        int[] newArray = new int[nums.length];
        
        for(int i = 0; i < nums.length - 1; i++) {
            newArray[i] = nums[nums.length - i - 1];
        }
        
        return newArray;
    }
    
    public static String reverseString2(String s) {
        String newString = "";
        int index = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            newString = newString + s.charAt(i);
        }
        return newString;
    }
    
    
}