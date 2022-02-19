package com.company;
class Teacher{

    Teacher(){
        System.out.println("Im Head Teacher of the college");
    }
    Teacher(String name){
        System.out.println("Name of the head teacher is " + name);
    }
    public void infoOfTeacher(){
        System.out.println("I have done Phd in Information Technology & I am in teaching field since you were not born so i have experience of 25 years");
    }
}
class Professor extends Teacher{
    Professor(){
        System.out.println("I am Professor of the college");
    }
    Professor(String name){
        System.out.println("Name of the professor is " + name);
    }
    public void infoOfProfessor(){
        System.out.println("I have done Masters in Information Technology & I am in teaching field since 2010 so i have experience of 11 years");
    }
}
class Associate_Professor extends Teacher{
    Associate_Professor(){
        System.out.println("I am Associate Professor of the college");
    }
    Associate_Professor(String name){
        System.out.println("Name of the Associate_Professor is " + name);
    }
    public void infoOfAssociateProfessor(){
        System.out.println("I have done Bachelor in Information Technology & I am in teaching field since 2010 so i have experience of 7 year");
    }
}
class Assistant_Professor extends Teacher{
    Assistant_Professor(){
        System.out.println("I am Assistant Professor of the college");
    }
    Assistant_Professor(String name){
        System.out.println("Name of the Assistant Professor is " + name);
    }
    public void infoOfAssistantProfessor(){
        System.out.println("I have done Bca in Information Technology & I am in teaching field since 2010 so i have experience of 2 year");
    }
}
public class CLG_JAVA_EXP8{
    public static void main(String[] args) {
        Assistant_Professor ap = new Assistant_Professor();
        Assistant_Professor ap1 = new Assistant_Professor("Pratham");

    }
}
