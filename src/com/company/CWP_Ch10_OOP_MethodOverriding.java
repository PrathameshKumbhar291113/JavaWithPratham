package com.company;
class A{
    public void meth1(){
        System.out.println("This is the method 1 from class A");
    }
    public void meth2(){
        System.out.println("Ths is the method 2 from class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("This is overridden method 2 from class A to class B");
    }
    public void meth3(){
        System.out.println("This is the method 3 of class B");
    }
}
public class CWP_Ch10_OOP_MethodOverriding{
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
