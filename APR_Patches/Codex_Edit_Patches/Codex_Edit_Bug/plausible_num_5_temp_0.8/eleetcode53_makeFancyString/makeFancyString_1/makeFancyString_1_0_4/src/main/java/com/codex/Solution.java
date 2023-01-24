package com.codex;

import java.util.*;

public class Solution {
package dcy.com.link;

/**
 * @author dingchengyun
 * @date 2020/8/20
 * @description
 */
public class MakeFancy {

    public static String makeFancyString(String s) {


        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                i -= 2;
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String s = null;
        String result = makeFancyString(s);

    }
}
}