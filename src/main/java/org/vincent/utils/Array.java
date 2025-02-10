package org.vincent.utils;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static String rotate(List<Integer> rawNumberList, int itemsToRotate){
        List<Integer> rotatedNumbers = new ArrayList<>(rawNumberList);
        for(int i = 0; i < itemsToRotate; i++){
            int firstNumber = rotatedNumbers.getFirst();
            rotatedNumbers.removeFirst();
            rotatedNumbers.add(firstNumber);
        }
        return rotatedNumbers.stream()
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.joining(", "));
    }
}
