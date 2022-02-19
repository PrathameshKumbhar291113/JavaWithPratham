package com.company;

// Hw Question : Create a class Animal and Derive another class dog from it
class Animal{
    public int legs;
    public int eyes;
    public String breed;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

}

//Creating the subclass dog
class Dog extends Animal{
    public String typeOfDog;

    public String getTypeOfDog() {
        return typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
                this.typeOfDog = typeOfDog;
    }
}

public class CWP_Ch10_OOP_Inhritance_Hw {
    public static void main(String[] args) {
//        Creating obj for super class
        Animal ani = new Animal();
        ani.setLegs(5);
        System.out.println(ani.getLegs());

        ani.setEyes(1);
        System.out.println(ani.getEyes());

//      Creating obj for subclass n accessing the properties of superclass
        Dog husky = new Dog();
        husky.setBreed("Kinda has genetic similarity  of wolves , so their parent class is wolves");
        System.out.println(husky.getBreed());

        husky.setTypeOfDog("Domestic");
        System.out.println(husky.getTypeOfDog());


    }
}
