package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        assertEquals(cellsInRange("K1:L2"), new ArrayList<String>(Arrays.asList("K1", "K2", "L1", "L2")));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(cellsInRange("A1:F1"), new ArrayList<String>(Arrays.asList("A1","B1","C1","D1","E1","F1")));
    }

}