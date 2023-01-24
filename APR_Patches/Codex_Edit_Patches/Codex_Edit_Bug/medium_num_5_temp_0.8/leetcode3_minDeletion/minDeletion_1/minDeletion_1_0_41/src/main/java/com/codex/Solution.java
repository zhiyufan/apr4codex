package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Solution {

    public static int minDeletionSize(String[] A) {
        

        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            char previous = A[0].charAt(i);
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) == previous) {
                    continue;
                } else if (A[j].charAt(i) > previous) {
                    previous = A[j].charAt(i);
                } else {
                    count++;
            previous = A[0].charAt(i);
                }
            }
        
        }
        return count;
    }

    public static void main(String[] args) {
        String[] sample = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(sample));
    }
}
}