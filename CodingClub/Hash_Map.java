package CodingClub;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {

        // create hashmap
        Map<Integer, String> map = new HashMap<>();

        // insert into it
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        // find
        if (map.containsKey(2)) {
            System.out.println(map.get(2)); // prints "two"
        }
        else{
            System.out.println("Key not found");
        }

        // print all keys 
        System.out.println("Keys below");
        for(Integer key: map.keySet()){
            System.out.println(key);
        }
        System.out.println("value below");
        for(String value: map.values()){
            System.out.println(value);
        }
        System.out.println("#############################");
        for(Integer  key: map.keySet()){
            System.out.println(key+ ":" +map.get(key));
        }

        // clear 
        // map.clear();
        // System.out.println("#############################");
        // for(Integer  key: map.keySet()){
        //     System.out.println(key+ ":" +map.get(key));
        // }

       
        // entry set
        System.out.println("#############Entry set################");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            }

    }
}
