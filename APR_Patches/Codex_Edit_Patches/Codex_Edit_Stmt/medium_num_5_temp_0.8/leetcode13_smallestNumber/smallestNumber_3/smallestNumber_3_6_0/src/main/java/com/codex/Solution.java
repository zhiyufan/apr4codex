package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {

    List<Integer> list = new ArrayList<>();
    while (num != 0) {
        list.add((int) num % 10);
        num /= 10;
    }
    list.sort(Integer::compareTo);
    long answer = 0;
    for (int i = 0; i < list.size(); i++) {
        answer += list.get(i) * Math.pow(10, i);
    }
    return answer;
}

// public static long smallestNumber(long num) {

//     List<Integer> list = new ArrayList<>();
//     while (num != 0) {
//         list.add((int) num % 10);
//         num /= 10;
//     }
//     list.sort(Integer::compareTo);
//     long answer = 0;
//     for (int i = 0; i < list.size(); i++) {
//         answer += list.get(i) * Math.pow(10, i);
//     }
//     return answer;
// }

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] split = s.split("-");
        for (String str : split) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += (str.charAt(i) - '0') * Math.pow(10, str.length() - 1 - i);
            }
            answer += sum;
        }
        return answer;
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] split = s.split("-");
        for (String str : split) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum = sum * 10 + (str.charAt(i) - '0');
            }
            answer += sum;
        }
        return answer;
    }

}
}