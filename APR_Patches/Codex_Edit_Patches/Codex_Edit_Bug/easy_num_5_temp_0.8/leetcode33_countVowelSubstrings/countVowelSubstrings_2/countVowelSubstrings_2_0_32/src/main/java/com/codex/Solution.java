package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class CountVowelSubstrings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    System.out.println(countVowelSubstrings(word));
  }

  public static int countVowelSubstrings(String word) {
    int ans = 0;
    for (int i = 0; i < word.length(); i++) {
      for (int j = i; j < word.length(); j++) {
        if (isVowelSubstring(word.substring(i, j + 1))) {
          ans++;
        }
      }
    }

    return ans;
  }

  private static boolean isVowelSubstring(String str) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    int[] freq = new int[5];
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < 5; j++) {
        if (str.charAt(i) == vowels[j]) {
          freq[j]++;
          break;
        }
      }
    }
    for (int i = 0; i < 5; i++) {
      if (freq[i] == 0) {
        return false;
      }
    }
    return true;
  }

}
}