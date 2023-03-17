package oop.exceptions;

public class Main {
    static void checkAge(int age){
        if (age <18){
            throw new ArithmeticException("Access defined -You must be at least 18 years old.");
        }
        else{
           System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args){
//        try catch finally

        int[] myNumbers = {1,2,3};
        try{
            System.out.println(myNumbers[10]);
        } catch (Exception e){
            System.out.println("Something went wrong");
        } finally{
            System.out.println("The 'try catch' is finished.");
        }

//        the throw keyword
        checkAge(20);

        checkAge(15); // set age to 15 (which is below 18...)




    }
}
