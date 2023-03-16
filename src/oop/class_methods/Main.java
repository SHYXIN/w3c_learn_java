package oop.class_methods;

public class Main {
    static void myMethod(){
        System.out.println("Hello World!");
    }

//    Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
//    Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
//    Create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
//    Create a speed() method and a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

//    Main method
    public static void main(String[] args){
        myMethod();

        myStaticMethod(); // Call the static method
//        myPublicMethod(); // This would compile an error

        Main myObj = new Main(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object

//        myObj.myStaticMethod()  // 也会错误

        Main myCar = new Main();  // Create a myCar object
        myCar.fullThrottle();  // Call the fullThrottle() method
        myCar.speed(200); // Call the speed() method

    }


}
