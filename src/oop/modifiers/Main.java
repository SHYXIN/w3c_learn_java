package oop.modifiers;

//public class Main {
//    final int x = 10;
//    final double PI = 3.14;
//
//    public static void main(String[] args){
//        Main myObj = new Main();
////        myObj.x = 50;
////        myObj.PI = 25;
//        System.out.println(myObj.x);
//    }
//
//}
// Code from filename : Main.java
// abstract class
abstract class Main{
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method

}

// Subclass (inherit from Main)
class Student extends Main{
    public int graduationYear = 2018;
    public void study(){
        // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java
