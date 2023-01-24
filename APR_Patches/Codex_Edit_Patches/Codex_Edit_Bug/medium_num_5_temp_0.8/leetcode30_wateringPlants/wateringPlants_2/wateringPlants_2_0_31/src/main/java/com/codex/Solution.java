package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
                    water -= plants[i];
                    i++;
                    x++;
                }
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }


public static String StringSplosion(String str) { 
  
  String result = ""; 
  // code goes here   
  /* Note: In Java the return type of a function and the 
     parameter types being passed are defined, so this return 
     call must match the return type of the function.
     You are free to modify the return type. */
  
  for (int i=0; i<str.length(); i++) {
    result += str.substring(0, i+1);
    }  
  
  return result;
    
  } 
}