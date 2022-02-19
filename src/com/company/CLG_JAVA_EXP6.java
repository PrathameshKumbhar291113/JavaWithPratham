package com.company;
import java.util.ArrayList;
class Student{
String name;
int age;
String address;
    Student(){
    name = "Unknown";
    age =0;
    address ="Not Available";
    }
    public void setInfo(String name , int age){
        this.name=name;
        this.age =age;
    }
    public void setInfo(String name , int age , String address){
        this.name =name;
        this.age =age;
        this.address =address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
public class CLG_JAVA_EXP6 {
    public static void main(String[] args) {
        ArrayList <Student> s = new ArrayList<>();
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());
        s.add(new Student());

        s.get(0).setInfo("Pratham" ,18 ,"New Mumbai");
        s.get(1).setInfo("Rohit" ,19);
        s.get(2).setInfo("Donald" ,20 ,"Manipur");
        s.get(3).setInfo("Siddesh" ,21 );
        s.get(4).setInfo("Aditya" ,19 ,"Mumbai");
        s.get(5).setInfo("Charm" ,1999 ,"Ulhasnagar");
        s.get(6).setInfo("Ritz" ,22 ,"Village");
        s.get(7).setInfo("Samarth" ,19 ,"Gym");
        s.get(8).setInfo("Sushi" ,69 );
        s.get(9).setInfo("Sharu" ,18);
        for (Student s1:s ) {
            System.out.println(s1);
        }
    }
}
