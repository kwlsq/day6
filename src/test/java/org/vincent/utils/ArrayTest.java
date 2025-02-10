package org.vincent.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @org.junit.jupiter.api.Test
    void rotate() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        assertEquals("3, 4, 5, 6, 7, 1, 2", Array.rotate(numbers, 2));  // Join as a single String
    }
}