package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);
        }        

        Collections.sort(l, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                boolean a1 = (Integer.bitCount(a) == Integer.bitCount(b));
                int answer = 0;

                if (a1) {
                    if (a < b) {
                        answer = -1;
                    } else if (a > b) {
                        answer = 1;
                    }
                } else {
                    if (Integer.bitCount(a) < Integer.bitCount(b)) {
                        answer = -1;
                    } else if (Integer.bitCount(a) > Integer.bitCount(b)) {
                        answer = 1;
                    }
                }

                return answer;
            }
        });

        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = l.get(i);
        }

}
        return answer;
    }
}