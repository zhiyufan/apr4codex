package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean Find(int target, int [][] array) {
        for(int i = 0; i < array.length; i++)
            for(int j = array[i].length - 1; j >= 0; j--){
                if(array[i][j] == target)
                    return true;
                else if(array[i][j] > target)
                    continue;
                else
                    break;
            }
        return false;
    }
}

    
}