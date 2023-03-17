package oop.lambda_expressions;
import java.util.ArrayList;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(6);
        numbers.add(1);
//        parameter - > expression
//        (parameter1, parameter2) - > expressions
//        (parameter1, parameter2) -> { code block }
        numbers.forEach((n) -> {System.out.println(n);});

        numbers.forEach(System.out::println);

//        user Consumer
        Consumer<Integer> method =(n) -> {System.out.println(n); };
        numbers.forEach( method );


    }
}

//        To use a lambda expression in a method, the method should have a parameter with a single-method
//        interface as its type. Calling the interface's method will run the lambda expression:


interface StringFunction{
    String run(String str);
}

class Main2{
    public static void main(String[] args){
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        printFormatted("你好", exclaim);
    }

    private static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);

    }


}

