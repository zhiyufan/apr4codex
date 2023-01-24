package com.codex;

import java.util.*;

public class Solution {
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define MAX 100
#define MAX_INT 999999
typedef enum {NONE, LEFT, RIGHT} node_t;
typedef struct bst{
    int key;
    struct bst *left;
    struct bst *right;
    int parent;
    node_t type;
}bst_t;

typedef struct stack{
    int top;
    bst_t *items[MAX];
}stack_t;

int extractMax (int *arr){
    int max = -MAX_INT;
    for(int i = 0; i < MAX; i++){
        if(max < arr[i]){
            max = arr[i];
        }
    }
    return max;
}

int extractMin (int *arr){
    int min = MAX_INT;
    for(int i = 0; i < MAX; i++){
        if(min > arr[i]){
            min = arr[i];
        }
    }
    return min;
}

int extractSecondLargestMinusOne(int *arr){
    int max1 = -MAX_INT;
    int max2 = -MAX_INT;
    int max3 = -MAX_INT;
    for(int i = 0; i < MAX; i++){
        if(arr[i] > max1){
            max3 = max2;
            max2 = max1;
            max1 = arr[i];
        }
        else if(arr[i] > max2 && arr[i] < max1){
            max3 = max2;
            max2 = arr[i];
        }
        else if(arr[i] > max3 && arr[i] < max2){
            max3 = arr[i];
        }
    }
    return max3;
}

void inOrderTraversal(bst_t *root){
    if(root){
        inOrderTraversal(root->left);
        printf("%d ", root->key);
        inOrderTraversal(root->right);
    }
}

void preOrderTraversal(bst_t *root){
    if(root){
        printf("%d ", root->key);
        preOrderTraversal(root->left);
        preOrderTraversal(root->right);
    }
}

void postOrderTraversal(bst_t *root){
    if(root){
        postOrderTraversal(root->left);
        postOrderTraversal(root->right);
        printf("%d ", root->key);
    }
}

void printHelper(bst_t *root, int indent){
    if(root){
        for(int i = 0; i < indent; i++){printf("\t");}
        printf("%d\n", root->key);
        printHelper(root->left, indent+1);
        printHelper(root->right, indent+1);
    }
}

void printTree(bst_t *root){
    printHelper(root, 0);
}

bst_t *newNode(int key){
    bst_t *n = (bst_t *)malloc(sizeof(bst_t));
    n->key = key;
    n->parent = 0;
    n->type = NONE;
    n->left = 0;
    n->right = 0;
    return n;
}

void insert(bst_t **root, int key){
    bst_t *node = newNode(key);
    if (*root == NULL){
        *root = node;
    }
    else{
        bst_t *ptr = *root;
        bst_t *parent = ptr;
        while(ptr){
            parent = ptr;
            if(key > ptr->key){
                ptr = ptr->right;
            }
            else{
                ptr = ptr->left;
            }
        }
        if(key > parent->key){
            parent->right = node;
            node->parent = parent->key;
            node->type = RIGHT;
        }
        else{
            parent->left = node;
            node->parent = parent->key;
            node->type = LEFT;
        }
    }
}

int findHeight(bst_t *root){
    if(root){
        if(!root->left && !root->right){
            return 0;
        }
        int l = findHeight(root->left);
        int r = findHeight(root->right);
        if(l > r){
            return l+1;
        }
        else{
            return r+1;
        }
    }
}
int size(bst_t *root){
        
    if(!root){
        return 0;
    }

    return (1 + size(root->left) + size(root->right));
}

int main(){
	bst_t *root = NULL;
	int arr[] = {7, 3, 5, 1, 6, 8, 11, 10, 9};
	for(int i = 0; i < sizeof(arr)/sizeof(int); i++){
		insert(&root, arr[i]);
	}
    printTree(root);
    printf("\n%d\n", size(root));
	return 0;
}
}