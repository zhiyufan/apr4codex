package com.codex;

import java.util.*;

public class Solution {

#include <stdio.h>

int main(int argc, char* argv[]) {
    int a, b;
    a = 10;
    b = 20;

    if (argc > 1) {
        if (argc == 3) {
            a = atoi(argv[1]);
            b = atoi(argv[2]);
        } else {
            printf("Please enter 2 arguments");
            return 1;
        }
    }

    printf("The sum of %d and %d is %d\n", a, b, a + b);
    char* name = "Gideon";
    int age = 21;
        
    printf("Name: %s\nAge: %d\n", name, age);
    char input[100];
    printf("Input your name: ");
    scanf("%s", input);
    
    printf("Input your age: ");
    scanf("%d", age);
    printf("Name: %s\nAge: %d\n", input, age);
        
    int days_in_a_week = 7;
    char* days_of_the_week[] =  {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    for (int i = 0; i < days_in_a_week; i++) {
        printf("Day %d is: %s\n", i+1, days_of_the_week[i]);
    }


    return 0;
}
}