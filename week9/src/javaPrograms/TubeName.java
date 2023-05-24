package javaPrograms;

import java.util.ArrayList;

public class TubeName {
    /*
    5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names
     */
    public static void main(String[] args) {

        ArrayList<String> tubename=new ArrayList<>();
            tubename.add("Jubilee");
            tubename.add("Circle");
            tubename.add("Victoria");
            tubename.add("Northern");
            tubename.add("westernise");
        System.out.println(tubename);
            if (tubename.isEmpty()){
                System.out.println("There is no name defined");
            }



//        tubename.add("Jub);
//        tubename.add("Central");
//        tubename.add("circle");
//        tubename.add("Vectoria");


    }
}
