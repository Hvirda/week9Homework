package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupName {
    /*
    9. Write program and add all group names in to array and iterates through for
each loop.
     */
    public static void main(String[] args) {
        ArrayList<String> group=new ArrayList();
        group.add("Java");
        group.add("Selenium");
        group.add("Postman");
        for (String s:group){
            System.out.println(s);
        }



        HashMap<String,Integer> gname=new HashMap<>();
        gname.put("Java",1);
        gname.put("Selenium",2);
        gname.put("Postman",3);

        gname.forEach((k,v)-> System.out.println(k+" "+v));



    }
}
