package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println(smallestNumber(934));
    }


    public static int smallestNumber(long num) {
        
        List<Long> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        list.sort(Long::compareTo);
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }
        return answer;
    }

    
}