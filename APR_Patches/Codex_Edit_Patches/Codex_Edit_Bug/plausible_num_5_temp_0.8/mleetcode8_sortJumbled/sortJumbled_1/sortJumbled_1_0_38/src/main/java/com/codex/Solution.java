package com.codex;

import java.util.*;

public class Solution {
    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);
        for (i = strlen(str) - 1, j = 0;i >= 0;i--, j++) {
            if (i == 0) {
                printf("%c", str[j]);
                break;
            }
            else {
                printf("%c-", str[j]);
            }
        }

        return 0;
    }


    #include<stdio.h>
    #include<string.h>
    int main() {
        char str[100];
        int i, j;
        gets(str);

    public static int[] sortJumbled(int[] mapping, int[] nums) {
        

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        Arrays.sort(res);

        int[] map = new int[10];
        for (int i = 0; i < 10; i++) {
            map[mapping[i]] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }

    
}