package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {7,4,3,9,1,8,5,2,6};
        int arr2[] = {-1,-1,-1,5,4,4,-1,-1,-1};
        assertArrayEquals(arr2, getAverages(arr, 3));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {100000};
        int arr2[] = {100000};
        assertArrayEquals(arr2, getAverages(arr, 0));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {8};
        int arr2[] = {-1};
        assertArrayEquals(arr2, getAverages(arr, 100000));
    }
}