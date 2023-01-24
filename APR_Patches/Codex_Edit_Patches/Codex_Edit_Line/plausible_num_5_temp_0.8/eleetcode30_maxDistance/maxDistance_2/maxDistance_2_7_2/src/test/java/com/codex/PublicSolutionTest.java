package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,1,1,6,1,1,1};
        assertEquals(3, maxDistance(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,8,3,8,3};
        assertEquals(4, maxDistance(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {0,1};
        assertEquals(1, maxDistance(arr));
    }


}