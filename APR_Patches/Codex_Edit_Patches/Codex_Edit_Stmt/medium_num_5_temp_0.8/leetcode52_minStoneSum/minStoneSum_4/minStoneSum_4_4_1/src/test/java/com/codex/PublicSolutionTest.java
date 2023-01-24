package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {5,4,9};
        assertEquals(12, minStoneSum(arr, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {4,3,6,7};
        assertEquals(12, minStoneSum(arr, 3));
    }
}