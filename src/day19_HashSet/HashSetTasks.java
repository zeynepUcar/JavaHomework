package day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTasks {
//    https://beginnersbook.com/2013/12/hashset-class-in-java-with-example/

    public static void main(String[] args) {


//8. Write a Java program to convert a hash set to a tree set.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers);

        TreeSet<Integer> treeNum = new TreeSet<>(numbers);

        System.out.println(treeNum);

//
//
//9. Write a Java program to convert a hash set to a List/ArrayList.

        ArrayList<Integer> array = new ArrayList<>(numbers);
        System.out.println(array);
//
//
//10. Write a Java program to compare two hash set.
        HashSet<Integer> number2 = new HashSet<>();
        number2.add(3);
        number2.add(3);
        number2.add(4);
        number2.add(4);
        number2.add(9);

        boolean equal =numbers.equals(number2);
            System.out.println(equal);



//
//
//11. Write a Java program to compare two sets and retain elements which are same on both sets.

        numbers.retainAll(number2);

        System.out.println("after retaining " + numbers);


 //
//
//12. Write a Java program to remove all of the elements from a hash set.
//        numbers.clear();
//        System.out.println(numbers);

//13. Write a Java Program to find duplications
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        HashSet<Integer> set = new HashSet<>();


        if (list.size()!= set.size()){
            System.out.println("it has duplication");
        }

    }
}
