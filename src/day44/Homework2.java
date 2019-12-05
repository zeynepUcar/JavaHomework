package day44;

public class Homework2 {



//2. Can we overload methods on return type? NO
//will this work???? why? why not?  NO it wont work because java saw these foo method same
                                    // functions can not be overloaded if they differ only in the return type
//public class Main
//{
//    public int foo() {
//        return 10; }
//
//    public char foo() {
//        return 'a'; }
//
//    public static void main(String args[])
//    {
//    }
//}

//3. Can we overload static methods?  YES
//4. Can we overload methods that differ only by static keyword? NO
//will this work???? why? why not?     NO IT WONT WORK BECAUSE JAVA CANNOT DEFINE FOO()
//public class Test
//{
//    public static void foo()
//    {
//        System.out.println("Test.foo() called ");
//    }
//    public void foo()
//    { // Compiler Error: cannot redefine foo()
//        System.out.println("Test.foo(int) called ");
//    }
//    public static void main(String args[])
//    {
//        Test.foo();
//    }
//}

//5. Can we overload main() in Java?
//6. What is the difference between Overloading and Overriding?
//         Overloading is compile time polymorphism, overriding is runtime polymorphism
//7. Can we Override static methods in java?   NO
//it is related to question 7.
//what is the output of this program? why? why not?

  //  ANSWER  Static or class method from Base
   //         Non-static or Instance method from Derived

//class Base
//{
//    public static void display()
//    {
//        System.out.println("Static or class method from Base");
//    }
//    public void print()
//    {
//        System.out.println("Non-static or Instance method from Base");
//    }
//}

//class Derived extends Base
//{
//public static void display()
//{
//    System.out.println("Static or class method from Derived");
//}
//public void print()
//{
//    System.out.println("Non-static or Instance method from Derived");
//}
//}

//public class Test
//{
//    public static void main(String args[ ])
//    {
//        Base obj1 = new Derived();
//        obj1.display();    //STATIC METHOD CANNOT OVERRIDDEN, BECAUSE OF THAT IT CALLS BASE CLASS NOT DERIVED

//        obj1.print();     // OVERRIDING WORKS IN THIS METHOD,DERIVED CLASS WILL BE CALLED
//    }
//}
}
