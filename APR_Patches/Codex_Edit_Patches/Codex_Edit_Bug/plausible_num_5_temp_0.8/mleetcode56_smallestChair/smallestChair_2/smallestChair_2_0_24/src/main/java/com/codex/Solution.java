package com.codex;

import java.util.*;

public class Solution {
    import java.util.Arrays;
    public class ChairSeat {
    public static int smallestChair(int[][] times, int targetFriend) {
        int[] people = new int[times.length];
        for (int i = 0; i < times.length; i++){
            for (int j = times[i][0]; j < times[i][1]; j++){
                people[j]++;
                if (people[j] > people[targetFriend]){
                    return i;
                }
            }
        }
        return -1;
    }

        public static void main(String[] args) {
            int[][] times = {{0,1},{1,2},{0,3}};
            System.out.println(smallestChair(times, 0));
        }
    }
    
    
}