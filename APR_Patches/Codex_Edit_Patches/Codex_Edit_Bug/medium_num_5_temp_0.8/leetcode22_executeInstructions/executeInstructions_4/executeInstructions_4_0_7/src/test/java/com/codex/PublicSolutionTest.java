package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {0,1};
        int arr2[] = {1,5,4,3,1,0};
        assertArrayEquals(arr2, executeInstructions(3, arr, "RRDDLU"));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,1};
        int arr2[] = {4,1,0,0};
        assertArrayEquals(arr2, executeInstructions(2, arr, "LURD"));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {0,0};
        int arr2[] = {0,0,0,0};
        assertArrayEquals(arr2, executeInstructions(1, arr, "LRUD"));
    }
}