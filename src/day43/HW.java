package day43;

import org.junit.Test;

public class HW {
    // Let's write a Online-Shop that sells books: ChildrenBook & Comics
    // use inheritance, polymorphism and encapsulation while doing this

    // Note: this HW is open-ended, so there a lot of way to solve it
    // task about salary is similar to this

    // Hint: you can use Book as parent class and define price() method there
    @Test
    public void test1(){
        Books book = new Books("tikTak", 450, true );
        book.price();

        Books book2 = new ChildrenBook("Squirrel", 20, true, "short");
        book2.price();




        Books book3 = new Comics("herkul", 120, false, "a lot");
        book3.price();
        ((Comics)book3).picture();

    }


}


