package arrays;

public class Utils {
    public static void arrayPrint(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println("index = " + index + " - array value " + array[index]);
        }
    }


    public static void arrayPrint2(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(" " + array[index]);
        }
        System.out.println();
    }

    public static int arraySum(int[] array) {
        int sum = 0;

        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum;
    }

    public static int arrayMax(int[] array) {
        //TODO Implement function thar return max value of array
        int max = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > max) max = array[index];
        }
        return max;
    }

    public static int arrayMin(int[] array) {
        //TODO Implement function thar return min value of array
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) min = array[index];
        }
        return min;
    }

//     public static int[] arrayDefault(int defaultValue) {
//          //TODO Implement function thar return array where all elements init by default value
//      }

    public static int[] arrayConcat(int[] firstArray, int[] secondArray) {
        //TODO Implement function thar return array contain element both array
        int[] arrayConcat = new int[firstArray.length + secondArray.length];
        for (int index = 0; index < firstArray.length; index++) {
            arrayConcat[index] = firstArray[index];
        }
        int a = firstArray.length;

        for (int index = 0; index < secondArray.length; index++) {
            arrayConcat[a] = secondArray[index];
            a++;
        }

        return arrayConcat;
    }

    public static void arraySort(int[] array) {
        //TODO Implement function thar return array contain element both array
        int a, b, c;

        for (a = 0; a < array.length; a++) {
            for (b = array.length - 1; b > a; b--) {
                if (array[b - 1] > array[b]) {
                    c = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = c;
                }
            }
        }
    }

    public static int[] arrayDefault (int[] array, int defaultValue){
        for (int a=0; a<array.length; a++){
            array[a]= defaultValue;
        }
        return array;
    }
}


