package day19_HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTasks {
    public static void main(String[] args) {


//12. Write a Java program to extract a portion of a array list.
        List<String> arr = new ArrayList<String>();

        arr.add("apple");
        arr.add("pear");
        arr.add("lemon");
        arr.add("cabbage");
        arr.add("cucumber");

        System.out.println("Original List : " + arr);

        System.out.println("task 12 -----------");

        List<String> arrnew = arr.subList(0, 3);

        System.out.println("Extracted one ; " + arrnew);

//
//
//13. Write a Java program to compare two array lists.

        boolean contain = arr.contains(arrnew);
        if (contain){
            System.out.println("those are same");
        }else {
            System.out.println("they are not same");
        }
//
//
//14. Write a Java program of swap two elements in an array list.
        Collections.swap(arr, 2,3);
        System.out.println("after swapping " + arr);
//
//
//15. Write a Java program to join two array lists.
        List<String> arr1 = new ArrayList<String>(arr); // added all elemts to arr1

        for (int i = 0; i < arr.size(); i++) {
            String element = arr.get(i);
            arr1.add(element);



        } System.out.println("Joining 2 list "  + arr1);

//
//
//16. Write a Java program to clone an array list to another array list.
//
//
//17. Write a Java program to empty an array list.
         //arr.clear();
//
//
//18. Write a Java program to test an array list is empty or not.
        boolean empty = arr.isEmpty();
        System.out.println(empty);
//
//
//19. Write a Java program to trim the capacity of an array list the current list size.
        // arr.trimToSize();
//
//
//20. Write a Java program to increase the size of an array list.

//
//
//21. Write a Java program to replace the second element of a ArrayList with the specified element.
        arr.set(2, "broccoli");
        System.out.println(arr);
//
//
//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        for (int i = 0; i < arr.size(); i++){
            String indexofValue = arr.get(i);
            System.out.println(indexofValue);
        }
        System.out.println();
    }
}
