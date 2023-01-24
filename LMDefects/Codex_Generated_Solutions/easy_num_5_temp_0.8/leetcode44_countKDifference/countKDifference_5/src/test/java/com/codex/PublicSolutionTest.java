package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,2,1};
        assertEquals(4, countKDifference(arr, 1));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,3};
        assertEquals(0, countKDifference(arr, 3));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {3,2,1,5,4};
        assertEquals(3, countKDifference(arr, 2));
    }

}