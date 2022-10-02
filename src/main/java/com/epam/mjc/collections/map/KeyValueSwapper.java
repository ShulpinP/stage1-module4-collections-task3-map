package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for(Map.Entry entry: sourceMap.entrySet()) {
            if (result.containsKey(entry.getValue()) ) {
                if (result.get(entry.getValue()) > ((Integer) entry.getKey())) {
                    result.put((String) entry.getValue(), (Integer) entry.getKey());
                }
                } else {
                result.put((String) entry.getValue(), (Integer) entry.getKey());
            }
            }
        return result;
        }
    }

