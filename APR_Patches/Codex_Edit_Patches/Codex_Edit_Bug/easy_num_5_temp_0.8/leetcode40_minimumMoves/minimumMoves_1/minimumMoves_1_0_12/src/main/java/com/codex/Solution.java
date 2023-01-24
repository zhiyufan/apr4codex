package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    int n;
    char str[1001];
    scanf("%d", &n);
    while (n--) {
        scanf("%s", str);
        if (strlen(str) < 3) {
            printf("0\n");
        } else {
            int count = 0;
            for (int i = 2; i < strlen(str); i++) {
                if (str[i] == 'X' && str[i - 1] == 'X' && str[i - 2] == 'X') {
                    count++;
                    i += 2;
                }
            }
            printf("%d\n", count);
        }
    }
    return 0;
}
}