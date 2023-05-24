package javaPrograms;

import java.util.HashSet;

public class NumberHashSet {
    /*
    6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
     */
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(4);
        num.add(7);
        num.add(8);

        for (int j = 0; j < 10; j++) {
            if (num.contains(j)) {
                System.out.println(j);
            }

//            for (int i : num) {
//                System.out.println(i);
//                if (i > 10) {
//                    System.out.println("number is not in between 1 to 10");
//                } else if (i <= 0) {
//                    System.out.println("number is not in between 1 to 10");
//                } else {
//                    System.out.println("numbers are between 1 to 10");
//                }
//            }
        }
    }
}