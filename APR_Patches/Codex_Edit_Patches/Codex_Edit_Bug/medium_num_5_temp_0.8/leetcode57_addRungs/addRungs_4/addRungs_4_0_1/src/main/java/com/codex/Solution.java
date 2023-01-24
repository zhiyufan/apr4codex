package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ladders = new int[s];
        for(int ladders_i=0; ladders_i < s; ladders_i++){
            ladders[ladders_i] = in.nextInt();
        }
        int kk = in.nextInt();
        int[] runs = new int[kk];
        for(int runs_i=0; runs_i < kk; runs_i++){
            runs[runs_i] = in.nextInt();
        }
        Arrays.sort(ladders);
        Arrays.sort(runs);
        int s_length = ladders.length;
        int k_length = runs.length;
        int remove_ladders = 0;
        int remove_runs = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < s_length; i++) {
            for (j = remove_runs; j < k_length; j++) {
                if (runs[j] >= ladders[i]) {
                    remove_runs++;
                    break;
                }
            }
            if (j == k_length) {
                remove_ladders++;
            }
        }
        System.out.println(remove_ladders);
        
    }

    
}