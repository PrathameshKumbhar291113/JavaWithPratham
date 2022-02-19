package com.company;
class Phone{
    public void showTime(){
        System.out.println("The time is 5:15");
    }
    public void camera(){
        System.out.println("taking pictures");
    }
    public void on(){
        System.out.println("Turning on the phone");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on the smart phone");
    }
    public void playMusic(){
        System.out.println("The music is playing on the smart phone");
    }
}
public class CWP_Ch10_OOP_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone object = new SmartPhone();
        object.on();
        object.camera();
        object.showTime();
//        object.playMusic():  --> this gives error in the code

//        SmartPhone obj = new Phone(); --> is not allowed :: as the smartphone is the subclass of phone(super class)
//        Basically we con do Dynamic Method Dispatch only for those methods which exist in both subclass & super class
//        & overridden from super class to subclass as well as we can access all the methods in the super class
    }
}
