package javaPrograms;

import java.util.ArrayList;

public class PrintName {
    /* 11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
     */
    static String name="Hiral";
    public static void main(String[] args) {
        ArrayList<String> name1=new ArrayList<>();

        name1.add("Vidhi");
        name1.add("Situ");
        name1.add("Meet");
        name1.add(name);



        for (String s:name1){
            if (s.equalsIgnoreCase(name)){
                System.out.println(s);
            }
        }
    }
}
