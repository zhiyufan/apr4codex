package com.codex;

import java.util.*;

public class Solution {
// Program to implement DFS for a graph
#include <stdio.h>
#include <stdlib.h>

// A structure to represent an adjacency list node
struct AdjListNode
{
	int dest;
	struct AdjListNode* next;
};

            if(hm2.contains(n)){
                hm2.remove(n);
                list.add(n);
            } else {
                hm2.add(n);
            }
        }

        for(int n : nums3){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }
            if(hm2.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }

    
}