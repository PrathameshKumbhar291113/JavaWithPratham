package com.company;
interface parentSampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends parentSampleInterface{
    void meth3();
    void meth4();
}
class InterfaceInheritance implements childSampleInterface{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }
    public void meth4() {
        System.out.println("Method 4");
    }
}
public class CWP_Ch11_OOP_InheritanceInJavaInterface{
    public static void main(String[] args){
        InterfaceInheritance ii = new InterfaceInheritance();
        ii.meth1();
        ii.meth2();
        ii.meth3();
        ii.meth4();
    }
}