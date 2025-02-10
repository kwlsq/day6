package org.vincent.utils;

import java.util.ArrayList;
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

//    public static boolean isDuplicateNumberExist(List<Integer> numsArray){
//        List<Integer> noDuplicatedArray = new ArrayList<>(0);
//        for(int i=0;i<numsArray.size();i++){
//            if(noDuplicatedArray.size() == 0){
//                noDuplicatedArray.add(numsArray.get(i));
//            }
//
//            if(noDuplicatedArray.indexOf(numsArray.get(i)) != -1){
//                noDuplicatedArray.add(numsArray.get(i));
//            }
//        }

//    }

}
