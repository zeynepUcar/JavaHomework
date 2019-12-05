package day44;

public class Homework3 {
    //1. what is polymorphism   //HAVING MANY FORMS
//2. what are the types of polymorphism   /  RUUNTIME AND COMPILE TIME POLYMORPHISM
//3. what is static binding, what is dynamic binding?   OVERLOADING IS STATIC BINDING
    // OVERRIDING IS DYNAMIC BINDING

//Polymorphism in java

//1) What is the output of the following program?


//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//}

//public class Test
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getData();
//    }
//}
//a) Inside Poly
//b) Inside TechnoStudy   //ANSWER B
//c) Compilation error
//d) Runtime error


//2) What is the output of the following program?

//class Test
//{
//    void myMethod()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test {
//    void myMethod() {
//        System.out.println("Poly");
//    }
//    public static void main(String[] args) {
//        Derived object = new Test();
//        object.myMethod();
//    }
//}


//a) TechnoStudy
//b) Poly
//c) Compilation error  //ANSWER C
//d) Runtime error

//3) What is the output of the following program?


//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//
//protected void getValue()
//{
//    System.out.println("TechnoStudy");
//}
//}
//
//public class Test
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getValue();
//    }
//}
//a) Compilation error  //ANSWER A
//b) Runtime error
//c) TechnoStudy
//d) None of these


/////////4) What is the output of the following program?

//interface Poly
//{
//    void myMethod();
//    void getInfo();
//}
//
//abstract class Geeks implements Poly
//{
//    void getData()
//    {
//        System.out.println("Poly");
//    }
//}
//
//public class Test extends Geeks
//{
//    public void myMethod()
//{
//    System.out.println("TechnoStudy");
//}
//public void getInfo()
//{
//    System.out.println("Geeks");
//}
//
//public static void main(String[] args)
//{
//    Geeks obj = new Test();
//    obj.getInfo();
//}
//}
//a) Geeks
//b) Compilation error
//c) Runtime error
//d) None of these


//5) What is the output of the following program?

//filter_none
//edit
//play_arrow

//brightness_4

//class Test
//{
//    public void Poly()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test {
//    public void Poly() {
//        System.out.println("Poly");
//    }
//
//    public static void main(String[] args) {
//        Derived obj = new Test();
//        obj.Poly();
//    }
//}

//a) Compilation error  ANSWER A
//b) Runtime error
//c) Poly
//d) TechnoStudy

}