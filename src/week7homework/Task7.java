package week7homework;

import java.util.Scanner;

public class Task7 {

    static float sa,cr;
    float Commission;
    public static void getCommission(float sa){
        //useing nestedifelse to get commission rate
        if ( sa>= 50000   ) {
            cr=sa*35/100;
        }else if (sa>=30000 && sa <50000){
            cr=sa*20/100;
        }else if (sa>=20000 && sa<30000){
            cr=sa*10/100;
        }else if (sa>=10000 && sa<20000){
            cr=sa*5/100;
        }else if (sa<10000){
            cr=sa*2/100;
        }
        System.out.println("Total commission is: "+cr);
    }
    public static void main(String[] args) { //main method
        Scanner cs = new Scanner (System.in);//scanner class
        System.out.println("please enter Total Sales ");
        sa=cs.nextFloat(); //scanner object
        getCommission(sa);
        cs.close();//scanner close
    }
}
