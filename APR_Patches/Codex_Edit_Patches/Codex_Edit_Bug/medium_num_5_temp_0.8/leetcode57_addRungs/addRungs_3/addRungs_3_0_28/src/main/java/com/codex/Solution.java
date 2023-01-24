package com.codex;

import java.util.*;

public class Solution {
class Solution {
   public int getRungs(int[] rungs, int dist) {
       int maxClimb = 0;
       int extraRung = 0;
       int total = 1;
       for (int i = 0; i < rungs.length; i++) {
           if (rungs[i] > maxClimb) {
               extraRung = rungs[i] - maxClimb;
               maxClimb += dist;
               if (extraRung > dist) {
                   maxClimb += extraRung - dist;
                   total++;
               }
           }
       }
       return total;
   }

   public static void main(String[] args) {
       int[] rungs = {4, 6, 8, 12, 14, 17};
       int dist = 5;
       Solution s = new Solution();
       System.out.println(s.getRungs(rungs, dist));
   }
}
}