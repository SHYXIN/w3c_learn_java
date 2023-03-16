package oop.linkedlist;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
//        linkedList methods
        cars.addFirst("王鑫");
        System.out.println(cars);

        cars.addLast("王鑫后");
        System.out.println(cars);

        cars.removeFirst();
        System.out.println(cars);

        cars.removeLast();
        System.out.println(cars);

        String first = cars.getFirst();
        System.out.println(first);

        String last = cars.getLast();
        System.out.println(last);


    }
}
