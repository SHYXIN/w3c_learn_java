package oop.inner_class;

//class OuterClass{
//    int x= 10;
//
//    // private protected
//    class InnerClass{
//       int y = 5;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
//    }
//
//}
//class OuterClass{
//    int x= 10;
//
//    // private protected
//    static class InnerClass{
//        int y = 5;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        OuterClass.InnerClass myInner =  new OuterClass.InnerClass();
//        System.out.println(myInner.y);
//    }
//
//}
// Access Outer Class From Inner Class

class OuterClass{
    int x = 10;

    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}


public class Main{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}
