package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("1");
        } else if(n % 2 == 0) {
            System.out.println(2);
        } else {
            int ans = 0;
            while(ans == 0) {
                System.out.println(1);
                System.out.flush();
                ans = sc.nextInt();
                if(ans == 1) {
                    System.out.println(n);
                    System.out.flush();
                    ans = sc.nextInt();
                }
            }
            int lo = 1, hi = n;
            while(lo < hi) {
                int mid = (lo + hi) / 2;
                System.out.println((mid + ans) / 2);
                System.out.flush();
                int x = sc.nextInt();
                if(x == 0) return;
                if(x == 1) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            }
            System.out.println(ans);
            System.out.flush();
            if(sc.nextInt() == 0) {
                return;
            } else {
                System.out.println(lo);
                System.out.flush();
            }
        }
    }

}
}