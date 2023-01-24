package com.codex;

import java.util.*;

public class Solution {
    
        int n = in.nextInt();
        int[] startPos = new int[2];
        startPos[0] = in.nextInt();
        startPos[1] = in.nextInt();
        String s = in.next();
        int[] result = executeInstructions(n, startPos, s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(",");
        }
    }
    private static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] result = new int[s.length()];        
        for (int i=0; i< s.length(); i++) {
            int count = 0;
            int[] pos = new int[2];
            pos[0] = startPos[0]; 
            pos[1] = startPos[1]; 
            while (pos[0] >= 0 && pos[0] < n && pos[1] >= 0 && pos[1] < n && i + count < s.length()){
                if(s.charAt(i + count) == 'L'){
                    pos[1]--;
                } else if(s.charAt(i + count) == 'R'){
                    pos[1]++;
                } else if(s.charAt(i + count) == 'U'){
                    pos[0]--;
                } else if(s.charAt(i + count) == 'D'){
                    pos[0]++;
                }
                count++;
            }
            result[i] = count; 
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int[] startPos = new int[2];
        System.out.println("Enter start position of row and column");
        startPos[0] = in.nextInt();
        startPos[1] = in.nextInt();
        System.out.println("Enter the directions");
        String s = in.next();
        int[] result = executeInstructions(n, startPos, s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(",");
        }
    }
    private static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] result = new int[s.length()];        
        for (int i=0; i< s.length(); i++) {
            int count = 0;
            int[] pos = new int[2];
            pos[0] = startPos[0]; 
            pos[1] = startPos[1]; 
            while (pos[0] >= 0 && pos[0] < n && pos[1] >= 0 && pos[1] < n && i + count < s.length()){
                if(s.charAt(i + count) == 'L'){
                    pos[1]--;
                } else if(s.charAt(i + count) == 'R'){
                    pos[1]++;
                } else if(s.charAt(i + count) == 'U'){
                    pos[0]--;
                } else if(s.charAt(i + count) == 'D'){
                    pos[0]++;
                }
                count++;
            }
            result[i] = count; 
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int[] startPos = new int[2];
        System.out.println("Enter start position of row and column");
        startPos[0] = in.nextInt();
        startPos[1] = in.nextInt();
        System.out.println("Enter the directions");
        String s = in.next();
        int[] result = executeInstructions(n, startPos, s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(",");
        }
    }

    
}