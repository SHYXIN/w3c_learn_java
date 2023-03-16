package oop.contructors;


// Create a Main class
public class Main {
    int x;  // Create a class attribute

    int modelYear;
    String modelName;

////    Create a class constructor for the Main class
//    public Main(){
//        x = 5; // Set the initial value for the class attribute x
////        System.out.println("got executed");
//    }
//
//    public static void main(String[] args){
//        // Create an object of class Main (This will call the constructor)
//        Main myObj = new Main();
//        System.out.println(myObj.x); // print the value of x
//    }

    // constructor parameters 单个参数的构造函数
//    public Main(int y){
//        x = y;
//    }
//
//    public static void main(String[] args){
//        Main myObj = new Main(5);
//        System.out.println(myObj.x);
//    }


    public Main(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
