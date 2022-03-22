package week7homework;

import java.util.Scanner;

public class Task3 {

    //main method
    public static void main(String[] args) {
        String name;
        int roll, math, science, english;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = obj.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = obj.nextInt();
        System.out.print("Enter marks in Maths: ");
        math = obj.nextInt();
        System.out.print("Enter marks in Science: ");
        science = obj.nextInt();
        System.out.print("Enter marks in English: ");
        english = obj.nextInt();
        obj.close();//scanner close
        int total = math + science + english;
        float a = (float) total / 300 * 100;

        System.out.println("-------------------------------------|");
        System.out.println("|       Name      : " + name + "     |");
        System.out.println("|       Roll      : " + roll + "     |");
        System.out.println("|       Subject   :    Marks            |");
        System.out.println("|       Maths     : " + math + "     |");
        System.out.println("|       Science   : " + science + "     |");
        System.out.println("|       English   : " + english + "     |");
        System.out.println("|       Total     : " + total + "     |");
        System.out.println("|       Percentage: " + a + "     |");

        int marks = 0;

//NestedIfElse
        if (math < 35 || science < 35 || english < 35) {
            System.out.println("|      Result : Fail       |");
        } else if (marks < 0 || marks > 100) {
            System.out.println("Wrong entry");
        } else if (a >= 80) {
            System.out.println("|       Grade A+            |");
            System.out.println("|      Result : Pass       |");
        } else if (a < 80 && a >= 60) {
            System.out.println("|       Grade A             |");
            System.out.println("|      Result : Pass       |");
        } else if (a < 60 && a >= 50) {
            System.out.println("|       Grade B             |");
            System.out.println("|      Result : Pass       |");
        } else if (marks < 50 && marks > 35) {
            System.out.println("|       Grade C             |");
            System.out.println("|      Result : Pass       |");

        } else {
            System.out.println("|      Result : Fail       |");
        }
    }
}