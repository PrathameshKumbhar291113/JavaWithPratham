package com.company;
//Q1 Create a class circle and use inheritance to create another class cylinder from it
//Create a method for area and volume in 1
class MyCircle{
    public int radius;
    public  MyCircle(int radius){
        this.radius = radius;
        System.out.println("This is the constructor of class MyCircle " + radius);
    }
    public int getRadius(){
        return radius;
    }
}
class MyCylinder extends MyCircle{
    public int height;
    public MyCylinder( int radius, int height){
        super(radius);
        this.height = height;
        System.out.println("This is constructor of class MyCylinder " + height);
    }
    public int getHeight(){
        return height;
    }
    public double areaOFCircle(){
        System.out.println("This is the area of circle");
        return Math.PI*radius*radius;
    }
    public double areaOfCylinder(){
        System.out.println("This is the area of cylinder");
        return 2*Math.PI*radius*(height+radius);
    }
    public double volOfCylinder(){
        System.out.println("This is the volume of cylinder");
        return Math.PI*radius*radius*height;
    }
}

//Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
class MyRectangle1{
    public int length;
    public int breath;

    public MyRectangle1(int length ,  int breath){
        this.length = length;
        this.breath = breath;
    }

//    public void setLength(int length) {
//        this.length = length;
//    }
    public int getLength() {
        return length;
    }
//    public void setBreath(int breath) {
//        this.breath = breath;
//    }
    public int getBreath() {
        return breath;
    }
}
class Cuboid extends MyRectangle1{
    public int height;
    public Cuboid(int length ,int breath ,int height){
        super(length , breath);
        this.height = height;
    }
//    public void setHeight(int height) {
//        this.height = height;
//    }

    public int getHeight(){
        return height;
    }
    public int areaOfRectangle(){
        System.out.println("This is the area of rectangle");
        return length*breath;
    }
    public int areaOfCuboid(){
        System.out.println("This is the area of cuboid ");
        return 2*length*height+2*breath*height+2*length*breath;
    }
    public int volOfCuboid(){
        System.out.println("This is the volume of Cuboid ");
        return length*breath*height;
    }
}
public class CWP_Ch10_PS_Inheritance {
    public static void main(String[] args) {
      /*  MyCircle mcir = new MyCircle();
        System.out.println("The radius "+ mcir.getRadius());
       */
        MyCylinder mcyl = new MyCylinder(4 ,5 );
        System.out.println(mcyl.areaOFCircle());
        System.out.println(mcyl.areaOfCylinder());
        System.out.println(mcyl.volOfCylinder());

        Cuboid cub = new Cuboid(4 , 5 , 6);
        System.out.println(cub.areaOfRectangle());
        System.out.println(cub.areaOfCuboid());
        System.out.println(cub.volOfCuboid());


    }
}
