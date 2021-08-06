package com.ashok;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CustomThreads extends Thread{
 static Map<Integer,String> map=new ConcurrentHashMap<Integer, String>();

    public void run() {
            try {
           Thread.sleep(1000);
                map.put(104,"D");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] args) throws InterruptedException{
        map.put(101,"A");
        map.put(102,"B");
        map.put(103,"C");

        CustomThreads customThreads=new CustomThreads();
        customThreads.start();

        //main thread is iterating
        for (Object o: map.entrySet()){
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }
    //segment locking
}
