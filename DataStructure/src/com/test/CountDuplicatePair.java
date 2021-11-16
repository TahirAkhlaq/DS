package com.test;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicatePair {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 4, 5, 5, 6};
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupli = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                dupli.add(a[i]);
            } else {
                set.add(a[i]);
            }
        }
        System.out.println(dupli.size());
    }
}
