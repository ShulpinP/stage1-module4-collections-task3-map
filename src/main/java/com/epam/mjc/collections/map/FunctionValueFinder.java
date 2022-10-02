package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Map.Entry entry : functionMap.entrySet()) {
            if (entry.getValue().equals(requiredValue)) {
                return true;
            }
        } return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map <Integer, Integer> functionValues = new HashMap<>();
        for (int i:sourceList) {
            functionValues.put(i,i*5+2);
        } return functionValues;
    }
}
