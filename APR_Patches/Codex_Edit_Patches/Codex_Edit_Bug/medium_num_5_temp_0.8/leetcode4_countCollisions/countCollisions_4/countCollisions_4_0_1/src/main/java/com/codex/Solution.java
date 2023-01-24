package com.codex;

import java.util.*;

public class Solution {
    import java.util.HashMap;
    import java.util.Map;

    public static int countCollisions(String directions) {
        
        int totalcollisions = 0;
        StringBuilder sb = new StringBuilder();

        char[] chars = directions.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {


                    break;
                } else {
                    if (chars[i] != 'S' && chars[j] != 'S') {
                        totalcollisions += 2;
                        chars[i] = 'S';
                        chars[j] = 'S';
                    } else {
                        if (chars[i] != 'S') {
                            chars[i] = 'S';
                        }
                        if (chars[j] != 'S') {
                            chars[j] = 'S';
                        }
                    }
                    break;
                }

            }

        }
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }

        System.out.println(sb);

        return totalcollisions;
    }




    public static int countCollisions1(String directions) {
        Map<Character,Integer> map = new HashMap<>();
        Integer value = 0;
        int totalcollisions = 0;
        
        char[] chars = directions.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    break;
                } else {
                    if (chars[i] != 'S' && chars[j] != 'S') {
                        totalcollisions += 2;
                        chars[i] = 'S';
                        chars[j] = 'S';
                    } else {
                        totalcollisions += 1;
                        if (chars[i] != 'S') {
                            chars[i] = 'S';
                        }
                        if (chars[j] != 'S') {
                            chars[j] = 'S';
                        }
                    }
                    break;
                }

            }

        }

        for (int i = 0; i < chars.length; i++) {
            value = map.get(chars[i]);
            if (value == null) {
                value = 0;
            }
            map.put(chars[i],++value);
        }

        System.out.println("Result: " + map);

        }

        return totalCollision;
    }

}