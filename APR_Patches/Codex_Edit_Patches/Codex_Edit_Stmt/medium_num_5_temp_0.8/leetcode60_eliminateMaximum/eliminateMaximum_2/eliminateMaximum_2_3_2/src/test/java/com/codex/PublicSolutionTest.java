package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,3,4};
        int arr2[] = {1,1,1};
        assertEquals(3, eliminateMaximum(arr, arr2));
    }

    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,1,2,3};
        int arr2[] = {1,1,1,1};
        assertEquals(1, eliminateMaximum(arr, arr2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {3,2,4};
        int arr2[] = {5,3,2};
        assertEquals(1, eliminateMaximum(arr, arr2));
    }
}