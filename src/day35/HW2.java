package day35;

public class HW2 {
    //create a class Person
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it
    public static void main(String[] args) {
        Person obj = new Person();   //calling 1.one
        System.out.println(obj.color + " " + obj.shoeSize + " " + obj.height + " " + obj.gender + " " + obj.name );
        System.out.println("---------------");

        Person obj1 = new Person("Henry");   //calling 2. method
        System.out.println(obj1.name);

        System.out.println("---------------");

        Person obj2 = new Person("male", "white");  //calling 3. method
        System.out.println(obj2.gender + " " + obj2.color);

        System.out.println("---------------");

        Person obj3 = new Person(6.01, 10); //calling 4.method
        System.out.println(obj3.height + " " + obj3.shoeSize);

        System.out.println("---------------");

        Person obj4 = new Person("Corey", "male", "white", 6.0, 12); //calling 5.method
        System.out.println(obj4.name + " " + obj4.gender + " " + obj4.color + " " + obj4.height + " " + obj4.shoeSize);

        System.out.println("---------------");

        Person obj5 = new Person();  //calling 6.method
        obj5.name = " Ashley";
        obj5.gender = "female";
        obj5.color = "black";
        obj5.height = 5.04;
        obj5.shoeSize = 6;
        System.out.println(obj5.getAttributes());

        Person obj6 = new Person("Ali");//calling 7. method
        System.out.println(obj6.name + " " + obj6.height);

        System.out.println("---------------");

        Person obj7 = new Person(7.0, 15); //calling 8.method
        System.out.println(obj7.height + " " + obj7.shoeSize + " " + obj7.name);

        System.out.println("---------------");

        Person obj8 = new Person("transgender", "yellow");  //calling 9. method
        System.out.println(obj8.gender + " " + obj8.color);

        System.out.println("---------------");

        Person obj9 = new Person("Zeynep");//calling 10. method
        System.out.println(obj9.name + " " + obj9.height);












    }
}
class Person{
    public String name;
    public String gender;
    public String color;
    public double height;
    public int shoeSize;

    public Person(){    //1. method
        name = "Adam";
        gender = "Male";
        color = "Black";
        height = 5.10;
        shoeSize = 10;
    }
    public Person(String newName){  //2.method
        name = newName;
    }
    public Person(String newGender, String newColor){ //3.method
        gender = newGender;
        color = newColor;
    }
    public Person(double newHeight, int newShosize){  //4.method
        height = newHeight;
        shoeSize = newShosize;
    }
    public Person(String newName,String newGender, String newColor,double newHeight, int newShosize){ //5.method
        name = newName;
        gender = newGender;
        color = newColor;
        height = newHeight;
        shoeSize = newShosize;
    }
    public String getAttributes(){  //6. method
        return "his name is " + name + "\n" +
                "his gender is " + gender + "\n"+
                "his color is " + color + "\n"+
                "his height is " + height + "\n"+
                "his shoesize is " + shoeSize ;
    }
}
