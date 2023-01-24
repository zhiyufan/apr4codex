package com.codex;

import java.util.*;

public class Solution {
public class TreesAndGraphs {

    //F (n) = (n - 1) + (n - 2) + ... + 2 + 1

    public static int f(int n) {
        int temp = 0;

        for (int i = 1; i <= n; i++)
            temp += i;

        return temp;
    }

}
}