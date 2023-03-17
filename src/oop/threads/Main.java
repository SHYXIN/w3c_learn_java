package oop.threads;

// Creating a Thread extends
public class Main extends Thread{
    public void run(){
        System.out.println("This code is running in a thread");
    }

//    Running Threads
    public static void main(String[] args){
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}
// another way to create a thread is implements the Runnable interface.
class Main2 implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
    public static void main(String[] args){
        Main2 obj =new Main2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

}
// Difference extends others
// class MyClass extends OtherClass implements Runnable

// Concurrency Problems 并发性问题

class Main3 extends Thread{
    public static int amount = 0;  // amount belongs to class rather than object

    public static void main(String[] args){
        Main3 thread = new Main3();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
    public void run(){
        amount++;
    }

}
// use isAlive()

class Main4 extends Thread{
    public static int amount = 0;

    public static void main(String[] args){
        Main4 thread = new Main4();
        thread.start();

//        wait for the thread of finish
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
//        Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run(){
        amount++;
    }
}