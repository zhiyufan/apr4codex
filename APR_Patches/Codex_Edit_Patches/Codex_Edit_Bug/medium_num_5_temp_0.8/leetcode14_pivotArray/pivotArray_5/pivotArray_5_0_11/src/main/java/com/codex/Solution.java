package com.codex;

import java.util.*;

public class Solution {
public int[] solution(int[] A, int K) {
    int[] result = new int[A.length];
    
    for(int i=0; i<A.length; i++) {
        int newLocation = i + K;
        if(newLocation >= A.length) {
            newLocation = newLocation - A.length;
        }
        result[newLocation] = A[i];
    }

    return result;
}
}