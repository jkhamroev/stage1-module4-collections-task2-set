package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer n : sourceList) {
            if ((n & 1) == 0) {
                int toAdd = n;
                while (toAdd != 0 && (toAdd & 1) == 0) {
                    set.add(toAdd);
                    toAdd >>= 1;
                }
                set.add(toAdd);
            } else {
                set.add(n);
                set.add(2 * n);
            }
        }
        return set;
    }
}
