package org.vincent.utils;

import java.util.List;
import java.util.Stack;

public class Temperature {
    public static int[] warmerTemperatureRange(List<Integer> temperatures){
        int n = temperatures.size();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures.get(i) > temperatures.get(stack.peek())) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }
}
