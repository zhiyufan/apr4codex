package com.codex;

import java.util.*;

public class Solution {
public String withSpaces(String str){
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if (i > 0)
                ret.append(" ");
            ret.append(str.charAt(i));
        }
        return ret.toString();
    }
}