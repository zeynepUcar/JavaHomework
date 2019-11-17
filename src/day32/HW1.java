package day32;

import java.net.PortUnreachableException;

public class HW1 {
    // write java program with method buyItem
    // that accepts argument
    // which lets you buy items from store
    // prints items bought in store
    // ex: I go to store and bought a milk
    // ex: I go to store and bought a water
    // ex: I go to store and bought a sugar

    public static void main(String[] args) {
        buyItem("I go to store and bought a milk");
        buyItem("I go to store and bought a water");
        buyItem("I go to store and bought a sugar");

    }

    public static void buyItem(String text){
        System.out.println(text);


    }


}
