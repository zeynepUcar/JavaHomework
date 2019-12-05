package day44;

public class Sum {
    //write a Sum class
//create a sum method that accepts 2 int parameters, x, y and returns int as a result;
//create a sum method overload that accepts 3 parameters and takes 3 int parameters, x, y, z
//create a sum method overload that accepts 2 double parameters x, y, and returns a double.
//in your main method call the class and run these 3 methods.

    public int sum(int x, int y){
        return x + y;
    }
    public int sum(int x, int y, int z){
        return x + y + z;
    }
    public  double sum(double a, double b){
        return a + b;
    }
}

class Main{
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(2,5));
        System.out.println(s.sum(3,5,7));
        System.out.println(s.sum(4.0, 3.2));
    }
}