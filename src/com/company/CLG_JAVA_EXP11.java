package com.company;
class Employeee{
    public int empNo;
    public String empName;
    public int empSal;
    public double newSal;
    public double inc;

    public void setEmpDetails(int empNo , String empName , int empSal){
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;

        System.out.println("!!!!!!!!!!!!!!!!!!!EMPLOYEE!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("The employee number is " + empNo);
        System.out.println("The employee name is " + empName);
        System.out.println("The employee salary is " + empSal);
        System.out.println();
    }

    public void enhanceSalary(){
        System.out.println("Previous salary of the employee " + empName + " is "+ empSal );
        inc = (empSal / 5);
        newSal = inc + empSal;
        System.out.println("Enhanced salary od the employee " + empName + " is " + newSal);
    }
}
class Hod{
    public int hodNo;
    public String hodName;
    public int hodSal;
    public String hodDep;

    public void setHodDetails(int hodNo ,String hodName , int hodSal , String hodDep){
        this.hodNo = hodNo;
        this.hodName =  hodName;
        this.hodSal = hodSal;
        this.hodDep = hodDep;

        System.out.println("!!!!!!!!!!!!!!!!HOD!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("The Hod number is " + hodNo);
        System.out.println("The Hod name is " + hodName);
        System.out.println("The Hod salary is " + hodSal);
        System.out.println("The Hod department is " + hodDep);
        System.out.println();
    }
    public void changeHod(int hodNo ,String hodName , int hodSal , String hodDep){
        this.hodNo = hodNo;
        this.hodName =  hodName;
        this.hodSal = hodSal;
        this.hodDep = hodDep;

        System.out.println("The new Hod number is " + hodNo);
        System.out.println("The new Hod name is " + hodName);
        System.out.println("The new Hod salary is " + hodSal);
        System.out.println("The new Hod department is " + hodDep);
    }

}
public class CLG_JAVA_EXP11 {
    public static void main(String[] args) {

        Employeee emp = new Employeee();
        emp.setEmpDetails(004 , "Shreya",5000);
        emp.enhanceSalary();

        System.out.println();

        Hod hod = new Hod();
        hod.setHodDetails(91 , "Jhon" , 5000 ,"I.T");
        hod.changeHod(01 , "Mike" , 5000 ,"I.T");
    }
}
