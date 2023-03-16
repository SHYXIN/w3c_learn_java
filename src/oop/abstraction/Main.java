package oop.abstraction;

// Abstract class
abstract class Animal{
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}
// Subclass (inherit form Animal)
class Pig extends Animal{
    public void animalSound(){
        // the body of animalSound(0 is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args){
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

    }
}
