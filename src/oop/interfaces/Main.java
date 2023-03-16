package oop.interfaces;
// interfaces

//interface Animal{
//    public void animalSound(); // interface method (does not have a body)
//    public void run(); // interface method (does not have a body)
//}

// interface
interface Animal{
    public void animalSound();
    public void sleep();
}

// Pig "implements" the Animal interface
class Pig {
    public void animalSound(){
        // The body of animalSound() is provided by here
        System.out.println("The pig says: wee wee");
    }

    public void sleep(){
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

// multiple interfaces

interface FirstInterface{
    public void myMethod(); // interface method
}

interface SecondInterface{
    public void myOtherMethod();// interface method
}

class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("Some text...");
    }

    public void myOtherMethod(){
        System.out.println("Some other text..");
    }
}



public class Main {
    public static void main(String[] args){
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();

    }
}
