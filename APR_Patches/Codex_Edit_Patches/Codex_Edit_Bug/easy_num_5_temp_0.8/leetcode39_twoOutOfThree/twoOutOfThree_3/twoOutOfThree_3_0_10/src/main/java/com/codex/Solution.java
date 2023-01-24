package com.codex;

import java.util.*;

public class Solution {
    public static int removeElement(List<Integer> list, int x) {
        
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == x) {
                list.remove(i);
                --i;
            }
        } 
        return list.size();
    }
}