package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {2,4},
            {6,8}
        };
        assertEquals(4, minOperations(arr, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {1,5},
            {2,3}
        };
        assertEquals(5, minOperations(arr, 1));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[][] = {
            {1,2},
            {3,4}
        };
        assertEquals(-1, minOperations(arr, 2));
    }
}