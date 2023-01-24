package com.codex;

import java.util.*;

public class Solution {
// a와 b의 최대공약수를 구하는 알고리즘을 재귀적으로 구현
import java.util.*;

public class coding_test_2020_05_31 {

    public static int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        List<String> list1 = getList(str1);
        List<String> list2 = getList(str2);
        if (list1.isEmpty() && list2.isEmpty()) return 65536;

        int sum = 0;
        for (String s : list1) {
            if (list2.contains(s)) {
                list2.remove(s);
                sum++;
            }
        }

        return (int) (sum / (Math.sqrt(list1.size() * list2.size())) * 65536);
    }


    public static List<String> getList(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            char char1 = str.charAt(i);
            char char2 = str.charAt(i + 1);
            if (!isValid(char1) || !isValid(char2)) continue;

            list.add(char1 + "" + char2);
        }
        return list;
    }

    public static boolean isValid(char a) {
        return 'A' <= a && a <= 'Z';
    }
}

        
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0];
            int col = startPos[1];
            int count = 0;

            char[] directions = s.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                switch (directions[j]) {
                    case 'L': {
                        if (col > 0) {
                            col--;
                            count++;
                        }
                        break;
                    }
                    case 'R': {
                        if (col < n - 1) {
                            col++;
                            count++;
                        }
                        break;
                    }
                    case 'U': {
                        if (row > 0) {
                            row--;
                            count++;
                        }
                        break;
                    }
                    case 'D': {
                        if (row < n - 1) {
                            row++;
                            count++;
                        }
                        break;
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    
}