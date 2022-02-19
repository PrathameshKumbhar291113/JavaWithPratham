package com.company;

/*Q1 Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)    */
class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}


class CellPhone{
     public void ring(){
         System.out.println("Cell is Ringing........");
     }
     public void vibrate(){
         System.out.println("Cell is Vibrating.......");
     }
     public void callFriend(){
         System.out.println("Calling Shreya .....but she cant pick now cz she is bsy!");
     }
}

class Square{
    int side ;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

//Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.

class Rectangle {
    int length, breath;

    public int area() {
        return length * breath;
    }

    public int perimeter() {
        return 2 * (length + breath);
    }
}

//    Create a class Circle with a method to initialize its side, calculating area, perimeter etc.
class Circle{
    float radius;
    public float Area(){
        return (float) (3.14*radius*radius);
    }
    public float Perimeter(){
        return (float) (2*3.14*radius);
    }
}

// Q5 Create a class Tommy Vecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
class TommyVecetti{
    public void hit(){
        System.out.println("Tommy Vecetti is hitting .....");
    }
    public void run(){
        System.out.println("Tommy Vecetti is running .....");
    }
    public void fire(){
        System.out.println("Tommy Vecetti is firing ......");
    }
}
public class CWP_Ch8_PS_OOP_ClassNObjects {
    public static void main(String[] args) {
//        Q1 Calling
        /* Employee Pratham = new Employee();
        Pratham.setName("Pratham Kumbhar");
        Pratham.salary = 150000;
        System.out.println(Pratham.getSalary());
        System.out.println(Pratham.getName());   */


//    Q2 Calling
        /*CellPhone Vivo = new CellPhone();
        Vivo.ring();
        Vivo.vibrate();
        Vivo.callFriend();    */

//        Q3 Calling
       /*  Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter()); */
//        Q4 Calling
      /*  Rectangle rect = new Rectangle();
        rect.length = 10;
        rect.breath = 20;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());   */

//        Q5 Calling
            TommyVecetti tommyvecetti = new TommyVecetti();
            tommyvecetti.hit();
            tommyvecetti.run();
            tommyvecetti.fire();

//        Q6Calling
  /*  Circle cir = new Circle();
    cir.radius = 5.0f;
        System.out.println(cir.Area());
        System.out.println(cir.Perimeter());  */
    }
}
