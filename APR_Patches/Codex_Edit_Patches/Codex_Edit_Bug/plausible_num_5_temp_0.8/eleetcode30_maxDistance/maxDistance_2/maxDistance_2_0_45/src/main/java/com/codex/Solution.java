package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] colors = new int[n];
    for(int i = 0; i < n; i++)
      colors[i] = sc.nextInt();
    System.out.println(maxDistance(colors));
  }
  public static int maxDistance(int[] colors) {
        

    int n = colors.length;
    int maxDist = 0;
    int lastColor = -1;
    int lastColorPos = -1;
    for (int i = 0; i < n; i++) {
      if (colors[i] != lastColor) {
        if (lastColor != -1) {
          maxDist = Math.max(maxDist, i - lastColorPos);
        }
        lastColor = colors[i];
        lastColorPos = i;
      }
    }

    maxDist = Math.max(maxDist, n - lastColorPos);    
    return maxDist;
  }
}
}