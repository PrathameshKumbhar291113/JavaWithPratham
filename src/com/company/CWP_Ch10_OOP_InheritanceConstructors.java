package com.company;
//Creating super class for inheritance
class SuperClass {
    public SuperClass() {
        System.out.println("this is default constructor of superclass");
    }

    public SuperClass(int x) {
        System.out.println("this constructor is overloaded  and it has the value x " + x);
    }
}
class SubClass extends SuperClass{
    public SubClass(){
        System.out.println("This is default constructor of subclass");
    }
    public SubClass(int x , int y) {
        super(x);
        System.out.println("This constructor is overloaded and has the value y " + y);
    }
}
class GrandSubClass extends SubClass{
    public GrandSubClass() {
        System.out.println("This is default constructor of grand subclass");
    }
    public GrandSubClass(int x , int y , int z) {
        super(x , y);
        System.out.println("This constructor is overloaded and has value z "+z);

    }
}

public class CWP_Ch10_OOP_InheritanceConstructors {
    public static void main(String[] args) {
        GrandSubClass gsc = new GrandSubClass();
//        GrandSubClass gsc1 = new GrandSubClass(13 ,14 , 15);
    }
}
