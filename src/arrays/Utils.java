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

    public static int arrayMax(int[] array){
        //TODO Implement function thar return max value of array
    }

    public static int arrayMin(int[] array){
        //TODO Implement function thar return min value of array
    }

    public static int[] arrayDefault(int defaultValue) {
        //TODO Implement function thar return array where all elements init by default value
    }

    public static int[] arrayConcat(int[] firstArray, int[] secondArray) {
        //TODO Implement function thar return array contain element both array
    }

    public static int[] arraySort(int[] array) {
        //TODO Implement function thar return array contain element both array
    }

}
