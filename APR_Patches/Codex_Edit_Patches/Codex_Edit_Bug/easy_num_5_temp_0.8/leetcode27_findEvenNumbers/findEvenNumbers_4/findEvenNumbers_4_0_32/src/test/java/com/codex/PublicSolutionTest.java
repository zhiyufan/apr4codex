package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {2,1,3,0};
        int arr2[] = {102,120,130,132,210,230,302,310,312,320};
        assertArrayEquals(arr2, findEvenNumbers(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {2,2,8,8,2};
        int arr2[] = {222,228,282,288,822,828,882};
        assertArrayEquals(arr2, findEvenNumbers(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {3,7,5};
        int arr2[] = {};
        assertArrayEquals(arr2, findEvenNumbers(arr));
    }


}