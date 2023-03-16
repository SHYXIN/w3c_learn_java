package oop.class_attributes;

public class Main {
    int x = 5;
    final int y = 3;  // if you don't want the ability to override existing values, declare the attribute as final;

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args){
        Main myObj = new Main();

//        Accessing Attributes
        System.out.println(myObj.x);
        System.out.println(myObj.y);

//        Modify Attributes

        Main myObj2 = new Main();

        myObj2.x = 40;  // set the value of x to 40
        System.out.println(myObj2.x);

//        myObj2.y = 12;   will generate an error: can assign a value to a final variable
//        System.out.println(myObj2.y);

//        Multiple Objects
        Main myObj3 = new Main();
        Main myObj4 = new Main();
        myObj4.x= 25;
        System.out.println(myObj4.x);
        System.out.println(myObj3.x);
//        Multiple Attributes

        Main myObj6 = new Main();
        System.out.println("Name: " + myObj6.fname + " " + myObj6.lname);
        System.out.println("Age: " + myObj6);


    }
}
