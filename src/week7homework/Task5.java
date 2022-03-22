package week7homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {  //main method
        Scanner in = new Scanner(System.in);  //scanner class
        System.out.print("Enter Employee Id:");
        int empid=in.nextInt();  //scanner object
        System.out.print("Enter Employee Name: ");
        String  empname=in.next();
        System.out.print("Enter Basic Salary:");
        double bs = in.nextDouble();
        in.close();//scanner close
        double hra = 0.10 * bs;
        double ta  = 0.09 *bs;
        double da = 0.08 * bs;
        double pf = 0.20 * bs;

        double gs = bs+ da + ta;
        double gs1=gs-pf;

        System.out.println("|----------------------------------|");
        System.out.println("|           Salary Slip            |");
        System.out.println("|----------------------------------|");
        System.out.println("| Employee Id       : "+empid+"    |");
        System.out.println("| Employee Name     : "+empname+"  |");
        System.out.println("|----------------------------------|");
        System.out.println("| Basic Salary      : "+bs+"       |");
        System.out.println("| HRA 10%           : "+hra+"      |");
        System.out.println("| TA  8%            : "+ta+"       |");
        System.out.println("| DA  9%            : "+da+"       |");
        System.out.println("| PF _20&           : "+pf+"       |");
        System.out.println("|----------------------------------|");
        System.out.println("| Gross Salary      : "+gs1+"      |");
        System.out.println("|==================================|");


    }


}