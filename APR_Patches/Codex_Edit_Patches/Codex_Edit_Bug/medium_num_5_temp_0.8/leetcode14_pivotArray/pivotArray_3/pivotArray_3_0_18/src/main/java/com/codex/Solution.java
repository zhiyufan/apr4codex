package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class ReverseOnlyLetters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = reverseOnlyLetters(s);
    System.out.println(t);
  }
  
  public static String reverseOnlyLetters(String s) {
    if (s.length() == 0 || s.length() == 1) return s;
    
    int left = 0, right = s.length()-1;
    char[] sChars = s.toCharArray();
    
    while (left < right) {
      while (left < right && !Character.isLetter(s.charAt(left))) {
        left++;
      }
      while (left < right && !Character.isLetter(s.charAt(right))) {
        right--;
      }
      
      if (left >= right) break;
      char temp = sChars[left];
      sChars[left] = sChars[right];
      sChars[right] = temp;
      
      left++;
      right--;
    }
    
    return new String(sChars);
  }
}
}