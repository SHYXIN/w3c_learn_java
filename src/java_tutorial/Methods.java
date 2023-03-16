package java_tutorial;

public class Methods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    // 参数
    static void myMethod2(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethod3(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    static int myMethod4(int x){
        return 5 + x;
    }

    static int myMethod5(int x, int y){
        return x + y;
    }

    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied - You are not old enough");
        }else {
            System.out.println("Access granted - You are old enough");
        }
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();

//        parameter 参数
        myMethod2("Liam");
        myMethod2("Jenny");
        myMethod2("Anja");

//        多个参数
        myMethod3("Lima", 5);
        myMethod3("Jenny", 8);
        myMethod3("Anja", 31);

//        有返回值
        System.out.println(myMethod4(3));
        System.out.println(myMethod4(5));

//        计算两个数的和
        System.out.println(myMethod5(5, 3));
        System.out.println(myMethod5(10, 10));

//        把返回值赋给变量
        int z = myMethod5(10,2);
        System.out.println(z);

//        年龄检查
        checkAge(29);

    }


}
