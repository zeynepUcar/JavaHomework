package day41;

//public class Homework1 {
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

     //RESULT Compile time error
//
//    class A
//    {
//        int i = 10;
//    }
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

      //RESULT Compile time error

//    class A
//    {
//        {
//            System.out.println(1);
//        }
//    }
//
////    class B extends A
//    class B
//    {
//        {
//            System.out.println(2);
//        }
//    }
//
//    class C
//    {
//        {
//            System.out.println(3);
//        }
//    }

//    public class MainClass

//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
//    //*********************************************************************************************
//   // What will be the output of the following Java program?

     // RESULT Compile time error
//    class A
//    {
//        String s = "Class A";
//    }
//
//    class B extends A
//    {
//        String s = "Class B";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    class C extends B
//    {
//        String s = "Class C";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
////    public class MainClass
//    class MainClass
//
//
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//
//            System.out.println(c.s);
//        }
//    }
//    //*********************************************************************************************
//   // What will be the output of the following Java program?

//    RESULT Compile time error

//    class A
//    {
//        static
//        {
//            System.out.println("THIRD");
//        }
//    }
//
//    class B extends A
//    {
//        static
//        {
//            System.out.println("SECOND");
//        }
//    }
//
//    class C extends B
//    {
//        static
//        {
//            System.out.println("FIRST");
//        }
//    }
//
////    public class MainClass
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
//    //*********************************************************************************************
//   // What will be the output of the following Java program?

//RESULT Compile time error

//    class A
//    {
//        public A()
//        {
//            System.out.println("Class A Constructor");
//        }
//    }
//
//    class B extends A
//    {
//        public B()
//        {
//            System.out.println("Class B Constructor");
//        }
//    }
//
//    class C extends B
//    {
//        public C()
//        {
//            System.out.println("Class C Constructor");
//        }
//    }
//
////    public class MainClass
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
//
//    //*********************************************************************************************
//   // What will be the output of the following Java program?

// RESULT Compile time error

//    class X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class X");
//        }
//    }
//
//    class Y extends X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class Y");
//        }
//    }
//
////    public class MainClass
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            Y.staticMethod();
//        }
//    }
//    //*********************************************************************************************
//   // What will be the output of the following Java program?

//RESULT Compile time error

//    class X
//    {
//        public X(int i)
//        {
//            System.out.println(1);
//        }
//    }
//
//    class Y extends X
//    {
////        public Y()
//        public Y(int i) // added parameter
//
//        {
//            super(i); // added  super(i);
//            System.out.println(2);
//        }
//    }

