package com.ashok;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Good");
        list.add("Morning");
        list.add("Good");
        list.add("Afternoon");
        list.add("Good");
        list.add("Night");

        List<String> anotherlist=new ArrayList<>();
        anotherlist.add("good");
        list.removeAll(anotherlist);
        for (String s:list)
            System.out.println(s+"");
        System.out.println();
        list.addAll(anotherlist);
        for (String s:list)
            System.out.println(s+"");
        System.out.println();
        list.retainAll(anotherlist);
        for (String s:list)
            System.out.println(s+"");
        System.out.println();



    }
}
