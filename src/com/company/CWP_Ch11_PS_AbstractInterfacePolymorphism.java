package com.company;
// Q1 Create an abstract class pen with methods Write() & refill() as abstract methods
abstract class Pen{
    abstract void write();
    abstract void refill();
}

//Q2 Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
class FountainPen extends Pen {
    void refill() {
        System.out.println("Refill");
    }

    void write() {
        System.out.println("Write");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

//Q3 Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and
// implements basic animal interface with eat ( ) and sleep methods
//Demonstrate polymorphism using monkey  class from Q3
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

//Q4 Create a class telephone with ring( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism
abstract class Telephone{ //This is not the parent class
 abstract void lift();
 abstract void disconnected();
 abstract void ring();
}
class SmartTelephone extends Telephone{
    public void camera(){
        System.out.println("Turning on camera");
    }
    public void MediaPlayer(){
        System.out.println("Play the fav song");
    }
    public void ring(){
        System.out.println("Telephone is ringing");
    }
    public void lift(){
        System.out.println("call has been picked");
    }
    public void disconnected(){
        System.out.println("Call has been disconnected");
    }
}
//Q6 Create an interface TV Remote and use it to inherit another interface smart TV Remote
interface TVRemote{
  void pressUpButtonToChangeChannel();
  void pressRedButton();
}
interface SmartTVRemote extends TVRemote{
    void pressHomeButton();
    void pressNetflixButton();
}
class TV implements SmartTVRemote{
    public void pressUpButtonToChangeChannel() {
        System.out.println("Changing the channel");
    }
    public void pressRedButton(){
        System.out.println("Switching Off Tv");
    }
    public void pressHomeButton() {
        System.out.println("You are in Home");
    }
    public void pressNetflixButton(){
        System.out.println("You are watching");
    }
}
public class CWP_Ch11_PS_AbstractInterfacePolymorphism {
    public static void main(String[] args) {
//      Q1 & Q2
        FountainPen fp = new FountainPen();
        fp.changeNib();

//      Q3 calling
        Human ningen = new Human();
        ningen.eat();
        ningen.jump();
//      Q5  Demonstration of Interface Polymorphism
        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();
        Monkey mon = new Human();
        mon.bite();
        mon.jump();

//      Q4 calling n demonstration of abstract Polymorphism
        Telephone tele = new SmartTelephone();
        tele.disconnected();
        tele.lift();
        tele.ring();

//        Q6 & Q7
        TV tv = new TV();
        tv.pressNetflixButton();
        tv.pressHomeButton();
        tv.pressRedButton();
        tv.pressUpButtonToChangeChannel();
    }
}
