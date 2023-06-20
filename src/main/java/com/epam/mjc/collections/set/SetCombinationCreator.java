package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);

        firstSet.retainAll(secondSet);
        firstSet.addAll(thirdSet);
        return firstSet;
    }
}
