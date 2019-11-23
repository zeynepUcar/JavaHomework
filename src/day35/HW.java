package day35;

public class HW {
    //create a class Bank
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it
    public static void main(String[] args) {
        Bank obj = new Bank(); //calling 1.
        System.out.println("first method is : " + obj.name + " " + obj.branch + " " + obj.employee);

        Bank obj2 = new Bank("Chase", 7, 21); //calling 2.
        System.out.println("second method is " + obj2.name + " " + obj2.branch + " " + obj2.employee);


        Bank obj3 = new Bank(true);
        System.out.println("third method is " + obj3.makeProfit);



        obj3.name = "PNC"; // calling attributes
        obj3.branch = 3;
        obj3.employee = 9;
        obj.makeProfit = false;

        System.out.println(obj3.getAttributes());


    }

}

class Bank{
    public String name;
    public int branch;
    public int employee;
    public boolean makeProfit;

    public  Bank(){  //1.method
        name = "TD";
        branch = 7;
        employee = 65;

    }

    public  Bank(String newName, int newBranch, int newEmployee){ //2.method
        name = newName;
        branch = newBranch;
        employee = newEmployee;
    }
    public Bank(boolean newProfit){
        makeProfit = newProfit;
    } //3.method

    public String getAttributes(){
        return "Bank name: " + name + "\n" +
                "How many branch: " + branch + "\n" +
                "How many employee: " + employee + "\n" +
                "Does it make profit " + makeProfit;


    }

}
