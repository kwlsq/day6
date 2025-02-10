package org.vincent.utils;

import java.util.*;

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

    public static List<Integer> removeOccurences(List<Integer> numsArray, int key){
        List<Integer> arrayWithNoOccurences = new ArrayList<>();
        for (Integer integer : numsArray) {
            if (integer != key) {
                arrayWithNoOccurences.add(integer);
            }
        }
        return arrayWithNoOccurences;
    }

    public static List<Integer> findDuplicates(List<Integer> numsArray){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : numsArray) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

}
