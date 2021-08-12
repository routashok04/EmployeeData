package com.ashok;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,5,8,9,44);
        List<Integer> collect = integers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Multiplication using Stream:"+collect);
    }
}
