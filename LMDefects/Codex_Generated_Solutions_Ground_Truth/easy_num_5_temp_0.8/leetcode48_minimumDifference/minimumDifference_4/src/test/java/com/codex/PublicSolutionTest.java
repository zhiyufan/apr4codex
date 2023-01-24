package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {90};
        assertEquals(0, minimumDifference(arr, 1));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {9,4,1,7};
        assertEquals(2, minimumDifference(arr, 2));
    }
}