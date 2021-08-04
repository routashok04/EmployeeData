package com.ashok;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMulti {
    public static void main(String[] args) {
        Integer[] inputarray={5,7,8,4};
        List<Integer> integers = Arrays.asList(inputarray);
        Optional<Integer> reduce = integers.stream().reduce((a,b) -> a * b);
        if(reduce.isPresent()){
            System.out.println("Multiplication using Java8: "+reduce.get() );
        }else {
            System.out.println("Empty arrayList");
        }
    }
}
