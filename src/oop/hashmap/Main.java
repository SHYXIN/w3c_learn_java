package oop.hashmap;
// import the HashMap class
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
//        Create
        HashMap<String, String> capitalCities = new HashMap<String,String>();
//        add item
//        add keys and values (country, city)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

//        Access an item
        System.out.println(capitalCities.get("England"));
//        remove an item
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);
//        HashMap Size
        System.out.println(capitalCities.size());
//        clear
//        capitalCities.clear();
//        System.out.println(capitalCities);

//        loop through a HashMap
//        keySet()
        for(String i:capitalCities.keySet()){
            System.out.println(i);
        }
//        values()
        for(String i:capitalCities.values()){
            System.out.println(i);
        }

//        item
//        print key and value
        for (String i: capitalCities.keySet()){
            System.out.println("key: "+ i + " value: " + capitalCities.get(i));

        }

//        other types
        HashMap<String, Integer> people = new HashMap<String, Integer>();
//        add keys and values (Name, Age)

        people.put("John", 32);
        people.put("Steven", 39);
        people.put("Angle", 33);

        for (String i:people.keySet()){
            System.out.println("key :" + i + " value: " + people.get(i));
        }

        for (int i : people.values()){
            System.out.println(i);
        }



    }


}
