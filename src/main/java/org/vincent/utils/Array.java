package org.vincent.utils;

import java.util.*;
import java.util.stream.Collectors;

public class Array {
    public static String rotate(List<Integer> rawNumberList, int itemsToRotate) {
        if (rawNumberList == null || rawNumberList.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        int length = rawNumberList.size();
        // to rotate = 10
        // length = 10
        // will also skip the operation if the to rotate is 0
        itemsToRotate = itemsToRotate % length;
        if (itemsToRotate == 0) {
            return formatList(rawNumberList);
        }

        // split the array into two parts, first part is the items to rotate
        // and the second part is the remaining items
        // then join them together
        List<Integer> rotatedList = new ArrayList<>(rawNumberList.subList(itemsToRotate, length));
        rotatedList.addAll(rawNumberList.subList(0, itemsToRotate));
        return formatList(rotatedList);
    }

    private static String formatList(List<Integer> numberList) {
        return numberList.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    public static boolean isDuplicateNumberExist(List<Integer> numsArray) {
        if (numsArray == null || numsArray.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        // O(n) time complexity
        // the set will use O(1) time complexity to check if the element is already in the set
        Set<Integer> seen = new HashSet<>();
        for (int num : numsArray) {
            if (!seen.add(num)) {
                // early return if duplicate is found
                return true;
            }
        }
        return false;
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
