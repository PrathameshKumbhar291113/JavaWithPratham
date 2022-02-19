package com.company;
class Pair<X ,Y>{
    X x ;
    Y y;
    public Pair(X x ,Y y){
        this.x =x;
        this.y=y;
    }
    public void description(){
        System.out.println(x + " And "+ y);
    }
}
public class CWP_Ch16_AdvancedJava_JavaGenericsDetailed {
    public static void main(String[] args) {
        Pair <String , Integer> p1 =new Pair<>("Pratham" ,91);
        Pair <Boolean , Double> p2 =new Pair<>(true ,12345.04735678);
        Pair <String ,String> p3 = new Pair<>("Shreya","Pratham");
        p1.description();
        p2.description();
        p3.description();
    }
}
