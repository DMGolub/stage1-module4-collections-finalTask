package com.epam.mjc.collections.combined;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapFromKeysCreator {

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> lengthToKeys = new TreeMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            lengthToKeys.putIfAbsent(e.getKey().length(), new TreeSet<>());
            lengthToKeys.get(e.getKey().length()).add(e.getKey());
        }
        return lengthToKeys;
    }
}