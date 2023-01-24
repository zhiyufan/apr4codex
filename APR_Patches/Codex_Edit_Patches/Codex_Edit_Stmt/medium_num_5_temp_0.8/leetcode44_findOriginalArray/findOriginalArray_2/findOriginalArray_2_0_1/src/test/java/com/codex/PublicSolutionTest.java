package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,3,4,2,6,8};
        int arr2[] = {1,3,4};
        assertArrayEquals(arr2, findOriginalArray(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {6,3,0,1};
        int arr2[] = {};
        assertArrayEquals(arr2, findOriginalArray(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1};
        int arr2[] = {};
        assertArrayEquals(arr2, findOriginalArray(arr));
    }
}