package com.codex;

import java.util.*;

public class Solution {
public class Sample {
   public static void main(String args[]){
      int[] array = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
      int total = 0;
      // advanced for loop
      for( int i : array) {
         total = total + i;
      }
      System.out.println( "Total : " + total );
   }
}
}