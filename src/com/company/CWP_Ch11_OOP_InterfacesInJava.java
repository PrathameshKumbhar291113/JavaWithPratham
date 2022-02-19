package com.company;
interface Bicycle{
    int a =45;
    void applyBrake(int decrement);
    void  speedUp(int increment);
}
interface RingBellForBicycle{
    void ringBell();
}
class HeroCycle implements Bicycle , RingBellForBicycle{
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Bicycle is applying breaks now");
    }
    public void speedUp(int increment){
        System.out.println("Bicycle is speeding up");
    }
    public void ringBell(){
        System.out.println("Tring Tring");
    }
}
public class CWP_Ch11_OOP_InterfacesInJava{
    public static void main(String[] args) {
        HeroCycle hc = new HeroCycle();
        hc.applyBrake(3);
        hc.speedUp(6);
        System.out.println(hc.a);
        hc.ringBell();
    }
}
