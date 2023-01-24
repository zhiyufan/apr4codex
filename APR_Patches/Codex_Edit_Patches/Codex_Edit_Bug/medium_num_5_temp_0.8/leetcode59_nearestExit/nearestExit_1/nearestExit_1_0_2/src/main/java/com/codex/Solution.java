package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public boolean isOneEditDistance(String s, String t) {
    if (s.length() == 0 && t.length() == 0)
      return false;
    if (s.length() > t.length())
      return isOneEditDistance(t, s);
    if (s.length() + 1 <= t.length()) {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != t.charAt(i))
          return s.substring(i + 1).equals(t.substring(i + 1));
      }
      return true;
    } else if (s.length() == t.length()) {
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != t.charAt(i))
          count++;
      }
      return count == 1;
    }
    return false;
  }
}
    


    
}