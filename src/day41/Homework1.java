package day41;

public class Homework1 {
//    //*********************************************************************************************
//    // What will be the output of the following Java program?
//
//    //RESULT Compile time error
//
//    class X {
//        //Class X Members
//    }
//
//    class Y extends X {
//        //Class Y Members
//    }
//
//    class Z extends X {
//        //Class Z Members
//    }
//}
    //*********************************************************************************************
    // What will be the output of the following Java program?

    //RESULT 10
//
//    class A
//    {
//        int i = 10;       //data members cant be overridden
//    }                       // only public methods cen be overridden
//
//    class B extends A
//    {
//        int i = 20;
//    }
//
////    public class MainClass       instead of this
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            //A a = new B();
//            A a = new A();
//
//            System.out.println(a.i);
//        }
//    }
//    //*********************************************************************************************
//    //What will be the output of the following Java program?

//What will be the output of the following Java program?   OUTPUT IS      1 2 3
//    public static void main(String[] args)
//    {
//        C c = new C();  // SAME OUTPUT WITH BELOW
//        A a = new C();
//    }
//}
//class A
//{
//    {
//        System.out.println(1);
//    }
//}
//
//class B extends A
//{
//    {
//        System.out.println(2);
//    }
//}
//
//class C extends B
//{
//    {
//        System.out.println(3);  // it is not overidingg, just printing
//    }
//}


//    //*********************************************************************************************
//   // What will be the output of the following Java program?

//What will be the output of the following Java program?   //Output is Class A
    //Class B
    //Class C
//public static void main(String[] args)
//    {
//        C c = new C();
//
//        System.out.println(c.s);
//    }
//}
//class A
//{
//    String s = "Class A";
//}
//
//class B extends A
//{
//    String s = "Class B";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//class C extends B
//{
//    String s = "Class C";
//
//    {
//        System.out.println(super.s);
//    }
//}
////    //*********************************************************************************************
//   // What will be the output of the following Java program?   //    OUTPUT IS   THIRD SECOND  FIRST


//IQ: what is static?, how is it used, why we have to use.
//compiler will go to static first. Debug and you will see.
//why we have to use?
//when you need to share it among other classes or objects,
//without create an instance on a new class.

    //how is it used.
    // StaticInstanceExample.val = 45;


//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
//
//class A
//{
//    static      //compiler will go to static first
//               //if have static , it goes static first not class
//    {
//        System.out.println("THIRD");
//    }
//}
//
//class B extends A
//{
//    static
//    {
//        System.out.println("SECOND");
//    }
//}
//
//class C extends B
//{
//    static    //sharing
//    {
//        System.out.println("FIRST");
//    }
//}
//
//    //*********************************************************************************************
//   // What will be the output of the following Java program?
    // OUTPUT IS
    //Class A Constructor
    //    Class B Constructor
    //    Class C Constructor

//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
//
//class A
//{
//    public A()
//    {
//        System.out.println("Class A Constructor");
//    }
//}
//
//class B extends A
//{
//    public B()
//    {
//        System.out.println("Class B Constructor");
//    }
//}
//
//class C extends B
//{
//    public C()
//    {
//        System.out.println("Class C Constructor");
//    }
//}


//
//    //*********************************************************************************************
//   // What will be the output of the following Java program?

    //OUTPUT IS Class Y

//    public static void main(String[] args)
//    {
//        Y.staticMethod();
//    }
//}
//class X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class X");
//    }
//}
//
//class Y extends X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class Y");
//    }
//}

//    //*********************************************************************************************
//   // What will be the output of the following Java program?

//    public static void main(String[] args) {
//        Y y = new Y ();
//    }
//}
//
//class X {
//    public X(int i) {
//        System.out.println ( 1 );
//    }
//
//    public X() {
//        System.out.println ( 1 );
//    }
//}
//
//class Y extends X {
//    public Y() {
//        super ();
//        System.out.println ( 2 );
//    }
//}
}