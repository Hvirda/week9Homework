package javaPrograms;

import java.util.ArrayList;

public class ColorsWithForEach {
    /*
    3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.

     */String colors[]={"Red","Yellow","White"};
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
          name.add("Purple");
          name.add("Blue");
          name.add("green");
          name.add("black");
          name.add("orange");
       System.out.println(name);
       for (String s:name){
           System.out.println(s);
       }

    }
}
