package oop.encapsulation;

public class Main {
    public static void main(String[] args){
        Person myObj = new Person();
        // 报错
//        myObj.name = "John";
//        System.out.println(myObj.name);
        myObj.setName("John");
        System.out.println(myObj.getName());



    }
}
