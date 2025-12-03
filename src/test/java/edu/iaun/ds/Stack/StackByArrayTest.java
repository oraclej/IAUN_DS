package edu.iaun.ds.Stack;

import edu.iaun.ds.stack.StackByArray;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackByArrayTest {
    @Test
    public void testReverse() {
        StackByArray<Integer> st = new StackByArray<>(5);

        st.arr[0] = 10;
        st.arr[1] = 20;
        st.arr[2] = 30;
        st.arr[3] = 40;
        st.top = 3;

        st.reverse();

        assertEquals(40, st.arr[0]);
        assertEquals(30, st.arr[1]);
        assertEquals(20, st.arr[2]);
        assertEquals(10, st.arr[3]);
    }
}
