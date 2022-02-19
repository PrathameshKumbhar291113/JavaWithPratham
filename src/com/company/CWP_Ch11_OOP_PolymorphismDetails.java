package com.company;
class MAnimal{

}
class MPet extends MAnimal{
    public void walk(){
        System.out.println("Pet is walking");
    }
}
class MDog extends MPet{
    @Override
    public void walk(){
        System.out.println("Dog is walking");
    }
}
public class CWP_Ch11_OOP_PolymorphismDetails{

    public static void greet(){
        System.out.println("Kon'nichiwa Hajimemashite");
    }
    public static void greet(String name){
        System.out.println("Kon'nichiwa " + name +" Hjimemashite");
    }
    public static void main(String[] args) {

//      Runtime Poly morphism
       /* MDog md =new MDog();
        md.walk();
        MPet mp = new MDog();
        mp.walk();
        MPet mp = md;
        mp.walk();
        MPet mP = new MPet();
        mP.walk();*/

//        Compiletime Polymorphism
        greet();
        greet("Pratham San");
    }
}