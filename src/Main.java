public class Main {
    public static void main(String[] args) {
//        https://www.w3schools.com/java/java_operators.asp
//        println 函数
        System.out.println("Hello world!");
        System.out.println("I am learning Java");
        System.out.println("It is awesome");

//        print 函数 不换行
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line");
//        打印数字
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

//        进行数字运算
        System.out.println(3 + 3);
        System.out.println(2 * 5);

//        这是单行注释
        System.out.println("注释用法"); // 这个也是单行注释
        /* 这是多行注释
         这是第二行*/
        System.out.println("这是多行注释");

//        java的变量
//        String 类型  "hello world"
//        int类型  123 或者 -123
//        float类型 如 19.99
//        char类型 录入 'a' 或者 'B'
//        boolean类型 如 true或者false

        // 声明（创建）变量
//        type variableName = value;
//        变量类型 变量名 = 变量值;
//        create a variable called name of type String and assign it the value "John":
        String name = "John";
        System.out.println(name);

//        To create a variable that should store a number, look at the following example:
//        Create a variable called myNum of type in and assign it the value 15:
        int myNum = 15;
        System.out.println(myNum);
//        You can also declare a variable without assigning the value, and assign the value later;
        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

//        Note that if you assign a new value to an existing variable, it will overwrite the previous value;
//        Change the value of myNum from 15 to 20:
        myNum = 20;
        System.out.println(myNum);
//        Final Variables 最终变量
//        If you don't want others (or yourself) to overwrite existing values, user the final keyword
//        (this will declare the variables as "final" or "constant"， which means unchangeable and read-only):
        final int myNum3 = 15;
//        myNum3 = 25; // will generate an error : cannot assign a value to a final variable
//        Others Types
//        A demonstration of how to declare variables of other types:
        int myNum4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
//        Display Variables
//        the println() method is often used to display variables.
//        To combine both text and a variable, use the + character:
        String name2 = "John";
        System.out.println("Hello " + name);
//        You can also use the + character to add a variable to another variable:
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
//        For numeric values, the + character works as mathematical operator
//        ( notice that we use int (integer) variables here):
        int x1 = 5, y1 = 6;
        System.out.println(x1 + y1);
//        Declare Many Variables
//        To declare more than one variable of the same type, you can use a comma-separated list:
//        Instead of the writing:
        int x3 = 5;
        int y3 = 6;
        int z3 = 50;
        System.out.println(x3 + y3 + z3);

        int x4 = 5, y4 = 6, z4 = 50;
        System.out.println(x4 + y4 + z4);

//        One Value to Multiple Variables
//        You can also assign the same value to multiple variables in one line:
        int x6, y6, z6;
        x6 = y6 = z6 = 50;
        System.out.println(x6 + y6 + z6);
//        Java Identifiers
//        All java variables must be identified with unique names.
//        These unique names are called identifiers.
//        Identifiers can be short names (like x and y) or more descriptive names (age , sum, totalVolume).
//        Note: It is recommended to use descriptive names in order tot create understandable and maintainable code.
//        Good
        int minutesPerHour = 60;
//        OK, but not so easy to understand what m actually is
        int m = 60;
//        the general rules for naming variables are:
//        Names can contain letters, digits, underscores, and dollar signs
//        Names must begin with a letter
//        Names should start with a lowercase letter, and it cannot contain whitespace.
//        Names can also begin with $ and _ (but we will not use it in this tutorial)
//        Names are case sensitive ("myVar" and "myvar" are different varialbes)
//        Reserved words (like Java keywords, such as int or boolean) cannot be used as names

//        Java Data Types
//        As explained the previous chapter, a variable in Java must be a specified data type:
        int myNum5 = 5; // Integer
        float myFloatNum2 = 5.99f;
        char myLetter2 = 'D';
        boolean myBool2 = true;
        String myText2 = "Hello";

//        Data types are divided into two groups;
//        Primitive data types - includes byte ,short ,int , long, float, double, boolean and char.
//        Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

//        Primitive Data types
//        A primitive data type specifies the size and type of variable values, and it has no additional methods.
//        These are eight primitive data types in Java:
//        byte      1 byte      stores whole numbers from -128 to 127
//        short     2 bytes     Stores whole numbers form -32768 to 32767
//        int       4 bytes     Stores whole numbers from
//        long      8 bytes
//        float     4 bytes
//        double    8 bytes
//        boolean   1 bit
//        char      2 bytes
        int myNum8 = 9;
        float myFloatNum9 = 8.99f;
        char myLetter3 = 'A';
        boolean myBool4 = true;
        String myText4 = "Hello world";

        double myDouble = 16.99d;
        System.out.println(myDouble);

        boolean isJavaFun = true;
        System.out.println(isJavaFun);

        System.out.println(firstName.concat(lastName));

//        条件语句

        int year = 2020;

        if (year == 2000) {
            System.out.println("if 条件语句");
        }

        int a = 10, b = 5;

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than or equal to b");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening");
        }

        // short hand if.. Else
        int time2 = 20;
        String result = (time2 < 18) ? "Good day" : "Good evening";
        System.out.println(result);

//        switch 语句
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Look forward to the Weekend");
        }

//        循环语句while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }


//        do while 循环
        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        } while (i2 < 5);

//        for loop循环
        for (int i3 = 0; i3 < 5; i3++) {
            System.out.println(i3);
        }

        for (int i4 = 0; i4 <= 10; i4 = i4 + 2) {
            System.out.println(i4);
        }

//        双层循环
        for (int ii = 1; ii <= 2; ii++) {
            System.out.println("Outer:" + ii);

//            inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }

        }

//        for each循环  遍历数组 array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

//        break 跳出循环
        for (int c = 0; c < 10; c++) {
            if (c == 4) {
                break;
            }
            System.out.println(c);
        }

        int dd = 0;
        while (dd < 10) {
            System.out.println(dd);
            dd++;
            if (dd == 4) {
                break;
            }
        }


//        continue 执行下次循环
        for (int d = 0; d < 10; d++) {
            if (d == 4) {
                continue;
            }
            System.out.println(d);
        }

        int ddd = 0;
        while (ddd < 10) {
            if (ddd == 4) {
                ddd++;
                continue;
            }
            System.out.println(ddd);

            ddd++;
        }

//        数组 array
        String[] cars2 = {"沃尔沃", "宝马", "福特", "马自达"};
        int[] myNumArray = {10, 20, 30, 40};

        System.out.println(myNumArray[0]);

        cars2[0] = "Opel";

        System.out.println(cars2[0]);
//        数组的长度
        System.out.println(cars2.length);
//        遍历数组  通过索引
        for (int jjj = 0; jjj < cars2.length; jjj++) {
            System.out.println(cars[jjj]);
        }
//        遍历索引，通过for each

        for (String cc: cars2){
            System.out.println(cc);
        }

//        多维数组
        int [][] myNumbers = {{1,2,3,4}, {5,6,7}};
        System.out.println(myNumbers[1][2]); // 结果是7

//        修改值
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        Main.main2();

    }

    public static void main2(){
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        for (int i=0;i < myNumbers.length;i++){
            for (int j=0;j<myNumbers[i].length;j++ ){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}