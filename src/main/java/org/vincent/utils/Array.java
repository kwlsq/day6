package org.vincent.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Array {
    public static String rotate(List<Integer> rawNumberList, int itemsToRotate) {
        List<Integer> rotatedNumbers = new ArrayList<>(rawNumberList);
        for (int i = 0; i < itemsToRotate; i++) {
            int firstNumber = rotatedNumbers.getFirst();
            rotatedNumbers.removeFirst();
            rotatedNumbers.add(firstNumber);
        }
        return rotatedNumbers.stream()
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.joining(", "));
    }

    public static boolean isDuplicateNumberExist(List<Integer> numsArray) {
        boolean checkingResult = false;
        for (int i = 0; i < numsArray.size(); i++) {
            int numberChecked = numsArray.get(i);
            numsArray.remove(i);
            if (numsArray.indexOf(numberChecked) != -1) {
                checkingResult = true;
            }
        }
        return checkingResult;
    }

    public static List<Integer> removeDuplicate(List<Integer> numsArray){
        HashMap<Integer,Integer> numsMap = new HashMap<>(); // key(index) , value

        for(int i = 0;i<numsArray.size();i++){
            if(numsMap.isEmpty()) {
                numsMap.put(i,numsArray.get(i));
            }

            if(!numsMap.containsValue(numsArray.get(i))){
                numsMap.put(i,numsArray.get(i));
            }
        }

        return numsMap.values().stream().toList();
    }

}
