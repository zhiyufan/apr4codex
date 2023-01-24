package com.codex;

import java.util.*;

public class Solution {
    List<Integer> goodDays = new ArrayList<>();
        for (int i = time; i < security.length; i++) {
            
            if (i == time) {
                boolean good = true;
                for (int j = 1; j < time; j++) {
                    if (security[j - 1] < security[j]) {
                        good = false;
                        break;
                    }
                }
                if(good) goodDays.add(i);
            if(!(i == security.length)) {
                if (security[i - time - 1] < security[i - time]) {
                    if(goodDays.contains(i - time)) {
                        goodDays.remove(new Integer(i - time));
                    }
                }
            }
            
            if (security[i - time] < security[i - time + 1]) {
                boolean good = true;
                for (int j = i - time + 1; j < i; j++) {
                    if (security[j - 1] < security[j]) {
                        good = false;
                        break;
                    }
                }
                if(!good) {
                    if(goodDays.contains(i - time)) {
                         goodDays.remove(new Integer(i - time));
                    }
                }
                if (good) {
                    if(!(i == security.length)) {
                        for (int j = i; j < i + time - 1; j++) {
                            if(security[j - 1] > security[j]) {
                                good = false;
                            }
                        }
                        if(good) goodDays.add(i);
                    }
                }
            }
        }
    
            }
    
}