package com.codex;

import java.util.*;

public class Solution {
public static String makeFancyString(String s) {
        if(s==null)
            return "";
        if(s.length()<2)
            return s;
        StringBuilder sb=new StringBuilder();
        char last=s.charAt(0);
        sb.append(last);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=last)
            {
                sb.append(s.charAt(i));
            }
            last=s.charAt(i);
        }
        return sb.toString();
    }
}
}