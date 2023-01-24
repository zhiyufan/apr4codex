package com.codex;

import java.util.*;

public class Solution {
        /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coderobin;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CodeRobin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            times[i][0] = scan.nextInt();
            times[i][1] = scan.nextInt();
        }
        System.out.println(smallestChair(times, m));
    }

    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0;
        for (int[] time : times) {
            currMax = Math.max(currMax, time[0]);
            currMax = Math.max(currMax, time[1]);
        }
        int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

}
}