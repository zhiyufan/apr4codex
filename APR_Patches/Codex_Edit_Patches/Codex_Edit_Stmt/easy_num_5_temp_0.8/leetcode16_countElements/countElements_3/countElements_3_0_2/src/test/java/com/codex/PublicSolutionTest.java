package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {11,7,2,15};
        assertEquals(countElements(arr), 2);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {-3,3,3,90};
        assertEquals(countElements(arr), 2);
    }

}