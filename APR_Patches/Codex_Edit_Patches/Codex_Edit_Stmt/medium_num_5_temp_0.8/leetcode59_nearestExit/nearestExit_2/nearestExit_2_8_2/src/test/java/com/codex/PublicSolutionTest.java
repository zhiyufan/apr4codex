package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        char arr[][] = {
            {'+','+','.','+'},
            {'.','.','.','+'},
            {'+','+','+','.'}
        };
        int arr2[] = {1,2};
        assertEquals(1, nearestExit(arr, arr2));
    }

    @Test(timeout=500)
    public void test2(){
        char arr[][] = {
            {'+','+','+'},
            {'.','.','.'},
            {'+','+','+'}
        };
        int arr2[] = {1,0};
        assertEquals(2, nearestExit(arr, arr2));
    }
    
    @Test(timeout=500)
    public void test3(){
        char arr[][] = {
            {'.', '+'}
        };
        int arr2[] = {0,0};
        assertEquals(-1, nearestExit(arr, arr2));
    }
}