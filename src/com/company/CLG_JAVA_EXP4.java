package com.company;
class MyEmployee{
        public String name;
        public int yearOfJoining;
        public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
            System.out.println(name +  "       " + yearOfJoining + "               " + address);
        }
}
public class CLG_JAVA_EXP4 {
    public static void main(String[] args) {
            MyEmployee me1 = new MyEmployee();
            MyEmployee me2 = new MyEmployee();
            MyEmployee me3 = new MyEmployee();

            me1.setName("Ram");
            me1.setYearOfJoining(1994);
            me1.setAddress("64C - WallsStreet");

            me2.setName("Sam");
            me2.setYearOfJoining(2000);
            me2.setAddress("68D - WallsStreet");

            me3.setName("Jon");
            me3.setYearOfJoining(1999);
            me3.setAddress("26B - WallsStreet");


            System.out.println("NAME " + "  YEAR OF JOINING     " + "  ADDRESS");
            me1.display();
            me2.display();
            me3.display();
    }
}
