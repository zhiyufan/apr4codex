package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,3,5,10};
        assertEquals(2, addRungs(arr, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {3,6,8,10};
        assertEquals(0, addRungs(arr, 3));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {3,4,6,7};
        assertEquals(1, addRungs(arr, 2));
    }

}