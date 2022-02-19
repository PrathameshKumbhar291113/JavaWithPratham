package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;
class InvalidPasswordException extends Exception{
    int passwordConditionViolated = 0;
    public InvalidPasswordException(int conditionViolated) {
        passwordConditionViolated = conditionViolated;
    }
    public String printMessage(){
        switch (passwordConditionViolated){
            case 1 :
                return ("Password Length should be 8 characters");
            case 2:
                return ("Password should contain at least one digit (0-9)");
            case 3:
                return ("Password should contain at least one special character");
        }
        return ("");
    }
    static class Password{
        public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            System.out.println("Enter your Login Id");
            String Username = sc.nextLine();
            System.out.println("Enter your Password");
            String Password = sc.nextLine();
            try{
                isValid(Password);
            }catch(InvalidPasswordException e){
                System.out.println(e.printMessage());
            }
        }
    }
    private static void isValid(String Password) throws InvalidPasswordException{
        if(Password.length() < 8){
            throw new InvalidPasswordException(1);
        }
        if(true){
            int count = 0;
            for(int i =0 ; i<=9 ;i++){
                String str1 = Integer.toString(i);
                if(Password.contains(str1)){
                    count = 1;
                }
                if(count == 0){
                    throw new InvalidPasswordException(2);
                }
            }
            Pattern specialCharPattern = Pattern.compile("[^a-z0-9]" , Pattern.CASE_INSENSITIVE);
            if(!specialCharPattern.matcher(Password).find()){
                throw new InvalidPasswordException(3);
            }

        }
    }
}
public class CLG_JAVA_EXP12{

}