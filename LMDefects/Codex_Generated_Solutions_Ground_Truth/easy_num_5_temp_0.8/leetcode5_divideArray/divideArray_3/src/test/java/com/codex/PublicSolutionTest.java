package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {3, 2, 3, 2, 2, 2};
        assertTrue(divideArray(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1, 2, 3, 4};
        assertFalse(divideArray(arr));
    }

}