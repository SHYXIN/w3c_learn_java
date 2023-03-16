package oop.user_input_scanner;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");

//        String input
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is :" + userName); // Output user input

//        Numerical  input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

//        Output input by user
        System.out.println("Name: "+ userName);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);



    }
}
