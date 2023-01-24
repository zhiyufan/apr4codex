package com.codex;

import java.util.*;

public class Solution {
public boolean checkRecord(String s){
    int count = 0;
    if(s.contains("A")){
        count++;
        if(s.contains("A")){
            count++;
        }
    }
    return count <= 1 && !s.contains(i+"L"+i+"L");
}
}