package day20;

import java.util.HashMap;

public class ModifyMap {
    // Modify and print the given map as follows:
    // if the key "a" has a value, set the key "b" to have that value,
    // and set the key "a" to have the value ""

    //{"a": "candy", "b": "dirt"} => "a": "", "b": "candy"
    //{"a": "candy"} => "a": "", "b": "candy"
    //{"a": "candy", "b": "carrot", "c": "meh"} => {"a": "", "b": "candy", "c": "meh"}

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");
        map.put("d"," ");


        if(!map.get("a").equalsIgnoreCase(" ") &&! map.get("b").equalsIgnoreCase(" " )) {

            System.out.println("a: "+ map.get("d"));
            System.out.println("b: "+ map.get("a"));
        }





    }
}
