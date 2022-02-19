package com.company;
interface MyCamera{
    void takeSnap();
    void recVid();
    private void greet(){
        System.out.println("Hello bro");
    }
    default void recVid4K(){
        greet();
        System.out.println("The vid is recording in the 4k");
    }
}
interface MyWifi{
     String [] getAvailableNetworks();
     void connectToNetwork(String network);
}

class MyCellPhone{
    public void callNumber(int number){
        System.out.println("calling " + number);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera , MyWifi{
    public void takeSnap(){
        System.out.println("taking Snaps");
    }

    public void recVid(){
        System.out.println("Recording the vide");
    }

    public String[] getAvailableNetworks() {
        System.out.println("Getting network list");
        String [] networkList = {"Prathamesh" ,"Shreya " , "Rhucha", "Sharu" };
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("connecting to " + network);
    }

//    Overriding the default  methods
//    public void recVid4K(){
//        System.out.println("This is overridden method");
//    }
}
public class CWP_Ch11_OOP_InterfaceNDefaultMethods{
    public static void main(String[] args) {
        MySmartPhone msm = new MySmartPhone();
        msm.connectToNetwork("Prathamesh");
        String []arr = msm.getAvailableNetworks();
        for (String item: arr) {
            System.out.println(item);
        }
        msm.recVid4K();
        msm.takeSnap();
        msm.recVid();
    }
}
