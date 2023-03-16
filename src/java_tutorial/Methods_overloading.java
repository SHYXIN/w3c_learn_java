package java_tutorial;

public class Methods_overloading {
    static int plusMethodInt(int x, int y){
        return x + y;
    }

    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x +  y;
    }



    public static void main(String[] args){
        int myNum1 = plusMethodInt(8,5);
        double myNum2 = plusMethodDouble(4.4, 4.2);
        System.out.println("int " + myNum1);
        System.out.println("double " + myNum2);
//        重载overloading
//        Multiple methods can have the same name as long as the number and
//        or type of parameters are different.
        int myNum3 = plusMethod(1,2);
        double myNum4 = plusMethod(1.3,4.5);

        System.out.println(myNum3);
        System.out.println(myNum4);



    }

}

