package day20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Pairs {

//    Given an array of non-empty strings,
//    create and return a Map<String, String> as follows:
//    for each string add its first character as a key with
//    its last character as the value.

    //    ["code", "bug"] → {"b": "g", "c": "e"}
//    ["man", "moon", "main"] → {"m": "n"}
//    ["man", "moon", "good", "night"] → {"g": "d", "m": "n", "n": "t"}
    public static void main(String[] args) {


        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        String first = "code";
        String second = "bug";

        char[] ch1 = first.toCharArray();
        char[] ch2 = second.toCharArray();


        System.out.println(first.charAt(0) + " : " + first.charAt(first.length() -1));
        System.out.println(second.charAt(0) + " : " + second.charAt(second.length() -1));


    }
}
