package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <stdlib.h>

int timeRequiredToBuy(int* tickets, int k) {
        
        int* counter = (int*)malloc(sizeof(int)*tickets.length);
        for (int i = 0; i < tickets.length(); i++) {
            counter[i] = tickets[i];        
        }
        int time = 0;        
        while (counter[k] > 0) {
            time++;            
            for (int i = 0; i < counter.length(); i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                }
            }
        }
        return time;
    }

    
}