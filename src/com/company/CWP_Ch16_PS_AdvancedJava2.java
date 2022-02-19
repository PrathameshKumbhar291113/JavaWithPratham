package com.company;
class MyDepricated{
    @Deprecated
    void meth(){
        System.out.println("I am Meth 1");
    }
}
 interface MyInt{
    void display();
}
public class CWP_Ch16_PS_AdvancedJava2 {
    @SuppressWarnings("Deprication")
    public static void main(String[] args) {
        MyDepricated md = new MyDepricated();
        md.meth();
        MyInt i = () -> System.out.println("I am Display");
    }

}
