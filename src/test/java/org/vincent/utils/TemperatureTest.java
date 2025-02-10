package org.vincent.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void warmerTemperatureRange() {
        List<Integer> input1 = new ArrayList<>(Arrays.asList(73,74,75,71,69,72,76,73));
        int[] expected1 = {1,1,4,2,1,1,0,0};
        assertArrayEquals(expected1, Temperature.warmerTemperatureRange(input1));

        List<Integer> input2 = new ArrayList<>(Arrays.asList(30,40,50,60));
        int[] expected2 = {1,1,1,0};
        assertArrayEquals(expected2, Temperature.warmerTemperatureRange(input2));

        List<Integer> input3 = new ArrayList<>(Arrays.asList(30,60,90));
        int[] expected3 = {1,1,0};
        assertArrayEquals(expected3, Temperature.warmerTemperatureRange(input3));

        List<Integer> input4 = new ArrayList<>(Arrays.asList(50,50,50,5));
        int[] expected4 = {0,0,0,0};
        assertArrayEquals(expected4, Temperature.warmerTemperatureRange(input4));
    }
}