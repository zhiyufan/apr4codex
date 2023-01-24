package com.codex;

import java.util.*;

public class Solution {
   public static int minBitFlips(int start, int goal) {
        
        String startBinary = Integer.toBinaryString(start);
        String goalBinary = Integer.toBinaryString(goal);
        
        if (Math.abs(goalBinary.length() - startBinary.length()) > 1){
            return -1;
        }
        
        if (startBinary.equals(goalBinary)){
            return 0;
        }
        
        StringBuilder sb = new StringBuilder();
        if (goalBinary.length() > startBinary.length()){
            sb.append("0");
        }
        sb.append(startBinary);
        startBinary = sb.toString();
        
        sb = new StringBuilder();
        if (startBinary.length() > goalBinary.length()){
            sb.append("0");
        }
        sb.append(goalBinary);
        goalBinary = sb.toString();
        
        int front = 0;
        int end = startBinary.length() - 1;
        int count = 0;
        while (front < end){
            if (startBinary.charAt(front) != goalBinary.charAt(front)){
                count++;
              
            }
            if (startBinary.charAt(end) != goalBinary.charAt(end)){
                count++;
                
            }
            front++;
            end--;
        }
        
        return count + Math.abs(startBinary.length() - goalBinary.length());
    }




}
}