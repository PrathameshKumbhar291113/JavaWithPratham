package com.company;
class University{
    public String nameOfStudent;
    public int ageOfStudent;
    public String programOfStudent;

    University(String nameOfStudent , int ageOfStudent  , String programOfStudent){
      this.nameOfStudent =nameOfStudent;
      this.ageOfStudent = ageOfStudent;
      this.programOfStudent = programOfStudent;
    }
    public void displayInfoOfStudent(){
        System.out.println("Name of the Student is " + nameOfStudent);
        System.out.println("Age of the of the Student is " + ageOfStudent);
        System.out.println("Program of the Student " + programOfStudent);
    }
}
class GraduateStudent extends University{
    public double percentageOfStudent;
    public int marksOfStudent;
    public String streamOfStudent;
    GraduateStudent(String nameOfStudent ,int ageOfStudent, String programOfStudent,double percentageOfStudent , int  marksOfStudent ,String streamOfStudent){
        super(nameOfStudent ,ageOfStudent ,programOfStudent);
        this.percentageOfStudent = percentageOfStudent;
        this.marksOfStudent = marksOfStudent;
        this.streamOfStudent = streamOfStudent;
    }
    @Override
    public void displayInfoOfStudent(){
        super.displayInfoOfStudent();
        System.out.println("Percentage of the Student " +percentageOfStudent);
        System.out.println("Marks of the Student " +marksOfStudent);
        System.out.println("Stream of the Of the Student " + streamOfStudent);
    }
}
class ResearchStudent extends University{
    public int yearsOfWorking;
    public String specializationInSubject;
    ResearchStudent( String nameOfStudent ,int ageOfStudent , String programOfStudent,int  yearsOfWorking ,String specializationInSubject){
        super(nameOfStudent ,ageOfStudent ,programOfStudent);
        this.yearsOfWorking = yearsOfWorking;
        this.specializationInSubject = specializationInSubject;
    }
    @Override
    public void displayInfoOfStudent(){
        super.displayInfoOfStudent();
        System.out.println("Years Of Working of the Student " +yearsOfWorking);
        System.out.println("Specialization in subject done by the Student " + specializationInSubject);
    }
}

public class CLG_JAVA_EXP10{
    public static void main(String[] args) {

        GraduateStudent gs  = new GraduateStudent("Pratham" ,19 ,"Engineering",96.8190456 ,499 ,"Science");
        gs.displayInfoOfStudent();
        ResearchStudent rs  = new ResearchStudent("Shreya" ,19 ,"Engineering",9, "Artificial Intelligence");
        rs.displayInfoOfStudent();
    }
}