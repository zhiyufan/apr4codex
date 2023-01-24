package com.codex;

import java.util.*;

public class Solution {
package com.company;

public class Main {

    public static void main(String[] args) {
        

        System.out.println("Hello World!");
    }

    public static int addRungs(int[] rungs, int dist) {


        if (rungs[0] > dist) { //bug fix
            return 1; 
        }else {
            int count = 0;
            for (int i = 1; i < rungs.length; i++) {
                if (rungs[i] - rungs[i - 1] > dist) {
                    count++;
                }
            }
        }
        return count;
    }

    
}