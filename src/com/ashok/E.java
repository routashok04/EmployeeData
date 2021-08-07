package com.ashok;

 class B {
    void method(B b){
        System.out.println("method of B");
    }
}
class C extends B{
    void method (C c){
        System.out.println("method of c");
    }
}
class D extends C{
    void method(D d){
        System.out.println("method D");
    }
}
public class E{
    public static void main(String[] args) {
        B obj1=new D();
        C obj2=new D();
        obj2.method(obj1);
        obj2.method(obj2);
    }

        }