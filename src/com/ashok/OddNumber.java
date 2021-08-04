package com.ashok;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 6, 8, 9);
        list.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------------------------------");
        list.stream().filter(n->n>3).collect(Collectors.toList()).forEach(System.out::println);
        }
    }

