package week7homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    //static method
    public static void city(char c){

        ArrayList<String> alist = new ArrayList<String>();
        //   ArrayList<String> alist2=new ArrayList<String>();
        alist.add("Ahmedabad");
        alist.add("Bangalore");
        alist.add("Chennai");
        alist.add("Delhi");
        alist.add("Ecatepec");
        alist.add("Faridabad");

        // nestedifelse getting city name
        if( c=='a')
        {
            System.out.println(alist.get(0));
        }else if(c=='b')
        {
            System.out.println(alist.get(1));
        }else if(c=='c')
        {
            System.out.println(alist.get(2));
        }else if(c=='d')
        {
            System.out.println(alist.get(3));
        }else if(c=='e')
        {
            System.out.println(alist.get(4));
        }else if(c=='f')
        {
            System.out.println(alist.get(5));
        }else
        {
            System.out.println("invalid");
        }

    }
    public static void main(String[] args) { //main method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character");
        char c = in.next().charAt(0);
        city(c);
        in.close();//scanner close

    }

}
