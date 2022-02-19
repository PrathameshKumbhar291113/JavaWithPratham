package com.company;
//import java.util.Scanner;
class CircleQuickEx{
    private float radius;
    private float Area;
    private float Perimeter;

    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }

    public float geArea() {
        return Area;
    }

    public void setPerimeter(float Perimeter) {
        this.Perimeter = Perimeter;
    }

    public float getPerimeter() {
        return Perimeter;
    }
}

public class CWP_Ch9_AccessModifiersNGettersNSetters_QuickEx{
    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);

        CircleQuickEx cir = new CircleQuickEx();

//        System.out.println("Enter the radius of the circle");
//        int rad = sc.nextInt();

        cir.setRadius(3.11f);
        System.out.println(cir.getRadius());

        cir.setArea(143.97f);
        System.out.println(cir.geArea());

        cir.setPerimeter(345.768f);
        System.out.println(cir.getPerimeter());


    }

}
