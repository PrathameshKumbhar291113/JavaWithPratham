package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWP_Ch16_AdvancedJava_FileHandling {
    public static void main(String[] args) {//throws IOException {
//        Code to create a new filw
//        File myFile = new File("CWP11File.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }

//        Code to write in a file
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("CWP11File.txt");
//            fileWriter.write("This is a Writing to a file");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Reading the contents inside the file
//            File myFile = new File("CWP11File.txt");
//            try {
//                Scanner sc = new Scanner(myFile);
//                while (sc.hasNextLine()){
//                    String line = sc.nextLine();
//                    System.out.println(line);
//                }
//                sc.close();
//            }catch(FileNotFoundException e){
//                e.printStackTrace();
//            }

//        Code to delete the file
        File myFile =new File("CWP11File.txt");
        if(myFile.delete()){
            System.out.println("I have deleted my file : "+ myFile.getName());
        }else{
            System.out.println("Some problem occurred during the file");
        }
    }
}
