package com.company;
abstract class Parent {
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greetInYourStyle();
}

class Child extends Parent{
    @Override
    public void greetInYourStyle(){
        System.out.println("Konnichiwa , greeting in Japanese ");
    }
    public void sayHello(){
        System.out.println("Don't say a word");
    }
}
abstract class Child2 extends Parent{
    abstract public void howAreYou();
}

class Pratham extends Child2{
    public void howAreYou(){
        System.out.println("This is me ");
    }
    public void greetInYourStyle(){
        System.out.println("I don't want tot greet you");
    }
}
public class CWP_Ch11_OOP_AbstractClassNAbstractMethods {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.greetInYourStyle();
        ch.sayHello();

        Pratham p = new Pratham();
        p.howAreYou();
        p.greetInYourStyle();
    }
}
