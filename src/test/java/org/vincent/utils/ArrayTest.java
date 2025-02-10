package org.vincent.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @org.junit.jupiter.api.Test
    void rotate() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        assertEquals("3, 4, 5, 6, 7, 1, 2", Array.rotate(numbers, 2));
    }

    @Test
    void isDuplicateNumberExist() {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 3, 4, 3, 2, 4, 2));

        assertTrue(Array.isDuplicateNumberExist(numbers1));
        assertFalse(Array.isDuplicateNumberExist(numbers2));
        assertTrue(Array.isDuplicateNumberExist(numbers3));
    }

    @Test
    void removeDuplicate() {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList( 1, 2, 2, 3, 3, 3, 4, 5));
        List<Integer> expectedNumbers1 = new ArrayList<>(Arrays.asList( 1,2,3,4,5));
        assertEquals(expectedNumbers1, Array.removeDuplicate(numbers1));

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList( 1, 1, 1, 1, 1, 1, 1, 2));
        List<Integer> expectedNumbers2 = new ArrayList<>(Arrays.asList(1,2));
        assertEquals(expectedNumbers2, Array.removeDuplicate(numbers2));
    }

    @Test
    void removeOccurences() {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 5, 1));
        List<Integer> expectedNumbers1 = new ArrayList<>(Arrays.asList(2,3,5));

        assertEquals(expectedNumbers1, Array.removeOccurences(numbers1,1));
    }
}