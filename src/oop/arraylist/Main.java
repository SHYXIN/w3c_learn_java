package oop.arraylist;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
//        可变数组 resizable
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

//        Access an item
        System.out.println(cars.get(0));
//        Change an item
        cars.set(0, "Opel");
        System.out.println(cars);
//        Remove an item
        cars.remove(0);
        System.out.println(cars);
//        clear
//        cars.clear();
        System.out.println(cars);
//        ArrayList size
        System.out.println(cars.size());
//        loop Through an ArrayList

        for (int i = 0; i< cars.size();i++){
            System.out.println(cars.get(i));
        }
//        for each ArrayList
        for (String i:cars){
            System.out.println(i);
        }

//        other types
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(14);
        myNumbers.add(255);
        myNumbers.add(24);
        for (Integer i :myNumbers){
            System.out.println(i);
        }
        for (int i :myNumbers){
            System.out.println(i);
        }

//        Sort an ArrayList
//        alphabetically or numerically
        Collections.sort(cars);
        for (String i :cars){
            System.out.println(i);
        }

        Collections.sort(myNumbers);
        for (int i: myNumbers){
            System.out.println(i);
        }



    }
}
