package oop.iterator;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args){
//        Getting an Iterator
//        Make a collection
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

//        get the iterator
        Iterator<String> it = cars.iterator();

//        print the first item
        System.out.println(it.next());
        System.out.println();

//        loop through a collection
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        remove numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> nit = numbers.iterator();

        while(nit.hasNext()){
            Integer i = nit.next();
            if (i < 10){
                nit.remove();
            }
        }

//        numbers.removeIf(i -> i < 10);

        System.out.println(numbers);

    }
}
