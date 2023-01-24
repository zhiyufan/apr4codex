package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {5,3,6,1,12};
        assertEquals(findFinalValue(arr, 3), 24);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {2,7,9};
        assertEquals(findFinalValue(arr, 4), 4);
    }

}