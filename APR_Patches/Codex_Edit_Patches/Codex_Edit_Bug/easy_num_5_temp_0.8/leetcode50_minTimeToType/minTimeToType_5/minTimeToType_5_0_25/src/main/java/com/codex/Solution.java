package com.codex;

import java.util.*;

public class Solution {
package com.niit.miniproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word");
	String s=sc.nextLine();
	int result=calcTime(s);
	System.out.println(result);
    }
    public static int calcTime(String word) {
        

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    

    
}