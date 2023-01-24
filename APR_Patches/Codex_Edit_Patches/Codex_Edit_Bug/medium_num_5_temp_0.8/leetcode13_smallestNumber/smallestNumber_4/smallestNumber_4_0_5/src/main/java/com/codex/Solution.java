package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        if (newS.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;
            while (!firstNotZero) {
                if (newS.charAt(i) != '0') {
                    firstNotZero = true;
                    char temp = newS.charAt(0);
                    newS = newS.substring(0, i) + temp + newS.substring(i + 1);
                    newS = newS.substring(1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(newS);
    }

    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class test {

    public static int[] solution(int[] prices, int costs) {
        int[] answer = {};
        List<Integer> answers = new ArrayList<>();

        for (int price : prices) {
            if (costs > price) {
                answers.add(-1);
            } else {
                answers.add(price - costs);
            }
        }

        answer = new int[answers.size()];
        ListIterator<Integer> listIter = answers.listIterator();
        while (listIter.hasNext()) {
            answer[listIter.nextIndex()] = listIter.next();
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] prices = { 100, 200, 300 };
        int costs = 100;
        int[] answer = solution(prices, costs);
        System.out.println(Arrays.toString(answer));
    }
}

    
}