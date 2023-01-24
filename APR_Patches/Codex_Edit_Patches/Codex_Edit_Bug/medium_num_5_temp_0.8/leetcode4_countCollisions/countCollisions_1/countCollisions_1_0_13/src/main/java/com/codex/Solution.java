package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            int n = in.nextInt();
            String directions = in.next();
            System.out.println(countCollisions(directions));
        }
    }

    private static int countCollisions(String directions) {
        
        char[] chars = directions.toCharArray();
        int result = 0;
        for (int i = 0; i <= chars.length-1; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j) {
                    continue;
                }
                if (chars[i] == 'L' && chars[j] == 'R') {
                        result++;
                } else if (chars[i] == 'R' && chars[j] == 'L') {
                        result++;
                }
            }
        }
        return result;
    }
}

    
}