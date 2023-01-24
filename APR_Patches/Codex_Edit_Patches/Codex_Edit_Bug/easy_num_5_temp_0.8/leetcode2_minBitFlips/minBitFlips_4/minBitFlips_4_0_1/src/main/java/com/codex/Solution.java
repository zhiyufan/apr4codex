package com.codex;

import java.util.*;

public class Solution {
while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int current = q.remove();
                if(current == target){
                    return level;
                }
                if(current != 0)
                    q.add(current - 1);
                q.add(current + 1);
                q.add(current * 2);
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
            n /= 2;
            m /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}