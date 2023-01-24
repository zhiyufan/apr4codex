package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Stack {
    int *array;
    int size;
    int top;
};

struct Stack *createStack(int);
int isEmpty(struct Stack*);
void push(struct Stack *, int);
void pop(struct Stack*);
int peek(struct Stack *);


    public static int getLucky(String s, int k) {
        

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int temp = 0;
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }
            result = temp;
        }
        return result;
    }

int main() {
    struct Stack *stack = createStack(20);
    push(stack, 10);
    push(stack, 20);
    push(stack, 30);
    push(stack, 40);
    printf("%d\n", peek(stack));
    pop(stack);
    pop(stack);
    pop(stack);
    printf("%d\n", peek(stack));
     return 0;
}

struct Stack *createStack(int size) {
    struct Stack *stack = malloc(sizeof(struct Stack));
    if (stack == NULL) {
        return NULL;
    }
    stack->size = size;
    stack->top = -1;
    stack->array = malloc(size * sizeof(int));
    if (stack->array == NULL) {
        return NULL;
    }
    return stack;
}

int isEmpty(struct Stack *stack) {
    return stack->top == -1;
}

void push(struct Stack *stack, int element) {
    stack->top++;
    stack->array[stack->top] = element;
}

void pop(struct Stack *stack) {
    if (!isEmpty(stack)) {
        stack->top--;
    }
}

int peek(struct Stack *stack) {
    if (isEmpty(stack)) {
        return -1;
    }
    return stack->array[stack->top];
}
}