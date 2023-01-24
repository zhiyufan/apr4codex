package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {0,2,1,5,3,4};
        int arr2[] = {0,1,2,4,5,3};
        assertArrayEquals(arr2, buildArray(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {5,0,1,2,3,4};
        int arr2[] = {4,5,0,1,2,3};
        assertArrayEquals(arr2, buildArray(arr));
    }
}