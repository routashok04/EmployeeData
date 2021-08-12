package com.ashok;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String[] strings={"abc","2","10","0"};
        List<String> list = Arrays.asList(strings);
        Collections.sort(list);
        System.out.println(Arrays.toString(strings));
        System.out.println("apple".compareTo("banana"));
    }
}
