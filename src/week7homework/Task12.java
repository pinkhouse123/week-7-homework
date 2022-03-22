package week7homework;

import java.util.Scanner;

public class Task12 {

    //main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner class

        System.out.println("Enter anyhing on keyboard : ");
        char ch = scanner.next().charAt(0); //scanner object
        scanner.close();//scanner close
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " this is an Alphabet");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println(ch + " this is a number");

        } else {

            System.out.println(ch + " this is a symbol");
        }

    }
}
