package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {8,9,4,0,2,1,3,5,7,6};
        int arr2[] = {991, 338, 38};
        int arr3[] = {338,38,991};
        assertArrayEquals(arr3, sortJumbled(arr, arr2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int arr2[] = {789,456,123};
        int arr3[] = {123,456,789};
        assertArrayEquals(arr3, sortJumbled(arr, arr2));
    }

}