package com.codex;

import java.util.*;

public class Solution {
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public int minimumMoves(String s) {
    int count = 0;
    for (int i = 0; i < s.length() - 2; i++) {
      if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
        count++;
        i += 2;
      }
    }
  }
}
    
}