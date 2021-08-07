package com.ashok;

public class a {
    int h=7;
}
class Solution{
    public static void main(String[] args) {
        a ob=new a();
        ob.h=10;
        a ob2=ob;
        ob=null;
        System.out.println(ob2.h);
    }
}