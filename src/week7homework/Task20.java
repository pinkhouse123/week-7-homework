package week7homework;

public class Task20 {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    //main method
    public static void main(String[] args) {
        int[] my_array1 = {
                101, 203, 99, 14, 201,
                145, 234, 21, 657, 123,
                126, 432, 22, 250};
        System.out.println(contains(my_array1, 99));
        System.out.println(contains(my_array1, 146));
    }
}