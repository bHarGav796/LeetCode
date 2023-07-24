package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,2}; //given

        IntStream stm = Arrays.stream(nums); //integer stream
        Set<Integer> items = new HashSet<>();//HashSet

        stm.filter(n -> items.add(n)).forEach(n -> System.out.println(n));
    }
}