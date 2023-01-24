package com.codex;

import java.util.*;

public class Solution {
public class Test {
    public static void main(String[] args) 
    { 
        runTest("Hello World", 1.2); 
    } 
  
    public static void runTest(String str, double number) {
        System.out.println("String: " + str); 
        System.out.println("Number: " + number); 
        System.out.println("Sum: " + add(number, number)); 
    }
  
    public static double add(double a, double b) { 
        double c = a + b; 
        return c; 
    } 
} 

    
}