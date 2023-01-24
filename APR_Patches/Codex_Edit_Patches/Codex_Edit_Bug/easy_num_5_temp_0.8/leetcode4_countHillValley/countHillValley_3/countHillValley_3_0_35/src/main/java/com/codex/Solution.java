package com.codex;

import java.util.*;

public class Solution {
public class Calculator {
  
  public int evaluate(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}

    
}