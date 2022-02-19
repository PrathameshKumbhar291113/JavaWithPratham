package com.company;
class MEmployee{
    private String ename;
    private int esal;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsal() {
        return esal;
    }

    public void setEsal(int esal) {
        this.esal = esal;
    }


}
public class CLG_JAVAPRACT {
    public static void main(String[] args) {
        MEmployee e1 = new MEmployee();
        e1.setEname("Pratham San");
        System.out.println(e1.getEname());
        e1.setEsal(1234556);
        System.out.println(e1.getEsal());
    }
}
