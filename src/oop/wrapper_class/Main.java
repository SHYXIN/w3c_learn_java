package oop.wrapper_class;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

//        ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>(); // valid

//        Creating wrapper Objects
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
//        get the value associated with the corresponding wrapper object

        System.out.println(myInt.intValue());
        System.out.println(myInt.doubleValue());

        System.out.println(myDouble.shortValue());
        System.out.println(myDouble.doubleValue());

        System.out.println(myChar.charValue());
        System.out.println(myChar.toString());  // 有用

        Integer myInt2 = 100;
        String myString = myInt2.toString();

        System.out.println(myString);
        System.out.println(myString.length());


    }
}
