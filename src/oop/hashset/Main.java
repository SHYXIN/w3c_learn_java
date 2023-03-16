package oop.hashset;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

//    add items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
//        check if an item Exists
        System.out.println(cars.contains("Mazda"));

//        remove an item
        cars.remove("Volvo");
        System.out.println(cars);
//        size
        System.out.println(cars.size());

//        loop through
        for (String i : cars) {
            System.out.println(i);
        }

//        clear
        cars.clear();


//        other types
        HashSet<Integer> numbers = new HashSet<Integer>();
//        add value to the set
        numbers.add(4);
        numbers.add(8);
        numbers.add(7);

//        print
        System.out.println(numbers);

        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }


    }

}



