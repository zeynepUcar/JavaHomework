package day20;

import java.util.HashMap;

public class CouuntinLetters {
    //part4
    // when you are putting character, check if you have that character already,
    // if you have, increment value, if you dont have just add character to map
    public static void main(String[] args) {

        // when you are putting character, check if you have that character already,
        // if you have, increment value, if you dont have just add character to map
        HashMap<Character, Integer> map  = new HashMap<Character, Integer>();


        String s=" BECOME A SOFTWARE TESTER IN 6 MONTHS";

        char[] ch = s.toCharArray();


        for (char c : ch) {

            if (map.containsKey(c)) {


                map.put(c, map.get(c) + 1);

            } else {


                map.put(c, 1);
            }
        }

        System.out.println(map);



    }
}