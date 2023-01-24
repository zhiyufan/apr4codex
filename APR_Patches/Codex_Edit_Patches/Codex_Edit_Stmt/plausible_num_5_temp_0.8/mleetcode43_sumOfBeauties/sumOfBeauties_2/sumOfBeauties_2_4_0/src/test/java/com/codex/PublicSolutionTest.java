package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,3};
        assertEquals(2, sumOfBeauties(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {2,4,6,4};
        assertEquals(1, sumOfBeauties(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {3,2,1};
        assertEquals(0, sumOfBeauties(arr));
    }
}