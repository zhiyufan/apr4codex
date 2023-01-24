package com.codex;

import java.util.*;

public class Solution {
public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("world!");
        System.out.println(" Hello again!");
        System.out.println("My name is Vova");
        System.out.println("I am 26 years old");
        System.out.println("Мой город Пермь");
    }

    public static int maximumNumber(int num, int[] change) {

        if (change.length == 0) {
            return num;
        }
        for (int element : change) {
            if (element > 0) {
                int number = num;
                while (element > 0) {
                    number = number * 10 + 9;
                    element--;
                }
            }
        }
        return new String(output);
    }


    
}