package com.example.practice;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class PracticeApplicationTests {

    @Test
    void contextLoads() {
        Set<Integer> set = new HashSet<Integer>();
        System.out.println(set.iterator().next());
    }

}
