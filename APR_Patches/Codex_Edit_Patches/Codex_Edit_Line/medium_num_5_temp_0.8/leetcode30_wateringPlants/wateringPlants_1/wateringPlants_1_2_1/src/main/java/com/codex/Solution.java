package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int i = 0;
        int position = 0;
        int steps = 0;
        while (i < plants.length) {
            if (plants[i] > capacity) {
                return -1;
            }
            if (position < 0) {
                steps++;
                position = 0;
            }
            if (plants[i] > capacity - position) {
                steps++;
                position = 0;
            }
            position += plants[i];
            steps++;
            i++;
        }
        return steps;
    }



        public static String appendAndDelete(String s, String t, int k) {
            int i = 0;
            StringBuilder sBuilder = new StringBuilder(s);
            StringBuilder tBuilder = new StringBuilder(t);
            if (s.length() + t.length() <= k) {
                return "Yes";
            }
            while (Math.abs(i) < Math.abs(s.length() - t.length()) && sBuilder.substring(0, i).toString().equals(tBuilder.substring(0, i).toString())) {
                i++;
            }
            i--;
            if (sBuilder.substring(i, s.length()).length() + tBuilder.substring(i, t.length()).length() > k) {
                return "No";
            }
            if (sBuilder.substring(i, s.length()).length() + tBuilder.substring(i, t.length()).length() == k) {
                return "Yes";
            }
            if (sBuilder.substring(i, s.length()).length() + tBuilder.substring(i, t.length()).length() + 2 * i <= k) {
                return "Yes";
            } else {
                return "No";
            }
        }



    
}