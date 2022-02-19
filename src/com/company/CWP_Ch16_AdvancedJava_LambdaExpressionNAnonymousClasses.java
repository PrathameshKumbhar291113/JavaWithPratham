package com.company;
@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void mth2();
}
//class PrathamFunc implements DemoAno {
//
//    @Override
//    public void meth1() {
//        System.out.println("This is then meth 1 of Pratham func class");
//    }
//}
//class AnonyDemo implements DemoAno{
//
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("Iam Meth 1 of anony class");
//    }
//
//    @Override
//    public void mth2() {
//        System.out.println("Im meth 2 of anony class");
//    }
//}
public class CWP_Ch16_AdvancedJava_LambdaExpressionNAnonymousClasses{
    public static void main(String[] args) {
//        Anonymous Class
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();
//        DemoAno obj1 = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("This is anonymous class meth1");
//            }

//            @Override
//            public void mth2() {
//                System.out.println("This is anonymous class meth2");
//            }
//        };
//        obj1.meth1();
//        obj.mth2();

//        Lambda Expression
//        DemoAno obj = new PrathamFunc();
//        obj.meth1();
        DemoAno obj = (a)->{
            System.out.println("This is the lambda expression " + a);
        };
        obj.meth1(7);
    }
}
