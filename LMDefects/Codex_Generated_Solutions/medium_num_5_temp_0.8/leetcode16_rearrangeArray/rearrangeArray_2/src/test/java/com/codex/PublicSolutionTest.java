package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {3,1,-2,-5,2,-4};
        int arr2[] = {3,-2,1,-5,2,-4};
        assertArrayEquals(arr2, rearrangeArray(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {-1,1};
        int arr2[] = {1,-1};
        assertArrayEquals(arr2, rearrangeArray(arr));
    }
}