package com.company;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry .
 * This is <i>italic</i> word<p> . This is a new paragraph</p>
 * @author Pratham (CodeWithPratham)
 * @since 2003
 * @version 0.19
 * @see <a href="https://docs.oracle.com/en/java/javase/16/docs/api/index.html" target="_blank>Java Docs</a>
 */
public class CWP_Ch16_AdvancedJava2_JavaDocumentation {
    /**
     *Hello this is a method and this is the most tatti method of the class
     * @param a This is the first number to add
     * @param b This is the first number to add
     * @return This returns the sum of two numbers as an Integer
     * @throws Exception if i id 0
     * @deprecated This method is deprecated pleas use + operator
     */

    public int add(int a, int b) throws Exception {
        System.out.println("This is the method of Addition ");
        if(a==0){
            throw new Exception();
        }
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
