package com.codex;

import java.util.*;

public class Solution {
int match(char* a, char* b) {
    int count = 0;
    for(int i = 0; i < strlen(a); i++){
        if(a[i] != b[i]) count++;
    }
    return count;
}
}