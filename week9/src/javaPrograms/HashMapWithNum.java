package javaPrograms;

import java.util.HashMap;

public class HashMapWithNum {
    /*
    7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

     */

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("p1", 1);
        people.put("p2", 3);
        people.put("p3", 6);
        people.put("p4", 7);


        people.forEach((k,v)-> System.out.println("Key= "+k+ " Value= "+v));
    }
}
//

