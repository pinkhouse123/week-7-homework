package week7homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    //static method
    public static void city(char c) {

        ArrayList<String> alist = new ArrayList<String>();
        //   ArrayList<String> alist2=new ArrayList<String>();
        alist.add("Ahmedabad");
        alist.add("Bangalore");
        alist.add("Chennai");
        alist.add("Delhi");
        alist.add("Ecatepec");
        alist.add("Faridabad");

        // switch case
        switch (c) {

            case 'a':
                System.out.println(alist.get(0));
                break;
            case 'b':
                System.out.println(alist.get(1));
                break;
            case 'c':
                System.out.println(alist.get(2));
                break;
            case 'd':
                System.out.println(alist.get(3));
                break;
            case 'e':
                System.out.println(alist.get(4));
                break;
            case 'f':
                System.out.println(alist.get(5));
                break;

            default:
                System.out.println("invalid");
                break;


        }}
    public static void main (String[]args){ //main method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character");
        char c = in.next().charAt(0);
        city(c);
        in.close();//scanner close

    }

}