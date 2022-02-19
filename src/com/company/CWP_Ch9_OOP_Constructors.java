package com.company;

import javax.naming.Name;

class MainEmployee{
    private   int Id;
    private String Name;

//    public MainEmployee(){
//        Id = 11;
//        Name = "Pratham";
//    }
    public MainEmployee(String Name , int Id){
        this.Id = Id;
        this.Name = Name;
    }
    public void setId(int Id) { this.Id = Id; }

    public int getId() { return Id; }

    public void setName(String Name) { this.Name = Name; }

    public String getName(){ return Name; }
}
public class CWP_Ch9_OOP_Constructors {
    public static void main(String[] args) {
    MainEmployee Pratham = new MainEmployee("Pratham" , 11);
//        Pratham.setEmpId(14);
//        Pratham.setEmpName("Prathamesh Kumbhar");

        System.out.println(Pratham.getId());
        System.out.println(Pratham.getName());
    }
}
