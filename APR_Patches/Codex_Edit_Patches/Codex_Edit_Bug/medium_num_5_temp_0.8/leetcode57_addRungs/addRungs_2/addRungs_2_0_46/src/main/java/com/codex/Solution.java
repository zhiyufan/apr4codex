package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0;
        for (int i = 1; i < rungs.length; ) {
            if (rungs[i] - rungs[i - 1] > dist) {
                add++;
                rungs[i] = rungs[i - 1] + dist;
            } else {
                i++;
            }
        }
        return add;
    }


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        System.out.println(countApplesAndOranges(s, t, a, b, apple, orange));
    }
    
    public static int countApplesAndOranges(int s, int t, int a, int b, int[] apple, int[] orange) {
        
        int appleFall = 0;
        int orangeFall = 0;
        for (int i = 0; i < apple.length; i++) {
            if (apple[i] > 0 && a + apple[i] >= s && a + apple[i] <= t) {
                appleFall++;
            }
        }
        
        for (int i = 0; i < orange.length; i++) {
            if (orange[i] < 0 && b + orange[i] >= s && b + orange[i] <= t) {
                orangeFall++;
            }
        }
        
        return appleFall +  orangeFall;
    }
}
    
}