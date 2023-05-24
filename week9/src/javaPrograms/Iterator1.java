package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("one");
        name.add("two");
        name.add("three");
        name.add("four");
        name.add("five");
        Iterator<String> s=name.iterator();
        while (s.hasNext()){
            System.out.println(s.next());
            }
    }
}
