package arrays;

//import org.jetbrains.annotations.NotNull;

public class ArrayMain {

    public static void main(String[] args) {

       /* int array3[] = new int[10];
        array3[0] = 1;
        array3[5] = 777;

        int[] array2 = new int[9];
        array2[0] = 10;
        array2[1] = 12;

        System.out.println("array3: " + array3);
        System.out.println("array2: " + array2.toString());

        Utils.arrayPrint(array3);
        System.out.println();
        Utils.arrayPrint(array2);

        System.out.println(Utils.arraySum(array3));*/

        //TODO init several array by different ways

        int newArray1[] = new int[10];
        int i;
        for (i = 0; i < 10; i++)
            newArray1[i] = i;
     //   for (i = 0; i < 10; i++)
     //       System.out.println("index [" + i + "] = " + newArray1[i]);
        Utils.arrayPrint(newArray1);
        System.out.println("Array sum: " + Utils.arraySum(newArray1));
        System.out.println("Array max value: " + Utils.arrayMax(newArray1));
        System.out.println("Array min value: " + Utils.arrayMin(newArray1));

        System.out.println();

        int newArray2[] = new int[8];
        newArray2[0] = 12;
        newArray2[1] = -14;
        newArray2[2] = 123;
        newArray2[3] = 9;
        newArray2[4] = -99;
        newArray2[5] = 2345;
        newArray2[6] = 3;
        newArray2[7] = 1;

        Utils.arrayPrint(newArray2);
        System.out.println("Array sum: " + Utils.arraySum(newArray2));
        System.out.println("Array max value: " + Utils.arrayMax(newArray2));
        System.out.println("Array min value: " + Utils.arrayMin(newArray2));

        System.out.println();

        int newArray3[] = {22, 45, -5, 78, -5, 678, 0, 99, 100};
        Utils.arrayPrint(newArray3);
        System.out.println("Array sum: " + Utils.arraySum(newArray3));
        System.out.println("Array max value: " + Utils.arrayMax(newArray3));
        System.out.println("Array min value: " + Utils.arrayMin(newArray3));

        //TODO print result all implemented methods

    }
}
