package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,3};
        assertEquals(4, subArrayRanges(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,3,3};
        assertEquals(4, subArrayRanges(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {4,-2,-3,4,1};
        assertEquals(59, subArrayRanges(arr));
    }
}