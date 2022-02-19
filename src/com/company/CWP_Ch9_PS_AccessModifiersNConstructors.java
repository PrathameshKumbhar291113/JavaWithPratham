package com.company;

//Q1 create a class cylinder and use getter and setters to set its radius and height
class Cylinder{
    private int radius ;
   private int  height;
// Setters n Getters for the class cylinder
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int  getHeight(){
        return height;
    }

//use ➊ to calculate surface and volume of the cylinder
    public double surfaceAreaOfCylinder(){
        return 2*3.14*radius*(height+radius);
    }

    public double volumeOfCylinder(){
        return 3.14* radius*radius*height;
    }

//    Use a constructor and repeat ➊
    public Cylinder(int radius , int height) {
        this.radius = radius;
        this.height = height;
    }

}

// Q4 Make class Rectangle & Overload a constructor used to initialize a rectangle of length 4 and breath 5 for using custom parameters
class MyRectangle{
    private int length ;
    private int breadth;

    public MyRectangle() {
        this.length = 11;
        this.breadth = 35;
    }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

/*
Q5  create a class cylinder and use getter and setters to set its radius and height
    use ➊ to calculate surface and volume of the cylinder
    Use a constructor and repeat ➊
 */

class MySphere{
    private int sphereRadius;

    public int getSphereRadius() {
        return sphereRadius;
    }

    public void setSphereRadius(int sphereRadius) {
        this.sphereRadius = sphereRadius;
    }

    public double sphereSurfaceArea(){
        return 4* Math.PI* sphereRadius*sphereRadius;
    }
    public double sphereVolume(){
        return 4/3f*Math.PI*sphereRadius*sphereRadius*sphereRadius;
    }

    public MySphere() {
        this.sphereRadius = 2;
    }

    public MySphere(int sphereRadius) {
        this.sphereRadius = sphereRadius;
    }
}


public class CWP_Ch9_PS_AccessModifiersNConstructors {
    public static void main(String[] args) {
/*
        //        Q1 getter n setter
        Cylinder cyl = new Cylinder();
        cyl.setRadius(11);
        System.out.println(cyl.getRadius());
        cyl.setHeight(34);
        System.out.println(cyl.getHeight());

 */

/*
//        Q2 calculate surface area & vol of cylinder
        Cylinder cyl1 = new Cylinder();
        cyl1.setRadius(2);
        cyl1.setHeight(4);

        System.out.println( cyl1.surfaceAreaOfCylinder());
        System.out.println(cyl1.volumeOfCylinder());

 */

//        Q3 Use a constructor and repeat ➊
//        Cylinder cyl2 = new Cylinder(11, 6);
//        System.out.println(cyl2.getHeight());
//        System.out.println(cyl2.getRadius());

//        Q4 Calling the class  n its constructors
//        MyRectangle rect = new MyRectangle(33  , 25);
//        MyRectangle rect = new MyRectangle();
//        System.out.println(rect.getLength());
//        System.out.println(rect.getBreadth());

//        Q5 Sphere class operations
        MySphere sp = new MySphere();
        sp.setSphereRadius(3);
        System.out.println(sp.getSphereRadius());

        MySphere sp1 = new MySphere(4);
        System.out.println(sp1.getSphereRadius());

        MySphere sp2 = new MySphere();
        System.out.println(sp2.getSphereRadius());

        System.out.println(sp2.sphereSurfaceArea());
        System.out.println(sp1.sphereVolume());


    }
}
