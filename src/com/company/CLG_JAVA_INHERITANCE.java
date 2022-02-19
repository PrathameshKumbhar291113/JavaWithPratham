package com.company;
class Aa{
    public void CLassAa(){
        System.out.println("This is class Aa");
    }
}
class Bb extends Aa{
    public void ClassBb(){
        System.out.println("Thi is class Bb");
    }
}
class Cc extends Aa{
    public void ClassCc(){
        System.out.println("This is class Cc");
    }
}
class Dd extends Bb {
    public void CLassDd(){
        System.out.println("This is class Dd");
    }
}
public class CLG_JAVA_INHERITANCE {
    public static void main(String[] args) {
        Dd d = new Dd();
        d.CLassAa();
    }
}