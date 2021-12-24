package arrays;

public class Utils {
    public static void arrayPrint(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println("index = " + index + " - array value " + array[index]);
        }
    }

    public static int arraySum(int[] array) {
        int sum = 0;

        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }

        return sum;
    }

}
