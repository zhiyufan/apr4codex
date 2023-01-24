package com.codex;

import java.util.*;

public class Solution {
class Main {
  public static int max_of_four(int a, int b, int c, int d)
  {
    int max = a;
    if(b > max)
    {
      max = b;
    }
    if(c > max)
    {
      max = c;
    }
    if(d > max)
    {
      max = d;
    }
    return max;
    }


  public static void main(String[] args) {
    int ans = max_of_four(5,4,3,4);

    System.out.println(ans);
  }
}
}