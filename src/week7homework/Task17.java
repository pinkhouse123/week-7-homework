package week7homework;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {

        //manual input of values in array1 and array2
        int[] my_array1 = {
                10, 7, 30, 23, 50, 60, 40, 8,
                33, 233, 0, 2, 55, 95, 69, 33};

        String[] my_array2 = {
                "Africa",
                "Europe",
                "South America",
                "North America",
                "Asia",
        };

        //Arrays to short in order

        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));

    }

}