package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalary {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(1,"Ashok",26,"08/09/2021",600000.00));
        list.add(new Employee(2,"Sudeep",28,"08/08/2021",60000.00));
        list.add(new Employee(3,"Akash",29,"07/12/2016",800000.00));
        list.add(new Employee(4,"Jyoti",25,"08/09/2019",756565.00));
        list.add(new Employee(5,"badal",30,"02/05/2021",7000000.00));

        Optional<Double> first = list.stream()
                .map(s -> s.getSalary()).sorted(Comparator.reverseOrder())
                .skip(2).findFirst();
        list.stream().filter(employee -> employee.getAge()>=26).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("3rd highrst salary using java8:" +first.get());

    }
}
