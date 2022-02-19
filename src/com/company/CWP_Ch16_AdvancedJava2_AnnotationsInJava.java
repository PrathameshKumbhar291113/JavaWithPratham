package com.company;
@FunctionalInterface // An interface which has only one method
interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2();
}
class NewPhone extends Phone{
    @Override //Annotation which tell whether the method is Override from the other class
    public void showTime(){
        System.out.println("This is 2 in the mid night");
    }
    @Deprecated
    public int sum(int a ,int b){
        return a+b;
    }
}
public class CWP_Ch16_AdvancedJava2_AnnotationsInJava {
    @SuppressWarnings("deprecation") // It mutes the waring of the compiler
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(1,4);
    }
}
