package com.company;
interface Camera{
    void takeSnap1();
    void recVid1();
    void rec4kVid1();
}
interface Gps{
    void getLocation1(String location);
}
interface Wifi{
    String [] getAvailableNetworks1();
    void connectToNetwork1();
}
interface MediaPlayer{
    void nameTheSong1(String song);
}
class CellPhone1{
    public void toCall1(long number ){
        System.out.println("Calling " + number);
    }
    public void toPickCall1(){
        System.out.println("Connecting....");
    }
}
class SmartPhone1 extends CellPhone1 implements Camera , Gps , Wifi , MediaPlayer {
   public void takeSnap1(){
       System.out.println("Taking snap of me ");
   }
   public void recVid1(){
       System.out.println("Recording the vid ");
   }
   public void rec4kVid1(){
       System.out.println("Recording the vid in the 4k format");
   }
   public void getLocation1(String location){
       System.out.println("U are at " + location);
    }
    public String[] getAvailableNetworks1() {
        System.out.println("getting the available networks");
        String [] getNetwork = {"Prathamesh ", "Rhucha ", "Sharu ", "Shreya "};
        return getNetwork;
    }
    public void connectToNetwork1(){
        System.out.println("Connecting. . . .");
    }
    public void nameTheSong1(String song){
        System.out.println("Shreya Baby Fav Song : " + song);
    }

}
public class CWP_Ch11_OOP_PolymorphismInJava {
    public static void main(String[] args) {
        Gps g = new SmartPhone1();
        g.getLocation1("Dadar");

        MediaPlayer mp = new SmartPhone1();
        mp.nameTheSong1("Make You Mine");

        SmartPhone1 sm1 = new SmartPhone1();
        sm1.connectToNetwork1();
        String [] arr = sm1.getAvailableNetworks1();
        for (String ele: arr) {
            System.out.println(ele);
        }



    }
}


