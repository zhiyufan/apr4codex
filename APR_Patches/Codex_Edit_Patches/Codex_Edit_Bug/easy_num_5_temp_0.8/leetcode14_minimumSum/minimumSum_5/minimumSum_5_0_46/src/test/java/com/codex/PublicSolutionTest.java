package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        assertEquals(minimumSum(2932), 52);
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(minimumSum(4009), 13);
    }

}