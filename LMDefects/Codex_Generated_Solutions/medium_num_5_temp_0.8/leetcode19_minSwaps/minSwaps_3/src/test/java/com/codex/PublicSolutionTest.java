package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {0,1,0,1,1,0,0};
        assertEquals(1, minSwaps(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {0,1,1,1,0,0,1,1,0};
        assertEquals(2, minSwaps(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,1,0,0,1};
        assertEquals(0, minSwaps(arr));
    }


}