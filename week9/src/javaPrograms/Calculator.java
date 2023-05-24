package javaPrograms;

import java.util.Scanner;

public class Calculator {

        /*

    1.	Write a “main” method into main class. It has scanner that takes user  input.
     Also write the logic that it ask user to “Enter first Number:”,  “Enter second Number:” “Please enter one of
     symbol +,-,*, /:” if user  enter + symbol result like “Addition of 5 and 10 is: 15” and respective  for other symbol.
     2. With the result it’s also print one more message “Would you like to do
      more calculation Please enter “Y” or “N” :” (Hint use while loop if user  enter Y program asking the
      user to enter First Number, and if user enter  N programme should terminate)

         */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            char ch;
            char c1='Y';
            do {
                System.out.println("enter first number");
                int a1 = sc.nextInt();
                System.out.println("enter second number");
                int b1 = sc.nextInt();
                System.out.println("enter calculation you want perform");
                char c = sc.next().charAt(0);
                switch (c) {
                    case '+':
                        System.out.println("addition is: " + (a1 + b1));
                        break;
                    case '-':
                        System.out.println("subtraction is: " + (a1 - b1));
                        break;
                    case '*':
                        System.out.println("multiplication is: " + (a1 * b1));
                        break;
                    case '/':
                        System.out.println("division is: " + (a1 / b1));
                        break;
                    default:
                        System.out.println("enter valid sign");
                }
                System.out.println("Would you you like to do calculation");
                System.out.println("enter choice Y or N");
                ch = sc.next().charAt(0);


            }while(ch==c1);




        }


    }


