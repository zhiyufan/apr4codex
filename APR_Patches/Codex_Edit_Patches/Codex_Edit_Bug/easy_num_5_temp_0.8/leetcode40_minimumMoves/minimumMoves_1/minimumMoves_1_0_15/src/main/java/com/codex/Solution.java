package com.codex;

import java.util.*;

public class Solution {
String i = "12";
        
        for (int i1 = 0; i1 < i.length(); i1++) {
            if (i.charAt(i1) == '3') {
                i = i.replace(i.charAt(i1), '9');
            }
        }
        return count;
    }

    
}