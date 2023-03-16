package oop.enums;

//enum Level {
//    LOW,
//    MEDIUM,
//    HIGH
//}
//
//public class Main {
//    public static void main(String[] args){
//        Level myVar = Level.MEDIUM;
//    }
//}
// Enum inside a Class

public class Main{
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        // Enum in a Switch Statement

        switch(myVar){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
        // Loop through an Enum
        for (Level myVar2: Level.values()){
            System.out.println(myVar2);
        }

    }
}
