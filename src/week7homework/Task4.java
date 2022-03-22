package week7homework;

import java.util.Scanner;

public class Task4 {


    //static method
    static int month;
    static int year;
    public static boolean isleapYear(int year) {
        boolean isleap = false;
        //if else statement
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isleap = true;
                else
                    isleap = false;
            } else
                isleap = true;
        } else {
            isleap = false;
        }
        return isleap;//return statement
    }

    public static void getDaysInMonth(int month, int year) {

        //Switch Statement

        switch (month) {
            case 1:

                System.out.println("31 days in this month");//january
                break;
            case 2:
                if (isleapYear(year)) {
                    System.out.println(year + " is a Leap Year");
                    System.out.println("29 days in this month");//
                    break;
                } else {
                    System.out.println(year + " is a not Leap Year");
                    System.out.println("28 days in this month");//february
                    break;
                }
            default:
                System.out.println("Enter valid number");
            case 3:
                System.out.println("31 days in this month");//march
                break;
            case 4:
                System.out.println("30 days in this month");//april
                break;
            case 5:
                System.out.println("31 days in this month");//may
                break;
            case 6:
                System.out.println("30 days in this month");//june
                break;
            case 7:
                System.out.println("31 days in this month");//july
                break;
            case 8:
                System.out.println("31 days in this month");//aug.
                break;
            case 9:
                System.out.println("30 days in this month");//sep.
                break;
            case 10:
                System.out.println("31 days in this month");//oct
                break;
            case 11:
                System.out.println("30 days in this month");//nov
                break;
            case 12:
                System.out.println("31 days in this month");//dec
                break;
        }
    }

    //Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner class
        System.out.println("Enter Year");//print statement
        year=scanner.nextInt();//scanner object
        System.out.println("Enter month");//print statement
        month=scanner.nextInt();//scanner object
        isleapYear(year);
        getDaysInMonth(month,year);

    }

}
