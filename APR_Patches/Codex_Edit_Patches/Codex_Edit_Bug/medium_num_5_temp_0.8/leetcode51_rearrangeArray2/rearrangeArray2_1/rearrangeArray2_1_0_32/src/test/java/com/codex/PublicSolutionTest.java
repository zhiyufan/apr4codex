package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,3,4,5};
        int arr2[] = {1,2,4,5,3};
        assertArrayEquals(arr2, rearrangeArray2(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {6,2,0,9,7};
        int arr2[] = {9,7,6,2,0};
        assertArrayEquals(arr2, rearrangeArray2(arr));
    }
}