package javaPrograms;

import java.util.ArrayList;

public class PrintYourName {
    /*
        10. Write program and add all group members names in to array and iterates
through for each loop and print your name.
     */
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();

        name.add("Vidhi");
        name.add("Situ");
        name.add("Hiral");
        name.add("Meet");

        for (String s:name){
            if (s.equalsIgnoreCase("Hiral")){

                System.out.println(s);
            }
        }
    }
}
