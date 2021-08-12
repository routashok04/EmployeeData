package com.ashok;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();

        StringBuffer sb=new StringBuffer(str);
        System.out.println("After reverse the string:"+ sb.reverse());
    }

}
